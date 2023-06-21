git pull origin master
echo
(java -jar target/blockchain-service-0.0.1.jar & mvn clean package)
clear
jps
kill -9 $(ps -ef | grep target/blockchain-service-0.0.1.jar | awk '/java/ {print $2}')
java -jar target/blockchain-service-0.0.1.jar
