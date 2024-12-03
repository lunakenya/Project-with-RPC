package client;

import interfaces.HelloWorld;
import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            // Localizar el objeto remoto
            HelloWorld hello = (HelloWorld) Naming.lookup("rmi://localhost:8089/HelloWorld");

            // Llamar al método remoto
            String response = hello.sayHello();
            System.out.println("Respuesta del servidor: " + response);
        } catch (Exception e) {
            System.err.println("Error en el cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
