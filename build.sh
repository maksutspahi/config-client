#!/bin/bash
set -e
username='maksutspahi'
service='config-client'
mvn package
docker build -t $username/$service:latest .
