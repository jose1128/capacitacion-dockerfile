FROM openjdk:8-jdk
RUN mkdir user-service
WORKDIR /user-service
RUN apt-get update && apt-get install -y git
RUN git clone https://github.com/jose1128/capacitacion-dockerfile.git
RUN /products/./gradlew clean build
WORKDIR /products/build/libs
ENTRYPOINT ["java","-jar","products-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["java","-jar","users-back-0.0.1-SNAPSHOT.jar"]