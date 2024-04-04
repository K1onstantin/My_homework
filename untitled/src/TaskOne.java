import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println("Введите счёт");
        Scanner sc = new Scanner(System.in);
        short r = sc.nextShort();
        if (r==1) {
            System.out.println("ничья");
        }
        if (r==0) {
            System.out.println("поражение");}
            if (r==3) {
                System.out.println("победа");

        }}}
