package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.messages.Region;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressLint
/* loaded from: classes6.dex */
public final class a extends b implements com.salesforce.marketingcloud.storage.a {
    public static final String e = "analytic_item";

    @VisibleForTesting
    static final int f = 1000;
    private static final String h = "CREATE TABLE analytic_item (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_type INTEGER, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, enc_json_pi_payload VARCHAR, enc_json_et_payload VARCHAR, predictive_intelligence_identifier VARCHAR DEFAULT NULL);";
    private static final String[] g = {"id", C0379a.c, C0379a.i, C0379a.d, "value", C0379a.f, C0379a.e, C0379a.h, C0379a.g, "predictive_intelligence_identifier"};
    private static final String i = com.salesforce.marketingcloud.g.a("AnalyticItemDbStorage");

    /* renamed from: com.salesforce.marketingcloud.storage.db.a$a, reason: collision with other inner class name */
    public static class C0379a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f17042a = "id";
        public static final String b = "value";
        public static final String c = "event_date";
        public static final String d = "analytic_type";
        public static final String e = "object_ids";
        public static final String f = "ready_to_send";
        public static final String g = "enc_json_et_payload";
        public static final String h = "enc_json_pi_payload";
        public static final String i = "analytic_product_type";
        public static final String j = "predictive_intelligence_identifier";
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public void a(com.salesforce.marketingcloud.analytics.b bVar, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        int i2 = bVar.j() == 0 ? 0 : 1;
        int iH = h(i2);
        if (iH + 1 > 1000) {
            a(iH, 1000, i2);
        }
        bVar.a((int) a(c(bVar, cVar)));
    }

