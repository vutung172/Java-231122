import java.util.Scanner;

public class DiemTrungBinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float  math,phys,chem,lite,engl,ave;
        System.out.printf("Điểm môn Toán: ");
        math = scanner.nextFloat();
        System.out.printf("Điểm môn Lý: ");
        phys = scanner.nextFloat();
        System.out.printf("Điểm môn Hóa: ");
        chem = scanner.nextFloat();
        System.out.printf("Điểm môn Văn: ");
        lite = scanner.nextFloat();
        System.out.printf("Điểm môn Anh: ");
        engl = scanner.nextFloat();
        ave = (math+phys+chem+lite+engl)/5;
        System.out.println("Điểm trung bình các môn: "+ave);
        if (ave>9){
            System.out.println("Bạn loại Xuất sắc");
        } else if (ave >=8 ) {
            System.out.println("Bạn loại Giỏi");
        } else if (ave >= 6.5) {
            System.out.println("Bạn loại Khá");
        } else if (ave >=5 ) {
            System.out.println("Bạn loại Trung Bình");
        } else {System.out.println("Bạn loại Yếu");}
    }
}
