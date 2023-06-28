public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 1000;
        System.out.println("Prime numbers between 1 and " + limit + " are:");

        for (int number = 2; number <= limit; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
