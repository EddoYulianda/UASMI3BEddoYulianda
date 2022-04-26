package api;

import model.UserModel;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface InsertAPI {
    @FormUrlEncoded
    @POST("insertuser.php")
    Call<UserModel> insertData(
            @Field("kode")String kode,
            @Field("nama_barang")String nama_barang,
            @Field("harga")String harga,
            @Field("jumlah_barang")String jumlah_barang,
            @Field("gambar_barang")String gambar_barang,
            @Field("cara_bayar")String cara_bayar,
            @Field("harga_promo")String harga_promo,
            @Field("jenis_satuan")String jenis_satuan);
}

