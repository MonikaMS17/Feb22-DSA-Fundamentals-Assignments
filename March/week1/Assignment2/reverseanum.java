import java.util.Scanner;

public class reverseanum {

 public static void main(String[] args) {
  System.out.println("Please enter a number : ");
  Scanner sc = new Scanner(System.in);
  int scanInput = sc.nextInt();
  reverseRec(scanInput);
  System.out.println();
  System.out.println("------------------");
  reverseNum(scanInput);
 }
 
 
 public static void reverseRec(int num){
  //System.out.println("num" + num);
  if(num == 0)
   return;
  System.out.print(num % 10);
  reverseRec(num/10);
 }
 
 system.out.println("reversedNum -- " + reversedNum);
 }
}
