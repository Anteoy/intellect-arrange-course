node {
    env.DOCKER_TAG = getDockerTag()
}

String getDockerTag() {
    if (BRANCH_NAME == "master") {
        return "v1.0.0-" + BUILD_ID
    }
    if (BRANCH_NAME == "test") {
        return "testv1.0.0-" + BUILD_ID
    }
    return BRANCH_NAME
}
pipeline {
    agent {
        //docker "hub.c.163.com/library/maven:3-jdk-8-alpine"
         docker "maven:3.5.2-jdk-8-alpine"
    }
    stages {
        stage('build') {
            when {
                expression { BRANCH_NAME ==~ /(qa|test|master)/ }
            }
            steps {
                sh "ls"
                sh "mvn -v"
                sh "mkdir /root/.m2"
                sh " mvn -N io.takari:maven:wrapper"
                sh "./mvnw package"
                sh "docker build -t registry-vpc.cn-shanghai.aliyuncs.com/online_biz/service-intellect-arrange-excel:$DOCKER_TAG ."
                sh "docker login -u $DOCKER_USER -p $DOCKER_PASS registry-vpc.cn-shanghai.aliyuncs.com"
                sh "docker push registry-vpc.cn-shanghai.aliyuncs.com/online_biz/service-intellect-arrange-excel:$DOCKER_TAG"
            }
        }
    }
}