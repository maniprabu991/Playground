import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
    String string = in.nextLine();
		string = string.replaceAll("[AaEeIiOoUu]", "");
		System.out.println(string);
  }
}