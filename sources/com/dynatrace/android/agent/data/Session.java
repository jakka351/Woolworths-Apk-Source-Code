package com.dynatrace.android.agent.data;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.conf.PrivacyRules;
import com.dynatrace.android.agent.conf.RageTapConfiguration;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.util.Utility;
import java.util.Random;

/* loaded from: classes.dex */
public class Session {
    public static final String l;
    public static final RandomFactory m;
    public static volatile Session n;

    /* renamed from: a, reason: collision with root package name */
    public final long f14113a;
    public long b;
    public long c;
    public String e;
    public final Random g;
    public volatile long h;
    public PrivacyRules i;
    public final RageTapConfiguration j;
    public int d = -1;
    public SessionState f = SessionState.f;
    public boolean k = false;

    static {
        boolean z = Global.f14077a;
        l = "dtxSession";
        m = new RandomFactory();
        n = null;
    }

    public Session(long j, Random random, PrivacyRules privacyRules, RageTapConfiguration rageTapConfiguration) {
        this.f14113a = j;
        this.h = j;
        this.g = random;
        this.i = privacyRules;
        this.j = rageTapConfiguration;
    }

    public static Session a() {
        return n != null ? n : i(PrivacyRules.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.dynatrace.android.agent.data.Session b(long r10, boolean r12) {
        /*
            com.dynatrace.android.agent.data.Session r0 = a()
            if (r12 != 0) goto L49
            com.dynatrace.android.agent.AdkSettings r12 = com.dynatrace.android.agent.AdkSettings.l
            com.dynatrace.android.agent.conf.ServerConfiguration r1 = r12.g
            com.dynatrace.android.agent.conf.SessionSplitConfiguration r1 = r1.c
            long r2 = r0.h
            int r4 = r1.b
            long r4 = (long) r4
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            long r4 = r4 + r2
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 < 0) goto L26
            long r2 = r0.f14113a
            int r1 = r1.f14102a
            int r1 = r1 * 60
            long r4 = (long) r1
            long r4 = r4 * r6
            long r4 = r4 + r2
            int r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r1 >= 0) goto L49
        L26:
            r1 = 1
            com.dynatrace.android.agent.conf.PrivacyRules r2 = r0.i
            com.dynatrace.android.agent.Core.h(r1, r2, r10)
            java.lang.String r1 = r0.e
            if (r1 == 0) goto L47
            com.dynatrace.android.agent.data.Session r1 = com.dynatrace.android.agent.data.Session.n
            java.lang.String r0 = r0.e
            r1.e = r0
            com.dynatrace.android.agent.data.Session r7 = com.dynatrace.android.agent.data.Session.n
            int r8 = r12.c
            java.lang.String r2 = r7.e
            r12 = 0
            java.lang.String[] r9 = new java.lang.String[r12]
            r3 = 12
            r4 = 0
            r6 = 0
            com.dynatrace.android.agent.Core.a(r2, r3, r4, r6, r7, r8, r9)
        L47:
            com.dynatrace.android.agent.data.Session r0 = com.dynatrace.android.agent.data.Session.n
        L49:
            r0.h = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.data.Session.b(long, boolean):com.dynatrace.android.agent.data.Session");
    }

    public static Session c(boolean z) {
        return b(TimeLineProvider.b.a(), z);
    }

    public static Session h(PrivacyRules privacyRules, long j) {
        ServerConfiguration serverConfiguration = AdkSettings.l.g;
        boolean z = n != null ? n.k : false;
        m.getClass();
        n = new Session(j, new Random(System.currentTimeMillis()), privacyRules, serverConfiguration.f);
        n.k = z;
        return n;
    }

    public static Session i(PrivacyRules privacyRules) {
        if (n == null) {
            synchronized (Session.class) {
                try {
                    if (n == null) {
                        return h(privacyRules, TimeLineProvider.b.a());
                    }
                } finally {
                }
            }
        }
        return n;
    }

    public static void j(PrivacyRules privacyRules, boolean z) {
        if (n == null) {
            synchronized (Session.class) {
                try {
                    if (n == null) {
                        h(privacyRules, TimeLineProvider.b.a()).k = z;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final long d() {
        return TimeLineProvider.b.a() - this.f14113a;
    }

    public final void e(ServerConfiguration serverConfiguration) {
        if (this.f != SessionState.f) {
            return;
        }
        int i = serverConfiguration.k;
        int i2 = serverConfiguration.h;
        this.d = i;
        boolean z = i > 0;
        String str = l;
        if (!z && Global.f14077a) {
            Utility.h(str, "Session disabled by overload prevention (mp=0)");
        }
        if (z) {
            boolean z2 = this.g.nextInt(100) < i2;
            if (!z2 && Global.f14077a) {
                Utility.h(str, "Session disabled by traffic control: tc=" + i2);
            }
            z = z2;
        }
        this.f = z ? SessionState.g : SessionState.h;
    }

    public final boolean f() {
        return this.f.d;
    }

    public final boolean g() {
        return this.f.e;
    }

    public final synchronized void k(long j) {
        if (j > this.h) {
            this.h = j;
        }
    }
}
