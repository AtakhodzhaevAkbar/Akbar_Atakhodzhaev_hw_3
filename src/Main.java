import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {8,5,2,-3,5,6,-2,1,5,-5};
        boolean otricatelnoe = false;
        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num < 0) {
                otricatelnoe = true;
                continue;
            }
            if (otricatelnoe && num > 0) {
                sum += num;
                count++;
            }
        }
        if (count > 0) {
            int srednee = sum / count;
            System.out.println("Среднее арифметическое: " + srednee);
        }
        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("Введите ваше слово");
        Scanner slovo = new Scanner(System.in);
        String vasheSlovo =slovo.nextLine();
        String bezProbelov = vasheSlovo.replaceAll("\\s","");
        String nijniyRegister = bezProbelov.toLowerCase();
        boolean esliPalindrome = true;
        for (int i = 0, j = nijniyRegister.length() - 1; i < j; i++, j--) {
            if (nijniyRegister.charAt(i) != nijniyRegister.charAt(j)) {
                esliPalindrome = false;
                break;
            }
        }
        if (esliPalindrome){
            System.out.println("Эта строка - палиндром.");
        }
        else System.out.println("Эта строка - не палиндром.");
    }
}
