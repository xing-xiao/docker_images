FROM java:8
MAINTAINER xingxiao <xingxiao@htsc.com>
RUN apt-get update && apt-get install -y vim wget curl
RUN apt-get install -y apt-transport-https openssh-server apt-utils
RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list \
  && apt-get update -y && export TERM=dumb && apt-get install -y --force-yes sbt
RUN sbt test
WORKDIR /opt/
RUN echo "HelloWorld" | sbt new sbt/scala-seed.g8
WORKDIR /opt/helloworld
RUN sbt run
WORKDIR /opt/
RUN echo "Template" | sbt new sbt/scala-seed.g8
ADD build.sbt /opt/template/build.sbt
ADD plugins.sbt /opt/template/project/plugins.sbt
ADD Hello.scala /opt/template/src/main/scala/example/Hello.scala
WORKDIR /opt/template/
RUN sbt run
RUN sbt test
RUN sbt assembly
