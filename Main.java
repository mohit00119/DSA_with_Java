
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // output

        // System.out.println("Hello Java");
        // System.out.println("Hello World");   
        
        // Pattern

        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");

        // Variables

        // String name = "John";
        // int age = 22;
        // int a = 25;
        // int b = 30;
        // double c = 5.5;

        // int a = 10;
        // int b = 20;
        // int sum = a + b;
        // // System.out.println(sum);

        // int diff = b - a;
        // // System.out.println(diff);

        // int mul = a * b;
        // // System.out.println(mul);

        // int div = b / a;
        // System.out.println(div);

        // Input

        // Scanner sc= new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.print( name);

        // Scanner sc= new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

        Scanner sc= new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age>=18){
        //     System.out.println("Adult");
        // } else {
        //     System.out.println("not Adult");
        // }


        // int x = sc.nextInt();
        // if(x%2==0){
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }

        // int a = sc.nextInt();
        // int b = sc.nextInt(); 
        // if(a == b){
        //     System.out.println("Equal");
        // } else {
        //     if(a > b){
        //         System.out.println("a is greater");
        //     } else {
        //     System.out.println("b is greater");
        //     }
        // }
        // int button = sc.nextInt();

        // Switch(button){
        //     case 1:
        //         System.out.println("Hello");
        //         break;
        //     case 2:
        //         System.out.println("Namaste");
        //         break;
        //     case 3:
        //         System.out.println("Bonjour");
        //         break;
        //     default:
        //         System.out.println("Invalid Input");

        int x = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(i * x);
        }
    }
}
