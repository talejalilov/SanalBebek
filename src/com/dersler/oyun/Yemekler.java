package com.dersler.oyun;

public enum Yemekler {
    //Değişkenler grubu: Aşağıda tanımlanan 6 farklı mülkü tek isim altında toplamaya yaran kısım.
    Biberon( 20, 20, 0, 10, 20),
    Dondurma( 5,50,-10,-10,25),
    Sekerleme( 5,50,-20,-20,50),
    Pasta( 10,50,-10,-10,50),
    Fastfood( 20,50,-25,-25,10),
    Sut( 5,20,0,10,0),
    Sebze( 25,-10,0,20,25),
    Et( 25,0,-10,20,25),
    Balik( 25,0,-10,20,25);

    //Mülkler grubu: Her değişkene atanan iç değişkenlerdir, bütün değerleri bir isim altında toplanarak yayınlanmasını sağlar.
    public float tokluk;
    public float keyif;
    public float temizlik;
    public float saglik;
    public float enerji;

    //Yapıcı Metot: Değişkenler ve Mülkleri birer birer eşleştirerek yapıyı tamamlar.
    Yemekler(float t, float k, float te, float s, float e) {
        this.tokluk = t;
        this.keyif = k;
        this.temizlik = te;
        this.saglik = s;
        this.enerji = e;

    }
}
