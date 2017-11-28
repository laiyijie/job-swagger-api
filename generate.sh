#!/bin/sh
set -x
rm -rf javaclient
java -jar swagger-codegen-cli-laiyijie.jar generate -i main.yaml -l java -o ./javaclient -c ./codegen_config/javaclientconfig.json
rm -rf spring
cp -r spring_server_config spring
java -jar swagger-codegen-cli-laiyijie.jar generate -i main.yaml -l spring -o ./spring -c ./codegen_config/springconfig.json
rm -rf objcclient
java -jar swagger-codegen-cli-laiyijie.jar generate -i main.yaml -l objc -o ./objcclient -c ./codegen_config/objcclientconfig.json
cd spring
mvn clean install

