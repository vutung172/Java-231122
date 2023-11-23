import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        // Nhập vào tên từ bàn phím rồi in ra màn hình console
        Scanner scanner = new Scanner(System.in);
        String fullName;
        System.out.printf("Hãy nhập họ và tên: ");
        fullName = scanner.nextLine();
        System.out.println("Xin chào "+fullName+" đến với RA");

        // Nhập với kiểu dữ liệu int
        System.out.printf("Mời bạn nhập tuổi:");
        int age = scanner.nextInt();
        System.out.println("Năm sinh của bạn là "+(2023-age));

        // Nhập với kiểu dữ liệu int
        System.out.printf("Mời bạn nhập chiều cao:");
        float height = scanner.nextFloat();
        System.out.println("Chiều cao của bạn là "+height+"m");


    }
}
