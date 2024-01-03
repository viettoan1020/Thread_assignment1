// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     NumberGenerator generator1 = new NumberGenerator();
     NumberGenerator generator2 = new NumberGenerator();

     Thread thread1 = new Thread(generator1);
     Thread thread2 = new Thread(generator2);

        System.out.println("Thread 1 priority : " + thread1.getPriority());
        System.out.println("Thread 2 priority : " + thread2.getPriority());

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Thread 1 priority : " + thread1.getPriority());
        System.out.println("Thread 2 priority : " + thread2.getPriority());
    }
}