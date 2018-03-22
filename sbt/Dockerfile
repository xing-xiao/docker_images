FROM java:8
MAINTAINER xingxiao <xingxiao@htsc.com>
RUN apt-get update && apt-get install -y vim wget curl
RUN apt-get install -y apt-transport-https openssh-server apt-utils
RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list \
  && apt-get update -y && export TERM=dumb && apt-get install -y --force-yes sbt
ADD repositories /root/.sbt/repositories
RUN sbt test
