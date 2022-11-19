public class miniProje_AsalSayi {
    public static void main(String[] args){ 
        int sayi = 2;
        boolean prime = false;

        if(sayi == 1 || sayi<1){
            System.out.println("Sayı Asal Değildir!!");
        }
        else{
            for(int i = 2; i < sayi; i++){
                if(sayi % i == 0){
                    prime = true;
                }
            }
    
            if(prime == false){
                System.out.println("Sayı Asaldır!");
            }
            else{
                System.out.println("Sayı Asal Değildir!");
            }
        }

        
    
    
    
    
    
    
    
    }
}
