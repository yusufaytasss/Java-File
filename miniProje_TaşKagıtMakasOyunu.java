import java.util.Scanner;
public class miniProje_TaşKagıtMakasOyunu {
    public static void main(String[] args){
    /*Kullanıcı İşlemi */
    Scanner giris = new Scanner(System.in);
    System.out.println("-------------------------------------------");
    System.out.println("Taş , Kağıt, Makas Oyununa Hoşgeldiniz.");
    System.out.println("Lütfen Seçim Yapınız.");
    System.out.println("Taş(0), Kağıt(1), Makas(2)");
    System.out.println("-------------------------------------------");
    System.out.print("=> ");
    int secimKullanıcı = giris.nextInt();
    
    

    /*Bilgisayar */
    int secimPC = (int)(Math.random() *3);
    System.out.println(secimPC);
    int Pc = secimPC;

    if(Pc == 0){
        if(secimKullanıcı == 0){
            System.out.println("Bilgisayar "+Pc+" Sen "+secimKullanıcı+" Berabere !");
        }
        if(secimKullanıcı == 1){
            System.out.println("Bilgisayar "+Pc+" Sen "+secimKullanıcı+" Kazandın !");
        }
        if(secimKullanıcı == 2){
            System.out.println("Bilgisayar "+Pc+" Sen "+secimKullanıcı+" Kaybettin !");
        }
    }
    if(Pc == 1){
        if(secimKullanıcı == 0){
            System.out.println("Bilgisayar "+Pc+" Sen "+secimKullanıcı+" Kaybettin !");
        }
        if(secimKullanıcı == 1){
            System.out.println("Bilgisayar "+Pc+" Sen "+secimKullanıcı+" Berabere !");
        }
        if(secimKullanıcı == 2){
            System.out.println("Bilgisayar "+Pc+" Sen "+secimKullanıcı+" Kazandın !");
        }
    }
    if(Pc == 2){
        if(secimKullanıcı == 0){
            System.out.println("Bilgisayar "+Pc+" Sen "+secimKullanıcı+" Kazandın !");
        }
        if(secimKullanıcı == 1){
            System.out.println("Bilgisayar "+Pc+" Sen "+secimKullanıcı+" Kaybettin !");
        }
        if(secimKullanıcı == 2){
            System.out.println("Bilgisayar "+Pc+" Sen "+secimKullanıcı+" Berabere !");
        }
    }
    }
}
