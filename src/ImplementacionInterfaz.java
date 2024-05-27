import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplementacionInterfaz extends UnicastRemoteObject implements Interfaz {

    // Constructor que necesita el UnicastRemoteObject
    public ImplementacionInterfaz() throws RemoteException {
        super();
    }

    // Implementar los metodos creados en la Interfaz
    @Override
    public String mensaje() throws RemoteException {
        return "Hola desde el servidor";
    }

    @Override
    public double suma(double a, double b) throws RemoteException {
        return a + b;
    }
}
