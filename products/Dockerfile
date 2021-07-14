FROM openjdk:8-jdk
RUN mkdir user-service
WORKDIR /user-service
RUN apt-get update && apt-get install -y git
RUN git clone https://github.com/jose1128/capacitacion-dockerfile.git
RUN  cd capacitacion-dockerfile/products/  && chmod +x gradlew && ./gradlew clean build
EXPOSE 8080
ENTRYPOINT ["java","-jar","capacitacion-dockerfile/products/build/libs/products-0.0.1-SNAPSHOT.jar"]