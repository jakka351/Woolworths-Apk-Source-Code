package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.storage.db.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class f extends b implements com.salesforce.marketingcloud.storage.g {
    public static final String e = "in_app_messages";
    public static final String f = "iam_state";
    public static final String g = "iam_view";
    public static final String h = "iam_state_init";
    private static final String i = com.salesforce.marketingcloud.g.a("InAppMessageDbStorage");
    private static final String j = "id IN (%s) AND (display_count < display_limit) AND (start_date IS NULL OR start_date < ?) AND (end_date IS NULL OR end_date > ?) ORDER BY   priority ASC,  modified_date DESC LIMIT 1";

    public f(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    private static void b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TRIGGER iam_state_init AFTER INSERT ON in_app_messages BEGIN INSERT INTO iam_state (id) VALUES (NEW.id); END;");
    }

    private static void c(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE VIEW iam_view AS SELECT in_app_messages.id,in_app_messages.priority,in_app_messages.start_date,in_app_messages.end_date,in_app_messages.modified_date,in_app_messages.display_limit,in_app_messages.message_json,iam_state.display_count FROM in_app_messages INNER JOIN iam_state ON iam_state.id = in_app_messages.id;");
    }

    private static void d(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE in_app_messages(id TEXT PRIMARY KEY, priority INTEGER DEFAULT 999, start_date INTEGER DEFAULT NULL, end_date INTEGER DEFAULT NULL, modified_date INTEGER DEFAULT NULL, display_limit INTEGER DEFAULT 1, media_url TEXT DEFAULT NULL, message_json TEXT);");
    }

    public static void e(SQLiteDatabase sQLiteDatabase) throws SQLException {
        h(sQLiteDatabase);
        f(sQLiteDatabase);
        g(sQLiteDatabase);
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS iam_state_init");
    }

    private static void f(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS iam_state");
    }

    private static void g(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS iam_view");
    }

    private static void h(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS in_app_messages");
    }

    public static void i(SQLiteDatabase sQLiteDatabase) throws SQLException {
        d(sQLiteDatabase);
        a(sQLiteDatabase);
        b(sQLiteDatabase);
        c(sQLiteDatabase);
    }

    private static boolean j(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.compileStatement("SELECT id,display_count FROM iam_state");
            return false;
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.e(i, e2, "%s is invalid", f);
            return true;
        }
    }

    private static boolean k(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.compileStatement("SELECT id,priority,start_date,end_date,modified_date,display_limit,media_url,message_json FROM in_app_messages");
            return false;
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.e(i, e2, "%s is invalid", e);
            return true;
        }
    }

    private static boolean l(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.compileStatement("SELECT id,priority,start_date,end_date,modified_date,display_limit,message_json,display_count FROM iam_view");
            return false;
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.e(i, e2, "%s is invalid", g);
            return true;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(5:4|60|5|11|(1:13))|16|(5:18|58|19|25|(1:27)(1:28))(1:31)|32|(4:66|34|38|(1:40))|41|(4:64|43|47|(1:49))(2:(0)|55)|56|51|55|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ac, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        com.salesforce.marketingcloud.g.b(com.salesforce.marketingcloud.storage.db.f.i, r8, "Unable to correct relationship between iam data and iam state.", new java.lang.Object[0]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m(android.database.sqlite.SQLiteDatabase r8) throws android.database.SQLException {
        /*
            boolean r0 = k(r8)
            java.lang.String r1 = "Unable to recover %s"
            r2 = 0
            if (r0 == 0) goto L32
            r8.beginTransaction()
            h(r8)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            d(r8)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            r8.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            goto L24
        L16:
            r0 = move-exception
            goto L2e
        L18:
            r0 = move-exception
            java.lang.String r3 = com.salesforce.marketingcloud.storage.db.f.i     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = "in_app_messages"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L16
            com.salesforce.marketingcloud.g.b(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L16
        L24:
            r8.endTransaction()
            boolean r0 = k(r8)
            if (r0 == 0) goto L32
            return r2
        L2e:
            r8.endTransaction()
            throw r0
        L32:
            boolean r0 = j(r8)
            r3 = 1
            if (r0 == 0) goto L64
            r8.beginTransaction()
            f(r8)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            a(r8)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r8.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            goto L54
        L46:
            r0 = move-exception
            goto L60
        L48:
            r0 = move-exception
            java.lang.String r4 = com.salesforce.marketingcloud.storage.db.f.i     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = "iam_state"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L46
            com.salesforce.marketingcloud.g.b(r4, r0, r1, r5)     // Catch: java.lang.Throwable -> L46
        L54:
            r8.endTransaction()
            boolean r0 = j(r8)
            if (r0 == 0) goto L5e
            return r2
        L5e:
            r0 = r3
            goto L65
        L60:
            r8.endTransaction()
            throw r0
        L64:
            r0 = r2
        L65:
            boolean r4 = l(r8)
            if (r4 == 0) goto L85
            g(r8)     // Catch: java.lang.Exception -> L72
            c(r8)     // Catch: java.lang.Exception -> L72
            goto L7e
        L72:
            r4 = move-exception
            java.lang.String r5 = com.salesforce.marketingcloud.storage.db.f.i
            java.lang.String r6 = "iam_view"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            com.salesforce.marketingcloud.g.b(r5, r4, r1, r6)
        L7e:
            boolean r4 = l(r8)
            if (r4 == 0) goto L85
            return r2
        L85:
            java.lang.String r4 = "trigger"
            java.lang.String r5 = "iam_state_init"
            boolean r6 = com.salesforce.marketingcloud.storage.db.c.a(r8, r4, r5)
            if (r6 == 0) goto La4
            b(r8)     // Catch: java.lang.Exception -> L93
            goto L9d
        L93:
            r0 = move-exception
            java.lang.String r6 = com.salesforce.marketingcloud.storage.db.f.i
            java.lang.Object[] r7 = new java.lang.Object[]{r5}
            com.salesforce.marketingcloud.g.b(r6, r0, r1, r7)
        L9d:
            boolean r0 = com.salesforce.marketingcloud.storage.db.c.a(r8, r4, r5)
            if (r0 == 0) goto La6
            return r2
        La4:
            if (r0 == 0) goto Lb6
        La6:
            java.lang.String r0 = "INSERT OR IGNORE INTO iam_state(id) SELECT id FROM in_app_messages;"
            r8.execSQL(r0)     // Catch: java.lang.Exception -> Lac
            goto Lb6
        Lac:
            r8 = move-exception
            java.lang.String r0 = com.salesforce.marketingcloud.storage.db.f.i
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "Unable to correct relationship between iam data and iam state."
            com.salesforce.marketingcloud.g.b(r0, r8, r2, r1)
        Lb6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.db.f.m(android.database.sqlite.SQLiteDatabase):boolean");
    }

    @Override // com.salesforce.marketingcloud.storage.g
    public int a(@NonNull InAppMessage inAppMessage, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValuesB = b(inAppMessage, cVar);
        if (this.c.update(e, contentValuesB, "id = ?", new String[]{inAppMessage.id()}) != 0) {
            return 2;
        }
        this.c.insert(e, null, contentValuesB);
        return 1;
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return null;
    }

    private static void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE iam_state(id TEXT PRIMARY KEY, display_count integer default 0, FOREIGN KEY (id) REFERENCES in_app_messages(id) ON DELETE CASCADE);");
    }

    @Nullable
    private static InAppMessage b(@NonNull Cursor cursor, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        try {
            return new InAppMessage(new JSONObject(cVar.b(cursor.getString(cursor.getColumnIndex("message_json")))));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(i, e2, "Unable to retrieve InAppMessage from db cursor", new Object[0]);
            return null;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.g
    @NonNull
    public JSONArray d(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        JSONArray jSONArray = new JSONArray();
        Cursor cursorA = a(g, new String[]{"message_json", "display_count"}, null, null);
        if (cursorA == null) {
            return jSONArray;
        }
        try {
            if (cursorA.moveToFirst()) {
                int columnIndex = cursorA.getColumnIndex("message_json");
                int columnIndex2 = cursorA.getColumnIndex("display_count");
                do {
                    try {
                        JSONObject jSONObject = new JSONObject(cVar.b(cursorA.getString(columnIndex)));
                        jSONObject.put("displayCount", cursorA.getInt(columnIndex2));
                        jSONArray.put(jSONObject);
                    } catch (Exception e2) {
                        com.salesforce.marketingcloud.g.b(i, e2, "Unable to read message information from cursor.", new Object[0]);
                    }
                } while (cursorA.moveToNext());
            }
            return jSONArray;
        } finally {
            cursorA.close();
        }
    }

    @Override // com.salesforce.marketingcloud.storage.g
    @NonNull
    public List<String> e(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        ArrayList arrayList = null;
        Cursor cursorA = a(e, new String[]{"media_url"}, "media_url IS NOT NULL", null);
        try {
            if (cursorA.moveToFirst()) {
                arrayList = new ArrayList(cursorA.getCount());
                do {
                    String strA = a(cursorA, cVar);
                    if (strA != null) {
                        arrayList.add(strA);
                    }
                } while (cursorA.moveToNext());
            }
            cursorA.close();
            return arrayList != null ? arrayList : Collections.EMPTY_LIST;
        } catch (Throwable th) {
            cursorA.close();
            throw th;
        }
    }

    @Nullable
    private static String a(@NonNull Cursor cursor, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        try {
            return cVar.b(cursor.getString(cursor.getColumnIndex("media_url")));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(i, e2, "Unable to retrieve media_url from db cursor", new Object[0]);
            return null;
        }
    }

    private static ContentValues b(InAppMessage inAppMessage, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", inAppMessage.id());
        contentValues.put("priority", Integer.valueOf(inAppMessage.priority()));
        contentValues.put(i.a.h, inAppMessage.startDateUtc() != null ? Long.valueOf(inAppMessage.startDateUtc().getTime()) : null);
        contentValues.put(i.a.i, inAppMessage.endDateUtc() != null ? Long.valueOf(inAppMessage.endDateUtc().getTime()) : null);
        contentValues.put("modified_date", Long.valueOf(inAppMessage.modifiedDateUtc().getTime()));
        contentValues.put("display_limit", Integer.valueOf(inAppMessage.displayLimit()));
        InAppMessage.Media media = inAppMessage.media();
        if (media != null && !TextUtils.isEmpty(media.url())) {
            contentValues.put("media_url", cVar.a(media.url()));
        }
        contentValues.put("message_json", cVar.a(com.salesforce.marketingcloud.internal.a.b(inAppMessage).toString()));
        return contentValues;
    }

    @Override // com.salesforce.marketingcloud.storage.g
    @Nullable
    public InAppMessage a(@NonNull String str, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        Cursor cursorA = a(e, new String[]{"message_json"}, "id = ?", new String[]{str});
        if (cursorA != null) {
            inAppMessageB = cursorA.moveToFirst() ? b(cursorA, cVar) : null;
            cursorA.close();
        }
        return inAppMessageB;
    }

    @Override // com.salesforce.marketingcloud.storage.g
    public void b(@NonNull String str, int i2) throws SQLException {
        if (str == null || i2 < 0) {
            return;
        }
        this.c.execSQL("UPDATE iam_state SET display_count = MAX(display_count, ?) WHERE id = ?", new Object[]{Integer.valueOf(i2), str});
    }

    @Override // com.salesforce.marketingcloud.storage.g
    public void a(@NonNull InAppMessage inAppMessage) throws SQLException {
        if (inAppMessage != null) {
            this.c.execSQL("UPDATE iam_state SET display_count = display_count + 1 WHERE id = ?", new String[]{inAppMessage.id()});
        }
    }

    @Override // com.salesforce.marketingcloud.storage.g
    public int a(@NonNull Collection<String> collection) {
        if (collection.size() == 0) {
            return this.c.delete(e, null, null);
        }
        try {
            return a(e, collection);
        } catch (SQLException unused) {
            com.salesforce.marketingcloud.g.e(i, "Unable to clean up %s table.", e);
            return 0;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.g
    @Nullable
    public InAppMessage a(@NonNull Collection<String> collection, @NonNull com.salesforce.marketingcloud.util.c cVar) throws SQLException {
        if (collection.size() > 0) {
            this.c.beginTransaction();
            b(g, collection);
            String strA = c.a(j, c.a("SELECT %1$s.id FROM %1$s LEFT JOIN tmp_%1$s ON %1$s.id = tmp_%1$s.id WHERE tmp_%1$s.id IS NOT NULL", g));
            String strValueOf = String.valueOf(System.currentTimeMillis());
            Cursor cursorA = a(g, new String[]{"message_json"}, strA, new String[]{strValueOf, strValueOf});
            if (cursorA != null) {
                inAppMessageB = cursorA.moveToFirst() ? b(cursorA, cVar) : null;
                cursorA.close();
            }
            h(g);
            this.c.setTransactionSuccessful();
            this.c.endTransaction();
        }
        return inAppMessageB;
    }
}
