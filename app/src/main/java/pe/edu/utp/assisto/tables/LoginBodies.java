package pe.edu.utp.assisto.tables;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Gonza on 26/07/2017.
 */

public class LoginBodies {
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;

    public LoginBodies(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
