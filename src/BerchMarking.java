import java.util.concurrent.Callable;
import models.Results;

public class BerchMarking {
    
    public static Results medirTiempo(Callable<Void> funcion, String name, int sample){
        try {
            //si lanza cualquier error va hacia abajo para atraparlo
            long inicio = System.nanoTime();
            funcion.call();
            long fin = System.nanoTime();
            double duracion = fin - inicio;
            Results resultados = new Results(duracion, name, sample);
            return resultados;
            
        } catch (Exception e) {

            throw new RuntimeException("Error en la funcion");
            
        }

    }
    
}
