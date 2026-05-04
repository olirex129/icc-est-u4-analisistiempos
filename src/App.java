import java.util.concurrent.Callable;
import controles.SortMethods;
import models.Results;

public class App {
    public static void main(String[] args) throws Exception {
        //static no se necesita instanciar el metodo
        //los metodos no estaticos para ejecutarse deben de estar en una clase intanciada
        int size = 100000;
        int[] arreglo = generate(size);

        // agregar metodo shell

        int[] arreglo2 = arreglo.clone();
        int[] arreglo3 = arreglo.clone();
        int[] arreglo4 = arreglo.clone();

        SortMethods metodos = new SortMethods();


    Callable<Void> funcionBubble = () -> {//guardar una funcion en una variable
                                          //son como ordenes para cuando lo llames con 
                                          //funcionBubble.call(); se ejecute lo de adentro
        metodos.sortBubble(arreglo2);
        return null;
    };    

    Results rBubble = BerchMarking.medirTiempo(funcionBubble,"burbuja",size);

    System.out.println(rBubble.getName() + " = " + rBubble.getTime());

    Callable<Void> funcionBubbleAvnz = () -> {
        metodos.sortBubbleAvan(arreglo3);
        return null;
    };    

    Results rBubbleAvnz = BerchMarking.medirTiempo(funcionBubbleAvnz,"burbuja avanzado",size);
    
    System.out.println(rBubbleAvnz.getName() + " = " + rBubbleAvnz.getTime());

    Callable<Void> funcionShellSort = () -> {
        metodos.shellSort(arreglo4);
        return null;
    };    

    Results rShell = BerchMarking.medirTiempo(funcionShellSort,"Shell",size);

    System.out.println(rShell.getName() + " = " + rShell.getTime());


    }

    //si no tiene static no sale error en generate
    public static int[] generate(int size){
        int[] array = new int[size];
        for (int i = 0 ; i < size ; i++ ){
            int numero = (int) (Math.random()*10000);
            array[i] = numero;
        }
        return array;
    }
}
