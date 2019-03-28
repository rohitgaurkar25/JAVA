import java.lang.Math;
import java.util.Scanner;
public class MathFunctions
{
 public static void main(String[] args)
 {
 Scanner in=new Scanner(System.in);
 System.out.println("Math.abs(1)= "+Math.abs(1));
 System.out.println("Math.abs(-1)= "+Math.abs(-1));
 System.out.println("Math.round(0.5)= "+Math.round(0.5));
 System.out.println("Math.round(1.1)= "+Math.round(1.1));
 System.out.println("Math.ceil(1.1)= "+Math.ceil(1.1));
 System.out.println("Math.ceil(7.9)= "+Math.ceil(7.9));
 System.out.println("Math.floor(1.1)= "+Math.floor(1.1));
 System.out.println("Math.floor(7.9)= "+Math.floor(7.9));
 System.out.println("Math.max(5,7)= "+Math.max(5,7));
 System.out.println("Math.min(1,100)= "+Math.min(1,100));
 System.out.println("Math.sqrt(9)= "+Math.sqrt(9));
 System.out.println("2^3= "+Math.pow(2,3));
 
 }
}
/*Output
Math.abs(1)= 1
Math.abs(-1)= 1
Math.round(0.5)= 1
Math.round(1.1)= 1
Math.ceil(1.1)= 2.0
Math.ceil(7.9)= 8.0
Math.floor(1.1)= 1.0
Math.floor(7.9)= 7.0
Math.max(5,7)= 7
Math.min(1,100)= 1
Math.sqrt(9)= 3.0
2^3= 8.0
*/
