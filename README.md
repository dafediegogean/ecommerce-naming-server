# E-commerce Naming Server

An microservice with Java 11, Spring Cloud Houxton SR4 and Netflix OSS

## Reference Documentation

### Provider Server

-   ecommerce-naming-server

### Description

> **ecommerce-naming-server**

Provider server responsible for discover/to locate new services. Between them:

 - Service Discovery;
 - Service Registry;
 - Load balancing;
 - Failover of middle-tier services

## Installation

-   Docker: [https://docs.docker.com/get-docker/](https://docs.docker.com/get-docker/)
-   Maven: [https://maven.apache.org/install.html](https://maven.apache.org/install.html)

## Starting services

### 1. Build Project

```
$ mvn clean install -U
```

### 2. Build docker image

```
$ docker build -t ${APPLICATION_NAME}:latest
```

### 3. Run the container

```
$ docker run -d --rm --network=host ${APPLICATION_NAME}:latest
```

-   Use the host's network stack inside the container.

### 4.Removing and cleaning the containers

```
$ docker stop ${CONTAINER_ID}
```
