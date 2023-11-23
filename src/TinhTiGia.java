import java.util.Scanner;

public class TinhTiGia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double rate = 24215;
        System.out.println("Mời bạn vào số USD muốn quy đổi: ");
        double usd = sc.nextDouble();
        double vnd = usd*rate;
        System.out.println(usd + " USD tương đương với: " +vnd+" VND");
    }
}
