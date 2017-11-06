FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/excel-intellect-0.1.0.jar app.jar
ENV JAVA_OPTS=""
RUN mkdir /upload-dir
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar