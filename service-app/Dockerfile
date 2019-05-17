
FROM openjdk:11-jre-slim

#SHELL ["/bin/bash", "-o", "pipefail", "-c"]

EXPOSE 8080 8090

WORKDIR /opt

COPY target/service-app.jar /opt/app.jar

ENTRYPOINT exec java -noverify -server -XX:TieredStopAtLevel=1 -Xms256M -Xmx256M -XX:MaxMetaspaceSize=300M -jar app.jar
