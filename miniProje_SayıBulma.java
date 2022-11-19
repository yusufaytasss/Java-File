public class miniProje_SayıBulma {
    public static void main(String[] args) {
        int[] sayilar = new int[] {0,1,2,3,4,5,6,7,8,9};
        int aranacak = 5;
        int kova = 0;


        for(int i = 1; i < sayilar.length; i++) {
            if(i == aranacak) {
                kova = i;
            }
        }
        if (kova == aranacak) {
            System.out.print("Sayi bulundu : "+ kova);
        }
        else {
            System.out.print("Sayı Bulunamadı !");
        }
        
    }
}
