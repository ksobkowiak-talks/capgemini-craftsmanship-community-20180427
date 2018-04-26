#! /bin/bash
./wait-for-it.sh itemsdb:5432 -t 65
java -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=postgresql -jar itemservice.jar