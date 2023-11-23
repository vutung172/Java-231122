import java.sql.SQLOutput;
import java.util.Scanner;

public class KiemTraSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số mà bạn muốn kiểm tra: ");
        int num = sc.nextInt();
        if (num%3==0) {
            if (num%5==0) {
                System.out.println("Chia hết cho cả 3 và 5");
            } else {
                System.out.println("Chỉ chia hết cho 3");
            }
        } else {
            if (num%5==0){
                System.out.println("Chỉ chia hết cho 5");
            } else {
                System.out.println("Không chi hết cho 3, cũng không chia hết cho 5");
            }
        }
    }
}
