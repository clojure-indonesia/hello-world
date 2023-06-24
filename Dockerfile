FROM bellsoft/liberica-openjdk-alpine-musl:17.0.7
RUN mkdir -p /app
WORKDIR /app
COPY target/hello-world-0.0.1-standalone.jar .
CMD java -jar hello-world-0.0.1-standalone.jar
