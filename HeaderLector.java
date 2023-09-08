import java.io.*;
import java.lang.Math.*;
import java.util.*;

public class HeaderLector{
    public static void main(String[] args)throws Exception{

        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Nombre del archivo: ");
        String imagenBmp = tec.readLine();
        
        try{
            FileInputStream archivo = new FileInputStream(imagenBmp);
            byte[] arr = new byte[54];
            archivo.read(arr);
            
            int contPrimer = arr[2];
            int contSeg = arr[3];  
            int contTer = arr[4];

            Double valorUno = contSeg * Math.pow(2,9);   
            Double ValorDos = contTer * Math.pow(2,16);

            int SumaPrimer = valorUno.intValue();
            int SumaSegun = ValorDos.intValue();
            int sumaTotal = (contPrimer + SumaPrimer + SumaSegun);
            System.out.println("File size: " + sumaTotal);

            //Ancho y alto en pixeles de la imagen

            int altura1 = arr[22];
            int altura2 = arr[23];
            Double valorAlt = altura2 * Math.pow(2,8);
            int alturaTot = valorAlt.intValue();
            int alturaComp = altura1 + alturaTot;
            System.out.println("Height: " + alturaComp);

            int primerDat = arr[18] * (- 1);
            int SegunDat = arr[19];
            Double valor = SegunDat * Math.pow(2,8);
            int valorComp = valor.intValue();
            int sumatoria = primerDat + valorComp;
            System.out.println("Width: " + sumatoria);
        }catch(Exception e){
            System.out.println("El archivo no existe o no se encuentra");
        }
    }
}