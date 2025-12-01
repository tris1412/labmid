FROM  eclipse-temurin:21-jdk-alpine
WORKDIR /app

COPY Add.java .

RUN javac Add.java

CMD ["java", "Add"]
