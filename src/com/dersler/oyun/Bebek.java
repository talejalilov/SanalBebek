package com.dersler.oyun;

import java.util.Date;

public class Bebek {
    private String isim;
    private Date DogumTarihi;
    private int yas;
    private float tokluk;
    private float keyif;
    private float temizlik;
    private float saglik;
    private float enerji;

    public Bebek(String isim) {
        this.isim = isim;
        this.DogumTarihi = new Date();
        this.yas = 0;
        this.tokluk = 50;
        this.keyif = 50;
        this.temizlik = 50;
        this.saglik = 100;
        this.enerji = 50;
    }

    @Override
    public String toString() {
        return isim +
                "(tokluk=" + tokluk +
                ", keyif=" + keyif +
                ", temizlik=" + temizlik +
                ", saglik=" + saglik +
                ", enerji=" + enerji + ')';
    }

    private float setOzellik(float ozellik) {

        return (ozellik > 100) ? 100 : (ozellik < 0) ? 0 : ozellik;
    }

    private void setTokluk(float tokluk) {
        this.tokluk += tokluk;
        this.tokluk = setOzellik(this.tokluk);
    }

    private void setKeyif(float keyif) {
        this.keyif += keyif;
        this.keyif = setOzellik(this.keyif);
    }

    private void setTemizlik(float temizlik) {
        this.temizlik += temizlik;
        this.temizlik = setOzellik(this.temizlik);
    }

    private void setSaglik(float saglik) {
        this.saglik += saglik;
        this.saglik = setOzellik(this.saglik);
    }

    private void setEnerji(float enerji) {
        this.enerji += enerji;
        this.enerji = setOzellik(this.enerji);
    }

    public void Besle(Yemekler yemek) {
        setTokluk(yemek.tokluk);
        setKeyif(yemek.keyif);
        setSaglik(yemek.saglik);
        setEnerji(yemek.enerji);
        setTemizlik(yemek.temizlik);
    }

    public void Oyna(Oyunlar oyun) {
        setTokluk(oyun.tokluk);
        setKeyif(oyun.keyif);
        setSaglik(oyun.saglik);
        setEnerji(oyun.enerji);
        setTemizlik(oyun.temizlik);
    }

    public void Uyut(int saat) {
        setEnerji(10 * saat);
        setTokluk(-10 * saat);
        setSaglik(5 * saat);
        setKeyif(5 * saat);
    }

    public void TuvaletYapti() {
        temizlik = 0;
        setKeyif(-50);
        setTokluk(-25);
        setEnerji(-25);
    }

    public void Asila() {
        saglik = 100;
        keyif = 0;
    }

    public void Temizle() {
        temizlik = 100;
        setKeyif(50);
        saglik = 100;
        setEnerji(-20);
        setTokluk(-20);
    }
}
