import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Ejercicio47();


    }

    public static void Ejercicio1(){
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void Ejercicio2(){
        for (int i = 2; i <= 200; i+=2) {
            System.out.println(i);
        }
    }

    public static void Ejercicio3(){
        for (int i = 25; i <= 122; i++) {
            System.out.println(i);
        }
    }

    public static void Ejercicio4(){
        Scanner in = new Scanner(System.in);
        System.out.println("ingrerse primer número");
        int x = in.nextInt();
        System.out.println("ingrerse segundo número");
        int y = in.nextInt();
        while (x<=y){
            System.out.println(x);
            x++;
        }
    }

    public static void Ejercicio5(){
        Scanner in = new Scanner(System.in);

        int cont = 0, sueldo = 0, contMayor = 0, contMenor = 0;
        int i=0, x=0;
        int myArrayMas[]= new int[10];
        int myArrayMemos[]= new int[10];
        while (cont<10){
            cont++;
            System.out.println("Ingrese el "+cont+" sueldo");
            sueldo = in.nextInt();

            if (sueldo>=400){
                contMayor++;
                myArrayMas[i]=sueldo;
                i++;
            }else if(sueldo<400){
                contMenor++;
                myArrayMemos[x]=sueldo;
                x++;
            }

        }

        System.out.println("El número de sueldos mayores o igual a 400 es: "+contMayor);
        for (int j = 0; j < contMayor; j++) {
            System.out.println(myArrayMas[j]);
        }
        System.out.println("El numero de sueldos inferiores a 400 es: "+contMenor);
        for (int j = 0; j < contMenor; j++) {
            System.out.println(myArrayMemos[j]);
        }

    }

    public static void Ejercicio6(){
        Scanner in = new Scanner(System.in);

        int i = 0, venta = 0, contA = 0, contB = 0, contC = 0;

        while (i<10){
            i++;
            System.out.println("Ingrese la "+i+" venta");
            venta = in.nextInt();

            if (venta<100){
                contA++;
            }
            else if(venta>=100 && venta<=300){
                contB++;
            }
            else if(venta>300){
                contC++;
            }

        }
        System.out.println("Las ventas menores que 100 son: "+contA+
                "\nLas ventas entre 100 y 300  son: "+contB+
                "\nlas ventas mayores a 300 son: "+contC);
    }

    public static void Ejercicio7(){
        for (int i = 10; i <=50; i++) {
            System.out.println(i);
        }
    }

    public static void Ejercicio8(){
        for (int i = 20; i <=100; i+=2) {
            System.out.println(i);
        }
    }

    public static void Ejercicio9(){
        for (int i = 30; i <=90; i+=3) {
            System.out.println(i);
        }
    }

    public static void Ejercicio10(){
        for (int i = 25; i <=100; i+=5) {
            System.out.println(i);
        }
    }

    public static void Ejercicio11(){
        for (int i = 70; i <=140; i+=7) {
            System.out.println(i);
        }
    }

    public static void Ejercicio12(){
        for (int i = 27; i <=90; i+=9) {
            System.out.println(i);
        }
    }

    public static void Ejercicio13(){
        int cont=0;
        for (int i = 0; i <20; i++) {
            System.out.println(cont);
            cont+=3;
        }
    }

    public static void Ejercicio14(){
        int cont=0;
        for (int i = 0; i <15; i++) {
            System.out.println(cont);
            cont+=7;
        }
    }

    public static void Ejercicio15(){
        Scanner in = new Scanner (System.in);
        int cont=0, tabla;
        System.out.print("Número de la tabla de multiplicar que desea ver\ntabla del: ");
        tabla = in.nextInt();

        do {
            switch (tabla){
                case 1:
                    for (int i = 0; i <=12; i++) {
                        System.out.println("1 x "+i+" = "+cont);
                        cont++;
                    }
                    cont=0;
                    System.out.println("ingrese un nuevo número o 0 para salir.");
                    tabla = in.nextInt();
                    break;
                case 2:
                    for (int i = 0; i <=12; i++) {
                        System.out.println("2 x "+i+" = "+cont);
                        cont+=2;
                    }
                    cont=0;
                    System.out.println("ingrese un nuevo número o 0 para salir.");
                    tabla = in.nextInt();
                    break;
                case 3:
                    for (int i = 0; i <=12; i++) {
                        System.out.println("3 x "+i+" = "+cont);
                        cont+=3;
                    }
                    cont=0;
                    System.out.println("ingrese un nuevo número o 0 para salir.");
                    tabla = in.nextInt();
                    break;

                case 4:
                    for (int i = 0; i <=12; i++) {
                        System.out.println("4 x "+i+" = "+cont);
                        cont+=4;
                    }
                    cont=0;
                    System.out.println("ingrese un nuevo número o 0 para salir.");
                    tabla = in.nextInt();
                    break;

                case 5:
                    for (int i = 0; i <=12; i++) {
                        System.out.println("5 x "+i+" = "+cont);
                        cont+=5;
                    }
                    cont=0;
                    System.out.println("ingrese un nuevo número o 0 para salir.");
                    tabla = in.nextInt();
                    break;

                case 6:
                    for (int i = 0; i <=12; i++) {
                        System.out.println("6 x "+i+" = "+cont);
                        cont+=6;
                    }
                    cont=0;
                    System.out.println("ingrese un nuevo número o 0 para salir.");
                    tabla = in.nextInt();
                    break;

                case 7:
                    for (int i = 0; i <=12; i++) {
                        System.out.println("7 x "+i+" = "+cont);
                        cont+=7;
                    }
                    cont=0;
                    System.out.println("ingrese un nuevo número o 0 para salir.");
                    tabla = in.nextInt();
                    break;

                case 8:
                    for (int i = 0; i <=12; i++) {
                        System.out.println("8 x "+i+" = "+cont);
                        cont+=8;
                    }
                    cont=0;
                    System.out.println("ingrese un nuevo número o 0 para salir.");
                    tabla = in.nextInt();
                    break;

                case 9:
                    for (int i = 0; i <=12; i++) {
                        System.out.println("9 x "+i+" = "+cont);
                        cont+=9;
                    }
                    cont=0;
                    System.out.println("ingrese un nuevo número o 0 para salir.");
                    tabla = in.nextInt();
                    break;

                case 10:
                    for (int i = 0; i <=12; i++) {
                        System.out.println("10 x "+i+" = "+cont);
                        cont+=10;
                    }
                    cont=0;
                    System.out.println("ingrese un nuevo número o 0 para salir.");
                    tabla = in.nextInt();
                    break;

                default:
                    cont=0;
                    System.out.println("ninguna tabla se multiplicar seleccionada\ningrese un nuevo número o 0 para salir.");
                    tabla = in.nextInt();
            }
        }while (tabla!=0);
    }

    public static void Ejercicio16(){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el valor de n");
        n= in.nextInt();
        do {
            System.out.println(n);
            n-=2;
        }while (n != 0);
    }

    public static void Ejercicio17(){
        int cont =0,nun=1;
        do {
            cont++;
            if (nun%2!=0){
                System.out.println(nun);
                nun++;
            }else{
                nun++;
            }
        }while (cont<20);
    }

    public static void Ejercicio18(){
        Scanner in = new Scanner(System.in);
        int cont =0, sueldo,suma=0,promedio;
        do {

            cont++;
            System.out.println("Ingrese el "+cont+" sueldo");
            sueldo = in.nextInt();
            suma+=sueldo;

        }while (cont<10);
        promedio=suma/10;
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+promedio);
    }

    public static void Ejercicio199(){
        Scanner in = new Scanner(System.in);
        int n,intNun;
        Double resultado = 1.0;

        System.out.println("Ingrese un número entero");

        n = in.nextInt();

        ArrayList<Double> factorial= new ArrayList<>();

        for (int i = 0; i <n ; i++) {

            factorial.add(i,i+1.0);

            resultado = resultado*factorial.get(i);
        }

        if(!(n>=14)){
            intNun = resultado.intValue();
            System.out.println("El factorial de "+n+" es: "+intNun);

        }else {
            System.out.println("El factorial de "+n+" es: "+resultado);
        }

    }

    public static void Ejercicio19(){
        Scanner in = new Scanner(System.in);
        int n,iResultado;
        Double dResultado = 1.0;

        System.out.println("Ingrese un número entero");
        n = in.nextInt();

        for (int i = 1; i<=n ; i++) {
            dResultado = dResultado*i;
        }

        if(n>=14){
            System.out.println("El factorial de "+n+" es: "+dResultado);
        }else {
            iResultado = dResultado.intValue();
            System.out.println("El factorial de "+n+" es: "+iResultado);
        }

    }

    public static void Ejercicio20(){
        Scanner in = new Scanner(System.in);
        int a,b, resultado=0;

        System.out.println("Ingrese primer número");
        a = in.nextInt();
        System.out.println("Ingrese segundo número");
        b = in.nextInt();

        for (int i=1; i<=b; i++){
            resultado += a;
        }
        System.out.println("El resulado es: "+resultado);
    }

    public static void Ejercicio21(){
        Scanner in = new Scanner(System.in);
        int cont =0,edad,contMayor=0,contMenor=0;

        do {
            cont++;
            System.out.println("Ingrese la edad del "+cont+" estudiante");
            edad = in.nextInt();

            if (edad>=18){
                contMayor++;
            }else{
                contMenor++;
            }

        }while (cont<4);

        System.out.println(contMayor+" Estudiantes son mayores de edad");
        System.out.println(contMenor+" Estudiantes son menores de edad");
    }

    public static void Ejercicio22(){
        int suma =0;

        for (int i = 1; i <= 20; i++) {
            System.out.print(i+"+");
            suma+=i;
        }
        System.out.println("\nEl resultado es: "+suma);
    }

    public static void Ejercicio23(){
        int suma =0;

        for (int i = 15; i <= 100; i+=5) {
            System.out.println(i);
            suma+=i;
        }
        System.out.println("El resultado es: "+suma);
    }

    public static void Ejercicio24(){
        Scanner in = new Scanner(System.in);
        int suma =0,n;

        System.out.println("Ingrese el número hasta se sumará");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            suma+=i;
        }
        System.out.println("El resultado es: "+suma);
    }

    public static void Ejercicio25(){
        double suma =0,contA=1,contB=2;
        int cont=0;
        String a,b;

        while (cont<8){
            cont++;
            a =String.valueOf(contA);
            b =String.valueOf(contB);

            System.out.println( a.substring(0,a.length()-2)+ "/"
                    +b.substring(0,b.length()-2));

            suma+=(contA/contB);
            contA+=2;
            contB+=2;

        }
        System.out.println("El resultado es: "+suma);
    }

    public static void Ejercicio26(){
        Scanner in = new Scanner(System.in);
        double suma =0,n=1,cont,numUno,numDos,i=0;

        System.out.println("ingrese el valor de n");
        cont=in.nextDouble();

        while (cont>i){
            i++;
            numUno =(2*n-1);
            numDos =2*n;

            suma+=(numUno/numDos);
            System.out.println(numUno+"/" +numDos);
            n++;
        }
        System.out.println("El resultado es: "+suma);
    }

    public static void Ejercicio27(){
        double suma =0,cont=0,n1=3,n2=5;
        double numUno,numDos,a=1,b=1;

        while (cont<10){
            cont++;
            numUno =(n1*a);
            numDos =(n2*b);
            suma+=(numUno/numDos);

            System.out.println(numUno+"/" +numDos);
            n1+=3;
            n2+=5;
            a++;
            b++;
        }
        System.out.println("El resultado es: "+suma);
    }

    public static void Ejercicio28(){
        Scanner in = new Scanner(System.in);
        double suma =0,n=1,cont,numUno,numDos;

        System.out.println("ingrese el valor de n");
        cont=in.nextDouble();

        for (int j = 1; j <= cont; j++) {
            numUno =n;
            numDos =(n+1);
            suma+=(numUno/numDos);
            System.out.println(numUno+"/" +numDos);
            n+=2;
        }
        System.out.println("El resultado es: "+suma);
    }

    public static void Ejercicio29(){
        double num1=0,num2=0,num3,a=1,suma=0;

        for (int i = 1; i<=10;i++){
            num1+=3;
            num2+=6;
            num3=(num2*a);
            suma+=(num1/num3);
            System.out.println(num1+"/"+num3);
            a++;
        }
        System.out.println("El resultado es: "+suma);
    }

    public static void Ejercicio30(){
        double resultado=1,suma=0;

        for (int x = 2; x <=20 ; x+=2) {

            for (int i = 1; i<=x ; i++) {
                resultado = resultado*i;
            }
            suma+=resultado;
            System.out.println(x+"!= "+resultado);
            resultado=1.0;

        }
        System.out.println("la suma es: "+suma);
    }

    public static void Ejercicio31(){
        Scanner in = new Scanner (System.in);
        int peso,cont=0,contP1=0,contP2=0,contP3=0;

        while (cont<5){
            cont++;
            System.out.println("Ingrese el "+cont+" peso");
            peso = in.nextInt();

            if (peso>=60 && peso<=121){
                contP1++;
            } else if (peso<60) {
                contP2++;
            }else {
                contP3++;
            }
        }
        System.out.println(contP1+" personas pesan de 60 a 121 kg");
        System.out.println(contP2+" personas pesan menos de 60 kg");
        System.out.println(contP3+" personas pesan más de 121 kg");
    }

    public static void Ejercicio32(){
        Scanner in = new Scanner (System.in);
        int edad,cont=0,contE1=0,contE2=0,contE3=0;

        while (cont<5){
            cont++;
            System.out.println("Ingrese la "+cont+" edad");
            edad = in.nextInt();

            if (edad>=17 && edad<=35){
                contE1++;
            } else if (edad<17) {
                contE2++;
            }else {
                contE3++;
            }
        }
        System.out.println(contE1+" personas tienen de 17 a 35 años");
        System.out.println(contE2+" personas tienen menos de 17 años");
        System.out.println(contE3+" personas tienen más de 35 años");
    }

    public static void Ejercicio33(){
        Scanner in = new Scanner (System.in);
        int nota,N,i=0,contN1=0,contN2=0,contN3=0;

        System.out.println("ingrese el número de estudiantes");
        N=in.nextInt();

        while (i<N){
            i++;
            System.out.println("ingrese la calificación del "+i+" estudiante");
            nota= in.nextInt();
            
            if (nota>=0 && nota<5){
                contN1++;
            } else if (nota>=5 && nota<=7) {
                contN2++;
            } else if (nota>7 && nota<=10) {
                contN3++;
            }
        }
        System.out.println(contN1+" estudiantes tienen notas de 0 a 4");
        System.out.println(contN2+" estudiantes tienen notas de 5 a 7");
        System.out.println(contN3+" estudiantes tienen notas de 8 a 10");
    }

    public static void Ejercicio34(){
        Scanner in = new Scanner (System.in);
        int peso,contP1=0,contP2=0,contP3=0,x;

        System.out.println("ingrese el número de personas");
        x=in.nextInt();

        for (int i = 1; i <=x ; i++) {
            System.out.println("Ingrese el "+i+" peso");
            peso = in.nextInt();

            if (peso>=60 && peso<=121){
                contP1++;
            } else if (peso<60) {
                contP2++;
            }else {
                contP3++;
            }
        }
        System.out.println(contP1+" personas pesan de 60 a 121 kg");
        System.out.println(contP2+" personas pesan menos de 60 kg");
        System.out.println(contP3+" personas pesan más de 121 kg");
    }

    public static void Ejercicio35(){
        Scanner in = new Scanner (System.in);
        int edad,contE1=0,contE2=0,contE3=0,y;

        System.out.println("ingrese el número de estudiantes");
        y=in.nextInt();

        for (int i = 1; i <=y; i++) {
            System.out.println("Ingrese la "+i+" edad");
            edad = in.nextInt();

            if (edad>=17 && edad<=35){
                contE1++;
            } else if (edad<17) {
                contE2++;
            }else {
                contE3++;
            }
        }
        System.out.println(contE1+" personas tienen de 17 a 35 años");
        System.out.println(contE2+" personas tienen menos de 17 años");
        System.out.println(contE3+" personas tienen más de 35 años");
    }

    public static void Ejercicio36(){
        Scanner in= new Scanner(System.in);
        int num;

        do {
            System.out.println("ingrese números entre 15 y 55");
            num= in.nextInt();

            if (num>=15 && num<=55){
                System.out.println("número válido");
            }else {
                System.out.println("númeor fuera del rango");

            }
        }while (num<15 || num>55);
    }

    public static void Ejercicio37(){
        Scanner in= new Scanner(System.in);
        int num;

        do {
            System.out.println("ingrese números entre 1 y 12");
            num= in.nextInt();

            if (num>=1 && num<=12){
                System.out.println("número válido");
            }else {
                System.out.println("númeor fuera del rango");

            }
        }while (num<1 || num>12);
    }

    public static void Ejercicio38(){
        Scanner in= new Scanner(System.in);
        int num;

        do {
            System.out.println("ingrese números entre 115 y 415");
            num= in.nextInt();

            if (num>=115 && num<=415){
                System.out.println("número válido");
            }else {
                System.out.println("númeor fuera del rango");
            }
        }while (num<115 || num>415);
    }

    public static void Ejercicio39(){
        Scanner in = new Scanner (System.in);
        int n,nota,cont1=0,cont2=0,promedio1,promedio2,suma1=0,suma2=0;

        System.out.println("Ingrese el número de estudiantes");
        n=in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("ingrese la nota del "+i+" estudiante");
            nota=in.nextInt();
            if (nota>=7){
                cont1++;
                suma1=(suma1+nota);
            }else {
                cont2++;
                suma2+=nota;
            }
        }
        promedio1=(suma1/cont1);
        promedio2=(suma2/cont2);
        System.out.println(cont1+" estudiantes tienen notas de 7 en adelante\npromedio: "+promedio1);
        System.out.println(cont2+" estudiantes tienen notas de menores de 7 \npromedio: "+promedio2);
    }

    public static void Ejercicio40(){
        Scanner in = new Scanner (System.in);

        int n,peso,suma1=0,suma2=0,suma3=0,suma4=0;
        int promedio1,promedio2,promedio3,promedio4;
        int cont1=0,cont2=0,cont3=0,cont4=0;

        System.out.println("Ingrese el número de estudiantes");
        n=in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("ingrese el peso del "+i+" estudiante");
            peso=in.nextInt();
            if (peso>=40 && peso<=50){
                cont1++;
                suma1+=peso;
            } else if (peso>50 && peso<60) {
                cont2++;
                suma2+=peso;
            } else if (peso>=60) {
                cont3++;
                suma3+=peso;
            }else {
                cont4++;
                suma4+=peso;
            }
        }
        promedio1=(suma1/cont1);
        promedio2=(suma2/cont2);
        promedio3=(suma3/cont3);
        promedio4=(suma4/cont4);
        System.out.println(cont1+" estudiantes tienen un peso entre 40 y 50 kg.\npromedio: "+promedio1);
        System.out.println(cont2+" estudiantes tienen un peso de más de 50 kg y menos de 60 kg. \npromedio: "+promedio2);
        System.out.println(cont3+" estudiantes tienen un peso mayor o igual a 60 kg. \npromedio: "+promedio3);
        System.out.println(cont4+" estudiantes tienen un peso menor a 40 kg. \npromedio: "+promedio4);
    }

    public static void Ejercicio41(){
        Scanner in = new Scanner(System.in);
        int n, sueldo,cont1=0,cont2=0,cont3=0,cont4=0;
        int suma1=0,suma2=0,suma3=0,suma4=0;

        do {
            System.out.println("Ingrese el número de trabajadores");
            n= in.nextInt();
            if (n<10){
                System.out.println("El número no puede ser menor a 10");
            }
        }while(n<10);

        for (int i = 1; i <= n ; i++) {
            System.out.println("Ingrese el sueldo del "+i+" trabajador");
            sueldo = in.nextInt();

            if (!(sueldo==0)){
                if (sueldo<=150){
                    cont1++;
                    suma1+=sueldo;
                }
                else if(sueldo>151 && sueldo<300){
                    cont2++;
                    suma2+=sueldo;
                }
                else if(sueldo>300 && sueldo<450){
                    cont3++;
                    suma3+=sueldo;
                }
                else if(sueldo>=450){
                    cont4++;
                    suma4+=sueldo;
                }
            }else{
                System.out.println("El sueldo no puede ser 0");
                i--;
            }
        }
        suma1=(suma1/cont1);
        suma2=(suma2/cont2);
        suma3=(suma3/cont3);
        suma4=(suma4/cont4);
        System.out.println("personas con sueldo menor igual a 150\nNúmero: "+cont1+" Promedio: "+suma1);
        System.out.println("personas con sueldo mayor a 150 y menor a 300\nNúmero: "+cont2+" Promedio: "+suma2);
        System.out.println("personas con sueldo mayor a 300 y menor a 450\nNúmero: "+cont3+" Promedio: "+suma3);
        System.out.println("personas con sueldo mayor a 450\nNúmero: "+cont4+" Promedio: "+suma4);
    }

    public static void Ejercicio42(){
        Scanner in = new Scanner(System.in);
        int n, sueldo, desct;
        int[] sueldos;

        do {
            System.out.println("Ingrese el número de trabajadores");
            n = in.nextInt();
            if (n<5){
                System.out.println("EL número de trabajadores no puede ser menor a 5");
            }
        }while (n<5);

        sueldos = new int[n];

        for (int i=0; i<n; i++){
            System.out.println("ingrese el sueldo del "+(i+1)+" trabajador");
            sueldo= in.nextInt();

            if (!(sueldo<=0)){
                if (sueldo<=150){
                    desct=(sueldo*5)/100;
                    sueldos[i]=(sueldo-desct);
                }else if(sueldo>150 && sueldo<300){
                    desct=(sueldo*7)/100;
                    sueldos[i]=(sueldo-desct);
                } else if(sueldo>300 && sueldo<450){
                    desct=(sueldo*9)/100;
                    sueldos[i]=(sueldo-desct);
                }else{
                    sueldos[i]=sueldo;
                }
            }else{
                System.out.println("El sueldo no puede ser menor o igual a 0");
                i--;
            }
        }
        for (int j = 0; j < sueldos.length; j++) {
            System.out.println("el sueldo del "+(j+1)+" trabajador es: "+sueldos[j]);
        }
    }

    public static void Ejercicio43(){
        Scanner in = new Scanner(System.in);
        int n,edad,cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;

        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("ingrese la edad de la "+i+" persona");
            edad = in.nextInt();
            if (edad>=1 && edad<=80){
                if (edad<15){
                    cont1++;
                }
                else if (edad>=15 && edad<18) {
                    cont2++;
                }
                else if (edad>=18 && edad<=25) {
                    cont3++;
                }
                else if (edad>25 && edad<35) {
                    cont4++;
                }
                else if (edad>=35) {
                    cont5++;
                }
            }else{
                System.out.println("La edad tiene que ser entre 1 y 80 años");
                i--;
            }
        }
        System.out.println(cont1+" Personas tienen menos de 15 años");
        System.out.println(cont2+" Personas tienen de 15 a 17 años");
        System.out.println(cont3+" Personas tienen entre 18 y 25 años");
        System.out.println(cont4+" Personas tienen entre 26 y 34 años");
        System.out.println(cont5+" Personas tienen de 35 años en adelante");
    }

    public static void Ejercicio44(){
        Scanner in = new Scanner(System.in);
        int n, venta, cont1=0,cont2=0,cont3=0,monto1=0,monto2=0,monto3=0,total;

        do {
            System.out.print("Número de ventas realizadas en el día: ");
            n= in.nextInt();
            if (n<=10){
                System.out.println("El número de ventas tienen que ser mayor a 10");
            }
        }while (n<=10);

        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese la "+i+" venta");
            venta= in.nextInt();

            if (venta>0){
                if (venta>1000){
                    cont1++;
                    monto1+=venta;
                }
                else if (venta<=500) {
                    cont3++;
                    monto3+=venta;
                }
            }else {
                System.out.println("La venta tiene que ser mayor a 0");
                i--;
            }

        }


        total= (monto1+monto2+monto3);
        System.out.println("Ventas mayor a 1000: "+cont1+"\nTotal categoría: "+monto1);
        System.out.println("Ventas entre 501 y 1000: "+cont2+"\nTotal categoría: "+monto2);
        System.out.println("Ventas menores o igual a 500: "+cont3+"\nTotal categoría: "+monto3);
        System.out.println("Monto total: "+total);
    }

    public static void Ejercicio45(){
        Scanner in = new Scanner(System.in);
        int n,tam;
        String cadena="";

        do {
            System.out.println("Ingrese un número de 10 dígitos");
            n=in.nextInt();
            cadena=String.valueOf(n);
            tam=cadena.length();
            if (tam!=10){
                System.out.println("El número tiene que ser de 10 dígitos. Intente de nuevo");
            }
        }while (tam!=10);

        for (int i = 0; i < tam; i++) {
            System.out.println(cadena.substring(0,i+1));
        }


    }

    public static void Ejercicio46(){
        Scanner in= new Scanner(System.in);

        int diaint, mesint, añoint;
        int n1,n2,n3,n4,n5,n6,n7,n8,x=0,resultado;

        String diastr="",messtr="",añostr="";

        String[] myarrd =new String[2];
        String[] myarrm =new String[2];
        String[] myarra =new String[4];

        int[] myarrdint =new int[2];

        System.out.println("ingrese su fecha de nacimiento");
        System.out.println("Formato: dd-mm-aa");

        //validación
        do {
            System.out.print("Día: ");
            diastr= in.nextLine();
            diaint = Integer.parseInt(diastr);
            if (diaint>31){
                System.out.println("Dia no puede ser mayor a 31");
            } else if (diastr.length()!=2) {
                System.out.println("numero incorrecto. Ejemplo: 05 07  21 18");
            }
        }while (diastr.length()!=2 || diaint>31);

        do {
            System.out.print("Mes: ");
            messtr= in.nextLine();
            mesint=Integer.parseInt(messtr);
            if (mesint>12){
                System.out.println("El mes no puede ser mayor a 12");
            } else if (messtr.length()!=2) {
                System.out.println("numero incorrecto. Ejemplo: 02 04  12 10");
            }
        }while (messtr.length()!=2 || mesint>12);

        do {
            System.out.print("Año: ");
            añostr= in.nextLine();
            añoint= Integer.parseInt(añostr);
            if (añoint>2023){
                System.out.println("El mes no puede ser mayor a 2023");
            } else if (messtr.length()!=4) {
                System.out.println("numero incorrecto. Ejemplo: 1980 2010");
            }
        }while (añostr.length()!=4 || añoint>2023);

        //asignación a Arrays
        for (int i = 0; i < myarrd.length; i++) {
            myarrd[i]=diastr.substring(i,i+1);
            myarrm[i]=messtr.substring(i,i+1);

        }
        for (int i = 0; i < myarra.length; i++) {
            myarra[i]=añostr.substring(i,i+1);
        }


        n1=Integer.parseInt(myarrd[x]);
        x++;
        n2=Integer.parseInt(myarrd[x]);
        x=0;
        n3=Integer.parseInt(myarrm[x]);
        x++;
        n4=Integer.parseInt(myarrm[x]);
        x=0;
        n5=Integer.parseInt(myarra[x]);
        x++;
        n6=Integer.parseInt(myarra[x]);
        x++;
        n7=Integer.parseInt(myarra[x]);
        x++;
        n8=Integer.parseInt(myarra[x]);
        resultado=n1+n2+n3+n4+n5+n6+n7+n8;
        System.out.println("número de la suerte: "+resultado);

    }

    public static void Ejercicio47(){
        String name = "Axel Pinargote";
        System.out.println(name.charAt(5));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());


        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            System.out.print("-");
        }

        System.out.println(" ");
        String apodo = name.substring(0,2)+name.substring(5,7);
        System.out.println(apodo.toUpperCase());
        System.out.println(apodo.toLowerCase());
        System.out.println(apodo.replace("i","y"));

        StringBuilder prueba = new StringBuilder();

        prueba.append("Hola ");
        prueba.append("Mundo ");
        prueba.append("Verde Azul Rosado ");

        System.out.println(prueba.toString());
    }
}


