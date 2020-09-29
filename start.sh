
cd `dirname $0`                 #进入根目录

proj_home=$PWD                  #工程根目录
img_output=test-jenkins-springboot         #生成镜像标签
appname=test-jenkins                   #容器名称
docker stop ${appname}
docker rm ${appname}
docker rmi ${img_output}
port=8080                         #docker暴露端口

# 生成镜像
docker build -t ${img_output} .
# 日志目录
mkdir -p $PWD/logs
chmod 777 $PWD/logs

# 启动镜像  8086为工程的端口
docker run --name=${appname} -p ${port}:8199 --link=mariadb:db -d ${img_output}