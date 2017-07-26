package pe.edu.utp.assisto.tables;

import com.orm.SugarRecord;
import com.orm.dsl.Table;

import java.util.Date;

/**
 * Created by Gonza on 25/07/2017.
 */
@Table
public class Users extends SugarRecord{
    private long codUser;
    private String firstname;
    private String lastname;
    private String email;
    private String username;
    private String password;
    private Date createdAt;
    private boolean status;
    private String data;

    public Users() {
    }

    public Users(long codUser, String firstname, String lastname, String email, String username, String password, Date createdAt, boolean status, String data) {
        this.codUser = codUser;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.createdAt = createdAt;
        this.status = status;
        this.data = data;
    }

    public Users(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public long getCodUser() {
        return codUser;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
