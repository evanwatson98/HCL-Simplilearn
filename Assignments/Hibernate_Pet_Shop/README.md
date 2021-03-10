# Pet Shop Hibernate

### Start Application
Run the Java application on a apache tomcat 7. You can do this by running a maven build
or with your personal tomcat server. 

### Walkthrough
To add a pet to the table, press on the big blue Add pet link right next to Pet Store. This will take
you to a page with a form. This form will validate the information on the client side through JS.
Once validated, the data will be inserted into the database utilizing HQL. The page is then redirected
back to the home page.