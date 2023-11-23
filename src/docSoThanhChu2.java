/*
import java.util.Scanner;

public class docSoThanhChu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input,dv,chuc,tram;
        String strDV="",strChuc="",strTram="";
        System.out.println("Nhập số bạn muốn đọc: ");
        input = sc.nextInt();
        dv = input%10;
        chuc = (input%100 - input%10)/10;
        tram = (input - input%100)/100;
        if (dv == 0 ) {
            if (chuc == 0) {
                if (tram != 0) {
                    switch (tram) {
                        case 1:strTram = "một";
                        case 2:strTram = "hai";
                        case 3:strTram = "ba";
                        case 4:strTram = "bốn";
                        case 5:strTram = "năm";
                        case 6:strTram = "sáu";
                        case 7:strTram = "bảy";
                        case 8:strTram = "tám";
                        case 9:strTram = "chín";
                        case 0:strTram = "mười";
                        default:
                            System.out.println("số không tồn tại");break;
                    }
                    strTram = strTram + "trăm";
                } else {System.out.println("không");}
            } else {}
    }
}
*/
