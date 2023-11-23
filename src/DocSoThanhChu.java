import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input,donVi,hangChuc,hangTram;
        String num=null,numDV = null,numChuc=null,numTram = null;
        System.out.println("Nhập số bạn muốn đọc:");
        input = sc.nextInt();
        if (input < 10) {
            switch (input) {
                case 1:num = "một";break;
                case 2:num = "hai";break;
                case 3:num = "ba";break;
                case 4:num = "bốn";break;
                case 5:num = "năm";break;
                case 6:num = "sáu";break;
                case 7:num = "bảy";break;
                case 8:num = "tám";break;
                case 9:num = "chín";break;
                case 0:num = "không";break;
                default:
                    System.out.println("số không tồn tại");break;
            }
            System.out.println(num);
        } else if (input < 20 ) {
            donVi = input%10;
            switch (donVi) {
                case 1:num = "một";break;
                case 2:num = "hai";break;
                case 3:num = "ba";break;
                case 4:num = "bốn";break;
                case 5:num = "năm";break;
                case 6:num = "sáu";break;
                case 7:num = "bảy";break;
                case 8:num = "tám";break;
                case 9:num = "chín";break;
                case 0:num = "";break;
                default:
                    System.out.println("số không tồn tại");break;
            }
            System.out.println("Mười "+num);
        } else if (input<100) {
            donVi = input%10;
            hangChuc = (input-input%10)/10;
            switch (donVi) {
                case 1:numDV = "một";break;
                case 2:numDV = "hai";break;
                case 3:numDV = "ba";break;
                case 4:numDV = "bốn";break;
                case 5:numDV = "năm";break;
                case 6:numDV = "sáu";break;
                case 7:numDV = "bảy";break;
                case 8:numDV = "tám";break;
                case 9:numDV = "chín";break;
                case 0:numDV = "";break;
                default:
                    System.out.println("số không tồn tại");break;
            }
            switch (hangChuc) {
                case 1:numChuc = "một";break;
                case 2:numChuc = "hai";break;
                case 3:numChuc = "ba";break;
                case 4:numChuc = "bốn";break;
                case 5:numChuc = "năm";break;
                case 6:numChuc = "sáu";break;
                case 7:numChuc = "bảy";break;
                case 8:numChuc = "tám";break;
                case 9:numChuc = "chín";break;
                case 0:numChuc = "";break;
                default:
                    System.out.println("số không tồn tại");break;
            }
            System.out.println(numChuc+" mươi "+numDV);

        } else if (input<1000) {
            donVi = input%10;
            hangChuc = (input%100-input%10)/10;
            hangTram = (input-input%100)/100;
            switch (donVi) {
                case 1:numDV = "một";break;
                case 2:numDV = "hai";break;
                case 3:numDV = "ba";break;
                case 4:numDV = "bốn";break;
                case 5:numDV = "năm";break;
                case 6:numDV = "sáu";break;
                case 7:numDV = "bảy";break;
                case 8:numDV = "tám";break;
                case 9:numDV = "chín";break;
                case 0:numDV = "";break;
                default:
                    System.out.println("số không tồn tại");break;
            }
            switch (hangChuc) {
                case 1:numChuc = "một";break;
                case 2:numChuc = "hai";break;
                case 3:numChuc = "ba";break;
                case 4:numChuc = "bốn";break;
                case 5:numChuc = "năm";break;
                case 6:numChuc = "sáu";break;
                case 7:numChuc = "bảy";break;
                case 8:numChuc = "tám";break;
                case 9:numChuc = "chín";break;
                case 0:numChuc = "";break;
                default:
                    System.out.println("số không tồn tại");break;
            }
            switch (hangTram) {
                case 1:numTram = "một";break;
                case 2:numTram = "hai";break;
                case 3:numTram = "ba";break;
                case 4:numTram = "bốn";break;
                case 5:numTram = "năm";break;
                case 6:numTram = "sáu";break;
                case 7:numTram = "bảy";break;
                case 8:numTram = "tám";break;
                case 9:numTram = "chín";break;
                case 0:numTram = "";break;
                default:
                    System.out.println("số không tồn tại");break;
            }
            System.out.println(numTram+" trăm "+numChuc+" mươi "+numDV);
        }
    }
}


