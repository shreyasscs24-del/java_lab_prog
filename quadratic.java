import java.util.*;
class quadratic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a:");
        double a = sc.nextDouble();
         System.out.print("enter the value of b:");
        double b = sc.nextDouble();
         System.out.print("enter the value of c:");
        double c = sc.nextDouble();
        double d= (b*b)-4*a*c;
        if (a==0){
            System.out.print("a cant be zero");
        }else if (d>0){
            System.out.print("Two real root");
            double firstRoot = (-b+Math.sqrt(d))/(2*a);
            double secondRoot = (-b-Math.sqrt(d))/(2*a);
            System.out.println("the two roots are" + firstRoot +secondRoot);
        }
        else if( d==0){
            System.out.println(" repeated roots ");
            double root = -b /( 2*a);
            System.out.println("roots are " + root);
        }
        else if (d<0) {
            System.out.println("No real roots!");
        }
        else {
            System.out.println("Invalid number ");
        }
    
    }
}