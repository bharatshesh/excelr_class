public  class VariableProgram {
     static int testValue=10;
    public static void main(String[] args) {
        int testData=10;
        System.out.println(testData);
        System.out.println(testValue +" inside method");
    }

    public static void m1() {
       // System.out.println(testData);
        System.out.println(testValue+" inside another method");
        
    }
}