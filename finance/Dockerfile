FROM openjdk:17-jdk-alpine
VOLUME /tmp
ADD target/*.jar app.jar

# Download java agents
RUN apk --no-cache add curl
RUN curl -L -o /opentelemetry-javaagent.jar https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar
RUN curl -L -o /honeycomb-opentelemetry-javaagent.jar https://github.com/honeycombio/honeycomb-opentelemetry-java/releases/download/v1.5.2/honeycomb-opentelemetry-javaagent-1.5.2.jar

ENV JAVA_OPTS="-javaagent:/opentelemetry-javaagent.jar"
ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar