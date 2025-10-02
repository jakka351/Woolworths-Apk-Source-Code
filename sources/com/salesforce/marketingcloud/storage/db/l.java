package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.Locale;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public final class l extends SQLiteOpenHelper {

    @VisibleForTesting
    public static final int d = 11;
    private static final String e = "mcsdk_%s.db";
    private static final String f = com.salesforce.marketingcloud.g.a("StorageSqliteOpenHelper");

    /* renamed from: a, reason: collision with root package name */
    private final Context f17050a;
    private final com.salesforce.marketingcloud.util.c b;
    private boolean c;

    public l(Context context, com.salesforce.marketingcloud.util.c cVar, String str) {
        this(context, cVar, a(str), 11);
    }

    public static String a(String str) {
        Locale locale = Locale.ENGLISH;
        return YU.a.h("mcsdk_", str, ".db");
    }

    public void b() throws Exception {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        a(writableDatabase);
        writableDatabase.execSQL("VACUUM");
        onCreate(writableDatabase);
    }

    public void c() throws IllegalStateException, com.salesforce.marketingcloud.storage.exceptions.a {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!k.c(writableDatabase)) {
            com.salesforce.marketingcloud.g.e(f, "Database table %s was not initialized properly and will be dropped and recreated.  Some data may be lost.", k.e);
            try {
                b();
                if (k.c(writableDatabase)) {
                    throw new com.salesforce.marketingcloud.storage.exceptions.a();
                }
                Locale locale = Locale.ENGLISH;
                throw new IllegalStateException("registration could not be initialized.");
            } catch (Exception e2) {
                throw new IllegalStateException(e2.getMessage(), e2);
            }
        }
        if (!g.d(writableDatabase)) {
            Locale locale2 = Locale.ENGLISH;
            throw new IllegalStateException("inbox_messages could not be initialized.");
        }
        if (!a.d(writableDatabase)) {
            Locale locale3 = Locale.ENGLISH;
            throw new IllegalStateException("analytic_item could not be initialized.");
        }
        if (!j.g(writableDatabase)) {
            Locale locale4 = Locale.ENGLISH;
            throw new IllegalStateException("regions could not be initialized.");
        }
        if (!i.d(writableDatabase)) {
            Locale locale5 = Locale.ENGLISH;
            throw new IllegalStateException("messages could not be initialized.");
        }
        if (!h.d(writableDatabase)) {
            Locale locale6 = Locale.ENGLISH;
            throw new IllegalStateException("location_table could not be initialized.");
        }
        if (!m.d(writableDatabase)) {
            Locale locale7 = Locale.ENGLISH;
            throw new IllegalStateException("triggers could not be initialized.");
        }
        if (!f.m(writableDatabase)) {
            Locale locale8 = Locale.ENGLISH;
            throw new IllegalStateException("in_app_messages could not be initialized.");
        }
        if (e.d(writableDatabase)) {
            return;
        }
        Locale locale9 = Locale.ENGLISH;
        throw new IllegalStateException("device_stats could not be initialized.");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            k.b(sQLiteDatabase);
            g.b(sQLiteDatabase);
            a.b(sQLiteDatabase);
            j.d(sQLiteDatabase);
            i.b(sQLiteDatabase);
            h.b(sQLiteDatabase);
            f.i(sQLiteDatabase);
            m.b(sQLiteDatabase);
            e.b(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        com.salesforce.marketingcloud.g.e(f, "SQLite database being downgraded from %d to %d", Integer.valueOf(i2), Integer.valueOf(i));
        this.c = true;
        a(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) throws SQLException {
        super.onOpen(sQLiteDatabase);
        if (sQLiteDatabase.isReadOnly()) {
            return;
        }
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws Throwable {
        if (i < 2) {
            com.salesforce.marketingcloud.storage.db.upgrades.b.b(sQLiteDatabase, this.f17050a, this.b);
        }
        if (i < 3) {
            com.salesforce.marketingcloud.storage.db.upgrades.c.f(sQLiteDatabase);
        }
        if (i < 4) {
            com.salesforce.marketingcloud.storage.db.upgrades.d.c(sQLiteDatabase);
        }
        if (i < 5) {
            com.salesforce.marketingcloud.storage.db.upgrades.e.b(sQLiteDatabase);
        }
        if (i < 6) {
            com.salesforce.marketingcloud.storage.db.upgrades.f.b(sQLiteDatabase);
        }
        if (i < 7) {
            com.salesforce.marketingcloud.storage.db.upgrades.g.b(sQLiteDatabase);
        }
        if (i < 8) {
            com.salesforce.marketingcloud.storage.db.upgrades.h.a(sQLiteDatabase);
        }
        if (i < 9) {
            com.salesforce.marketingcloud.storage.db.upgrades.i.b(sQLiteDatabase);
        }
        if (i < 10) {
            com.salesforce.marketingcloud.storage.db.upgrades.j.b(sQLiteDatabase, this.b);
        }
        if (i < 11) {
            com.salesforce.marketingcloud.storage.db.upgrades.a.b(sQLiteDatabase, this.b);
        }
    }

    public l(Context context, com.salesforce.marketingcloud.util.c cVar, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f17050a = context;
        this.b = cVar;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            k.a(sQLiteDatabase);
            g.a(sQLiteDatabase);
            a.a(sQLiteDatabase);
            j.c(sQLiteDatabase);
            i.a(sQLiteDatabase);
            h.a(sQLiteDatabase);
            f.e(sQLiteDatabase);
            m.a(sQLiteDatabase);
            e.a(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public boolean a() {
        return this.c;
    }
}
