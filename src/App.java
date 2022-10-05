import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário por hora: ");
        double salariohora = sc.nextDouble();
        System.out.print("Digite suas horas trabalhadas por mês: ");
        double horas = sc.nextDouble();
        sc.close();

        double salariofinal = (salariohora * horas);

        System.out.println("No mês, você ganha " + salariofinal);
        
    }
    
}
