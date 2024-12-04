import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenericExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int count = sc.nextInt();
        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            numbers.add(scanner.nextInt());
        }
        System.out.println("Count of even numbers: " + countElements(numbers, GenericPropertyCounter::isEven));
        System.out.println("Count of odd numbers: " + countElements(numbers, GenericPropertyCounter::isOdd));
        System.out.println("Count of prime numbers: " + countElements(numbers, GenericPropertyCounter::isPrime));
        System.out.println("Count of palindromes: " + countElements(numbers, GenericPropertyCounter::isPalindrome));
    }

    public static <T> int countElements(List<T> list, PropertyChecker<T> checker) {
        int count = 0;
        for (T element : list) {
            if (checker.check(element)) {
                count++;
            }
        }
        return count;
    }

    @FunctionalInterface
    interface PropertyChecker<T> {
        boolean check(T element);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        String str = String.valueOf(number);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
}
