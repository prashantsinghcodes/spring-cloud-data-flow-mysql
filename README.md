# scdfdemo-mysql
This is the spring cloud data flow local server application which uses mysql database for it's task implementation. Any task application which uses mysql database can be deployed on this server. Once we run the main application of scdfdemo application as spring boot app. On successful launch of the appication, we open any web browser of our choice and hit localhost:9393/dashboard and it launches the server ui. This ui has many options where we can deploy applications, tasks, streams, batch etc.. I have designed this scdfdemo local server to deploy a task application which reads data from the database and writes the data into the csv. Note: Use this scdfdemo application for the deployment of the task application which uses only mysql database.
