FROM openjdk:8-jdk-alpine
MAINTAINER Alfinza Sanjaya Putra <2041720186@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY Tugas1.java /app

#compile file java
RUN javac Tugas1.java

#running java
CMD ["java","Tugas1"]
