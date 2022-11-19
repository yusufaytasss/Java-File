import java.util.Scanner;
public class RandomSayiBulmaVeCikarmaOyunu {
    public static void main(String[] args){

        /* RANDOM SAYI ÜRETME */
        int sayi_one = (int)(Math.random() * 1000);
        int sayi_two = (int)(Math.random() * 1000);
        int kova , sonuc = 0;
        boolean koşul= true;

        /* SAYI BÜYÜK - KÜÇÜKLÜĞÜNÜ AYARLAMA */
        if(sayi_one > sayi_two){
            kova = sayi_one;
            sayi_one = sayi_two;
            sayi_two = kova;
        }

        /* ÇIKARMA İŞLEMİ */
        sonuc = sayi_two - sayi_one;

        /* SAYI DENEME BÖLÜMÜ */
        Scanner deneme = new Scanner(System.in);
        System.out.print("Lütfen deneme yapınız :");
        int SayiDenemesi = deneme.nextInt();

        if(SayiDenemesi == sonuc){
            System.out.println("Tebrikler Doğru Sonucu Buldunuz !");
        }
        /*EŞİTLİĞİ BULMA BÖLÜMÜ */
        if(SayiDenemesi != sonuc){
            if(SayiDenemesi > sonuc) {
                System.out.println("Daha Küçük Bir Sayı Giriniz !");
            }
            if(SayiDenemesi < sonuc) {
                System.out.println("Daha Büyük Bir Sayı Giriniz !");
            }
            for(int i = 0; i < 100; i++){
                System.out.print("=> ");
                SayiDenemesi = deneme.nextInt();
                if(SayiDenemesi > sonuc) {
                    System.out.println("Daha Küçük Bir Sayı Giriniz !");
                }
                if(SayiDenemesi < sonuc) {
                    System.out.println("Daha Büyük Bir Sayı Giriniz !");
                }
                if(SayiDenemesi == sonuc){
                    System.out.println("Tebrikler sonucu doğru buldunuz : " +sonuc);
                    break;
                }
            }
        }        
    }
}
