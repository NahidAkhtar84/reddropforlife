## Introduction:


A Brief Description & motivation to our Web Application:
We chose to develop a website called Red Drop For Life which will be a digital platform for blood access and donation. The features we are going to include in our website are Authentication System, Registration, View Information (Donor & Seeker), Auto-date Tracking System, Multiple search (will be mentioned in the requirements), Communication Platform, Tracking points etc. Users will be able to browse other options regarding their status, come in or even find assistance to whom the Blood is needed. It’s a one click solution to finding better health and good Treatment. 
The New Normal has tuned the world into being more Virtualized then expected and in respect to a country like ours, the urgency to build a bridge between the Technology and Health is a dire need. 
At times of emergency cases a Facebook post or calls may delay to a very extended point and we might not find Blood with a proper health feature to our case. From this view, we team members came out with this idea to help people save time and lives both in use of Technology at ease. So, with utter importance and a positive outcome this Beautiful Web Application was chosen and served as to be better with respect to our country. It’s a one-click solution to finding better health and good Treatment.




## Objectives of our Web Application:
Our objectives are mostly set based on the craving need for assistance and proper management to be served, we point out those as follows;
-To step in Virtualization that can save lives of people in their crucial moments
- Save time and utilize it to analyze the Requirements.
-To find one place with details of Blood Group and better access to data.
-To identify the right location, donator and health regulations to be followed.
- An Alternative to Post or calls for search of Blood.


2. Software Requirements:
IDE: Intellij IDEA Ultimate
	Version: 2020.3.1
	Download Link: https://www.jetbrains.com/idea/download/#section=windows

Web Application Server: Apache Tomcat
Version: 9.0.41
Download Link: https://tomcat.apache.org/download-90.cgi

Database server: MySQL
Driver: JDBC
Version: 8.0.22

Framework: Spring Boot
Version: 2.4.1 





3. Description of the Functionalities:

Functionalities:


Authentication System: Authentication includes sign up and sign-in of the users (including the Admin). All the users should be registered with a unique email id, Phone number (for also proper validation)with which authentication will be recognized and the admin will have a unique email to sign in.


Registration: A Blood Donor and Seeker (can look-up like a Visitor), has to register first with their specific details to create their own profile (admin will have some special privileges). It is important to input their necessary information to receive definite access to their requirements (also they can save on browser, Cookies).


User Profile and Account Settings: These two are the basic functionalities for all the users. They can edit and delete their profile information in the user profile. It’s a basic way for them to update their Profile, bring change to their email and password.


View information: It will have viewing options for the User (Donor/ Seeker) to acquire necessary data and detail themselves about more of the Blood Donation Process. 


Search: Can be searched with blood groups. After having a total list of the members, blood seekers can search for blood donors searching for the blood they need.


Home Page: Some Basic information will be available to assist and guide the user on our Home Page.




UML Diagram:



Figure-01: Sequence Diagram







 4. Web Engineering Model:

Web Architecture Diagram:

Figure-02: Model-2 Architecture with respect to MVC Structure


Model 2 architecture:
JSP Model 2 is a complex design pattern used in the design of Java Web applications which separates the display of content from the logic used to obtain and manipulate the content. Since Model 2 drives a separation between logic and display, it is usually associated with the model–view–controller (MVC) paradigm. While the exact form of the MVC "Model" was never specified by the Model 2 design, several publications recommend a formalized layer to contain MVC Model code. The Java BluePrints, for example, originally recommended using EJBs to encapsulate the MVC Model.
In a Model 2 application, requests from the client browser are passed to the controller. The controller performs any logic necessary to obtain the correct content for display. It then places the content in the request (commonly in the form of a JavaBean or POJO) and decides which view it will pass the request to. The view then renders the content passed by the controller. Model 2 is recommended for medium- and large-sized applications.

Development framework: Spring 

The Spring Framework provides a comprehensive programming and configuration model for modern Java-based enterprise applications - on any kind of deployment platform. 
A key element of Spring is infrastructural support at the application level: Spring focuses on the "plumbing" of enterprise applications so that teams can focus on application-level business logic, without unnecessary ties to specific deployment environments.

