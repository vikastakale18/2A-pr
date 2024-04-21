
//------- VARIABLE QUESTION-------


// 1) Average of number 




import java.util.*;
 public class java9 {
    // public static void main (String args[]) {
       // Scanner sc = new Scanner(System.in);
       // int A = sc.nextInt();
       // int B = sc.nextInt();
       // int C = sc.nextInt();
       // int average = ( A + B + C ) / 3;
//
       // System.out.println("average is : " + average);

   // }
//} 



//2) Area of square 

// import java.util.*;
// public class java9 {
//     public static void main (String args[]) {
// Scanner sc = new Scanner(System.in);
// int A = sc.nextInt();
// int B = sc.nextInt();

// int Area = ( A*B);

// System.out.println("Area is : " + Area);
// }
//}




//3) Bill of Items 

// import java.util.*;
//  public class java9 {
     public static void main (String args[]) {
 Scanner sc = new Scanner(System.in);
 float Pencil = sc.nextInt();
 float Pen = sc.nextInt();
 float Eraser = sc.nextInt();

 float Total =  Pencil + Pen + Eraser ;

 System.out.println("Bill is : " + Total);
     
    


// Add 18 GST

float newTotal = Total + (0.18f * Total);

System.out.println("Bill  with 18% GST tax :" + newTotal);
     }

    } 


    //4)