package pe.edu.utp.assisto.requests;



import pe.edu.utp.assisto.tables.LoginBodies;
import pe.edu.utp.assisto.tables.Users;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Gonza on 15/07/2017.
 */

public interface LoginRequest {
    /*
    public static final String LOGIN_REQUEST_URL = "http://assisto.pe.hu/api/user/login";
    private Map<String, String> params;

    public LoginRequest(String email, String password, Response.Listener<String> listener){
        super(Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("email",email);
        params.put("password",password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }*/

    // TODO: Cambiar host por "10.0.0.2" para Genymotion.
    // TODO: Cambiar host por "10.0.0.3" para AVD.
    // TODO: Cambiar host por IP de tu PC para dispositivo real.
    String BASE_URL = "http://assisto.pe.hu/api/";

    @POST("user/login")
    Call<Users> login(@Body LoginBodies loginBodies);
}
