package api;

import java.util.List;

import model.UserModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SelectAPI {
    @GET("selectuser.php")
    Call<List<UserModel>> callModel();

}
