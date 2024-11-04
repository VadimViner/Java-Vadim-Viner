public class LineAndNumber {
    public static void lineNumberMethod(){
        String line = "Привет!";
        int number = 5;

        for (int i = 0; i < number; i++){
            System.out.println(line);
        }
    }
    public static void main(String[] arg){
        lineNumberMethod();
    }
}
