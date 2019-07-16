import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int column_size = in.nextInt();
    int matrix1[][] = new int[row_size][column_size];
    for(int i = 0; i < row_size; i++){
      for(int j = 0; j < column_size; j++)
      {
        matrix1[i][j] = in.nextInt();
      }
    }
    int matrix2[][] = new int[row_size][column_size];
    for(int i = 0; i < row_size; i++){
      for(int j = 0; j < column_size; j++)
      {
        matrix2[i][j] = in.nextInt();
      }
    }
    int sub[][] = new int[row_size][column_size];
    substraction_of_2_matrices(matrix1, matrix2, sub);
    display_the_matrix(sub);
  }
  public static void substraction_of_2_matrices(int matrix1[][], int matrix2[][], int sub[][]){
    for(int i = 0; i <= sub.length - 1; i++){
      for(int j = 0; j <= sub[i].length - 1; j++)
      {
        sub[i][j] = matrix1[i][j] - matrix2[i][j];
      }
    }
  }
  public static void display_the_matrix(int matrix[][]){
    for(int i = 0; i <= matrix.length - 1; i++){
      for(int j = 0; j <= matrix[i].length - 1; j++)
      {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}