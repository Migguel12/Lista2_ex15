import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o primeiro lado do triangulo: ");
        double l1 = ler.nextDouble();
        System.out.println("");

        System.out.print("Informe o segundo lado do triangulo: ");
        double l2 = ler.nextDouble();
        System.out.println("");

        System.out.print("Informe o terceiro lado do triangulo: ");
        double l3 = ler.nextDouble();
        System.out.println("");

        if(l1 == l2 && l1 == l3){
            System.out.println("Triangulo equilatero");
        }

        if(l1 == l2 && l1 != l3){
            System.out.println("Triangulo Isosceles");
        }

        if(l1 == l3 && l2 != l3){
            System.out.println("Triangulo Isosceles");
        }

        if(l2 == l3 && l2 != l1){
            System.out.println("Triangulo Isosceles");
        }

        if(l1 != l3 && l2 != l3 && l1 != l2){
            System.out.println("Triangulo Escaleno");
        }
    }
}
