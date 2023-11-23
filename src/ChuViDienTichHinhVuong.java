import java.util.Scanner;

public class ChuViDienTichHinhVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Hãy nhập giá trị chiều dài hình chữ nhật: ");
        double edgeL = scanner.nextDouble();
        System.out.printf("Hãy nhập giá trị chiều rộng hình chũ nhật: ");
        double edgeS = scanner.nextDouble();
        System.out.println("Chu vi hình chữ nhật là: "+((edgeL+edgeS)*2));
        System.out.println("Diện tích hình chữ nhật là: "+(edgeL*edgeS));
    }
}
