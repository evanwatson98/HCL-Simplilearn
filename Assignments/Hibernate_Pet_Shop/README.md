# Pet Shop Hibernate

### Start Application
Run the Java application on an apache tomcat server. You can do this by running a maven build
or with your personal tomcat server. 

### Walkthrough
To add a pet to the table, press on the big blue Add pet link right next to Pet Store. This will take
you to a page with a form. This form will validate the information on the client side through JS. 
If an incorrect input is given, an alert will show up and the form will not be submitted.
Once the form is validated, the data will be inserted into the database utilizing HQL. The page is then redirected
back to the home page.

### Database
```sql
CREATE DATABASE pets;
create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user springuser
grant all on pets.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database
```

### Pet Table
```sql
CREATE TABLE pets.products (
id  int(11) AUTO_INCREMENT, 
name VARCHAR(256), 
color VARCHAR(256), 
price DECIMAL(19,2),
PRIMARY KEY (`id`)
);

INSERT INTO pets.products (name,color,price) VALUES ("Bird", "Chartreuse", 200.00);
INSERT INTO pets.products (name,color,price) VALUES ("Hamster", "Brown", 30.00);
INSERT INTO pets.products (name,color,price) VALUES ("Cayman", "Neon Pink", 500.00);
INSERT INTO pets.products (name,color,price) VALUES ("Tarantula", "Red", 100.00);
```

### User Table
```sql
CREATE TABLE users(
	email VARCHAR(256) NOT NULL,
	fname VARCHAR(256),
	lname VARCHAR(256),
	password VARCHAR(1000),
	PRIMARY KEY (email)
);
```