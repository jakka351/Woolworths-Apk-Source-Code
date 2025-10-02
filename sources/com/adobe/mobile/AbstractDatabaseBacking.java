package com.adobe.mobile;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* loaded from: classes4.dex */
abstract class AbstractDatabaseBacking {

    /* renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f13258a;
    public DatabaseStatus c;
    public String e;
    public String f;
    public File b = null;
    public final Object d = new Object();

    public static class CorruptedDatabaseException extends Exception {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DatabaseStatus {
        public static final DatabaseStatus d;
        public static final DatabaseStatus e;
        public static final /* synthetic */ DatabaseStatus[] f;

        static {
            DatabaseStatus databaseStatus = new DatabaseStatus("OK", 0);
            d = databaseStatus;
            DatabaseStatus databaseStatus2 = new DatabaseStatus("FATALERROR", 1);
            e = databaseStatus2;
            f = new DatabaseStatus[]{databaseStatus, databaseStatus2};
        }

        public static DatabaseStatus valueOf(String str) {
            return (DatabaseStatus) Enum.valueOf(DatabaseStatus.class, str);
        }

        public static DatabaseStatus[] values() {
            return (DatabaseStatus[]) f.clone();
        }
    }

    public final void a(File file) {
        this.b = file;
        synchronized (this.d) {
            try {
                e();
                c();
                if (this.f13258a != null) {
                    b();
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        throw new UnsupportedOperationException("initializeDatabase must be overwritten");
    }

    public final void c() {
        try {
            SQLiteDatabase sQLiteDatabase = this.f13258a;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            this.f13258a = SQLiteDatabase.openDatabase(this.b.getPath(), null, 268435472);
            this.c = DatabaseStatus.d;
        } catch (SQLException e) {
            this.c = DatabaseStatus.e;
            StaticMethods.J("%s - Unable to open database (%s).", this.f, e.getLocalizedMessage());
        }
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
        throw new UnsupportedOperationException("prepareStatements must be overwritten");
    }

    public final void g(Exception exc) {
        StaticMethods.J("%s - Database in unrecoverable state (%s), resetting.", this.f, exc.getLocalizedMessage());
        synchronized (this.d) {
            try {
                if (this.b.exists() && !this.b.delete()) {
                    StaticMethods.J("%s - Failed to delete database file(%s).", this.f, this.b.getAbsolutePath());
                    this.c = DatabaseStatus.e;
                    return;
                }
                StaticMethods.I("%s - Database file(%s) was corrupt and had to be deleted.", this.f, this.b.getAbsolutePath());
                c();
                b();
                f();
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
