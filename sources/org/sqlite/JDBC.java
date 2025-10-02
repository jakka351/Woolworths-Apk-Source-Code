package org.sqlite;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Properties;
import org.sqlite.SQLiteConfig;
import org.sqlite.jdbc4.JDBC4Connection;

/* loaded from: classes8.dex */
public class JDBC implements Driver {
    static {
        try {
            DriverManager.registerDriver(new JDBC());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override // java.sql.Driver
    public final boolean acceptsURL(String str) {
        return str != null && str.toLowerCase().startsWith("jdbc:sqlite:");
    }

    @Override // java.sql.Driver
    public final Connection connect(String str, Properties properties) {
        if (str == null || !str.toLowerCase().startsWith("jdbc:sqlite:")) {
            return null;
        }
        String strTrim = str.trim();
        return new JDBC4Connection(strTrim, strTrim.substring(12), properties);
    }

    @Override // java.sql.Driver
    public final int getMajorVersion() {
        String[] strArrSplit = SQLiteJDBCLoader.b().split("\\.");
        if (strArrSplit.length > 0) {
            return Integer.parseInt(strArrSplit[0]);
        }
        return 1;
    }

    @Override // java.sql.Driver
    public final int getMinorVersion() {
        String[] strArrSplit = SQLiteJDBCLoader.b().split("\\.");
        if (strArrSplit.length > 1) {
            return Integer.parseInt(strArrSplit[1]);
        }
        return 0;
    }

    @Override // java.sql.Driver
    public final DriverPropertyInfo[] getPropertyInfo(String str, Properties properties) {
        String[] strArr = SQLiteConfig.e;
        DriverPropertyInfo[] driverPropertyInfoArr = new DriverPropertyInfo[SQLiteConfig.Pragma.values().length];
        SQLiteConfig.Pragma[] pragmaArrValues = SQLiteConfig.Pragma.values();
        int length = pragmaArrValues.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            SQLiteConfig.Pragma pragma = pragmaArrValues[i];
            DriverPropertyInfo driverPropertyInfo = new DriverPropertyInfo(pragma.d, null);
            driverPropertyInfo.choices = pragma.e;
            driverPropertyInfo.description = pragma.f;
            driverPropertyInfo.required = false;
            driverPropertyInfoArr[i2] = driverPropertyInfo;
            i++;
            i2++;
        }
        return driverPropertyInfoArr;
    }

    @Override // java.sql.Driver
    public final boolean jdbcCompliant() {
        return false;
    }
}
