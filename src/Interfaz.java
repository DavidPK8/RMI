import java.rmi.Remote;

// Se crea una interfaz que se extiende de la clase Remota
public interface Interfaz extends Remote {

    // Metodos que el cliente puede invocar de forma remota
    String mensaje();
    double suma(double a, double b);

}
