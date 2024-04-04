import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {
        System.out.println("Введите значение для d");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextShort();
        System.out.println("Введите значение для e");
        int e = sc.nextShort();
        double dk2 = Math.sqrt(e);

        //System.out.println(dk2);
        if (dk2<d){ System.out.println(dk2*5);
}}}
//сканер два числа, найти кв.кореньвторого, увеличить второе число в пять раз при условии