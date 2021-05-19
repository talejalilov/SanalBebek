package com.dersler.oyun;

public enum Oyunlar {
    Top(-20,25,-50,-10,-50),
    Saklambac(-20,30,-25,-10,-50),
    Bebek(-20,25,-10,0,-25);

    public float tokluk;
    public float keyif;
    public float temizlik;
    public float saglik;
    public float enerji;

    Oyunlar(float t, float k, float te, float s, float e) {
        this.tokluk = t;
        this.keyif = k;
        this.temizlik = te;
        this.saglik = s;
        this.enerji = e;
    }
}
