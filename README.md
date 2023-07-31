# Simple web application using Java, Spring Boot, Aerospike database and Docker.

#### To start 'aerospike' server from docker, follow the below steps

##### Pull the Docker image of 'Aerospike'
`docker pull aerospike/aerospike-server`
##### Verify the image is present or not
`docker images`
##### Run the 'aerospike' image with name as `aerospike-server` and with ports as 3000, 3001, 3002 and 3003'
`docker run --rm -tid --name aerospike-server -p 3000:3000 -p 3001:3001 -p 3002:3002 -p 3003:3003 aerospike/aerospike-server`

This will start the image and we can verify with the below command

`docker ps`

To check the data when we perform the CRUD operations, we can check with Shell. To attach the 'aerospike-server' to the shell we need the IP address. To get those details, below commands to be executed.

`docker inspect --format="{{json .NetworkSettings.Networks}}" aerospike-server`

The above command will give the complete network details of `aerospike-server`

##### To get the IP address of the `aerospike-server`, below command will help

`docker inspect -f "{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}" aerospike-server`

##### To get the shell attached to `aerospike-server`, execute below command:
- Without hard-coding the IP Address
	<br />
`docker run -it --name aerospike-tools aerospike/aerospike-tools aql -h $(docker inspect -f "{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}" aerospike-server)`


- By hard-coding the IP Address
	<br />
`docker run -it --name aerospike-tools aerospike/aerospike-tools aql -h <ip_address>`