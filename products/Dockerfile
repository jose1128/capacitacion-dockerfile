FROM openjdk:8-jdk-alpine
RUN mkdir user-service
WORKDIR /user-service
ADD /build/libs/users-back-0.0.1-SNAPSHOT.jar /user-service/
ENTRYPOINT ["java","-jar","users-back-0.0.1-SNAPSHOT.jar"]