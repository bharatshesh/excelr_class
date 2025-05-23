class Pallindrome {
    public static void main(String[] args) {
        int n = 123;
        int temp= n;
        int reverse=0;

        while (n>0){
            int rem=n%10;
            reverse=reverse*10+rem;
            n/=10;
            System.err.println(reverse);

        }
        if (temp == reverse){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");

        }


    }
}