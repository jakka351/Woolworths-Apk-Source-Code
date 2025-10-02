package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.storage.db.i;
import com.salesforce.marketingcloud.storage.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public final class g extends b implements com.salesforce.marketingcloud.storage.h {
    public static final String e = "inbox_messages";
    private static final String f = "(start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?)";
    static final String g = com.salesforce.marketingcloud.g.a("InboxMessageDbStorage");
    private static final String[] h = {"id", i.a.h, "is_deleted", "is_read", "message_hash", "is_dirty"};

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17046a;

        static {
            int[] iArr = new int[h.a.values().length];
            f17046a = iArr;
            try {
                iArr[h.a.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17046a[h.a.UNREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17046a[h.a.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17046a[h.a.NOT_DELETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    public static void b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE inbox_messages(id TEXT PRIMARY KEY, start_date INTEGER DEFAULT NULL, end_date INTEGER DEFAULT NULL, is_deleted INTEGER DEFAULT 0, is_read INTEGER DEFAULT 0, is_dirty INTEGER DEFAULT 0, message_hash TEXT DEFAULT NULL, message_json TEXT);");
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.compileStatement("SELECT id,start_date,end_date,is_deleted,is_read,is_dirty,message_hash,message_json FROM inbox_messages");
            return true;
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.e(g, e2, "%s is invalid", e);
            return false;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public void a(@NonNull InboxMessage inboxMessage, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        ContentValues contentValuesA = d.a(inboxMessage, cVar);
        if (a(contentValuesA, "id = ?", new String[]{inboxMessage.id()}) == 0) {
            a(contentValuesA);
        }
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public void d(@NonNull String str) throws SQLException {
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.c.execSQL("UPDATE inbox_messages SET   is_read = 1,  is_dirty = CASE WHEN is_dirty=1 OR is_deleted=0 THEN 1 ELSE 0 END WHERE   id=? AND (start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?) AND is_read=0", new String[]{str, strValueOf, strValueOf});
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public boolean e(@NonNull String str) {
        return DatabaseUtils.queryNumEntries(this.c, e, "id=?", new String[]{str}) > 0;
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public h.b f(@NonNull String str) {
        Cursor cursorA = a(h, "id=?", new String[]{str});
        if (cursorA != null) {
            bVarA = cursorA.moveToFirst() ? a(cursorA) : null;
            cursorA.close();
        }
        return bVarA;
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public int h() {
        return i(null);
    }

    @Override // com.salesforce.marketingcloud.storage.h
    @NonNull
    public List<h.b> i() {
        ArrayList arrayList = null;
        Cursor cursorA = a(h, "is_dirty=1", (String[]) null);
        if (cursorA != null) {
            if (cursorA.moveToFirst()) {
                ArrayList arrayList2 = new ArrayList(cursorA.getCount());
                do {
                    arrayList2.add(a(cursorA));
                } while (cursorA.moveToNext());
                arrayList = arrayList2;
            }
            cursorA.close();
        }
        return arrayList != null ? arrayList : Collections.EMPTY_LIST;
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public void j() throws SQLException {
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.c.execSQL("UPDATE inbox_messages SET   is_read = 1,  is_dirty = CASE WHEN is_dirty=1 OR is_deleted=0 THEN 1 ELSE 0 END WHERE (start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?) AND is_read=0", new String[]{strValueOf, strValueOf});
    }

    @Override // com.salesforce.marketingcloud.storage.h
    @NonNull
    public List<InboxMessage> n(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        return a(a((String[]) null, (String) null, (String[]) null), cVar);
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return e;
    }

    public static void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS inbox_messages");
    }

    public static boolean d(SQLiteDatabase sQLiteDatabase) throws SQLException {
        boolean zC = c(sQLiteDatabase);
        if (!zC) {
            try {
                a(sQLiteDatabase);
                b(sQLiteDatabase);
                return c(sQLiteDatabase);
            } catch (Exception e2) {
                com.salesforce.marketingcloud.g.b(g, e2, "Unable to recover %s", e);
            }
        }
        return zC;
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public void b() {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("is_dirty", (Integer) 1);
        contentValues.put("is_deleted", (Integer) 1);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        a(contentValues, "(start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?) AND is_deleted=0", new String[]{strValueOf, strValueOf});
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public void c(@NonNull String str) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("is_dirty", (Integer) 1);
        contentValues.put("is_deleted", (Integer) 1);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        a(contentValues, "id=? AND (start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?) AND is_deleted=0", new String[]{str, strValueOf, strValueOf});
    }

    private static String c(h.a aVar) {
        String str;
        StringBuilder sbO = androidx.constraintlayout.core.state.a.o(101, f);
        int i = a.f17046a[aVar.ordinal()];
        if (i == 1 || i == 2) {
            str = " AND is_read=? AND is_deleted=?";
        } else {
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException("Unknown MessageStatus while getting message counts.");
            }
            str = " AND is_deleted=?";
        }
        sbO.append(str);
        return sbO.toString();
    }

    @Override // com.salesforce.marketingcloud.storage.h
    @Nullable
    public InboxMessage a(@NonNull String str, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        Cursor cursorA = a(null, "id=?", new String[]{str}, null, null, null, "1");
        if (cursorA != null) {
            inboxMessageA = cursorA.moveToFirst() ? d.a(cursorA, cVar) : null;
            cursorA.close();
        }
        return inboxMessageA;
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public void b(@NonNull String[] strArr) {
        if (strArr.length > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_dirty", (Integer) 0);
            try {
                a(contentValues, Arrays.asList(strArr));
            } catch (Exception unused) {
                com.salesforce.marketingcloud.g.e(g, "Unable to update %s table.", o());
            }
        }
    }

    private static String[] b(h.a aVar) {
        String strValueOf = String.valueOf(System.currentTimeMillis());
        int i = a.f17046a[aVar.ordinal()];
        if (i == 1 || i == 2) {
            return new String[]{strValueOf, strValueOf, aVar != h.a.READ ? "0" : "1", "0"};
        }
        if (i == 3 || i == 4) {
            return new String[]{strValueOf, strValueOf, aVar != h.a.DELETED ? "0" : "1"};
        }
        throw new IllegalArgumentException("Unknown MessageStatus while getting message counts.");
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public int a(@NonNull h.a aVar) {
        return (int) DatabaseUtils.queryNumEntries(this.c, e, c(aVar), b(aVar));
    }

    @Override // com.salesforce.marketingcloud.storage.h
    @NonNull
    public List<InboxMessage> a(@NonNull com.salesforce.marketingcloud.util.c cVar, h.a aVar) {
        return a(a(null, c(aVar), b(aVar), null, null, "IFNULL(start_date, " + System.currentTimeMillis() + ") DESC"), cVar);
    }

    @NonNull
    private static List<InboxMessage> a(@NonNull Cursor cursor, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        List<InboxMessage> list = Collections.EMPTY_LIST;
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                ArrayList arrayList = new ArrayList();
                do {
                    InboxMessage inboxMessageA = d.a(cursor, cVar);
                    if (inboxMessageA != null) {
                        arrayList.add(inboxMessageA);
                    }
                } while (cursor.moveToNext());
                list = arrayList;
            }
            cursor.close();
        }
        return list;
    }

    @NonNull
    private static h.b a(@NonNull Cursor cursor) {
        boolean z;
        boolean z2;
        int columnIndex = cursor.getColumnIndex(i.a.h);
        String string = cursor.getString(cursor.getColumnIndex("id"));
        String string2 = cursor.getString(cursor.getColumnIndex("message_hash"));
        Date date = cursor.isNull(columnIndex) ? null : new Date(cursor.getLong(columnIndex));
        boolean z3 = false;
        boolean z4 = true;
        if (cursor.getInt(cursor.getColumnIndex("is_read")) == 1) {
            z = false;
            z3 = true;
        } else {
            z = false;
        }
        if (cursor.getInt(cursor.getColumnIndex("is_deleted")) == 1) {
            z2 = true;
        } else {
            z2 = true;
            z4 = z;
        }
        if (cursor.getInt(cursor.getColumnIndex("is_dirty")) != z2) {
            z2 = z;
        }
        return new h.b(string, string2, date, z3, z4, z2);
    }

    @Override // com.salesforce.marketingcloud.storage.h
    @WorkerThread
    public int a(@NonNull List<String> list) {
        if (list.size() == 0) {
            return a((String) null, (String[]) null);
        }
        try {
            return a(o(), list);
        } catch (Exception unused) {
            com.salesforce.marketingcloud.g.e(g, "Unable to clean up %s table.", o());
            return 0;
        }
    }
}
