import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] datos_sismos = new String[10];
        menu();

        System.out.println("Hello world!");
    }

    public static void menu (){
        Scanner opcion = new Scanner(System.in);
        int opcionelegida = 0;
        System.out.println("Ingrese 1 para ingresar datos");
        System.out.println("Ingrese 2 para mostrar el sismo de mayor magnitud");
        System.out.println("Ingrese 3 para contar sismos mayores o iguales a 5.0");
        System.out.println("Ingrese 4 para enviar SMS por cada sismo mayor o igual a 7.0");
        System.out.println("Ingrese 5 para Salir");
        opcionelegida = opcion.nextInt();
        while (opcionelegida != 0){
            switch (opcionelegida){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return;
            }

        }

    }

}