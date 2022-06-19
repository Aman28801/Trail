import java.util.Scanner;

public class Area
{

    public static void main(String[] args) {
        float a, b, c, s;
        Double Ar ;
        System.out.println("Enter the value of a, b ,c");
        Scanner sc = new Scanner(System.in);
        a= sc.nextFloat();
        b= sc.nextFloat();
        c= sc.nextFloat();
        s= (a+b+c)/2;
        Ar =Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area :"+ Ar);
    }
}
