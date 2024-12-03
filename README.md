# Java RPC Example
## Name
 
 Kenya Luna

# Java RPC Example

This project is a basic "Hello, World!" implementation using Java RMI (Remote Method Invocation), an implementation of Remote Procedure Call (RPC) in Java. It demonstrates how to set up a simple server-client architecture where the client invokes a remote method provided by the server. The project runs entirely on a local setup.

# Features

 - Java RMI: A framework for building distributed systems using Java.
 - Remote Procedure Call (RPC): Allows clients to call methods on a remote server as if they were local.
 - Client-Server Architecture: A simple communication flow between a remote server and a client.
 - Hello, World!: A basic example to verify the RPC setup.

# Requirements

 - Java Development Kit (JDK) 8 or higher

# Installation
Clone this repository:
```bash
   git clone 
```
Compile the project:
```bash
   javac -d bin src/interfaces/*.java src/implementations/*.java src/server/*.java src/client/*.java
```

# Running the Application
1. Start the RMI Server
    Run the server:
```bash
    java -cp bin server.Server
```
The server will start and be ready to listen for remote calls on the configured port (default: 8089).
![imagen](https://github.com/user-attachments/assets/30719b57-c34a-43c4-bbf3-0b0760d5991e)


2. Run the RMI Client
    Run the client:
```bash
java -cp bin client.Client
```
The client will connect to the server and invoke the remote method sayHello.
![imagen](https://github.com/user-attachments/assets/a4d21d3f-3920-40e7-aac7-ce2bc8b1078f)

