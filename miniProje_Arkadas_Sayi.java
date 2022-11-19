public class miniProje_Arkadas_Sayi {
    public static void main(String[] args){
        int number_one = 220, number_two =284,total_one = 0, total_two = 0;

        for(int a=1; a<number_one; a++){
            if(number_one % a == 0){
                total_one = total_one + a;
            }
        }
        for(int b=1; b<number_two; b++){
            if(number_two % b == 0){
                total_two = total_two + b;
            }
        }
        if(total_one == number_two && total_two == number_one){
            System.out.println("Arkadaş sayılar : "+number_one+" "+number_two);
        }
        else{
            System.out.println("Arkadaş sayılar bulunamadı ! ");
        }
    }
}
