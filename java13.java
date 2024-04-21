//----CONDITIONAL STATEMENT-------

 
// ------If Else-----


// public class java13 {
// public static void main(String args[]){
//     int age = 16;
//     if (age>=18){
//         System.out.println("adult : Vote : Drive");

//     }
//     if(age > 13 && age < 18){
//         System.out.println("teenager");

//     }
//     else{
//         System.out.println("No Adult");
//     }
// }
    
// }

//---------PRINT LARGEST NUMBER-----------

// public class java13{
// public static void main(String args[]){
//     int A = 10;
//     int B =5;

//     if(A >= B){ 
//         System.out.println("A is largest Number of 2");
//     }
//     else {
//         System.out.println("B is largest of 2");
//     }
    
// }

// }


// ------ print if number is even or odd---------

// public class java13{
//     public static void main(String args[]) {
//      scanner sc = new scanner (System.in);
//      int number = sc.nextInt();
 
//      if(number % 2 == 0) { 
//         System.out.println("EVEN");
//      } else {
//         System.out.println("ODD");
//      }
//     }
// }


//----------INCOME TAX CALCULATOR------
// import java.util.*;
// public class java13{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;

//         if( income < 500000) {
//             tax = 0;
//         }
//             else if(income >= 500000 && income <= 1000000){
//                 tax = (int) (income * 0.2);
//             }
//         else {

//             tax = (int) (income*0.3);

//            }
//            System.out.println("your tax is : " + tax);
//         }

//     }


//-------------Print largest value--------
//  public class java13{

// public static void main(String args[]){
//     int A = 1;
//     int B = 3;
//     int C = 6;
//     if((A >= B) && (A >= C)) {
//         System.out.println("largest value is A");
//     }
//     else if(B >= C)
//             {
//         System.out.println("largest value is B");
//     }
//     else{
//         System.out.println("largest value is C");
//     }
// }
//  }
// ----------ternory operator-----------

//-----check if student will pass or fail------

//    public class java13{
//     public static void main(String args[]){
//         int marks = 80;
//         String reportcard = marks >=35 ? "PASS"  : "FAIL";
//         System.out.println(reportcard);
//     }
// }


// -----SWITCH STATEMENT--------

// public class java13{

// public static void main(String args[]){
// int number = 1;
// switch (number){
//     case 1 : System.out.println("Samosa");
//     break;
//     case 2 : System.out.println("burger");
//     break;
//     case 3 :System.out.println("Mango Shake");
//     break;
//     default : System.out.println("we wake up");
// }
// }
// } 

import java.util.Scanner;

public class java13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a is ");
        int a = sc.nextInt();
        System.out.println("enter b is ");
    int b = sc.nextInt();
    System.out.println("enter operator");
char operator = sc.next();
switch(operator){
    case'+' : System.out.println(a+b);
    break;
    case '-' : System.out.println(a-b);
    break;
    case '*' : System.out.println(a*b);
    break;
    case '/' : System.out.println(a/b);
    break;
    case '%' : System.out.println(a%b);
    break;
    default : System.out.println("wrong operation");
}
}
}