FROM java:8
VOLUME /tmp
ADD target/demo-0.0.1-SNAPSHOT.jar app.jar
#需要暴露的端口号 即你项目的端口号
EXPOSE 8199
ENTRYPOINT ["java","-jar","/app.jar"]