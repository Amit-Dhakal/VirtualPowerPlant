# VirtualPowerPlant
Project on Virtual Power Plant
# Test-Coding

This project is based on virtual centralizing power distribution process.
REST API of this project have two major functionalities :

- Save list of batteries,that contains the battery information like name, postcode, and watt capacity.
- Fetch the battery details that fall under the postcode range & calculate their Total and Average Watt Capacity.

Project Details :
- Spring boot Rest API project
- H2 database
- Tomcat Server 


Tools & Libraries used:
- Eclipse IDE
- Swagger documentation
- SonarQube for testing 
- Postman Client for Request 
- ORM technologies like Hibernate is used for mapping object to database table
- Junit 5 for Test cases
- Swagger OpenAPI library used for documentaion

Project Setup :
- pull the project from remote repository using 
  git clone https://github.com/Amit-Dhakal/Test-Coding.git  command
  
- Run PowerSystemProjectApplication.Java class file
- For test cases Run PowerSystemRepoTest.Java class

H2 Database Setup :
database url: localhost:8080/h2-console/

Credentials
username :user
password :pass
schema name : powersystemdb

All configuration is in (application.properties) file.

Project API Endpoints :
Save Battery Information :-

Http Method : POST 
Endpoint    : http://localhost:8080/api/v1/save

Request Body Data:
[

{
"name": "Hay Street",
"postcode": "6000",
"capacity": 23500
},

{
"name": "Armadale",
"postcode": "6992",
"capacity": 25000
},



{
"name": "Armadale",
"postcode": "6992",
"capacity": 25000
},

{
"name": "Koolan Island",
"postcode": "6733",
"capacity": 10000
},
{

"name": "Akunda Bay",
"postcode": "2084",
"capacity": 13500

},

{
"name": "Bagot",
"postcode": "0820",
"capacity": 27000
},
{

"name": "Kalamunda",
"postcode": "6076",
"capacity": 13500
},
{

"name": "Bentley",
"postcode": "6102",
"capacity": 85000
},

{

"name": "Yirrkala",
"postcode": "0880",
"capacity": 13500

}

]


API Response :

Data Saved [Battery [name=Hay Street, postcode=6000, capacity=23500.0], Battery [name=Armadale, postcode=6992, capacity=25000.0], Battery [name=Armadale, postcode=6992, capacity=25000.0], Battery [name=Koolan Island, postcode=6733, capacity=10000.0], Battery [name=Akunda Bay, postcode=2084, capacity=13500.0], Battery [name=Bagot, postcode=0820, capacity=27000.0], Battery [name=Kalamunda, postcode=6076, capacity=13500.0], Battery [name=Bentley, postcode=6102, capacity=85000.0], Battery [name=Yirrkala, postcode=0880, capacity=13500.0]]



Retrieve Battery Information By PostCode Range :

HTTP Method  : GET
Endpoint Url : http://localhost:8080/api/v1/range/{postcodemin}/{postcodemax}

{postcodemin} ->Minimum postcode range to be selected
{postcodemax} -> Maximum postcode range to be selected


API Response :
[Battery [name=Akunda Bay, postcode=2084, capacity=13500.0], Battery [name=Bagot, postcode=0820, capacity=27000.0], Battery [name=Hay Street, postcode=6000, capacity=23500.0], Battery [name=Yirrkala, postcode=0880, capacity=13500.0]]Total Watt Capacity :77500.0Average Watt Capacity :19375.0



Github Repository Link:  https://github.com/Amit-Dhakal/Test-Coding/tree/master


Swagger Documentation Link : localhost:8080/v1/VirtualPowerSystem


SonarQube :
Url : http://localhost:9000/

SonarQube credentials :
username : admin 
password : pass

Maven Plugin :
clean org.jacoco:jacoco-maven-plugin:prepare-agent install

Token :
sonar:sonar -Dsonar.login=squ_51393e43a0582f74dc41621b74bdab608c0cae4e
    

