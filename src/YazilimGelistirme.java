public class YazilimGelistirme {
    String isim = "Ali";
    String kodYaz() {
        return "Uygulama geliştirir";
    }
}

 class FrontEnd extends YazilimGelistirme {
    String isim = "Gizem";
    String kodyaz() {
        return "Sadece Ön Arayüz Geliştrir";
    }
}

 class Calis {
    public static void main(String[] args) {
        YazilimGelistirme yg = new FrontEnd();
        System.out.println(yg.isim + " " + yg.kodYaz());
    }
}