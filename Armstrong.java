import java.util.*;
class Armstrong{
public static void main(String[] args){
int temp,sum=0,r;
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();
temp=n;
while(n>0)
{
r=n%10;
sum=sum+(r*r*r);
n=n/10;
}
if(temp==sum)
System.out.println("ARMSTRONG NUMBER");
else
System.out.println("NOT ARMSTRONG NUMBER");
}
}
