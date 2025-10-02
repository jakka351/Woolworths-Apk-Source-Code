package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.location.LatLon;
import java.util.Locale;

@SuppressLint
/* loaded from: classes6.dex */
public final class h extends b implements com.salesforce.marketingcloud.storage.i {
    public static final String e = "location_table";
    private static final String f = "CREATE TABLE location_table (id INTEGER PRIMARY KEY CHECK (id = 0), latitude VARCHAR, longitude VARCHAR );";
    private static final String[] g = {"id", a.b, a.c};
    private static final String h = com.salesforce.marketingcloud.g.a("LocationDbStorage");

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f17047a = "id";
        public static final String b = "latitude";
        public static final String c = "longitude";
    }

    public h(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    public static void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS location_table");
    }

    public static void b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(f);
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.compileStatement(c.a("SELECT %s FROM %s", TextUtils.join(",", g), e));
            return true;
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.e(h, e2, "%s is invalid", e);
            return false;
        }
    }

    public static boolean d(SQLiteDatabase sQLiteDatabase) throws SQLException {
        boolean zC = c(sQLiteDatabase);
        if (!zC) {
            try {
                a(sQLiteDatabase);
                b(sQLiteDatabase);
                return c(sQLiteDatabase);
            } catch (Exception e2) {
                com.salesforce.marketingcloud.g.b(h, e2, "Unable to recover %s", e);
            }
        }
        return zC;
    }

    @Override // com.salesforce.marketingcloud.storage.i
    @Nullable
    public LatLon f(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        String[] strArr = g;
        Locale locale = Locale.ENGLISH;
        Cursor cursorA = a(strArr, "id = ?", new String[]{"0"});
        LatLon latLon = null;
        if (cursorA != null) {
            if (cursorA.moveToFirst()) {
                try {
                    latLon = new LatLon(Double.valueOf(cVar.b(cursorA.getString(cursorA.getColumnIndex(a.b)))).doubleValue(), Double.valueOf(cVar.b(cursorA.getString(cursorA.getColumnIndex(a.c)))).doubleValue());
                } catch (Exception e2) {
                    com.salesforce.marketingcloud.g.b(h, e2, "Unable to read location from database.", new Object[0]);
                }
            }
            cursorA.close();
        }
        return latLon;
    }

    @Override // com.salesforce.marketingcloud.storage.i
    public int g() {
        return i(null);
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return e;
    }

    @Override // com.salesforce.marketingcloud.storage.i
    public void a(@NonNull LatLon latLon, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", (Integer) 0);
        contentValues.put(a.b, cVar.a(Double.toString(latLon.latitude())));
        contentValues.put(a.c, cVar.a(Double.toString(latLon.longitude())));
        Locale locale = Locale.ENGLISH;
        if (a(contentValues, "id = ?", new String[]{"0"}) == 0) {
            a(contentValues);
        }
    }
}
