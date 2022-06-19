import java.lang.*;
import java.util.*;

public class Exceptions
{
    public static  void main(String[] args) {
        float base,height,area;
        System.out.println("Enter base and height");
        Scanner sc =new Scanner(System.in);
        base=sc.nextFloat();
        height=sc.nextFloat();
        area=1f/2f*base*height;
        System.out.println("Area of Triangle is " +area );
    }
}
