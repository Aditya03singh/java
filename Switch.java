import java.util.*;
class Switch{
public static void main(String[] args){
String monthName="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter month no:");
int month=sc.nextInt();
switch(month){
case 1:monthName="1-Jan";
break;
case 2:monthName="2-Feb";
break;
case 3:monthName="3-March";
break;
case 4:monthName="4-April";
break;
case 5:monthName="5-May";
break;
case 6:monthName="6-june";
break;
case 7:monthName="7-july";
break;
case 8:monthName="8-Aug";
break;
case 9:monthName="9-sept";
break;
case 10:monthName="10-oct";
break;
case 11:monthName="11-nov";
break;
case 12:monthName="12-dec";
break;
default:System.out.println("Invalid Month!");    
    }    
    System.out.println(monthName);  
}    
}   
