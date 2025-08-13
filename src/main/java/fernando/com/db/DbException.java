package fernando.com.db;

import java.sql.SQLException;

public class DbException extends RuntimeException {
    public DbException(String msg) {
        super(msg);
    }

    public DbException(String msg, Throwable cause) {
        super(msg, cause);
    }
}