    @VisibleForTesting
    public List<com.salesforce.marketingcloud.analytics.b> b(Cursor cursor, @Nullable com.salesforce.marketingcloud.util.c cVar) {
        List<com.salesforce.marketingcloud.analytics.b> list = Collections.EMPTY_LIST;
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                ArrayList arrayList = new ArrayList();
                do {
                    com.salesforce.marketingcloud.analytics.b bVarA = a(cursor, cVar);
                    if (bVarA != null) {
                        arrayList.add(bVarA);
                    } else {
                        int i2 = cursor.getInt(cursor.getColumnIndex("id"));
                        if (i2 >= 0) {
                            a(a("%s = ?", "id"), new String[]{String.valueOf(i2)});
                        }
                    }
                } while (cursor.moveToNext());
                list = arrayList;
            }
            cursor.close();
        }
        return list;
    }

    @Override // com.salesforce.marketingcloud.storage.a
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.b> c(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        return b(a(g, a("%s=? AND %s=?", C0379a.i, C0379a.f), new String[]{String.valueOf(0), "1"}, null, null, a("%s ASC", "id")), cVar);
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int d() {
        return h(0);
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int e() {
        return h(1);
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int g(int i2) {
        return a(a("%s = ?", C0379a.i), new String[]{String.valueOf(i2)});
    }

    @Override // com.salesforce.marketingcloud.storage.a
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.b> h(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        return b(a(g, a("(%1$s=? OR %1$s=?) AND %2$s=?", C0379a.d, C0379a.f), new String[]{String.valueOf(13), String.valueOf(11), String.valueOf(0)}), cVar);
    }

    @Override // com.salesforce.marketingcloud.storage.a
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.b> i(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        return b(1, cVar);
    }

    @Override // com.salesforce.marketingcloud.storage.a
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.b> o(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        return b(a(g, a("%s=? AND %s=?", C0379a.i, C0379a.f), new String[]{String.valueOf(1), String.valueOf(1)}, null, null, a("%s ASC", C0379a.c)), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.ArrayList] */
    private static com.salesforce.marketingcloud.analytics.b a(Cursor cursor, @Nullable com.salesforce.marketingcloud.util.c cVar) {
        String strB;
        String strOptString;
        com.salesforce.marketingcloud.analytics.b bVarA;
        try {
            int i2 = cursor.getInt(cursor.getColumnIndex(C0379a.d));
            int i3 = cursor.getInt(cursor.getColumnIndex(C0379a.i)) == 0 ? 0 : 1;
            Date dateF = com.salesforce.marketingcloud.util.l.f(cursor.getString(cursor.getColumnIndex(C0379a.c)));
            boolean z = cursor.getInt(cursor.getColumnIndex(C0379a.f)) == 1;
            ?? arrayList = Collections.EMPTY_LIST;
            JSONArray jSONArray = new JSONArray(cursor.getString(cursor.getColumnIndex(C0379a.e)));
            if (jSONArray.length() > 0) {
                arrayList = new ArrayList();
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    arrayList.add(jSONArray.getString(i4));
                }
            }
            List list = arrayList;
            if (cVar != null) {
                strB = cVar.b(cursor.getString(cursor.getColumnIndex(C0379a.g)));
                strOptString = !TextUtils.isEmpty(strB) ? new JSONObject(strB).optString("requestId") : null;
            } else {
                strB = null;
                strOptString = null;
            }
            if (!TextUtils.isEmpty(strOptString)) {
                bVarA = com.salesforce.marketingcloud.analytics.b.a(dateF, i3, i2, list, strOptString, z);
            } else if (list.size() > 0) {
                bVarA = com.salesforce.marketingcloud.analytics.b.a(dateF, i3, i2, (List<String>) list, z);
            } else {
                bVarA = com.salesforce.marketingcloud.analytics.b.a(dateF, i3, i2);
                bVarA.a(z);
            }
            bVarA.a(cursor.getInt(cursor.getColumnIndex("id")));
            bVarA.b(cursor.getInt(cursor.getColumnIndex("value")));
            bVarA.b(strB);
            if (i3 == 1 && cVar != null) {
                bVarA.d(cVar.b(cursor.getString(cursor.getColumnIndex("predictive_intelligence_identifier"))));
                String string = cursor.getString(cursor.getColumnIndex(C0379a.h));
                if (!TextUtils.isEmpty(string)) {
                    bVarA.c(cVar.b(string));
                }
            }
            return bVarA;
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(i, e2, "Failed to create our analytic item from storage.", new Object[0]);
            return null;
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
                com.salesforce.marketingcloud.g.b(i, e2, "Unable to recover %s", e);
            }
        }
        return zC;
    }

    private int h(int i2) {
        return (int) DatabaseUtils.queryNumEntries(this.c, e, a("%s=%s", C0379a.i, Integer.valueOf(i2)));
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int b(int i2) {
        return a(a("%s = ? AND %s IN (%s)", C0379a.i, C0379a.d, TextUtils.join(",", com.salesforce.marketingcloud.analytics.b.t)), new String[]{String.valueOf(i2)});
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public boolean c(int i2) {
        return DatabaseUtils.queryNumEntries(this.c, o(), a("(%1$s=? OR %1$s=?) AND %2$s=? AND %3$s=? AND %4$s=?", C0379a.d, C0379a.i, "value", C0379a.f), new String[]{String.valueOf(4), String.valueOf(5), String.valueOf(i2), String.valueOf(0), String.valueOf(0)}) > 0;
    }

    @Override // com.salesforce.marketingcloud.storage.a
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.b> g(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        return b(0, cVar);
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return e;
    }

    private List<com.salesforce.marketingcloud.analytics.b> b(int i2, @Nullable com.salesforce.marketingcloud.util.c cVar) {
        return b(a(g, a("(%1$s=? OR %1$s=?) AND %2$s=? AND %3$s=? AND %4$s=?", C0379a.d, C0379a.i, "value", C0379a.f), new String[]{String.valueOf(4), String.valueOf(5), String.valueOf(i2), String.valueOf(0), String.valueOf(0)}, null, null, a("%s ASC", "id")), cVar);
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.compileStatement(c.a("SELECT %s FROM %s", TextUtils.join(",", g), e));
            return true;
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.e(i, e2, "%s is invalid", e);
            return false;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int a(String[] strArr) {
        return i(a("%s IN (%s)", "id", TextUtils.join(",", strArr)));
    }

    private static ContentValues c(@NonNull com.salesforce.marketingcloud.analytics.b bVar, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        String strA;
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0379a.c, com.salesforce.marketingcloud.util.l.a(bVar.b()));
        contentValues.put(C0379a.i, Integer.valueOf(bVar.j()));
        contentValues.put(C0379a.d, Integer.valueOf(bVar.a()));
        contentValues.put("value", Integer.valueOf(bVar.g()));
        contentValues.put(C0379a.f, Integer.valueOf(bVar.h() ? 1 : 0));
        contentValues.put(C0379a.e, new JSONArray((Collection) bVar.i()).toString());
        if (bVar.c() != null) {
            contentValues.put(C0379a.g, cVar.a(bVar.c()));
        }
        if (bVar.j() == 1) {
            contentValues.put("predictive_intelligence_identifier", cVar.a(bVar.f()));
            strA = cVar.a(bVar.e());
        } else {
            contentValues.put("predictive_intelligence_identifier", (String) null);
            strA = "";
        }
        contentValues.put(C0379a.h, strA);
        return contentValues;
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int a(int i2) {
        return a(a("%s = ? AND %s NOT IN (%s)", C0379a.i, C0379a.d, TextUtils.join(",", com.salesforce.marketingcloud.analytics.b.t)), new String[]{String.valueOf(i2)});
    }

    @Override // com.salesforce.marketingcloud.storage.a
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.b> b(@NonNull Region region, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        return b(a(g, a("(%1$s=? OR %1$s=?) AND %2$s LIKE ? AND %3$s=?", C0379a.d, C0379a.e, C0379a.f), new String[]{String.valueOf(13), String.valueOf(11), a("%%%s%%", region.id()), String.valueOf(0)}), cVar);
    }

    public static void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS analytic_item");
    }

    public static void b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(h);
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int b(com.salesforce.marketingcloud.analytics.b bVar, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        return a(c(bVar, cVar), a("%s = ?", "id"), new String[]{String.valueOf(bVar.d())});
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int a() {
        try {
            return a("analytic_product_type =? AND event_date <= ?", new String[]{String.valueOf(1), com.salesforce.marketingcloud.util.l.a(new Date(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(14L)))});
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(i, e2, "Unable to purge old analytic data.", new Object[0]);
            return 0;
        }
    }

    private void a(int i2, int i3, int i4) throws Exception {
        i(a("%s IN ( SELECT %s FROM %s WHERE %s=%d ORDER BY %s ASC LIMIT %d )", "id", "id", e, C0379a.i, Integer.valueOf(i4), "id", Integer.valueOf((i2 + 1) - i3)));
    }
}
