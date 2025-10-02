package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.storage.db.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
/* loaded from: classes6.dex */
public class m extends b implements com.salesforce.marketingcloud.storage.n {
    public static final String g = "triggers";
    private static final String h = com.salesforce.marketingcloud.g.a("TriggerDbStorage");
    private final SQLiteStatement e;
    private final SQLiteStatement f;

    public m(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
        this.e = sQLiteDatabase.compileStatement("UPDATE triggers SET app_open_count = app_open_count + 1 WHERE (start_date IS NULL OR start_date < ?)");
        this.f = sQLiteDatabase.compileStatement("SELECT app_open_count FROM triggers WHERE id = ?");
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.compileStatement("SELECT id,_key,start_date,_trigger,app_open_count FROM triggers");
            return true;
        } catch (Exception unused) {
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
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(h, e, "Unable to recover %s", g);
            }
        }
        return zC;
    }

    @Override // com.salesforce.marketingcloud.storage.n
    public void a(@NonNull com.salesforce.marketingcloud.events.h hVar) throws Exception {
        ContentValues contentValuesC = c(hVar);
        if (a(contentValuesC, "id = ?", new String[]{hVar.h()}) == 0) {
            a(contentValuesC);
        }
    }

    @Override // com.salesforce.marketingcloud.storage.n
    public int b(@NonNull com.salesforce.marketingcloud.events.h hVar) {
        if (hVar == null) {
            return 0;
        }
        try {
            this.f.bindString(1, hVar.h());
            return (int) this.f.simpleQueryForLong();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.n
    @NonNull
    public List<com.salesforce.marketingcloud.events.h> g(@NonNull String str) {
        ArrayList arrayList;
        Cursor cursorA = a(new String[]{"_trigger"}, "lower(_key) = lower(?) AND (start_date IS NULL OR start_date < ?)", new String[]{str, String.valueOf(System.currentTimeMillis())});
        try {
            if (cursorA.moveToFirst()) {
                arrayList = new ArrayList(cursorA.getCount());
                do {
                    arrayList.add(a(cursorA));
                } while (cursorA.moveToNext());
            } else {
                arrayList = null;
            }
            return arrayList != null ? arrayList : Collections.EMPTY_LIST;
        } finally {
            cursorA.close();
        }
    }

    @Override // com.salesforce.marketingcloud.storage.n
    public void k() {
        this.e.bindString(1, String.valueOf(System.currentTimeMillis()));
        this.e.execute();
    }

    @Override // com.salesforce.marketingcloud.storage.n
    @NonNull
    public JSONArray m() {
        JSONArray jSONArray = new JSONArray();
        Cursor cursorA = a(new String[]{"_trigger", "app_open_count"}, (String) null);
        if (cursorA == null) {
            return jSONArray;
        }
        try {
            if (cursorA.moveToFirst()) {
                int columnIndex = cursorA.getColumnIndex("_trigger");
                int columnIndex2 = cursorA.getColumnIndex("app_open_count");
                do {
                    try {
                        JSONObject jSONObject = new JSONObject(cursorA.getString(columnIndex));
                        jSONObject.put("appOpenCount", cursorA.getInt(columnIndex2));
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        com.salesforce.marketingcloud.g.b(h, e, "Unable to read trigger information from cursor.", new Object[0]);
                    }
                } while (cursorA.moveToNext());
            }
            return jSONArray;
        } finally {
            cursorA.close();
        }
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return g;
    }

    @Nullable
    private static com.salesforce.marketingcloud.events.h a(@NonNull Cursor cursor) {
        try {
            return new com.salesforce.marketingcloud.events.h(new JSONObject(cursor.getString(cursor.getColumnIndex("_trigger"))));
        } catch (Exception e) {
            com.salesforce.marketingcloud.g.b(h, e, "Unable to read trigger from DB", new Object[0]);
            return null;
        }
    }

    private static ContentValues c(com.salesforce.marketingcloud.events.h hVar) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", hVar.h());
        contentValues.put("_key", hVar.i());
        contentValues.put(i.a.h, hVar.l() != null ? Long.valueOf(hVar.l().getTime()) : null);
        contentValues.put("_trigger", hVar.m().toString());
        return contentValues;
    }

    @Override // com.salesforce.marketingcloud.storage.n
    @Nullable
    public com.salesforce.marketingcloud.events.h b(@NonNull String str) {
        Cursor cursorA = a(new String[]{"_trigger"}, "id = ?", new String[]{str});
        if (cursorA != null) {
            hVarA = cursorA.moveToFirst() ? a(cursorA) : null;
            cursorA.close();
        }
        return hVarA;
    }

    public static void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS triggers");
    }

    public static void b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE triggers(id TEXT PRIMARY KEY, _key TEXT, start_date INTEGER DEFAULT NULL, _trigger TEXT, app_open_count INTEGER DEFAULT 0);");
    }

    @Override // com.salesforce.marketingcloud.storage.n
    public int b(@NonNull Collection<String> collection) {
        if (collection.size() == 0) {
            return i(null);
        }
        try {
            return a(o(), collection);
        } catch (Exception unused) {
            com.salesforce.marketingcloud.g.e(h, "Unable to clean up %s table.", o());
            return 0;
        }
    }
}
