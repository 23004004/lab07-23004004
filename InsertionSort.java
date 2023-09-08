import java.io.*;

public class InsertionSort{

    //Campos
    static int iteracionesAsc = 0;
    static int visitadasAsc = 0;
    static int cambioCasillasAsc = 0;
    static int iteracionesDesc = 0;
    static int visitadasDesc = 0;
    static int cambioCasillasDesc = 0;
    //metodos

    public static void ascSort(int[] arr){
        iteracionesAsc = arr.length - 1;
      visitadasAsc = 0;
        cambioCasillasAsc = 0;
      
        for(int i = 1; i < arr.length; i++){
            int aux = arr[i];
            visitadasAsc ++;
            int j = i - 1;
            while(j >= 0 && arr[j] > aux){
                arr[j + 1] = arr[j];
                j --;
                visitadasAsc ++;
                cambioCasillasAsc = cambioCasillasAsc + 2;
            }
            arr[j + 1] = aux;
        }
    }

    public static void descSort(int[] arr){
      iteracionesDesc = arr.length - 1; 
      visitadasDesc = 0;
        cambioCasillasDesc = 0;
        for(int i = 1; i < arr.length; i++){
            int aux = arr[i];
            visitadasDesc ++;
            int j = i - 1;
            while(j >= 0 && arr[j] < aux){
                arr[j + 1] = arr[j];
                j --;
                visitadasDesc ++;
                cambioCasillasDesc = cambioCasillasDesc + 2;
            }
            arr[j + 1] = aux;
        }
    }

    public static void lastRunAsc(){
        System.out.println("Datos recopilados del arreglo ascendente: ");
        System.out.println("Cantidad de iteraciones: " + iteracionesAsc);
        System.out.println("Casillas visitadas: " + visitadasAsc);
        System.out.println("Cambio de casillas: " + cambioCasillasAsc);
        System.out.println();
    }

    public static void lastRunDesc(){
        System.out.println("Datos recopilados del arreglo descendente: ");
        System.out.println("Cantidad de iteraciones: " + iteracionesDesc);
        System.out.println("Casillas visitadas: " + visitadasDesc);
        System.out.println("Cambio de casillas: " + cambioCasillasDesc);
        System.out.println();

    }

}