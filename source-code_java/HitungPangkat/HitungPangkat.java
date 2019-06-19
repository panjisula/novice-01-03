import java.util.Scanner;

public class HitungPangkat{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Program Hitung Pangkat");
        System.out.println("=======================");
        System.out.println("Masukkan angka : ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Masukkan pangkat : ");
        int n = Integer.parseInt(scan.nextLine());

        int result = a;
        for(int i = 0; i < (n-1); i++){
            result = result*a;
        }

        System.out.println("Result : "+result);

    }
}