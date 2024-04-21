//-----REVERSE A NUMBER-------

import java.util.*;
public class java16 {
    
  public static void main(String args[]){
    int n  = 24122002;
    while( n > 0) {
        int lastDigit = n % 10;
        System.out.print(lastDigit);
        n = n / 10;
    }
System.out.println();  
}

}
