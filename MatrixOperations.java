import java.util.Scanner;
public class MatrixOperations
{
 public static void main(String[] args)
 {
 Scanner in= new Scanner(System.in);
 int [][] a=new int[10][10];
 int [][] b=new int[10][10];
 int m,n,i,j;
 System.out.println("Enter row and column:");
 m=in.nextInt();
 n=in.nextInt();
 System.out.println("Enter elements of first matrix:");
 for(i=0;i<m;i++)
  for(j=0;j<n;j++)
   a[i][j]=in.nextInt(); 
 System.out.println("Enter elements of second matrix:");
 for(i=0;i<m;i++)
  for(j=0;j<n;j++)
   b[i][j]=in.nextInt(); 
 operations obj=new operations();
 if(m==n)
 {
 obj.addition(a,b,m,n);
 obj.subtraction(a,b,m,n);
 obj.multiplication(a,b,n);
 }
 else
 {
 System.out.println("Operation not possible.");
 }
 }
}
/*Output
Enter row and column:
3
3
Enter elements of first matrix:
1
1
1
1
1
1
1
1
1
Enter elements of second matrix:
1
1
1
1
1
1
1
1
1
Addition is:
2 2 2 
2 2 2 
2 2 2 
Subtraction is:
0 0 0 
0 0 0 
0 0 0 
Multiplication is:
3 3 3 
3 3 3 
3 3 3 
*/
