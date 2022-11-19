public class miniProje_Kalın_İnce_Harf {
    public static void main(String[] args) {
       /*/ char harf = 'A';
        String x = seslilist[0];
        String[] seslilist = {"A","I","O","U"};
        String[] sessizlist = {"E","İ","Ö","Ü"};

        for(String harfler : seslilist) {
            x = harfler;
        }
        */

        char harf = 'C';
        if(harf == 'A' || harf == 'I' || harf == 'O' || harf == 'U'){
            System.out.println(harf + " Harfi Kalın");
        }
        if(harf == 'E' || harf == 'İ' || harf == 'Ö' || harf == 'ü'){
            System.out.println(harf + " Harf İnce");
        }
        else{
            System.out.println("Kalın ve İnce sesli harfler dışında harf girişi oldu");
        }
    }
}
