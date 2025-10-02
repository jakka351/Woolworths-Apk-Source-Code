package com.dynatrace.android.agent;

import YU.a;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class DTXAutoAction extends DTXActionImpl {
    public static final String F;
    public static int G;
    public static int H;
    public static boolean I;
    public static volatile DTXAutoAction J;
    public static final List K;
    public volatile boolean A;
    public volatile boolean B;
    public volatile boolean C;
    public volatile boolean D;
    public volatile Timer E;
    public volatile long w;
    public volatile int x;
    public volatile int y;
    public volatile boolean z;

    /* renamed from: com.dynatrace.android.agent.DTXAutoAction$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14074a;

        static {
            int[] iArr = new int[EventType.values().length];
            f14074a = iArr;
            try {
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14074a[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14074a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14074a[12] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14074a[13] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14074a[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        boolean z = Global.f14077a;
        F = "dtxDTXAutoAction";
        G = 500;
        H = 60000;
        I = true;
        K = Collections.synchronizedList(new ArrayList(5));
    }

    public DTXAutoAction(String str, Session session, int i) {
        super(str, EventType.g, 0L, session, i, true, null);
        this.w = 0L;
        this.x = 0;
        this.y = 0;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.E = null;
        Core.a(str, 1, this.d, this, session, i, new String[0]);
    }

    public static DTXAutoAction w(String str, Session session, int i) {
        String str2 = F;
        DTXAutoAction dTXAutoAction = new DTXAutoAction(str, session, i);
        synchronized (DTXAutoAction.class) {
            DTXAutoAction dTXAutoAction2 = J;
            J = dTXAutoAction;
            if (dTXAutoAction2 != null) {
                K.add(dTXAutoAction2);
            }
        }
        if (Global.f14077a) {
            Utility.h(str2, String.format("onUA: new GAUA %s @ %d", str, Long.valueOf(dTXAutoAction.b)));
        }
        return dTXAutoAction;
    }

    public final void A(long j) {
        if (!this.e && this.x > 0 && j == this.m) {
            y();
            this.x--;
        }
    }

    public final void B(int i) {
        u();
        if (i <= 0) {
            z(0);
            return;
        }
        if (Global.f14077a) {
            Utility.h(F, "onUA: start grace period for " + this.k);
        }
        long j = i;
        C(j, 0, j, false);
    }

    public final void C(long j, int i, long j2, boolean z) {
        if (Global.f14077a) {
            Utility.h(F, String.format("onUA: startTimer for %s delay=%dms period=%dms #period=%d", this.k, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
        TimerTask timerTask = new TimerTask(i, z) { // from class: com.dynatrace.android.agent.DTXAutoAction.1
            public int d;
            public final /* synthetic */ boolean e;

            {
                this.e = z;
                this.d = i;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                int i2 = this.d;
                DTXAutoAction dTXAutoAction = DTXAutoAction.this;
                if (i2 > 0) {
                    this.d = i2 - 1;
                    if (!this.e) {
                        return;
                    }
                } else {
                    dTXAutoAction.u();
                }
                int i3 = this.d;
                String str = DTXAutoAction.F;
                dTXAutoAction.z(i3);
            }
        };
        for (int i2 = 3; i2 > 0; i2--) {
            try {
                x(true).schedule(timerTask, j, j2);
                return;
            } catch (IllegalArgumentException unused) {
                return;
            } catch (IllegalStateException unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[EDGE_INSN: B:37:0x00a9->B:33:0x00a9 BREAK  A[LOOP:0: B:25:0x0086->B:38:?]] */
    @Override // com.dynatrace.android.agent.DTXActionImpl, com.dynatrace.android.agent.DTXAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r10 = this;
            r10.u()
            r0 = 1
            r10.C = r0
            r10.D = r0
            r1 = 0
            r10.t(r10, r1)
            java.util.List r2 = com.dynatrace.android.agent.DTXAutoAction.K
            r2.remove(r10)
            boolean r2 = com.dynatrace.android.agent.Global.f14077a
            if (r2 == 0) goto L40
            java.lang.String r2 = com.dynatrace.android.agent.DTXAutoAction.F
            java.lang.String r3 = r10.k
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r5 = r10.z
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r6 = r10.A
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r7 = r10.B
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            long r8 = r10.w
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8}
            java.lang.String r4 = "onUA: leave %s - abandon=%b WR=%b action=%b modified=%b eT=%d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            com.dynatrace.android.agent.util.Utility.h(r2, r3)
        L40:
            boolean r2 = r10.z
            if (r2 != 0) goto L48
            boolean r2 = r10.A
            if (r2 == 0) goto L50
        L48:
            long r2 = r10.w
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L5a
        L50:
            boolean r2 = com.dynatrace.android.agent.DTXAutoAction.I
            if (r2 != 0) goto L5a
            boolean r2 = r10.B
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            if (r0 == 0) goto La9
            int r2 = r10.y
            if (r2 <= 0) goto La9
            java.lang.String r2 = r10.k
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Loading "
            r3.<init>(r4)
            java.lang.String r4 = com.dynatrace.android.agent.AdkSettings.j
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto La9
            java.util.Vector r2 = r10.n()
            int r3 = r2.size()
            if (r3 <= 0) goto La9
            java.util.Iterator r3 = r2.iterator()
        L86:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L97
            java.lang.Object r4 = r3.next()
            com.dynatrace.android.agent.CustomSegment r4 = (com.dynatrace.android.agent.CustomSegment) r4
            boolean r4 = r4 instanceof com.dynatrace.android.useraction.LifecyclePlaceholderSegment
            if (r4 == 0) goto L86
            goto La9
        L97:
            java.lang.Object r3 = r2.get(r1)
            boolean r3 = r3 instanceof com.dynatrace.android.useraction.AppStartPlaceholderSegment
            if (r3 == 0) goto La9
            java.lang.Object r0 = r2.get(r1)
            com.dynatrace.android.useraction.AppStartPlaceholderSegment r0 = (com.dynatrace.android.useraction.AppStartPlaceholderSegment) r0
            r0.t()
            goto Laa
        La9:
            r1 = r0
        Laa:
            r10.q(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.DTXAutoAction.a():void");
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl, com.dynatrace.android.agent.CustomSegment
    public final StringBuilder f() {
        StringBuilder sbS = a.s("et=");
        sbS.append(this.j.d);
        sbS.append("&na=");
        sbS.append(Utility.f(this.k));
        sbS.append("&it=");
        sbS.append(Thread.currentThread().getId());
        sbS.append("&ca=");
        sbS.append(this.m);
        sbS.append("&pa=");
        sbS.append(this.d);
        sbS.append("&s0=");
        sbS.append(this.g);
        sbS.append("&t0=");
        sbS.append(this.b);
        sbS.append("&s1=");
        sbS.append(this.p);
        sbS.append("&t1=");
        sbS.append(this.c - this.b);
        sbS.append("&mo=");
        sbS.append("0");
        sbS.append("&fw=");
        sbS.append(this.s ? "1" : "0");
        return sbS;
    }

    @Override // com.dynatrace.android.agent.CustomSegment
    public final long h() {
        if (this.z || this.A) {
            if (Global.f14077a) {
                Utility.h(F, String.format("onUA: use adjusted eT=%d dur=%d", Long.valueOf(this.w), Long.valueOf(this.w - this.b)));
            }
            return this.w;
        }
        if (this.w <= 0) {
            return 0L;
        }
        if (Global.f14077a) {
            Utility.h(F, String.format("onUA (empty): use adjusted eT=%d dur=%d", Long.valueOf(this.w), Long.valueOf(this.w - this.b)));
        }
        return this.w;
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public final WebReqTag o() {
        if (this.D) {
            return null;
        }
        return super.o();
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public final void s(CustomSegment customSegment) {
        if (Global.f14077a) {
            Utility.h(F, "onUA: add child " + customSegment.k + " to " + this.k);
        }
        int i = customSegment.i();
        boolean z = true;
        if (i == 5) {
            this.y++;
            this.A = true;
            return;
        }
        if (i == 100 || i == 110) {
            this.x++;
            this.z = true;
            return;
        }
        int iOrdinal = customSegment.j.ordinal();
        if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 12 && iOrdinal != 13) {
            z = false;
        }
        this.B = z;
    }

    public final synchronized void t(DTXAutoAction dTXAutoAction, boolean z) {
        if (J == dTXAutoAction) {
            J = null;
            if (z) {
                K.add(dTXAutoAction);
            }
        }
    }

    public final void u() {
        v(x(false));
    }

    public final void v(Timer timer) {
        this.D = this.C;
        if (Global.f14077a) {
            Utility.h(F, "onUA: cancel timer=" + timer + " graceTimeOver=" + this.D);
        }
        if (timer != null) {
            timer.cancel();
            timer.purge();
        }
    }

    public final synchronized Timer x(boolean z) {
        Timer timer;
        try {
            if (z) {
                if (this.E != null) {
                    v(this.E);
                }
                timer = new Timer(F);
                this.E = timer;
            } else {
                timer = this.E;
                this.E = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return timer;
    }

    public final synchronized void y() {
        if (this.e) {
            return;
        }
        this.w = this.h.d();
        if (Global.f14077a) {
            Utility.h(F, String.format("onUA: new eT=%d dur=%d", Long.valueOf(this.w), Long.valueOf(this.w - this.b)));
        }
    }

    public final void z(int i) {
        DTXAutoAction dTXAutoAction;
        int i2;
        this.D = true;
        if (Global.f14077a) {
            Utility.h(F, String.format("onUA: onTimerPop for %s intv=%d WR=%d action=%d", this.k, Integer.valueOf(i), Integer.valueOf(this.x), Integer.valueOf(this.y)));
        }
        if (!this.C) {
            t(this, true);
        }
        if (this.x <= 0 && this.y <= 0) {
            dTXAutoAction = this;
        } else {
            if (!this.C) {
                this.C = true;
                if (Global.f14077a) {
                    Utility.h(F, "onUA: starting waiting period for " + this.k);
                }
                long jD = H - (this.h.d() - this.b);
                if (jD > 1000) {
                    i2 = 1000;
                } else {
                    if (jD < 0) {
                        jD = 0;
                    }
                    i2 = 100;
                }
                long j = i2;
                C(j, Math.round(jD / i2) - 1, j, true);
                return;
            }
            dTXAutoAction = this;
            if (i > 0) {
                return;
            }
        }
        u();
        if (Global.f14077a) {
            Utility.h(F, "onUA: closing " + dTXAutoAction.k);
        }
        a();
    }
}
