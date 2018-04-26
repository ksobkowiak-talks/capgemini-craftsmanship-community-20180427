FROM openjdk:8-jre

ADD target/itemservice.jar .

EXPOSE 8090
ENTRYPOINT ["/usr/bin/java", "-jar", "-Dspring.profiles.active=postgresql", "itemservice.jar"]