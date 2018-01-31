FROM java:8
MAINTAINER xingxiao <xingxiao@htsc.com>
RUN apt-get update && apt-get install -y vim wget curl
RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list \
  && apt-get update && apt-get install -y sbt
