
import java.util.Scanner;

class numb
{
public static Boolean retrunValue(int number)
{
  if(number<5)
{
     return  false;
}
  else if(number>5)
{
      return true;
}
return null;

}

public static void main(String[] args) {
   
    Scanner in=new Scanner(System.in);
    System.out.println("enter number");
    int number=in.nextInt();
    Boolean ab=retrunValue(number);
    System.out.println(ab);
    
}


}
