FROM maven:3.6-adoptopenjdk-11

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/

RUN mvn package -DskipTests

FROM openjdk:11-jre-slim-stretch

COPY --from=0 build/target/sqldemo-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx500m", "-jar", "/app/sqldemo-0.0.1-SNAPSHOT.jar"]

HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:4712/actuator/health || exit 1

EXPOSE 4712
