#!/bin/sh

docker-machine create --virtualbox-memory "4096" --driver virtualbox default
eval "$(docker-machine env default)"
docker pull openjdk:latest
docker pull openjdk:8-jre
docker pull postgres:latest

docker-machine create --virtualbox-memory "4096" --driver virtualbox worker
eval "$(docker-machine env worker)"
docker pull openjdk:latest
docker pull openjdk:8-jre
docker pull postgres:latest

eval "$(docker-machine env default)"