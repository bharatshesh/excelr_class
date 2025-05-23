public class PrimeNumber {
  public static void main(String[] args) {
    int n=12;
    int count = 0;
    for (int i = 2; i < n; i++){
        if( n % i == 0) {
         count++;
         break;
       }
    }
    if (count == 0) {
        System.out.println(n + "is a prime");
    }else {
        System.out.println(n +"is not a prime");
    }
      
  }
}