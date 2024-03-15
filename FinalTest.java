public class FinalTest {
    /*public final int obje_sayisi = 4;  /*  Final olarak bir özellik tanımladık fakat hata aldık. Java bize bu özelliğin değerini
                                       burada veya herhangi bir constructorda başlatmadığımızı ve bir an önce başlatmamızı
                                       söylüyor.  //  1
                                       Bu değeri ya tanımlandığı yer olan burada ya da constructor içerisinde verebiliriz.
                                       Değeri ilk olarak burada 4 olarak verdik. */  //  2

    //public FinalTest() {  //  Constructor oluşturduk.  //  3

        /*obje_sayisi = 5; /* Özelliğe tekrar değer vermeye çalıştık fakat yukarıda halihazırda tanımlamış olduğumuz için burada
                            tekrar tanımlayamadık ve hata aldık. */  //  4
    //}

    // Şimdi de değeri constructor içerisinde vererek tekrar durumu gözlemleyelim.  //  5

    //public final int obje_sayisi;  // Bu sefer tanımlanırken değeri vermedik. Aşağıda constructor içerisinde verdik. //  6

    /*public FinalTest() {  //  7
        obje_sayisi = 4;  // Bu sefer constructor içerisinde değer tanımladık. //  8
    }*/

    /*public void deneme() {  //  9

        obje_sayisi = 5;  /*  Fonksiyon içerisinde değer vermeye çalıştığımızda hata aldık. Çünkü ya fonksiyon içerisinde
                                //  10

    }*/

    // Temel mantığı kavradık. Şimdi örnek yaparak devam edelim. Aşağıda tekrar özellik tanımlayacağız. //  11

    public final int obje_sayisi;  //  Buna burada değer tanımlamadık. Aşağıda constructor içinde değer vereceğiz.  //  12

    private static int say = 0;  // static olduğu için sadece class'a ait oluyor.  //  13
    private final String isim; //  Bu alanın değerini de constructor içerisind tanımlayacağız.  //  14

    public FinalTest(String isim) {  //  15
        this.isim = isim;  //  16
        say++;  //  17
        obje_sayisi = say;  //  18
    }

    public static int getSay() {  //  Getter ve Setter metodunda sadece say olanı seçtik. //  21
        return say;
    }

    public static void setSay(int say) {  //  Getter ve Setter metodunda sadece say olanı seçtik. //  22
        FinalTest.say = say;
    }
}
