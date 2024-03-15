/*

    Final anahtar kelimesi tanımlanan bir özelliğin değeri sadece ve sadece 1 defa verilebiliyor. Başka bir yerde değiştirilemiyor.
    Değeri, ya özelliğin tanımlandığı noktada ya da obje oluştururken constructor içerisinde 1 defaya mahsus bir şekilde verilebiliyor.
    Sonrasında baş bir metodda da değiştirilemiyor.

    Ne avantajı var?
    Projede değiştirilmesi istenmeyen bir değer var ise (Örneğin Data Base şifresi) bunu kullanabiliyoruz.

 */
public class Main {
    public static void main(String[] args) {
        FinalTest f1 = new FinalTest("Obje1");  //  19
        FinalTest f2 = new FinalTest("Obje2");  //  20

        System.out.println("Obje Sayısı : " + f1.obje_sayisi);  /* FinalTest.java classında obje_sayisi'nı "static final"
                                                                   olarak yazmadığımız için f1 ve f2 obje referansları üzerinden
                                                                   obje_sayisini bu şekilde bastırdığımızda Çıktı şu şekilde oldu:
                                                                   Obje Sayısı : 1
                                                                   Obje Sayısı : 2
                                                                   Yani bu durumda static olmadığı için ilk objenin değeri 1
                                                                   İkinici objenin değeri 2 olarak gözüktü.
                                                                   static olsaydı her ikisi de 2 gözükecekti. */  //  23
        System.out.println("Obje Sayısı : " + f2.obje_sayisi);  //  24

        // f2.obje_sayisi = 10;  // Hata aldık. Çünkü obje_sayisi final olarak bir kez tanımlanmıştı. Bir kez daha değiştirilemez.  //  25

        // Şimdi farklı bir örnek yapalım. Math kütüphanesinin içerisine CTRL basılı iken Math'a tıklayarak gidelim. //  26

        System.out.println(Math.PI);  //  27

        /* Math kütüphanesine gittiğimizde gördüğümüz PI değişkeninin public static final şeklinde yazılmış olması.
        public olması heryerden erişilebileceğini, static olması obje oluşturmaya gerek kalmadan ulaşılabileceğini ve final
        olması da sadece 1 kere tanımlanabileceği, başka hiçbiryerden hiçbir şekilde değiştirilemeyeceğini ifade etmektedir.
         */  //  28

        /*Math.PI = 3.15; /* Vermiş olduğu hatadan gördüğümüz üzere PI değişkeni final olarak yazılmış olduğu için burada
                           değiştirilemiyor. */  //  29

        // Son olarak Database.java dosyası oluşturup birakım istekler doğrultusunda özelliklerini ekleyelim. //  30

        System.out.println("Database İsmi : " + Database.databaseIsmi);  //  35
        System.out.println("UserName : " + Database.userName);  //  36
        System.out.println("Password : " + Database.passWord);  //  37

        /*  Database.userName = "root2";  //  Direkt hata verdi. Çünkü userName alanı/özelliği final ile yazıldı.
                                              Tekrar değiştirilemez.*/  //   38




    }




}
