import java.util.Scanner;

public class miniproje5 {
    public static void main(String[] args){
        //Kullanıcıdan alınan 3 sayıdan en büyük olanını bulma

        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci sayı: ");
        int a = scan.nextInt();

        System.out.println("İkinci sayı: ");
        int b = scan.nextInt();

        System.out.println("Üçüncü sayı: ");
        int c = scan.nextInt();

        //int max= -1;
        int max = 0;  // 0 olmasının bir anlamı yok, Bu tür sorularda ilk sayı max değişkenine eklenir,sonra karşılaştırma yapılır.

        if( a >= b && a >=c )
            max=a;
        else if ( b >= a && b >= c)
            max=b;
        else if ( c >= a && c >= b )
            max=c;
        else
            System.out.println("yanlış değer ... ");

        System.out.println("maksimum deger: " + max);




    }
}
