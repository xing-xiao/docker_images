FROM python:3.7.0a3-alpine3.6
MAINTAINER xiao_xing <lo0o.xing@gmail.com>
RUN apk update
RUN apk add gcc libzmq libc-dev build-base freetype-dev libjpeg-turbo-dev libpng-dev lapack-dev gfortran musl-dev nodejs nodejs-npm python-dev libxml2-dev libxslt-dev zlib-dev
RUN apk add tzdata && cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN apk add git openssh ca-certificates && update-ca-certificates && apk add openssl
RUN apk add supervisor && mkdir /etc/supervisord.d
ADD conf/id_rsa.pub /root/.ssh/id_rsa.pub
ADD conf/id_rsa /root/.ssh/id_rsa
RUN pip3 install jupyter
RUN pip3 install elasticsearch kafka-python pymysql
RUN pip3 install PyYAML SQLAlchemy cachetools python-dateutil configparser
RUN pip3 install pandas
RUN pip3 install numpy
RUN pip3 install matplotlib
RUN pip3 install scipy
RUN pip3 install -U scikit-learn
RUN pip3 install rq
RUN pip3 install requests
RUN pip3 install docx xlrd
RUN pip3 install happybase
RUN pip3 install pymongo
RUN pip3 install tenserflow
COPY conf/supervisord.conf /etc
RUN jupyter notebook --generate-config --allow-root \
    && sed -i "218cc.NotebookApp.password = 'sha1:714afce9dd05:552ef3fd7e5b3eb7eb76ff8db1d5d7d0a8c7b117'" /root/.jupyter/jupyter_notebook_config.py
WORKDIR /opt/
EXPOSE 9999
CMD ["supervisord", "--nodaemon", "--configuration", "/etc/supervisord.conf"]
# CMD ["jupyter", "notebook", "--ip=0.0.0.0", "--port", "9999", "--allow-root"]
# CMD["rq", "worker", "-c", "settings"]