Features/Modules Spring offers:
Spring Core Container: this is the base module of Spring and provides spring containers (BeanFactory and ApplicationContext).
Aspect-oriented programming: enables implementing cross-cutting concerns.
Authentication and authorization: configurable security processes that support a range of standards, protocols, tools, and practices via the Spring Security sub-project (formerly Acegi Security System for Spring).
Convention over configuration: a rapid application development solution for Spring-based enterprise applications is offered in the Spring Roo module
Data access: working with relational database management systems on the Java platform using Java Database Connectivity (JDBC) and object-relational mapping tools and with NoSQL databases
Inversion of control container: configuration of application components and lifecycle management of Java objects, done mainly via dependency injection
Messaging: configurative registration of message listener objects for transparent message-consumption from message queues via Java Message Service (JMS), improvement of message sending over standard JMS APIs
Model–view–controller: an HTTP- and servlet-based framework providing hooks for extension and customization for web applications and RESTful (representational state transfer) Web services.
Remote access framework: configurative remote procedure call (RPC)-style marshalling of Java objects over networks supporting Java remote method invocation (RMI), CORBA (Common Object Request Broker Architecture) and HTTP-based protocols including Web services (SOAP (Simple Object Access Protocol))
Transaction management: unifies several transaction management APIs and coordinates transactions for Java objects
Remote management: configurative exposure and management of Java objects for local or remote configuration via Java Management Extensions (JMX)
Testing: support classes for writing unit tests and integration tests





Figure-03: Spring Framework Architecture concerning  MVC Structure



Design pattern used with diagram (Front controller, Session Façade pattern, DAO, etc.): 
Front Controller: Front controller basically handles all the requests to a web application. As we developed our web application using Spring MVC framework, DispatcherServlet is the front controller in our system which will handle all the requests to our web application. 


Data Access Object (DAO): It is a structural pattern that allows us to isolate the business/application layer from the persistence layer (Relational Database, etc. ) using an abstract API.




5. Technologies used in different tier:

Application tier: The heart of any application which acts as a middle tier. In this tier, information collected in the presentation tier is processed - sometimes against other information in the data tier - using business logic, a specific set of business rules. The application tier can also add, delete, or modify data in the data tier.


Technology:Java


Presentation tier: After collecting information from the user, this tier displays that information in a good presentable manner. 


Technology:Html, CSS, Bootstrap


Database tier: In this tier information are stored and managed appropriately.


Technology: MySQL

6. Conclusion and future work:

Achievements from this final project: 
   We have gained an elaborate knowledge about the structure of OOP and how it is used in web application. The project increases our understanding about the Spring framework, one of the most structured and powerful frameworks for web development. Moreover, we have worked as a team in this project. This increases our skills of team working. We understood how to merge different layers of work together.


b.  Limitations of the project: 
There are several limitations in our project. To be an ideal web-based blood bank, it should also contain the information of a physical blood bank and a communication process between the web platform and all physical blood banks. We don't have that functionality.
There is not any functionality of searching donors by their location and there is not any location tracker functionality of the system.
It is important to keep the records of the health condition of the donors which is not facilitated in this system.
Most of the people of the area do not use the internet on a regular basis or outdoor basis. But, users need internet facility to have the service of the system.
Blood donation and seeking records should be kept in such a system that is not available.


c. Faced Challenges:
The vital challenge for this project was to set up the spring boot environment and collaborate different technologies together. Moreover, It was a great challenge for us because so many people were working together and merging everyone’s work together. It was also a challenge to reach any decision together.


d. Futureworks:
In the future, we want to increase our “Red Drop for Life” in a way that each blood bank and hospital can use our system for finding donors. We can make proper contact with those organizations. But before commenting that our task is to add some features to our system. We want to add some more features like calculating the future date when the donor will be able to donate blood again.
We also want to make our system an AI-based one where the system can predict the seeking blood group & the corresponding organization which may need blood in the upcoming 5 days.
Hope in the near future we can add those features and can help each person in their real need.
