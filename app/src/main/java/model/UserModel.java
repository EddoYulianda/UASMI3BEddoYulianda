package model;

import com.google.gson.annotations.SerializedName;

public class UserModel {
    @SerializedName("id")
    private  int id;
    @SerializedName("kode")
    private String kode;
    @SerializedName("nama_barang")
    private String nama_barang;
    @SerializedName("harga")
    private String harga;
    @SerializedName("jumlah_barang")
    private String jumlah_barang;
    @SerializedName("gambar_barang")
    private String gambar_barang;
    @SerializedName("cara_bayar")
    private String cara_bayar;
    @SerializedName("harga_promo")
    private String harga_promo;
    @SerializedName("jenis_satuan")
    private String jenis_satuan;

    public UserModel(String kode, String nama_barang, String harga, String jumlah_barang, String gambar_barang, String cara_bayar, String harga_promo, String jenis_satuan){
        this.kode = kode;
        this.nama_barang = nama_barang;
        this.harga = harga;
        this.jumlah_barang = jumlah_barang;
        this.gambar_barang = gambar_barang;
        this.cara_bayar = cara_bayar;
        this.harga_promo = harga_promo;
        this.jenis_satuan =jenis_satuan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(String jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public String getGambar_barang() {
        return gambar_barang;
    }

    public void setGambar_barang(String gambar_barang) {
        this.gambar_barang = gambar_barang;
    }

    public String getCara_bayar() {
        return cara_bayar;
    }

    public void setCara_bayar(String cara_bayar) {
        this.cara_bayar = cara_bayar;
    }

    public String getHarga_promo() {
        return harga_promo;
    }

    public void setHarga_promo(String harga_promo) {
        this.harga_promo = harga_promo;
    }

    public String getJenis_satuan() {
        return jenis_satuan;
    }

    public void setJenis_satuan(String jenis_satuan) {
        this.jenis_satuan = jenis_satuan;
    }
}
