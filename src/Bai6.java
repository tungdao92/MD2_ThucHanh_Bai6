import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short nam;
        System.out.println("nhập năm: ");
        nam = scanner.nextShort();
        boolean namnhuan = false;
        if (nam % 4 == 0){
            if (nam % 100 == 0){
                if (nam % 400 == 0){
                    namnhuan = true;

                }
            } else {
                namnhuan = true;
            }
        }
        if (namnhuan){
            System.out.println(nam+ " là năm nhuận");
        } else {
            System.out.println(nam + " không là năm nhuận");
        }
    }
}