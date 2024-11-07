package Converciones;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner ingreso=new Scanner(System.in);
        int val1;
        double con_val1;

        System.out.println("Ingrese el valor a convertir: ");
        val1=ingreso.nextInt();
        con_val1=Double.parseDouble(String.valueOf(val1));

        System.out.print("El resultado del valor convetido a double es: "+con_val1);


        //Scanner ingreso=new Scanner(System.in);
        //String val1;
        //double con_val1;

        //System.out.println("Ingrese el valor a convertir: ");
        //val1=ingreso.nextLine();
        //con_val1=Double.parseDouble(val1);

        //System.out.print("El resultado del valor convetido a double es: "+con_val1);


        //Scanner ingreso=new Scanner(System.in);
        //int val1;
        //int result;
        //String con_val1;

        //System.out.println("Ingrese el valor a convertir: ");
        //val1=ingreso.nextInt();
        //con_val1=Integer.toString(val1);

        //System.out.print("El resultado del valor convetido a string es: "+con_val1);


        //Scanner ingreso=new Scanner(System.in);
        //double val1;
        //int result;
        //int con_val1;

        //System.out.println("Ingrese el valor a multiplicar: ");
        //val1=ingreso.nextDouble();
        //con_val1=(int)(val1);
        //result=con_val1*2;

        //System.out.print("El resultado "+con_val1+" * 2 es "+result);


        //Scanner ingreso=new Scanner(System.in);
        //String val1;
        //int result;
        //int con_val1;

        //System.out.println("Ingrese el valor a multiplicar: ");
        //val1=ingreso.nextLine();
        //con_val1=Integer.parseInt(val1);
        //result=con_val1*2;

        //System.out.print("El resultado "+con_val1+" * 2 es "+result);
    }
}