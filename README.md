# sqldemo

To run this application you should have already installed Maven and Java 11.

Now clone or download this repository and navigate inside it.  
Open a command line (inside the repositories top folder) and type `mvn spring-boot:run`.   
See how the database starts up and pre-fills itself.

You can operate on the SQL database via the h2-console.  
Open a browser and type in the URL `localhost:4712/h2-console`.  
The credentials for the database are:
- Username: sa
- Password: *leave empty*
- JDBC URL: jdbc:h2:file:./task_db

You can now login and play around.

Note: the database is configured to forget all changes once you terminate it. This behaviour can be adjusted in the application.yml file.
