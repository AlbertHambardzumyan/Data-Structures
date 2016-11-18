package ADT.Stack;

/**
 * @author Albert Hambardzumyan
 */
public class Test {
    public static void main(String[] args){

        System.out.println("Init ADT.Stack...");
        Stack<Integer> a = new Stack<Integer>();

        System.out.println("\nADT.Stack isEmpty... should be true");
        System.out.println(a.isEmpty());

        System.out.println("\nADT.Stack push... 5");
        a.push(5);

        System.out.println("\nADT.Stack isEmpty... should be false");
        System.out.println(a.isEmpty());

        System.out.println("\nADT.Stack top... should be 5");
        System.out.println(a.top());

        System.out.println("\nADT.Stack pop...");
        a.pop();

        System.out.println("\nADT.Stack isEmpty... should be true");
        System.out.println(a.isEmpty());
    }
}
