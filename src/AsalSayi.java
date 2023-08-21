public class AsalSayi {
    public static void main (String [] args) {
            int number = 1221435776 ;
        if (isNumberPrime(number)){
            System.out.println("Sayı Asaldır!");
        }
        else{
            System.out.println("Sayi Asal Değildir!");
        }
    }
    public static boolean isNumberPrime (int number) {
        if (number <=1){
            return false;
        }
        for (int i=2;i<number;i++){
            if (number % i==0) {
                return false;
            }
        }
        return true;
    }
}

