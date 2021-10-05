import java.util.*;
class Numbers{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();
if(n>0)
{
System.out.println("POSITIVE NUMBER");
}
else if(n<0)
{
System.out.println("NEGATIVE NUMBER");
}
else
{
System.out.println("ZERO");
}
}
}