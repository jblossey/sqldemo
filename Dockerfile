FROM maven:3.6.3-openjdk-11-slim

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/

RUN mvn package -DskipTests

FROM openjdk:11-jre-slim

COPY --from=0 build/target/milestone-3-demo-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx500m", "-jar", "/app/milestone-3-demo-0.0.1-SNAPSHOT.jar"]

HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:4711/actuator/health || exit 1

EXPOSE 4711
