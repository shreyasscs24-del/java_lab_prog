import java.util.Scanner;
 class HelloWorld {
    public static void main(String args[]) {
    int a;float b ;String s;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the string");
    s=in.nextLine();
    System.out.println("You entered a string:" +s);
    System.out.println("Enter an integer");
    a=in.nextInt();
    System.out.println("You entered a integer:" +a);
    System.out.println("Enter an float");
    b=in.nextFloat();
    System.out.println("You entered a float:" +b);
    
}}
