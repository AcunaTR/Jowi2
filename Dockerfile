FROM openjdk:8-jre
COPY ./Janra.Jowi/target/jowi-0.1.0.jar /usr
WORKDIR /usr

CMD  ["java","-cp", "jowi-0.1.0.jar", "Examples.Basic.Program"]
