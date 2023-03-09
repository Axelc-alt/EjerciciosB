import java.util.Scanner;

public class EjercicioJ {
    /**
     * Pedir al estudiante tres notas y diga la nota finqal del curso
     * la primera y segunda nota equivalen al 30% de la nota final cada una y
     * la tercera nota es el 40%.
     * mostrar nota final y si aprobó o no(nota mínina 7)
     * **/

    public static void Calcular(){
        Scanner in = new Scanner(System.in);
        int notaUno =0, notaDos = 0, notaTres = 0;
        double promedio = 0;
        int ban;

        //Validación de datos
        //primer do while
        do {
            try {
                ban =0;
                System.out.println("Ingrese su primera nota");
                notaUno = in.nextInt();
            }catch (Exception e){
                System.out.println("Caracter inválid");
                ban = 1;
                in.nextLine();
            }
        }while (ban!=0);

        //Segundo do while
        do {
            try {
                ban =0;
                System.out.println("Ingrese su segunda nota");
                notaDos = in.nextInt();
            }catch (Exception e){
                System.out.println("Caracter inválido");
                ban = 1;
                in.nextLine();
            }
        }while (ban!=0);

        //Tercer do while
        do {
            try {
                ban =0;
                System.out.println("Ingrese su tercera nota");
                notaTres = in.nextInt();
            }catch (Exception e){
                System.out.println("caracter inválido");
                ban = 1;
                in.nextLine();
            }
        }while (ban!=0);

        //Calculo del promedio
        promedio =(notaUno*0.3)+(notaDos*0.3)+(notaTres*0.4);

        //condicion de aprobar o reprobar
        if (promedio>=7&&promedio<=10){
            System.out.println("Felicidades aprobó");
            System.out.println("su nota final es "+promedio);
        }else if(promedio<=6.9&&promedio>=1){
            System.out.println("Usted reprobó el curso");
            System.out.println("su nota final es "+promedio);
        }else{
            System.out.println("Intente ingresar números reales");
        }
    }


}
