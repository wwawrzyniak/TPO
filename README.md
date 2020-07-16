# TPO
Technologie Programowania Rozproszonego

### 1. Non-blocking I/O – shared mapped file
Write simple two applications (it may be one application which operates in two modes) which communicate with each other by saving and reading data from a shared file mapped with into memory. <br />
One of the application should save some data – e.g. two integer values. The other application should retrieve the data and perform some operation – e.g. adding the values read – and then print out the result to the console. <br />
NOTE: Your solution should be based on non-blocking I/O implementation.<br />

### 2. Client/Server – custom protocol for echoing messages and adding values
Write a client/server solution which implements a simple (human-readable) protocol which supports two basic operations: <br />
− echoing messages – the server echoes the message sent by the client;<br />
− adding values of two operands and returning the result to the requestor (client).<br />
NOTE: Your solution should be based on non-blocking I/O implementation.<br />

### 3. Web Applications – Introduction
Develop a simple Java™ servlet which adds two integer values passed by a user as parameters to a web form and prints the result below the mentioned form. <br /> The user of your application should be capable to pass parameters to the servlet either with GET or POST method – i.e. you could for instance put two different submit buttons for each of the HTTP method.<br />
NOTE: make your servlet robust to invalid input – a user may provide parameter values which may not be parsed into integer<br />

### 4. Web Applications – Model-View-Controller
Modify the architecture of the solution for assignment 3 so that it complies with the Model-View-Controller concept implementation for web application as discussed during lecture<br />

### 5. Web Applications – database access
Develop a simple web application which allows particular users to display the resources available to them.<br />
The application would hold user directory in a database table ‘Users’. A ‘Users’ entry contains: technical (so called surrogate) identifier, login, first name, surname and the password. The resources are stored in ‘Resources’ database table. Each resource has: surrogate identifier, name and content – i.e. a 2048-byte long string.<br />
A resource may be accessible to multiple users, as well as each user may access multiple resources, which implies that in the relational model there should be a junction table between the two above entity types. Your web application should allow a user to establish a session after successful authentication. Within a session a user can browse the resources he/she has access to. <br />
This means that your application should provide 3 different user screens:<br />
(1) entry login screen for user authentication;<br />
(2) a screen listing resources available to the user – each resource entry presents only name of a resource – the resource details page (see below) is displayed when a user follows a corresponding link or presses a ‘Details’ button besides the name of the resource;<br />
(3) a screen presenting details of particular resource displaying both the name and the content.<br />
NOTE: Screens (2) and (3) should contain a ‘logout’ button which invalidates the session. <br />
Screen (3) should have a button/link to navigate back to the list of the available resources.<br />
NOTE: Your solution should utilize DataSource mechanism which supports database connection pooling.<br />

### 6. Web Applications – AJAX
Modify the solution for assignment 3 or 4 so that the result of the addition operation will be evaluated right after entering valid input without explicitly submitting the parameters by pressing <Enter> or clicking the button.<br />
The evaluation should be based on AJAX – i.e. it should be started by JavaScript right after one of the input text field loses focus.<br />
  
### 7. Web Applications – Filters and Events
Modify your web application developed as the solution to assignments 3, 4, 5 or 6 so that it complements the generated web page with (1) a header, and (2) a footer added by filters.<br />
The footer will print out the current date which will be updated each second.<br />
Add handlers to the following events:<br />
(1) servlet context initialization and destruction;<br />
(2) request construction and destruction.<br />
Your handler will print out some notification to web-container log that the particular event has been raised.<br />
Request construction event will print out the request content.<br />

### 8. RMI – echoing messages and adding values
Write a client/server solution based on RMI technology which implements the operations discussed in task 2:
− echoing messages;
− adding values of two number operands.
For both features create separate classes representing requests and responses (e.g. EchoRequest/EchoResponse and AddRequest/AddResponse).<br />
NOTE: Passing or getting results as values of ‘simple’ types (i.e. primitive types or strings) is not satisfactory<br />

### 9. Java Messaging Service – asynchronous message processing
Write a solution based on JMS technology composed of two types of parties:<br />
− 10 requestor threads run in a pool sending requests and<br />
− 5 service threads run in a pool responsible for processing the received requests.<br />
Your solution should support the following scenario:<br />
1. Requestor prepares the body of request message.
2. Requestor puts a request message into a JMS destination and awaits result of processing.
3. An idle service retrieves the request message from the JMS destination.
4. Service processes the request – processing should take a random amount of time between 3 and 5 seconds.
5. Service puts the response message into a JMS destination.
6. Requestor retrieves the message from JMS destination and consumes the result.
Please note that requestor should consume only the response of the request it has put in step (2).
All the above steps should be logged with standard Java™ logger – each log entry should be a single line of the following format:
‘hh:mm:ss.SSS <participant>: <log-message>’.<br />
A sample log message could look as follows:<br />
12:31:34.678 REQUESTOR-1: request put into destination<br />
Your application should support two different types of requests:<br />
1. Generating random number;<br />
2. Performing a simple two-argument arithmetic operation: addition, subtraction, multiplication or division.<br />
Both types of requests/responses should be your custom types:<br />
− RandomRequest/RandomResponse;<br />
− ArithmeticRequest/ArithmeticResponse.<br />
Please note that ArithmeticRequest should specify the type of operation to be performed.<br />
The requestors and services should be started from one entry point (i.e. method main).<br />
During a session each requestor should put 3 different requests and consume the processing results<br />
  
### 10. XML Web Services – Introduction
Based on the samples for JAX-WS implementation provided for the lecture create your own SOAP web service which will hold information about people (e.g. in a map). Each person has the following attributes:<br />
− First name;<br />
− Surname;<br />
− Birth date.<br />
Your web service will respond to a query which will filter the stored entries based on:<br />
− Surname;<br />
− Birth date.<br />
Based on the provided samples create a JUnit test for verifying whether your SOAP web service works as expected.<br />

### 11. XML Web Services – MTOM transport
Based on samples provided for JAX-WS create a SOAP web service enabling uploading and downloading files. Each file uploaded to your web service should be stored along
with its metadata:<br />
− File name;<br />
− File size;<br />
− Keywords describing file content.<br />
Your web service should support three types of requests:<br />
− File upload – used for file uploading. Some of the aforementioned properties, such as file name or file size, could be retrieved from the file itself. Keywords should be provided as separate set of values in the request.<br />
− File query – used for filtering files of the given keywords.<br />
− File download – for downloading file based on file name.<br />
Based on the provided samples create a JUnit test for verifying whether your SOAP web service works as expected.<br />

