import java.util.Scanner;
class Main{
  public static int sum(int m)
  {
    int sum = 0;
    while(m!=0)
    {
      int a = m;
      sum = sum + a;
      m = m - 1;
    }
    return sum;
  }
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum1 = sum(n);
      System.out.println(sum1);
	}
}