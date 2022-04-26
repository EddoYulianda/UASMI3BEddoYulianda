package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uasmi3beddoyulianda.R;

import java.util.List;

import model.UserModel;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private Context context;
    private List<UserModel> userList;

    public UserAdapter(Context context, List<UserModel> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull

    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_insert_product,parent,false);
        UserViewHolder uvh = new UserViewHolder(view);
        return uvh;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        UserModel userModel = userList.get(position);
        holder.kode.setText("kode : "+userModel.getKode());
        holder.nama_barang.setText("Nama Barang : "+userModel.getNama_barang());
        holder.harga.setText("Harga : "+userModel.getHarga());
        holder.jumlah_barang.setText("Jumlah Barang : "+userModel.getJumlah_barang());
        holder.gambar_barang.setText("Jumlah Barang : "+userModel.getGambar_barang());
        holder.cara_bayar.setText("Jumlah Barang : "+userModel.getCara_bayar());
        holder.harga_promo.setText("Jumlah Barang : "+userModel.getHarga_promo());
        holder.jenis_satuan.setText("Jumlah Barang : "+userModel.getJenis_satuan());

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}


class   UserViewHolder extends RecyclerView.ViewHolder {

    TextView id, kode, nama_barang, harga, jumlah_barang, gambar_barang, cara_bayar, harga_promo, jenis_satuan;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        id = itemView.findViewById(R.id.userid);
        kode = itemView.findViewById(R.id.kode);
        nama_barang = itemView.findViewById(R.id.namabrg);
        harga = itemView.findViewById(R.id.harga);
        jumlah_barang = itemView.findViewById(R.id.jumlah);
        gambar_barang = itemView.findViewById(R.id.gmbr);
        cara_bayar = itemView.findViewById(R.id.bayar);
        harga_promo = itemView.findViewById(R.id.hargaPromo);
        jenis_satuan =itemView.findViewById(R.id.satuan);

    }

}
