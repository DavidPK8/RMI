import java.rmi.Remote;
import java.rmi.RemoteException;

// Se crea una interfaz que se extiende de la clase Remota
public interface Interfaz extends Remote {

    // Metodos que el cliente puede invocar de forma remota
    String mensaje() throws RemoteException;
    double suma(double a, double b) throws RemoteException;

}
