package server;

import implementations.HelloWorldImpl;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            // Crear el registro RMI en el puerto 8089
            LocateRegistry.createRegistry(8089);
            
            // Instanciar la implementación
            HelloWorldImpl hello = new HelloWorldImpl();

            // Publicar el objeto en el registro RMI
            Naming.rebind("rmi://localhost:8089/HelloWorld", hello);

            System.out.println("Servidor RMI listo en el puerto 8089.");
        } catch (Exception e) {
            System.err.println("Error en el servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

