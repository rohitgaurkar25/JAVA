import java.util.Scanner;
public class ArraySearch
{
 public static void main(String[] args)
 {
 Scanner in= new Scanner(System.in);
 int n,i;
 System.out.println("Enter size of array:");
 n=in.nextInt();
 int [] a=new int[n];
 System.out.println("Enter "+n+" elements:");
 for(i=0;i<n;i++)
  a[i]=in.nextInt();
 int key,flag=0;
 System.out.println("Enter element to search:");
 key=in.nextInt();
 for(i=0;i<n;i++)
 if(key==a[i])
 {
  int pos=i+1;
  System.out.println(key+" found at "+pos+" position.");
  flag=1;
 }
 if(flag==0)
 System.out.println("Element not found.");
}
}
/*Output
Enter size of array:
5
Enter 5 elements:
1
1
1
2
3
Enter element to search:
1
1 found at 1 position.
1 found at 2 position.
1 found at 3 position.
*/
