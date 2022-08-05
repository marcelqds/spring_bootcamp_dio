#!/bin/bash
docker build .

docker rm -f academia_db

docker run --name academia_db -p 5432:5432 -d c9cf43e376ec

