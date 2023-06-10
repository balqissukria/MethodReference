package my.uum;


    import java.util.Scanner;

    public class MyPrimeNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value of x: ");
            int x = scanner.nextInt();

            PrimeNumberThread thread1 = new PrimeNumberThread(x, x + 5);
            PrimeNumberThread thread2 = new PrimeNumberThread(x + 5, x + 10);

            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int totalPrimeCount = thread1.getPrimeCount() + thread2.getPrimeCount();
            System.out.println("Total prime numbers: " + totalPrimeCount);
        }
    }



