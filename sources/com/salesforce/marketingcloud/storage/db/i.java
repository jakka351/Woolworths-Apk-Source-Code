package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.messages.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

@SuppressLint
/* loaded from: classes6.dex */
public final class i extends b implements com.salesforce.marketingcloud.storage.k {
    public static final String e = "messages";
    private static final String g = "CREATE TABLE messages (id VARCHAR PRIMARY KEY, title VARCHAR, alert VARCHAR, sound VARCHAR, mediaUrl VARCHAR, mediaAlt VARCHAR, open_direct VARCHAR, start_date VARCHAR, end_date VARCHAR, message_type INTEGER, content_type INTEGER, url VARCHAR, custom VARCHAR, keys VARCHAR, period_show_count INTEGER, last_shown_date VARCHAR, next_allowed_show VARCHAR, show_count INTEGER, message_limit INTEGER, rolling_period SMALLINT, period_type INTEGER, number_of_periods INTEGER, messages_per_period INTEGER, proximity INTEGER, notify_id INTEGER );";
    private static final String[] f = {"id", "title", "alert", "sound", a.e, a.f, a.g, a.h, a.i, a.j, a.k, "url", a.m, a.n, a.o, a.q, a.r, a.p, a.s, a.t, a.u, a.v, a.w, a.x, a.y};
    private static final String h = com.salesforce.marketingcloud.g.a("MessageDbStorage");

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f17048a = "id";
        public static final String b = "title";
        public static final String c = "alert";
        public static final String d = "sound";
        public static final String e = "mediaUrl";
        public static final String f = "mediaAlt";
        public static final String g = "open_direct";
        public static final String h = "start_date";
        public static final String i = "end_date";
        public static final String j = "message_type";
        public static final String k = "content_type";
        public static final String l = "url";
        public static final String m = "custom";
        public static final String n = "keys";
        public static final String o = "period_show_count";
        public static final String p = "show_count";
        public static final String q = "last_shown_date";
        public static final String r = "next_allowed_show";
        public static final String s = "message_limit";
        public static final String t = "rolling_period";
        public static final String u = "period_type";
        public static final String v = "number_of_periods";
        public static final String w = "messages_per_period";
        public static final String x = "proximity";
        public static final String y = "notify_id";
    }

    public i(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.compileStatement(c.a("SELECT %s FROM %s", TextUtils.join(",", f), e));
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

    @Override // com.salesforce.marketingcloud.storage.k
    public void a(@NonNull Message message, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValuesB = b(message, cVar);
        if (a(contentValuesB, a("%s = ?", "id"), new String[]{message.id()}) == 0) {
            a(contentValuesB);
        }
    }

    @Override // com.salesforce.marketingcloud.storage.k
    @NonNull
    public List<Message> b(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        List<Message> list = Collections.EMPTY_LIST;
        Cursor cursorA = a(f, a(5));
        if (cursorA != null) {
            if (cursorA.moveToFirst()) {
                ArrayList arrayList = new ArrayList(cursorA.getCount());
                do {
                    Message messageB = d.b(cursorA, cVar);
                    if (messageB != null) {
                        arrayList.add(messageB);
                    }
                } while (cursorA.moveToNext());
                list = arrayList;
            }
            cursorA.close();
        }
        return list;
    }

    @Override // com.salesforce.marketingcloud.storage.k
    public int e(int i) {
        return a(a("%s = ?", a.j), new String[]{String.valueOf(i)});
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return e;
    }

    private String a(int... iArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (int i : iArr) {
            if (z) {
                sb.append("message_type IN(");
                z = false;
            } else {
                sb.append(',');
            }
            sb.append(i);
        }
        sb.append(");");
        return sb.toString();
    }

    public static void b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(g);
    }

    private static ContentValues b(Message message, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", message.id());
        contentValues.put("title", cVar.a(message.title()));
        contentValues.put("alert", cVar.a(message.alert()));
        contentValues.put("sound", message.sound());
        if (message.media() != null) {
            contentValues.put(a.e, cVar.a(message.media().url()));
            contentValues.put(a.f, cVar.a(message.media().altText()));
        }
        contentValues.put(a.h, com.salesforce.marketingcloud.util.l.a(message.startDateUtc()));
        contentValues.put(a.i, com.salesforce.marketingcloud.util.l.a(message.endDateUtc()));
        contentValues.put(a.j, Integer.valueOf(message.messageType()));
        contentValues.put(a.k, Integer.valueOf(message.contentType()));
        contentValues.put("url", cVar.a(message.url()));
        contentValues.put(a.m, cVar.a(message.custom()));
        contentValues.put(a.w, Integer.valueOf(message.messagesPerPeriod()));
        contentValues.put(a.v, Integer.valueOf(message.numberOfPeriods()));
        contentValues.put(a.u, Integer.valueOf(message.periodType()));
        contentValues.put(a.t, Integer.valueOf(message.isRollingPeriod() ? 1 : 0));
        contentValues.put(a.s, Integer.valueOf(message.messageLimit()));
        contentValues.put(a.x, Integer.valueOf(message.proximity()));
        contentValues.put(a.g, cVar.a(message.openDirect()));
        contentValues.put(a.n, cVar.a(com.salesforce.marketingcloud.util.l.a(message.customKeys())));
        contentValues.put(a.r, com.salesforce.marketingcloud.util.l.a(com.salesforce.marketingcloud.internal.f.b(message)));
        contentValues.put(a.o, Integer.valueOf(com.salesforce.marketingcloud.internal.f.d(message)));
        contentValues.put(a.y, Integer.valueOf(com.salesforce.marketingcloud.internal.f.c(message)));
        contentValues.put(a.p, Integer.valueOf(com.salesforce.marketingcloud.internal.f.e(message)));
        contentValues.put(a.q, com.salesforce.marketingcloud.util.l.a(com.salesforce.marketingcloud.internal.f.a(message)));
        return contentValues;
    }

    @Override // com.salesforce.marketingcloud.storage.k
    public int a(@NonNull String str) {
        return a(a("%s = ?", "id"), new String[]{str});
    }

    public static void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS messages");
    }

    private static String a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    @Override // com.salesforce.marketingcloud.storage.k
    @NonNull
    public List<Message> a(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        List<Message> list = Collections.EMPTY_LIST;
        Cursor cursorA = a(f, a(3, 4));
        if (cursorA != null) {
            if (cursorA.moveToFirst()) {
                ArrayList arrayList = new ArrayList(cursorA.getCount());
                do {
                    Message messageB = d.b(cursorA, cVar);
                    if (messageB != null) {
                        arrayList.add(messageB);
                    }
                } while (cursorA.moveToNext());
                list = arrayList;
            }
            cursorA.close();
        }
        return list;
    }

    @Override // com.salesforce.marketingcloud.storage.k
    public Message a(@NonNull String str, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        Cursor cursorA = a(f, a("%s = ?", "id"), new String[]{str}, null, null, null, "1");
        if (cursorA != null) {
            messageB = cursorA.moveToFirst() ? d.b(cursorA, cVar) : null;
            cursorA.close();
        }
        return messageB;
    }

    @Override // com.salesforce.marketingcloud.storage.k
    public int a(@NonNull String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.y, Integer.valueOf(i));
        return a(contentValues, a("%s = ?", "id"), new String[]{str});
    }
}
