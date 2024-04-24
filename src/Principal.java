import except.MiExcepcion;
import except.MiExcepcion2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws MiExcepcion2 {
        System.out.println("CAMBIO EN EL PROYECTO 2");
        Scanner sc = new Scanner(System.in);
        //Pedir nombre y, si no empieza por mayúscula salta MiExcepcion2
        System.out.println("Dime un nombre");
        String nombre = sc.nextLine();
        if (nombre.substring(0, 1).equals(nombre.substring(0,1).toLowerCase())){
            MiExcepcion2 e = new MiExcepcion2();
            throw e;
        }


        /*boolean comprobado = true;
        do {
            System.out.println("Dime un número entero");
            Scanner sc = new Scanner(System.in);
            try{
                int num = sc.nextInt();
                int r = 5/num;
                System.out.println(r);
            }catch (ArithmeticException a){
                System.out.println(a.getClass() + " Error en la operación");
            }catch (InputMismatchException b){
                System.out.println(b.getClass() + " Error en el número introducido");
            }catch (Exception c){
                System.out.println(c.getClass() + " Algo ha sucedido");
            }finally {

            }
        }while (comprobado);*/

        try {
            pedirNumero();
        } catch (MiExcepcion e) {
            System.out.println(e.getClass());
        }


    }
    public static void pedirNumero() throws MiExcepcion {
        Scanner sc = new Scanner(System.in);
        /*try{
            System.out.println("Dime un número: ");
            int n = sc.nextInt();
            System.out.println("Éxito");
        }catch (InputMismatchException a){
            sc.nextLine();
            System.out.println("Error");
        }*/
        System.out.println("Dime otro número");
        int n2 = sc.nextInt();
        if (n2 > 9){
            MiExcepcion e = new MiExcepcion();
            throw e;
        }
        System.out.println("Éxito");
    }
}