### TEST
```bash
clojure -M:test
```
### FLY
```bash
clojure -M -m hello-world.core
```
### BUILD
```bash
clojure -T:build uber
```
### RUN
```bash
java -jar target/hello-world-0.0.1-standalone.jar
```
### DOCKER
```bash
docker build -t hello-world .
docker run hello-world
```