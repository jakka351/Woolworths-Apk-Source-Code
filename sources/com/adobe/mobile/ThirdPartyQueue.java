package com.adobe.mobile;

import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import java.io.File;

/* loaded from: classes4.dex */
class ThirdPartyQueue extends AbstractHitDatabase {
    public static final String[] p = {"ID", "URL", "POSTBODY", "POSTTYPE", "TIMESTAMP", "TIMEOUT"};
    public static ThirdPartyQueue q = null;
    public static final Object r = new Object();
    public SQLiteStatement o = null;

    public ThirdPartyQueue() {
        this.e = m();
        this.f = o();
        this.i = "CREATE TABLE IF NOT EXISTS HITS (ID INTEGER PRIMARY KEY AUTOINCREMENT, URL TEXT, POSTBODY TEXT, POSTTYPE TEXT, TIMESTAMP INTEGER, TIMEOUT INTEGER)";
        this.h = 0L;
        a(new File(StaticMethods.o(), this.e));
        this.g = j();
    }

    public static ThirdPartyQueue p() {
        ThirdPartyQueue thirdPartyQueue;
        synchronized (r) {
            try {
                if (q == null) {
                    q = new ThirdPartyQueue();
                }
                thirdPartyQueue = q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return thirdPartyQueue;
    }

    @Override // com.adobe.mobile.AbstractDatabaseBacking
    public final void f() {
        try {
            this.o = this.f13258a.compileStatement("INSERT INTO HITS (URL, POSTBODY, POSTTYPE, TIMESTAMP, TIMEOUT) VALUES (?, ?, ?, ?, ?)");
        } catch (SQLException e) {
            StaticMethods.J("%s - Unable to create database due to a sql error (%s)", this.f, e.getLocalizedMessage());
        } catch (NullPointerException e2) {
            StaticMethods.J("%s - Unable to create database due to an invalid path (%s)", this.f, e2.getLocalizedMessage());
        } catch (Exception e3) {
            StaticMethods.J("%s - Unable to create database due to an unexpected error (%s)", this.f, e3.getLocalizedMessage());
        }
    }

    @Override // com.adobe.mobile.AbstractHitDatabase
    public final Runnable l() {
        final ThirdPartyQueue thirdPartyQueueN = n();
        return new Runnable() { // from class: com.adobe.mobile.ThirdPartyQueue.1
            /* JADX WARN: Removed duplicated region for block: B:154:0x023f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:170:0x02c9 A[ADDED_TO_REGION, EDGE_INSN: B:170:0x02c9->B:146:0x02c9 BREAK  A[LOOP:0: B:3:0x0024->B:176:0x0024], REMOVE, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:175:0x0256 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.lang.IllegalAccessException, java.lang.InterruptedException, java.lang.SecurityException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
                /*
                    Method dump skipped, instructions count: 718
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adobe.mobile.ThirdPartyQueue.AnonymousClass1.run():void");
            }
        };
    }

    public String m() {
        return "ADBMobile3rdPartyDataCache.sqlite";
    }

    public ThirdPartyQueue n() {
        return p();
    }

    public String o() {
        return "External Callback";
    }
}
