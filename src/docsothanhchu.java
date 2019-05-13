import java.util.Scanner;

public class docsothanhchu {
    public static void main(String[] args){
        String str;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 so co 3 chu so :");
        str = scanner.nextLine();
        int number = Integer.parseInt(str);


        if (0 <= number && 10 >= number) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
            }
        } else if (number > 10 && number < 20) {
            int a = (int)str.charAt(1)-'0';
            String ex1 = "Mười";
            switch (a) {
                case 1:
                    System.out.println(ex1 + " một");
                    break;
                case 2:
                    System.out.println(ex1 + " hai");
                    break;
                case 3:
                    System.out.println(ex1 + " ba");
                    break;
                case 4:
                    System.out.println(ex1 + " bốn");
                    break;
                case 5:
                    System.out.println(ex1 + " năm");
                    break;
                case 6:
                    System.out.println(ex1 + " sáu");
                    break;
                case 7:
                    System.out.println(ex1 + " bảy");
                    break;
                case 8:
                    System.out.println(ex1 + " tám");
                    break;
                case 9:
                    System.out.println(ex1 + " chín");
                    break;

            }
        } else if (number >= 20 && number < 100) {
            int a = (int)str.charAt(0)-'0';
            int b = (int)str.charAt(1)-'0';
            String stra = "";
            String strb = "";
            String ex2 = " mươi ";
            switch (a) {
                case 2:
                    stra = "Hai";
                    break;
                case 3:
                    stra = "Ba";
                    break;
                case 4:
                    stra = "Bốn";
                    break;
                case 5:
                    stra = "Năm";
                    break;
                case 6:
                    stra = "Sáu";
                    break;
                case 7:
                    stra = "Bảy";
                    break;
                case 8:
                    stra = "Tám";
                    break;
                case 9:
                    stra = "Chín";
                    break;
            };

            switch (b) {
                case 0:
                    strb = "";
                    break;
                case 1:
                    strb = "một";
                    break;
                case 2:
                    strb = "hai";
                    break;
                case 3:
                    strb = "ba";
                    break;
                case 4:
                    strb = "bốn";
                    break;
                case 5:
                    strb = "năm";
                    break;
                case 6:
                    strb = "sáu";
                    break;
                case 7:
                    strb = "bảy";
                    break;
                case 8:
                    strb = "tám";
                    break;
                case 9:
                    strb = "chín";
                    break;
            };
            System.out.println(stra + ex2 + strb);
        }

        else if (number >= 100 && number < 1000) {
            int a = (int)str.charAt(0)-'0';
            int b = (int)str.charAt(1)-'0';
            int c = (int)str.charAt(2)-'0';
            String stra = "";
            String strb = "";
            String strc = "";
            String tram = " trăm ";
            switch (a) {
                case 1:
                    stra = "Một";
                    break;
                case 2:
                    stra = "Hai";
                    break;
                case 3:
                    stra = "Ba";
                    break;
                case 4:
                    stra = "Bốn";
                    break;
                case 5:
                    stra = "Năm";
                    break;
                case 6:
                    stra = "Sáu";
                    break;
                case 7:
                    stra = "Bảy";
                    break;
                case 8:
                    stra = "Tám";
                    break;
                case 9:
                    stra = "Chín";
                    break;

            };

            switch (b) {
                case 0:
                    if(c == 0) {
                        strb = "";
                        break;
                    }
                    strb = "linh";
                    break;
                case 1:
                    strb = "mười";
                    break;
                case 2:
                    strb = "hai mươi";
                    break;
                case 3:
                    strb = "ba mươi";
                    break;
                case 4:
                    strb = "bốn mươi";
                    break;
                case 5:
                    strb = "năm mươi";
                    break;
                case 6:
                    strb = "sáu mươi";
                    break;
                case 7:
                    strb = "bảy mươi";
                    break;
                case 8:
                    strb = "tám mươi";
                    break;
                case 9:
                    strb = "chín mươi";
                    break;

            };

            switch (c) {
                case 1:
                    if(b == 0) {
                        strc = "một";
                        break;
                    }
                    strc = "mốt";
                    break;
                case 2:
                    strc = "hai";
                    break;
                case 3:
                    strc = "ba";
                    break;
                case 4:
                    strc = "bốn";
                    break;
                case 5:
                    strc = "năm";
                    break;
                case 6:
                    strc = "sáu";
                    break;
                case 7:
                    strc = "bảy";
                    break;
                case 8:
                    strc = "tám";
                    break;
                case 9:
                    strc = "chín";
                    break;
            }
            System.out.println(stra + tram + strb  + " " + strc);
        }
    }
}
