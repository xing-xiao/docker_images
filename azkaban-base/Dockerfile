FROM java:8
MAINTAINER xingxiao <xingxiao@htsc.com>
RUN apt-get update && apt-get install -y vim wget curl
RUN wget https://github.com/azkaban/azkaban/archive/3.38.0.tar.gz
RUN tar zxvf 3.38.0.tar.gz && rm -f 3.38.0.tar.gz
WORKDIR azkaban-3.38.0
RUN bash gradlew build installDist -x test
RUN mkdir /azkaban/ \
    && mv /azkaban-3.38.0/azkaban-solo-server/build/install/azkaban-solo-server /azkaban/ \ 
    && mv /azkaban-3.38.0/azkaban-exec-server/build/install/azkaban-exec-server /azkaban/ \
    && mv /azkaban-3.38.0/azkaban-web-server/build/install/azkaban-web-server /azkaban/ \
    && rm -rf /azkaban-3.38.0
RUN apt-get install -y supervisor
