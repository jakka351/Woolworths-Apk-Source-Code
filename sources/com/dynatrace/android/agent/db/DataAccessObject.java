package com.dynatrace.android.agent.db;

import android.content.Context;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;

/* loaded from: classes.dex */
public class DataAccessObject {
    public static final String c;

    /* renamed from: a, reason: collision with root package name */
    public final ParmDbHelper f14114a;
    public final EventsDbHelper b;

    static {
        boolean z = Global.f14077a;
        c = "dtxDataAccessObject";
    }

    public DataAccessObject(Context context) {
        EventsDbHelper eventsDbHelper = new EventsDbHelper(context);
        ParmDbHelper parmDbHelper = new ParmDbHelper(context);
        this.b = eventsDbHelper;
        this.f14114a = parmDbHelper;
    }

    public static long d() {
        long jLongValue = 0;
        for (int i = 0; i < 3; i++) {
            jLongValue += Double.valueOf(Math.random() * 65536.0d).longValue() << (i * 8);
        }
        return jLongValue;
    }

    public final synchronized void a(long j, boolean z) {
        try {
            this.b.a(j - 540000, z);
        } catch (Exception e) {
            if (Global.f14077a) {
                Utility.j(c, "Database error.", e);
            }
        }
    }

    public final synchronized void b(MonitoringDataEntity monitoringDataEntity) {
        try {
            this.b.c(monitoringDataEntity.f14116a, monitoringDataEntity.c, monitoringDataEntity.d, monitoringDataEntity.b, monitoringDataEntity.e);
        } catch (Exception e) {
            if (Global.f14077a) {
                Utility.g(e, c, "Database error.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0168, code lost:
    
        r44 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.dynatrace.android.agent.db.MonitoringDataEntity c(long r46) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.db.DataAccessObject.c(long):com.dynatrace.android.agent.db.MonitoringDataEntity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r3.b.b(r5.e);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e(java.util.LinkedList r4, com.dynatrace.android.agent.conf.ServerConfiguration r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.dynatrace.android.agent.db.EventsDbHelper r0 = r3.b     // Catch: java.lang.Throwable -> L29
            r0.d(r4)     // Catch: java.lang.Throwable -> L29
            boolean r0 = r5.a()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L3b
            r0 = 0
        Ld:
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L29
            if (r0 >= r1) goto L3b
            java.lang.Object r1 = r4.get(r0)     // Catch: java.lang.Throwable -> L29
            com.dynatrace.android.agent.db.DatabaseWriteQueue$DatabaseRecord r1 = (com.dynatrace.android.agent.db.DatabaseWriteQueue.DatabaseRecord) r1     // Catch: java.lang.Throwable -> L29
            int r1 = r1.d     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = com.dynatrace.android.agent.db.EventsDbHelper.g     // Catch: java.lang.Throwable -> L29
            r2 = 50
            if (r1 != r2) goto L38
            com.dynatrace.android.agent.db.EventsDbHelper r4 = r3.b     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            int r5 = r5.e     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            r4.b(r5)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            goto L3b
        L29:
            r4 = move-exception
            goto L3d
        L2b:
            r4 = move-exception
            boolean r5 = com.dynatrace.android.agent.Global.f14077a     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L3b
            java.lang.String r5 = com.dynatrace.android.agent.db.DataAccessObject.c     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "Database error."
            com.dynatrace.android.agent.util.Utility.g(r4, r5, r0)     // Catch: java.lang.Throwable -> L29
            goto L3b
        L38:
            int r0 = r0 + 1
            goto Ld
        L3b:
            monitor-exit(r3)
            return
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.db.DataAccessObject.e(java.util.LinkedList, com.dynatrace.android.agent.conf.ServerConfiguration):void");
    }
}
