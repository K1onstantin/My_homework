import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        System.out.println("Введите значение для a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextShort();
        System.out.println("Введите значение для b");
        int b = sc.nextShort();
        System.out.println("Введите значение для c");
        int c = sc.nextShort();
    if ((a < b) &(b < c)){ System.out.println("a<b<c;");}
    if ((a < b) &(a > c)){ System.out.println("b>a>c");
}
}}
