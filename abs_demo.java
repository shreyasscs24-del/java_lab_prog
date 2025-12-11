import java.util.Scanner;
abstract  class shape{
    int l;
    int b;
   
public shape(int l,int b) {
        this.l=l;
        this.b=b;
        
    }
 abstract  void  printArea();

}
class  Rectangle extends shape{
    public Rectangle(int l,int b){
        super(l, b);
    }
    void printArea() {
       double area =l*b;
       System.out.println("Area of Rectangle:  "+area);
    }
    }
 class Triangle extends shape{
    public Triangle(int l,int b){
        super(l, b);
    }
    void printArea(){
        double area=(0.5*l*b);
        System.out.println("The area of triangle:  "+area);

    }
 }

 class Circle extends shape{
    public Circle(int l,int b){
        super(l,b);
    }
    void printArea(){
        double area=(3.14*l*l);
        System.out.println("The area of circle is:  "+area);
    }
 }
  

 class abs_demo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value of l :");
    int a = sc.nextInt();
    System.out.print("enter the value of b :");
    int b = sc.nextInt();
     Rectangle r=new Rectangle(a,b);
     r.printArea();


      Triangle t=new Triangle(a,b);
     t.printArea();


      Circle c=new Circle(a,b);
     c.printArea();

}
    
}


