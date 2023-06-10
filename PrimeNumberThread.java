package my.uum;

class PrimeNumberThread extends Thread {
    private int start;
    private int end;
    private int primeCount;

    public PrimeNumberThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.primeCount = 0;
    }

    public int getPrimeCount() {
        return primeCount;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println("Prime number: " + i);
                primeCount++;
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
