FROM openjdk:8
COPY . /usr/src/partnerservice
WORKDIR /usr/src/partnerservice
ADD build/libs/partnerservice-service-docker-0.1.jar partnerservice-service-docker-0.1.jar
EXPOSE 8103
VOLUME /tmp
ENTRYPOINT ["java","-jar","partnerservice-service-docker-0.1.jar"]