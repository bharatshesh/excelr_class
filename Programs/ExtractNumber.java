class ExtractNumber {
    public static void main(String[] args) {
        int a = 726;
        int sum = 0;
        while(a>0){
            int rem = a%10;
            sum+=rem;
            a/=10;
            
            a/=10; 
        } 
    }
}