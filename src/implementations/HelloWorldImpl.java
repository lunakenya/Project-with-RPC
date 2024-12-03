package implementations;

import interfaces.HelloWorld;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class HelloWorldImpl extends UnicastRemoteObject implements HelloWorld {

    // Constructor debe ser público
    public HelloWorldImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "¡Hola Mundo desde RPC en Java!";
    }
}
