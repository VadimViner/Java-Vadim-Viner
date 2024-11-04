public class NumberTenToTwenty {
    public void Sum(){
        int a = 1;
        int b = 2;
        boolean trueSum = (a + b) >= 10 && (a + b) <= 20;
        System.out.println(trueSum);
    }
    public static void main(String[] arg){
        NumberTenToTwenty theSum = new NumberTenToTwenty();
        theSum.Sum();
    }
}
