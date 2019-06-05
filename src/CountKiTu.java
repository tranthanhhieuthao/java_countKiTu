import java.util.Scanner;

public class CountKiTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Str ="Tran Thanh Hieu";
        String Sfind = scanner.nextLine();
        int count =0;
        for (int i=0;i<Str.length();i++){
            if (Str.charAt(i) == Sfind.charAt(0)){
                count++;
            }
        }
        System.out.println("so ki tu"+" "+Sfind+" "+"xuat hien:"+" "+count+" "+"lan");
    }
}
