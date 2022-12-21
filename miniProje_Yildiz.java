import java.util.Scanner;
public class miniProje_Yildiz {
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
        System.out.print("Yıldız Sayısını Giriniz: ");
        int gir = giris.nextInt();

        for(int i=1; i<=gir;i++) {
            for(int j=i;j<10;j++) {
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        gir = gir - 1;
        for(int y = gir; 0<y;y--){
            for(int z = y;z<10;z++) {
                System.out.print(" ");
            }
            for(int m = 1; m<=y;m++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
