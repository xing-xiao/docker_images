FROM python:3.6-stretch
RUN apt-get update
RUN DEBIAN_FRONTEND=noninteractive apt-get -y install openssh-server curl unzip vim wget vsftpd git supervisor
RUN pip install --upgrade pip
RUN pip3 install jupyter
RUN pip3 install elasticsearch kafka-python pymysql redis
RUN pip3 install requests
RUN pip3 install rq
RUN apt-get -y install libtiff5-dev zlib1g-dev libfreetype6-dev liblcms2-dev libwebp-dev tcl8.6-dev tk8.6-dev python-tk
RUN pip3 install docx xlrd
RUN pip3 install SQLAlchemy cachetools python-dateutil configparser
RUN pip3 install PyYAML
RUN pip3 install pymongo
RUN pip3 install pandas
RUN pip3 install numpy
RUN pip3 install matplotlib
RUN pip3 install scipy
RUN pip3 install -U scikit-learn
RUN pip3 install happybase
RUN pip3 install tensorflow
RUN pip3 install apscheduler
