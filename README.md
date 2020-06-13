# Milestone 3 Sample Application

## Run the app

To run this application you should have already installed Maven and Java 11.

Now clone or download this repository and navigate inside it.  
Open a command line (inside the repositories top folder) and type `mvn spring-boot:run`.  
See how the database starts up and pre-fills itself.

You can operate on the SQL database via the h2-console.  
Open a browser and type in the URL `localhost:4711/h2-console`.  
The credentials for the database are:
- Username: sa
- Password: *leave empty*
- JDBC URL: jdbc:h2:mem:testdb

You can now login and play around.

Note: the database is configured to forget all changes once you terminate it. This behaviour can be adjusted in the application.yml file.

## Pipelines

This app exists to showcase the continuous integration and deployment of a microservice.

*Continuous Integration* is done via Github CI (which ends in a delivery on Azure Kubernetes) and Travis-CI to publish code-coverage reports on codecov.io. You can find the configuration in the .travis-ci.yml.  
If you navigate to [travis-ci.com](https://travis-ci.com/anwesys-tutors/milestone-3-demo) you will find the different testing and compilation cycles which were triggered by commits to the master branch.

*Continuous Deployment* is aimed at an Azure Kubernetes Cluster which exposes a public IP-Address to reach the respective Service.

The *Continuous Delivery* pipeline ends on [Docker Hub](hub.docker.com/jblossey/milestone-3-sample). Each push to the master branch triggers the re-building of the Docker image to be always up-to-date.
