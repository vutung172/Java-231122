import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input,donVi,hangChuc,hangTram;
        String num=" ",numDV = " ",numChuc=" ",numTram = " ";
        System.out.println("Nhập số bạn muốn đọc:");
        input = sc.nextInt();
        if (input < 10) {
            switch (input) {
                case 1:num = "one";break;
                case 2:num = "two";break;
                case 3:num = "three";break;
                case 4:num = "four";break;
                case 5:num = "five";break;
                case 6:num = "six";break;
                case 7:num = "seven";break;
                case 8:num = "eight";break;
                case 9:num = "nine";break;
                case 0:num = "zero";break;
                default:
                    System.out.println("số không tồn tại");break;
            }
            System.out.println(num);
        } else if (input < 20 ) {
            donVi = input%10;
            switch (donVi) {
                case 1:num = "eleven";break;
                case 2:num = "twelve";break;
                case 3:num = "thirteen";break;
                case 4:num = "fourteen";break;
                case 5:num = "fifteen";break;
                case 6:num = "sixteen";break;
                case 7:num = "seventeen";break;
                case 8:num = "eighteen";break;
                case 9:num = "nineteen";break;
                case 0:num = "ten";break;
                default:
                    System.out.println("số không tồn tại");break;
            }
            System.out.println(num);
        } else if (input<100) {
            donVi = input%10;
            hangChuc = (input-input%10)/10;
            switch (hangChuc) {
                case 1:
                    System.out.printf("ten");;break;
                case 2:System.out.printf("twenty");;break;
                case 3:System.out.printf("thirty");;break;
                case 4:System.out.printf("forty");;break;
                case 5:System.out.printf("fifty");;break;
                case 6:System.out.printf("sixty");;break;
                case 7:System.out.printf("seventy");;break;
                case 8:System.out.printf("eighty");;break;
                case 9:System.out.printf("ninety");;break;
                case 0:System.out.printf("");;break;
                default:
                    System.out.println("số không tồn tại");break;
            }
            switch (donVi) {
                case 1:numDV = "one";break;
                case 2:numDV = "two";break;
                case 3:numDV = "three";break;
                case 4:numDV = "four";break;
                case 5:numDV = "five";break;
                case 6:numDV = "six";break;
                case 7:numDV = "seven";break;
                case 8:numDV = "eight";break;
                case 9:numDV = "nine";break;
                case 0:numDV = "";break;
                default:
                    System.out.println("số không tồn tại");break;
            }

            System.out.println(numChuc+numDV);

        } else if (input<1000) {
            donVi = input%10;
            hangChuc = (input%100-input%10)/10;
            hangTram = (input-input%100)/100;
            switch (hangTram) {
                case 1:numTram = "one hundred";break;
                case 2:numTram = "two hundred";break;
                case 3:numTram = "three hundred";break;
                case 4:numTram = "four hundred";break;
                case 5:numTram = "five hundred";break;
                case 6:numTram = "six hundred";break;
                case 7:numTram = "seven hundred";break;
                case 8:numTram = "eight hundred";break;
                case 9:numTram = "nine hundred";break;
                case 0:break;
                default:
                    System.out.println("số không tồn tại");break;
            }
            System.out.printf(numTram);
            if (donVi==0){
                if (hangChuc ==0){
                    System.out.printf("");
                }
            } else {
                System.out.printf(" and ");
            }
            switch (hangChuc) {
                case 0:numChuc = "";break;
                case 1:
                    if (donVi < 10) {
                        switch (donVi) {
                            case 1:num = "eleven";break;
                            case 2:num = "twelve";break;
                            case 3:num = "thirteen";break;
                            case 4:num = "fourteen";break;
                            case 5:num = "fifteen";break;
                            case 6:num = "sixteen";break;
                            case 7:num = "seventeen";break;
                            case 8:num = "eighteen";break;
                            case 9:num = "nineteen";break;
                            case 0:num = " and ten";break;
                            default:
                                System.out.println("số không tồn tại");break;
                        }
                        System.out.println(num);}
                        System.exit(0);
                    break;
                case 2:numChuc = "twenty";break;
                case 3:numChuc = "thirty";break;
                case 4:numChuc = "forty";break;
                case 5:numChuc = "fifty";break;
                case 6:numChuc = "sixty";break;
                case 7:numChuc = "seventy";break;
                case 8:numChuc = "eighty";break;
                case 9:numChuc = "ninety";break;
                default:
                    System.out.println("số không tồn tại");break;
            }
            System.out.printf(numChuc+" ");
            switch (donVi) {
                case 1:numDV = "one";break;
                case 2:numDV = "two";break;
                case 3:numDV = "three";break;
                case 4:numDV = "four";break;
                case 5:numDV = "five";break;
                case 6:numDV = "six";break;
                case 7:numDV = "seven";break;
                case 8:numDV = "eight";break;
                case 9:numDV = "nine";break;
                case 0:numDV = "";break;
                default:
                    System.out.println("số không tồn tại");break;
            }
            System.out.printf(numDV);

        }
    }
}


