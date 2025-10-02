package com.adobe.marketing.mobile.services;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import com.adobe.marketing.mobile.internal.util.DatabaseProcessing;
import com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper;
import com.adobe.marketing.mobile.services.ServiceProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes.dex */
final class SQLiteDataQueue implements DataQueue {

    /* renamed from: a, reason: collision with root package name */
    public final String f13237a;
    public boolean b = false;
    public final Object c = new Object();

    public SQLiteDataQueue(String str) {
        this.f13237a = str;
        b();
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public final boolean a(final DataEntity dataEntity) {
        if (dataEntity == null) {
            Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            return false;
        }
        synchronized (this.c) {
            try {
                if (this.b) {
                    Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                    return false;
                }
                String str = this.f13237a;
                SQLiteDatabaseHelper.DatabaseOpenMode databaseOpenMode = SQLiteDatabaseHelper.DatabaseOpenMode.READ_WRITE;
                boolean zD = SQLiteDatabaseHelper.d(str, databaseOpenMode, new DatabaseProcessing() { // from class: com.adobe.marketing.mobile.services.c
                    @Override // com.adobe.marketing.mobile.internal.util.DatabaseProcessing
                    public final boolean a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                        DataEntity dataEntity2 = dataEntity;
                        this.f13241a.getClass();
                        if (sQLiteDatabase == null) {
                            return false;
                        }
                        try {
                            SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement("INSERT INTO TB_AEP_DATA_ENTITY (uniqueIdentifier, timestamp, data) VALUES (?, ?, ?)");
                            try {
                                sQLiteStatementCompileStatement.bindString(1, dataEntity2.f13229a);
                                sQLiteStatementCompileStatement.bindLong(2, dataEntity2.b.getTime());
                                String str2 = dataEntity2.c;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                sQLiteStatementCompileStatement.bindString(3, str2);
                                boolean z = sQLiteStatementCompileStatement.executeInsert() >= 0;
                                sQLiteStatementCompileStatement.close();
                                return z;
                            } finally {
                            }
                        } catch (Exception e) {
                            e.getLocalizedMessage();
                            Logging logging3 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                            return false;
                        }
                    }
                });
                if (!zD) {
                    c();
                    zD = SQLiteDatabaseHelper.d(this.f13237a, databaseOpenMode, new DatabaseProcessing() { // from class: com.adobe.marketing.mobile.services.c
                        @Override // com.adobe.marketing.mobile.internal.util.DatabaseProcessing
                        public final boolean a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                            DataEntity dataEntity2 = dataEntity;
                            this.f13241a.getClass();
                            if (sQLiteDatabase == null) {
                                return false;
                            }
                            try {
                                SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement("INSERT INTO TB_AEP_DATA_ENTITY (uniqueIdentifier, timestamp, data) VALUES (?, ?, ?)");
                                try {
                                    sQLiteStatementCompileStatement.bindString(1, dataEntity2.f13229a);
                                    sQLiteStatementCompileStatement.bindLong(2, dataEntity2.b.getTime());
                                    String str2 = dataEntity2.c;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    sQLiteStatementCompileStatement.bindString(3, str2);
                                    boolean z = sQLiteStatementCompileStatement.executeInsert() >= 0;
                                    sQLiteStatementCompileStatement.close();
                                    return z;
                                } finally {
                                }
                            } catch (Exception e) {
                                e.getLocalizedMessage();
                                Logging logging3 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                                return false;
                            }
                        }
                    });
                }
                return zD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            try {
                if (SQLiteDatabaseHelper.b(this.f13237a, "CREATE TABLE IF NOT EXISTS TB_AEP_DATA_ENTITY (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, uniqueIdentifier TEXT NOT NULL UNIQUE, timestamp INTEGER NOT NULL, data TEXT);")) {
                    Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                } else {
                    Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
        try {
            new File(this.f13237a).delete();
            b();
        } catch (Exception unused) {
            Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003e A[Catch: all -> 0x000e, TryCatch #4 {all -> 0x000e, blocks: (B:4:0x0003, B:6:0x0008, B:7:0x000c, B:11:0x0010, B:15:0x0021, B:26:0x0038, B:28:0x003e, B:29:0x0041, B:31:0x0043, B:32:0x0046, B:25:0x0035), top: B:38:0x0003 }] */
    @Override // com.adobe.marketing.mobile.services.DataQueue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean clear() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            monitor-enter(r0)
            boolean r1 = r7.b     // Catch: java.lang.Throwable -> Le
            r2 = 0
            if (r1 == 0) goto L10
            com.adobe.marketing.mobile.services.ServiceProvider r1 = com.adobe.marketing.mobile.services.ServiceProvider.ServiceProviderSingleton.f13239a     // Catch: java.lang.Throwable -> Le
            com.adobe.marketing.mobile.services.Logging r1 = r1.e     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r2
        Le:
            r1 = move-exception
            goto L47
        L10:
            java.lang.String r1 = r7.f13237a     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "TB_AEP_DATA_ENTITY"
            r4 = 1
            r5 = 0
            com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper$DatabaseOpenMode r6 = com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.DatabaseOpenMode.READ_WRITE     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2e
            android.database.sqlite.SQLiteDatabase r1 = com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.c(r1, r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2e
            java.lang.String r6 = "1"
            r1.delete(r3, r6, r5)     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L29
            com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.a(r1)     // Catch: java.lang.Throwable -> Le
            r2 = r4
            goto L38
        L26:
            r2 = move-exception
            r5 = r1
            goto L43
        L29:
            r3 = move-exception
            r5 = r1
            goto L2f
        L2c:
            r2 = move-exception
            goto L43
        L2e:
            r3 = move-exception
        L2f:
            r3.getMessage()     // Catch: java.lang.Throwable -> L2c
            com.adobe.marketing.mobile.services.Log.d()     // Catch: java.lang.Throwable -> L2c
            com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.a(r5)     // Catch: java.lang.Throwable -> Le
        L38:
            com.adobe.marketing.mobile.services.ServiceProvider r1 = com.adobe.marketing.mobile.services.ServiceProvider.ServiceProviderSingleton.f13239a     // Catch: java.lang.Throwable -> Le
            com.adobe.marketing.mobile.services.Logging r1 = r1.e     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L41
            r7.c()     // Catch: java.lang.Throwable -> Le
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r4
        L43:
            com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.a(r5)     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> Le
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.services.SQLiteDataQueue.clear():boolean");
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public final void close() {
        synchronized (this.c) {
            this.b = true;
        }
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public final DataEntity peek() {
        ArrayList arrayList;
        final ArrayList arrayList2 = new ArrayList();
        synchronized (this.c) {
            try {
                if (this.b) {
                    Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                    arrayList = null;
                } else {
                    SQLiteDatabaseHelper.d(this.f13237a, SQLiteDatabaseHelper.DatabaseOpenMode.READ_ONLY, new DatabaseProcessing(this) { // from class: com.adobe.marketing.mobile.services.d
                        @Override // com.adobe.marketing.mobile.internal.util.DatabaseProcessing
                        public final boolean a(SQLiteDatabase sQLiteDatabase) {
                            if (sQLiteDatabase == null) {
                                return false;
                            }
                            try {
                                Cursor cursorQuery = sQLiteDatabase.query("TB_AEP_DATA_ENTITY", new String[]{"timestamp", "uniqueIdentifier", "data"}, null, null, null, null, "id ASC", String.valueOf(1));
                                try {
                                    boolean zMoveToFirst = cursorQuery.moveToFirst();
                                    ArrayList arrayList3 = arrayList2;
                                    if (zMoveToFirst) {
                                        do {
                                            ContentValues contentValues = new ContentValues();
                                            DatabaseUtils.cursorRowToContentValues(cursorQuery, contentValues);
                                            arrayList3.add(contentValues);
                                        } while (cursorQuery.moveToNext());
                                    }
                                    String.format("query - Successfully read %d rows from table.", Integer.valueOf(arrayList3.size()));
                                    Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                                    cursorQuery.close();
                                    return true;
                                } finally {
                                }
                            } catch (SQLiteException e) {
                                e.getLocalizedMessage();
                                Logging logging3 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                                return false;
                            }
                        }
                    });
                    arrayList = new ArrayList(arrayList2.size());
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ContentValues contentValues = (ContentValues) it.next();
                        arrayList.add(new DataEntity(contentValues.getAsString("uniqueIdentifier"), contentValues.getAsString("data"), new Date(contentValues.getAsLong("timestamp").longValue())));
                    }
                    String.format("peek n - Successfully returned %d DataEntities", Integer.valueOf(arrayList.size()));
                    Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                }
            } finally {
            }
        }
        if (arrayList == null) {
            Logging logging3 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            return null;
        }
        if (arrayList.isEmpty()) {
            Logging logging4 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            return null;
        }
        ((DataEntity) arrayList.get(0)).toString();
        Logging logging5 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
        return (DataEntity) arrayList.get(0);
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public final boolean remove() {
        synchronized (this.c) {
            try {
                if (this.b) {
                    Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                    return false;
                }
                boolean zD = SQLiteDatabaseHelper.d(this.f13237a, SQLiteDatabaseHelper.DatabaseOpenMode.READ_WRITE, new e());
                if (!zD) {
                    c();
                }
                return zD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
