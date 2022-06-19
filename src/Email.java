import java.lang.*;


public class Email
{
    public static void main(String[] args)
    {
        String str1 = "programmer@gmail.com";
        int i = str1.indexOf("@");
        String username=str1.substring(0,i);
        String Domain=str1.substring(i+1, str1.length());
        System.out.println("Username :"+username);
        System.out.println("Domain  :" +Domain);

        int j=Domain.indexOf(".");
        String name=Domain.substring(0,j);
        System.out.println(name.equals("gmail"));
    }
}
