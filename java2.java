import java.util.Scanner;
class Java
{
  void add(int x, int y)
  {
    int sum=x+y;
    System.out.println("the sum of two numbers is :" + sum);
  }
  public static void main(String[] args)
  {
    Java j=new Java();
    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter the inputs");
    int n1=s.nextInt();
    int n2=s.nextInt();
    j.add(n1,n2);
    
  }
  
}
    
