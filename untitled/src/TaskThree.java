import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        System.out.println("Введите двухзначеное число");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextShort();
        int units = t % 10;
        int decimals = t / 10;

        int qOne = units % decimals;
        int qTwo = decimals % units;
        System.out.println(qOne);
        System.out.println(qTwo);

    }
}
// ввод числа, разделение его на десятки и единицы, деление одного на другое и находжение остатка