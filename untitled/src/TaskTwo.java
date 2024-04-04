import java.util.Scanner;
public class TaskTwo {

        public static void main(String[] args) {
            System.out.println("Введите площадь круга:");
            Scanner sc = new Scanner(System.in);
            short r = sc.nextShort();
            double l=2 *Math.PI *r;
            System.out.println("Введите площадь квадрата:");
//            Scanner sc = new Scanner(System.in);
            short k = sc.nextShort();
            double kv = k*k;
            System.out.println("Площадь квадрата=" + kv);
            System.out.println("Площадь круга=" + l);
            if (kv<l){System.out.println("Площадь круга больше");}
            if (kv>l){System.out.println("Площадь круга меньше");}
            //
            //System.out.println("Площадь квадрата больше");
}}
//нужно два сканера, переменные и формулы для круга и квадрата, сравнение и вывод словестной информации