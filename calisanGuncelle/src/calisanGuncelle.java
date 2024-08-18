import java.util.Scanner;

public class calisanGuncelle {
    public static void main(String[] args) {
        /*
        5 tane çalışan için isim ve maaş bilgisi alalım.
        bunları ekrana yazdırabilen bir uygulama yazalım.
        bunu bir menü olarak yazalım.
        --Ek : Yönetici olarak isterseniz calisanlariniza zam
        yapabiliyorsunuz. Menüye bunun için bir secim ekleyelim.
        Ör. girilen sayı kadar yüzdede arttırsın. 50 -> %50 zam yapmak.
         */
        Scanner sc = new Scanner(System.in);
        int[] maas = new int[5];
        String[] isim = new String[5];

        int calisanSayisi = 0;
        boolean kontrol = true;

        while (kontrol){
            System.out.println("1 - Calisan Ekle\n" +
                    "2 - Calisanlari Goster\n" +
                            "3 - Maas Guncelle\n"+
                            "0 - Cikis\n" +
                            "Bir secim yapiniz :");
            int secim = sc.nextInt();
            sc.nextLine();
            switch (secim){
                case 1:
                    if (calisanSayisi >= 5){
                        System.out.println("Çalışan Sınırı Geçildi!!");
                    }
                    else {
                        System.out.println("İsim Gir: ");
                        isim[calisanSayisi] = sc.nextLine();

                        System.out.println("Maaş Gir: ");
                        maas[calisanSayisi] = sc.nextInt();
                        calisanSayisi++;
                    }
                    break;
                case 2:
                    for (int i = 0; i <calisanSayisi; i++){
                        System.out.println(isim[i] + " - " + maas[i] + " - ");
                    }
                    break;
                case 3:
                    System.out.println("½ yüzde miktarını girin: ");
                    int miktar = sc.nextInt();
                    for (int i = 0; i < calisanSayisi; i++){
                        maas[i] += maas[i]*miktar/100;
                    }
                    System.out.println("Maaş Güncellendi!");
                    break;
                case 0:
                    System.out.println("Çıkış Yapılıyor...");
                    kontrol = false;
                    break;
                default:
                    System.out.println("Yanlış Değer Girildi!!");

            }
        }

    }
}
