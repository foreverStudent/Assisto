package pe.edu.utp.assisto.tables;

import com.orm.SugarRecord;
import com.orm.dsl.Column;
import com.orm.dsl.Table;

/**
 * Created by Gonza on 26/07/2017.
 */
@Table
public class UserSession extends SugarRecord{
    private long iUserSession;
    @Column(name="status")
    private boolean status;

    public UserSession() {
    }

    public UserSession(boolean status) {
        this.status = status;
    }

    public long getiUserSession() {
        return iUserSession;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
