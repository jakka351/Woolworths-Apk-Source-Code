package com.adobe.mobile;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import com.adobe.mobile.AbstractHitDatabase;
import java.io.File;
import java.security.SecureRandom;
import java.util.HashMap;

/* loaded from: classes4.dex */
final class AnalyticsWorker extends AbstractHitDatabase {
    public static String s;
    public SQLiteStatement o = null;
    public static final SecureRandom p = new SecureRandom();
    public static AnalyticsWorker q = null;
    public static final Object r = new Object();
    public static volatile boolean t = true;

    public AnalyticsWorker() {
        this.e = "ADBMobileDataCache.sqlite";
        this.f = "Analytics";
        this.i = "CREATE TABLE IF NOT EXISTS HITS (ID INTEGER PRIMARY KEY AUTOINCREMENT, URL TEXT, TIMESTAMP INTEGER)";
        this.h = 0L;
        a(new File(StaticMethods.o(), this.e));
        this.g = j();
    }

    public static AnalyticsWorker o() {
        AnalyticsWorker analyticsWorker;
        synchronized (r) {
            try {
                if (q == null) {
                    q = new AnalyticsWorker();
                }
                analyticsWorker = q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return analyticsWorker;
    }

    @Override // com.adobe.mobile.AbstractDatabaseBacking
    public final void e() {
        File file = new File(StaticMethods.o() + this.e);
        File file2 = new File(StaticMethods.o(), this.e);
        if (!file.exists() || file2.exists()) {
            return;
        }
        try {
            if (file.renameTo(file2)) {
                return;
            }
            StaticMethods.K("Analytics - Unable to migrate old hits db, creating new hits db (move file returned false)", new Object[0]);
        } catch (Exception e) {
            StaticMethods.K("Analytics - Unable to migrate old hits db, creating new hits db (%s)", e.getLocalizedMessage());
        }
    }

    @Override // com.adobe.mobile.AbstractDatabaseBacking
    public final void f() {
        try {
            this.o = this.f13258a.compileStatement("INSERT INTO HITS (URL, TIMESTAMP) VALUES (?, ?)");
        } catch (SQLException e) {
            StaticMethods.J("Analytics - Unable to create database due to a sql error (%s)", e.getLocalizedMessage());
        } catch (NullPointerException e2) {
            StaticMethods.J("Analytics - Unable to create database due to an invalid path (%s)", e2.getLocalizedMessage());
        } catch (Exception e3) {
            StaticMethods.J("Analytics - Unable to create database due to an unexpected error (%s)", e3.getLocalizedMessage());
        }
    }

    @Override // com.adobe.mobile.AbstractHitDatabase
    public final Runnable l() {
        return new Runnable() { // from class: com.adobe.mobile.AnalyticsWorker.1
            /* JADX WARN: Removed duplicated region for block: B:102:0x02b0 A[LOOP:3: B:102:0x02b0->B:112:0x02d1, LOOP_START, PHI: r5
  0x02b0: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:101:0x02ae, B:112:0x02d1] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:115:0x02e5  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0297  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.lang.IllegalAccessException, java.lang.InterruptedException, java.lang.SecurityException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
                /*
                    Method dump skipped, instructions count: 852
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adobe.mobile.AnalyticsWorker.AnonymousClass1.run():void");
            }
        };
    }

    public final void m(HashMap map) {
        String str;
        if (map.size() <= 0) {
            ReferrerHandler.f13278a = true;
            k(false);
            return;
        }
        AbstractHitDatabase.Hit hitN = n();
        if (hitN != null && (str = hitN.f13259a) != null) {
            hitN.f13259a = StaticMethods.c(str, map);
            synchronized (this.d) {
                try {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("URL", hitN.f13259a);
                        this.f13258a.update("HITS", contentValues, "id=" + hitN.b, null);
                    } catch (Exception e) {
                        StaticMethods.J("Analytics - Unknown error updating url in database (%s)", e.getMessage());
                    }
                } catch (SQLException e2) {
                    StaticMethods.J("Analytics - Unable to update url in database (%s)", e2.getMessage());
                }
            }
            ReferrerHandler.f13278a = true;
        }
        k(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006c A[Catch: all -> 0x0053, PHI: r2 r4
  0x006c: PHI (r2v3 android.database.Cursor) = (r2v2 android.database.Cursor), (r2v6 android.database.Cursor) binds: [B:33:0x006a, B:37:0x007e] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r4v3 com.adobe.mobile.AbstractHitDatabase$Hit) = (r4v2 com.adobe.mobile.AbstractHitDatabase$Hit), (r4v5 com.adobe.mobile.AbstractHitDatabase$Hit) binds: [B:33:0x006a, B:37:0x007e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:34:0x006c, B:39:0x0081, B:22:0x004f, B:42:0x0085, B:43:0x0088), top: B:48:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.adobe.mobile.AbstractHitDatabase.Hit n() {
        /*
            r12 = this;
            java.lang.Object r1 = r12.d
            monitor-enter(r1)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.f13258a     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57 android.database.SQLException -> L5a
            java.lang.String r4 = "HITS"
            java.lang.String r0 = "ID"
            java.lang.String r5 = "URL"
            java.lang.String r6 = "TIMESTAMP"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57 android.database.SQLException -> L5a
            java.lang.String r10 = "ID ASC"
            java.lang.String r11 = "1"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57 android.database.SQLException -> L5a
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L49 android.database.SQLException -> L4c
            if (r0 == 0) goto L4f
            com.adobe.mobile.AbstractHitDatabase$Hit r4 = new com.adobe.mobile.AbstractHitDatabase$Hit     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L49 android.database.SQLException -> L4c
            r4.<init>()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L49 android.database.SQLException -> L4c
            r0 = 0
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43 android.database.SQLException -> L46
            r4.b = r0     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43 android.database.SQLException -> L46
            r0 = 1
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43 android.database.SQLException -> L46
            r4.f13259a = r0     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43 android.database.SQLException -> L46
            r0 = 2
            long r5 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43 android.database.SQLException -> L46
            r4.c = r5     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43 android.database.SQLException -> L46
            r2 = r4
            goto L4f
        L40:
            r0 = move-exception
            r2 = r3
            goto L83
        L43:
            r0 = move-exception
        L44:
            r2 = r3
            goto L5d
        L46:
            r0 = move-exception
        L47:
            r2 = r3
            goto L71
        L49:
            r0 = move-exception
            r4 = r2
            goto L44
        L4c:
            r0 = move-exception
            r4 = r2
            goto L47
        L4f:
            r3.close()     // Catch: java.lang.Throwable -> L53
            goto L81
        L53:
            r0 = move-exception
            goto L89
        L55:
            r0 = move-exception
            goto L83
        L57:
            r0 = move-exception
            r4 = r2
            goto L5d
        L5a:
            r0 = move-exception
            r4 = r2
            goto L71
        L5d:
            java.lang.String r3 = "Analytics - Unknown error reading from database (%s)"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L55
            com.adobe.mobile.StaticMethods.J(r3, r0)     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L6f
        L6c:
            r2.close()     // Catch: java.lang.Throwable -> L53
        L6f:
            r2 = r4
            goto L81
        L71:
            java.lang.String r3 = "Analytics - Unable to read from database (%s)"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L55
            com.adobe.mobile.StaticMethods.J(r3, r0)     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L6f
            goto L6c
        L81:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L53
            return r2
        L83:
            if (r2 == 0) goto L88
            r2.close()     // Catch: java.lang.Throwable -> L53
        L88:
            throw r0     // Catch: java.lang.Throwable -> L53
        L89:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L53
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.mobile.AnalyticsWorker.n():com.adobe.mobile.AbstractHitDatabase$Hit");
    }
}
