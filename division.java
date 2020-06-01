package chapter13;

public class division {

    public static void main(String[] Args){
        try{
            int c = 30/0;
        }catch(ArithmeticException e) {
            System.out.println("divide by zero");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("unknown error");
            e.printStackTrace();
        }finally{
            System.out.println("division is fun");
        }
    }
}
