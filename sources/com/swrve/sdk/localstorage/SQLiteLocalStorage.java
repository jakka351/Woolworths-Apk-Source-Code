package com.swrve.sdk.localstorage;

import YU.a;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.swrve.sdk.SwrveHelper;
import com.swrve.sdk.SwrveLogger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class SQLiteLocalStorage implements LocalStorage {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f19085a;

    public SQLiteLocalStorage(Context context) {
        SwrveSQLiteOpenHelper swrveSQLiteOpenHelper;
        synchronized (SwrveSQLiteOpenHelper.f) {
            try {
                if (SwrveSQLiteOpenHelper.e == null) {
                    SwrveSQLiteOpenHelper swrveSQLiteOpenHelper2 = new SwrveSQLiteOpenHelper(context, "swrve.db", null, 5);
                    swrveSQLiteOpenHelper2.d = context;
                    SwrveSQLiteOpenHelper.e = swrveSQLiteOpenHelper2;
                }
                swrveSQLiteOpenHelper = SwrveSQLiteOpenHelper.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        SQLiteDatabase writableDatabase = swrveSQLiteOpenHelper.getWritableDatabase();
        this.f19085a = writableDatabase;
        writableDatabase.setMaximumSize(26214400L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    @Override // com.swrve.sdk.localstorage.LocalStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.swrve.sdk.localstorage.SwrveCacheItem a(java.lang.String r18, java.lang.String r19) throws java.lang.Throwable {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            java.lang.String r4 = "Exception occurred getting cache userId:"
            java.lang.String r0 = "\" AND category= \""
            java.lang.String r5 = "user_id= \""
            r6 = 0
            if (r2 == 0) goto L90
            if (r3 != 0) goto L13
            goto L90
        L13:
            android.database.sqlite.SQLiteDatabase r7 = r1.f19085a
            boolean r7 = r7.isOpen()
            if (r7 == 0) goto L99
            r7 = 0
            android.database.sqlite.SQLiteDatabase r8 = r1.f19085a     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.String r9 = "cache"
            java.lang.String r10 = "raw_data"
            java.lang.String[] r10 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r11.<init>(r5)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r11.append(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r11.append(r0)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r11.append(r3)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.String r0 = "\""
            r11.append(r0)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.String r16 = "1"
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            android.database.Cursor r5 = r8.query(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r5.moveToFirst()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            boolean r0 = r5.isAfterLast()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            if (r0 != 0) goto L63
            java.lang.String r0 = r5.getString(r7)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            r5.moveToNext()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            com.swrve.sdk.localstorage.SwrveCacheItem r8 = new com.swrve.sdk.localstorage.SwrveCacheItem     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            r8.<init>(r2, r3, r0)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            r6 = r8
            goto L63
        L5e:
            r0 = move-exception
            r6 = r5
            goto L8a
        L61:
            r0 = move-exception
            goto L6b
        L63:
            r5.close()
            return r6
        L67:
            r0 = move-exception
            goto L8a
        L69:
            r0 = move-exception
            r5 = r6
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L5e
            r8.append(r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = " category:"
            r8.append(r2)     // Catch: java.lang.Throwable -> L5e
            r8.append(r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r8.toString()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L5e
            com.swrve.sdk.SwrveLogger.c(r2, r0, r3)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L99
            r5.close()
            goto L99
        L8a:
            if (r6 == 0) goto L8f
            r6.close()
        L8f:
            throw r0
        L90:
            java.lang.String r0 = "Cannot use null value in getCacheItem. userId:%s category:%s rawData:%s."
            java.lang.Object[] r2 = new java.lang.Object[]{r18, r19}
            com.swrve.sdk.SwrveLogger.d(r0, r2)
        L99:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.localstorage.SQLiteLocalStorage.a(java.lang.String, java.lang.String):com.swrve.sdk.localstorage.SwrveCacheItem");
    }

    @Override // com.swrve.sdk.localstorage.LocalStorage
    public final void b(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            SwrveLogger.d("Cannot set null value in cache entry for userId:%s category:%s rawData:%s.", str, str2, str3);
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("user_id", str);
            contentValues.put("category", str2);
            contentValues.put("raw_data", str3);
            j("cache", contentValues, "user_id= ? AND category= ?", new String[]{str, str2});
        } catch (Exception e) {
            StringBuilder sbV = a.v("Exception setting cache for userId:", str, " category:", str2, " rawData:");
            sbV.append(str3);
            SwrveLogger.c(sbV.toString(), e, new Object[0]);
        }
    }

    @Override // com.swrve.sdk.localstorage.LocalStorage
    public final long c(String str, String str2) {
        SQLiteDatabase sQLiteDatabase = this.f19085a;
        if (!sQLiteDatabase.isOpen()) {
            return 0L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("user_id", str);
        contentValues.put("event", str2);
        return sQLiteDatabase.insertOrThrow("events", null, contentValues);
    }

    @Override // com.swrve.sdk.localstorage.LocalStorage
    public final void d(String str, String str2, String str3, String str4) {
        b(str, str2, str3);
        b(str, str2.concat("_SGT"), str4);
    }

    @Override // com.swrve.sdk.localstorage.LocalStorage
    public final synchronized void e(String str, Set set) {
        try {
            try {
                if (this.f19085a.isOpen()) {
                    ArrayList arrayList = new ArrayList(set.size());
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.toString(((Long) it.next()).longValue()));
                    }
                    this.f19085a.delete("events", "_id IN (" + TextUtils.join(",  ", arrayList) + ")", null);
                }
            } catch (Exception e) {
                SwrveLogger.c("Exception deleting events for userId:" + str + " id's:[" + set + "]", e, new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.swrve.sdk.localstorage.LocalStorage
    public final LinkedHashMap f(Integer num, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            SwrveLogger.d("Cannot use null value userId for getFirstNEvents. userId:%s.", str);
            return linkedHashMap;
        }
        if (this.f19085a.isOpen()) {
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = this.f19085a.query("events", new String[]{"_id", "event"}, "user_id = ?", new String[]{str}, null, null, "_id", Integer.toString(num.intValue()));
                    cursorQuery.moveToFirst();
                    while (!cursorQuery.isAfterLast()) {
                        linkedHashMap.put(Long.valueOf(cursorQuery.getLong(0)), cursorQuery.getString(1));
                        cursorQuery.moveToNext();
                    }
                    cursorQuery.close();
                    return linkedHashMap;
                } catch (Exception e) {
                    SwrveLogger.c("Error getting " + num + " events for user:" + str, e, new Object[0]);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } finally {
            }
        }
        return linkedHashMap;
    }

    public final int g(String str) {
        int i = 0;
        if (str != null && !str.isEmpty()) {
            SQLiteDatabase sQLiteDatabase = this.f19085a;
            if (sQLiteDatabase.isOpen()) {
                Cursor cursorRawQuery = null;
                try {
                    try {
                        cursorRawQuery = sQLiteDatabase.rawQuery("SELECT download_count FROM asset_logs WHERE name = '" + str + "' ", null);
                        cursorRawQuery.moveToFirst();
                        if (!cursorRawQuery.isAfterLast()) {
                            i = cursorRawQuery.getInt(0);
                            cursorRawQuery.moveToNext();
                        }
                        cursorRawQuery.close();
                        return i;
                    } catch (Exception e) {
                        SwrveLogger.c("Exception occurred getting asset download count:%s", e, str);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return i;
                    }
                } catch (Throwable th) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    throw th;
                }
            }
        }
        return 0;
    }

    public final String h(String str, String str2) throws Throwable {
        String str3;
        Cursor cursor = null;
        string = null;
        String string = null;
        cursor = null;
        if (str == null || str2 == null) {
            SwrveLogger.d("Cannot use null value in getofflineCampaign. userId:%s category:%s rawData:%s.", str, str2);
            return null;
        }
        SQLiteDatabase sQLiteDatabase = this.f19085a;
        if (!sQLiteDatabase.isOpen()) {
            return null;
        }
        try {
            try {
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT campaign_json FROM offline_campaigns WHERE user_id = '" + str + "' AND campaign_id = '" + str2 + "' ", null);
                try {
                    cursorRawQuery.moveToFirst();
                    if (!cursorRawQuery.isAfterLast()) {
                        string = cursorRawQuery.getString(0);
                        cursorRawQuery.moveToNext();
                    }
                    cursorRawQuery.close();
                    return string;
                } catch (Exception e) {
                    e = e;
                    String str4 = string;
                    cursor = cursorRawQuery;
                    str3 = str4;
                    SwrveLogger.c("Exception occurred getting cache userId:" + str + " category:" + str2, e, new Object[0]);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return str3;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
            str3 = null;
        }
    }

    public final String i(String str, String str2) throws Throwable {
        String str3;
        SwrveCacheItem swrveCacheItemA;
        String strC;
        SwrveCacheItem swrveCacheItemA2 = a(str, "swrve.q1");
        if (swrveCacheItemA2 == null || (str3 = swrveCacheItemA2.c) == null || (swrveCacheItemA = a(str, "swrve.q1_SGT")) == null) {
            return null;
        }
        String str4 = swrveCacheItemA.c;
        try {
            strC = SwrveHelper.c(str3, str2);
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
        }
        if (SwrveHelper.p(strC) || SwrveHelper.p(str4) || !str4.equals(strC)) {
            throw new SecurityException("Signature validation failed");
        }
        return str3;
    }

    public final void j(String str, ContentValues contentValues, String str2, String[] strArr) throws SQLException {
        SQLiteDatabase sQLiteDatabase = this.f19085a;
        if (sQLiteDatabase.isOpen() && sQLiteDatabase.update(str, contentValues, str2, strArr) == 0) {
            sQLiteDatabase.insertOrThrow(str, null, contentValues);
        }
    }

    public final void k(Map map) {
        SQLiteDatabase sQLiteDatabase = this.f19085a;
        if (sQLiteDatabase.isOpen()) {
            sQLiteDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                for (Map.Entry entry : map.entrySet()) {
                    String str = ((SwrveCacheItem) entry.getValue()).f19086a;
                    String str2 = ((SwrveCacheItem) entry.getValue()).b;
                    String str3 = ((SwrveCacheItem) entry.getValue()).c;
                    contentValues.put("user_id", str);
                    contentValues.put("category", str2);
                    contentValues.put("raw_data", str3);
                    j("cache", contentValues, "user_id= ? AND category= ?", new String[]{str, str2});
                }
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
    }

    public final void l(List list) throws Throwable {
        SQLiteStatement sQLiteStatementCompileStatement;
        SQLiteDatabase sQLiteDatabase = this.f19085a;
        if (!sQLiteDatabase.isOpen()) {
            return;
        }
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement("INSERT INTO events (event, user_id) VALUES (?, ?)");
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    SwrveEventItem swrveEventItem = (SwrveEventItem) it.next();
                    sQLiteStatementCompileStatement.bindString(1, swrveEventItem.b);
                    sQLiteStatementCompileStatement.bindString(2, swrveEventItem.c);
                    sQLiteStatementCompileStatement.execute();
                    sQLiteStatementCompileStatement.clearBindings();
                }
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteStatementCompileStatement != null) {
                    sQLiteStatementCompileStatement.close();
                }
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                th = th;
                if (sQLiteStatementCompileStatement != null) {
                    sQLiteStatementCompileStatement.close();
                }
                sQLiteDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteStatementCompileStatement = null;
        }
    }
}
