import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) {

        try{
            // Obtener el registro
            // En host va localhost o la ip de quien quieres conectarte
            Registry registro = LocateRegistry.getRegistry("172.31.115.130", 1099);

            // Crear la instancia de la implementacion de la interfaz
            Interfaz objetoRemoto = (Interfaz) registro.lookup("ClienteRemoto");

            String mensaje = objetoRemoto.mensaje();
            System.out.println(mensaje);

            double respuesta = objetoRemoto.suma(5, 3);
            System.out.println(respuesta);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
