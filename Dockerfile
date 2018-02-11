FROM anapsix/alpine-java:8_jdk
RUN mkdir /var/config-client
COPY target/client-0.0.1.jar /var/config-client
WORKDIR /var/config-client
ENTRYPOINT ["java","-jar","client-0.0.1.jar"]