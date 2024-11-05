public class Main {
    public static void main(String[] args) {

        //Homework 1
        int sum = 0;
        for (int i = 10; i <= 100; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("10-დან 100-მდე 5-ის ჯერადი რიცხვების ჯამი არის " + sum);

        //Homework 2

        int number = 124;
        int digitCount = 0;
        int temporaryNumber = number;
        while (temporaryNumber != 0) {
            temporaryNumber /= 10;
            digitCount++;
        }
        System.out.println(number + " არის " + digitCount + " ნიშნა.");

        //Homework 3

        int n = 6;
        boolean isPrimeNumber = true;

        if (n <= 1) {
            isPrimeNumber = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }

        if (isPrimeNumber) {
            System.out.println(n + " არის მარტივი რიცხვი.");
        } else {
            System.out.println(n + " არ არის მარტივი რიცხვი.");
        }

        //Homework 4

        int a = 10;
        int b = 22;
        while (b != 0) {
            int temporaryNum = b;
            b = a % b;
            a = temporaryNum;
        }
        System.out.println("უდიდესი საერთო გამყოფი: " + a);

        //Homework 5

        for (int i = 100; i <= 999; i++) {
            int sumOfDigits = (i / 100) + (i / 10 % 10) + (i % 10);
            if (i % sumOfDigits == 0) {
                System.out.println("რიცხვი " + i + " იყოფა მის ციფრთა ჯამზე, ნაშთის გარეშე");
            }
        }

        //Homework 6

        System.out.println("ფიბონაჩის პირველი 10 წევრი:");
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 3; i <= 10; i++) {
            int nextNum = num1 + num2;
            System.out.print(nextNum + " ");
            num1 = num2;
            num2 = nextNum;
        }

    }
}