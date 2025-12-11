import java.util.*;
class student{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of subject:");
        int m = sc.nextInt();
        int [] credits = new int[m];
        int [] marks = new int[m];

            System.out.println("Enter the name:");
            String name = sc.nextLine();
            System.out.println("Enter the usn:");
            String usn = sc.nextLine();
           
            for(int j=0; j<m;j++){
                System.out.println("Enter the credits:");
                int i = sc.nextInt();
                credits[j]= i;
                System.out.println("Enter the marks:");
                int l = sc.nextInt();
                int  mark= (int)Math.ceil((l/10));
                marks[j]= mark;
            }
            int creditSum=0;
            for(int a = 0 ; a<credits.length ; a++){
                creditSum = creditSum + credits[a] ;
            }
            float sgpa = 0;
         for(int j = 0 ; j<m ; j++){
            sgpa = (sgpa + (credits[j]*marks[j]))/creditSum;
        }

    System.out.println("the sgpa is :" + sgpa);
        }
       
    }
