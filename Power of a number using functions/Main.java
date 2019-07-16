import java.util.Scanner;
class Main{
  public static int pow(int base,int exponent)
  {
    int result = 1;
    while(exponent != 0)
    {
      result = result * base;
      --exponent;
      
    }
    return result;
  }
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int base1 = in.nextInt();
      int exponent1=in.nextInt();
      int result1= pow(base1,exponent1);
      System.out.println(result1);
	}
}