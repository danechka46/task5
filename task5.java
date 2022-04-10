import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 2 переменные");
        double a = s.nextDouble();
        double b = s.nextDouble();
        System.out.println("Введите операцию");
        String znak = s.next();

        double answer = 0;
        switch (znak){
            case "+": answer = a+b;
                System.out.println(answer);
                break;
            case "-": answer = a-b;
                System.out.println(answer);
                break;
            case "/": answer = a/b;
                System.out.println(answer);
                break;
            case "*": answer = a*b;
                System.out.println(answer);
                break;
            default:
                System.out.println("Ошибка!!!");
        }

    }
}