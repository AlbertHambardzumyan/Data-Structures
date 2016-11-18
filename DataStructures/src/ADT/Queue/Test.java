package ADT.Queue;

/**
 * @author Albert Hambardzumyan
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("Init ADT.Queue...");
        Queue<Integer> a = new Queue<Integer>();

        System.out.println("\nADT.Queue isEmpty... should be true");
        System.out.println(a.isEmpty());

        System.out.println("\nADT.Queue push... 5");
        a.push(5);
        System.out.println("\nADT.Queue push... 20");
        a.push(20);

        System.out.println("\nADT.Queue isEmpty... should be false");
        System.out.println(a.isEmpty());

        System.out.println("\nADT.Queue top... should be 5");
        System.out.println(a.top());

        System.out.println("\nADT.Queue pop...");
        a.pop();
        System.out.println("\nADT.Queue pop...");
        a.pop();

        System.out.println("\nADT.Queue isEmpty... should be true");
        System.out.println(a.isEmpty());
    }
}
