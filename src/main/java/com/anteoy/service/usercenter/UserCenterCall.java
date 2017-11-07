package com.anteoy.service.usercenter;


import com.anteoy.sample.JRServiceClient;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Created by zhoudazhuang on 17-11-7.
 */
public class UserCenterCall {
    private static final Logger logger = Logger.getLogger(JRServiceClient.class.getName());

    private final ManagedChannel channel;
    private final ConsumerCentreGrpc.ConsumerCentreBlockingStub blockingStub;
    private final ConsumerCentreGrpc.ConsumerCentreStub asyncStub;

    public UserCenterCall(String hots, int port) {
        channel = ManagedChannelBuilder.forAddress(hots, port)
                .usePlaintext(true)
                .build();
        blockingStub = ConsumerCentreGrpc.newBlockingStub(channel);
        asyncStub = ConsumerCentreGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void GetSchools() {
        logger.info("call GetSchools() method : ");
        RequestGetSchs request = RequestGetSchs.newBuilder().setPageSize(20).setCurrentPage(1).build();
        ReplySchools resp = blockingStub.getSchools(request);
        logger.info(resp.toString());
        logger.info("finished!");
    }

    public void GetSchoolsUsingAsyncStub() throws InterruptedException {
        logger.info("call GetSchools() method using asynchronous stub : ");
        RequestGetSchs request = RequestGetSchs.newBuilder().setPageSize(20).setCurrentPage(1).build();
        final CountDownLatch latch = new CountDownLatch(1); // using CountDownLatch

        StreamObserver<ReplySchools> responseObserver = new StreamObserver<ReplySchools>() {

            @Override
            public void onNext(ReplySchools replySchools) {
                logger.info("get resp :" + replySchools.toString());
            }

            @Override
            public void onError(Throwable t) {
                Status status = Status.fromThrowable(t);
                logger.info("failed with status : " + status );
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                logger.info("finished!");
                latch.countDown();
            }
        };

        asyncStub.getSchools(request, responseObserver);

        latch.await();
    }

    public static void main(String[] args) throws InterruptedException{
        UserCenterCall client = new UserCenterCall("localhost", 65520);
        try {
//            client.GetSchools();
            client.GetSchoolsUsingAsyncStub();
        } finally {
            client.shutdown();
        }
    }

}
