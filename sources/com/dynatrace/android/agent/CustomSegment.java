package com.dynatrace.android.agent;

import YU.a;
import com.dynatrace.android.agent.crash.PlatformType;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class CustomSegment implements Segment {
    public static final AtomicInteger o = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public String f14072a;
    public long b;
    public long c;
    public long d;
    public boolean e;
    public boolean f;
    public int g;
    public Session h;
    public int i;
    public EventType j;
    public String k;
    public int l;
    public long m;
    public boolean n;

    /* renamed from: com.dynatrace.android.agent.CustomSegment$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14073a;

        static {
            int[] iArr = new int[EventType.values().length];
            f14073a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14073a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14073a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14073a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14073a[15] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14073a[12] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14073a[16] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public CustomSegment(String str, int i, EventType eventType, long j, Session session, int i2, boolean z) {
        this.b = -1L;
        this.c = -1L;
        this.d = 0L;
        this.e = false;
        this.f = true;
        this.k = "";
        this.m = 0L;
        this.h = session;
        this.l = i;
        this.j = eventType;
        long jD = session.d();
        this.b = jD;
        this.c = jD;
        this.d = j;
        this.m = Utility.c.incrementAndGet();
        this.g = Utility.b.getAndIncrement();
        this.i = i2;
        this.e = i != 5;
        if (str == null) {
            this.k = "";
        } else {
            this.k = Utility.e(250, str);
        }
        if (j == 0) {
            session.k(TimeLineProvider.b.a());
        }
        this.n = z;
    }

    public static void e(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(str);
            if (str2.isEmpty()) {
                return;
            }
            sb.append(str2);
        }
    }

    public StringBuilder f() {
        StringBuilder sbS = a.s("et=");
        sbS.append(this.j.d);
        int iOrdinal = this.j.ordinal();
        if (iOrdinal == 3) {
            g(sbS);
        } else if (iOrdinal == 4) {
            g(sbS);
            e(sbS, "&vl=", Utility.f(this.f14072a));
        } else if (iOrdinal == 5 || iOrdinal == 6) {
            g(sbS);
            sbS.append("&vl=");
            sbS.append(Utility.f(this.f14072a));
        } else if (iOrdinal == 12) {
            g(sbS);
            sbS.append("&ev=");
            sbS.append(Utility.f(this.f14072a));
            sbS.append("&tt=");
            sbS.append(PlatformType.CUSTOM.a());
        } else if (iOrdinal == 15) {
            g(sbS);
        } else if (iOrdinal == 16) {
            sbS.append("&na=");
            sbS.append(Utility.f(this.k));
            e(sbS, "&pl=", Utility.f(this.f14072a));
            sbS.append("&t0=");
            sbS.append(this.b);
        }
        sbS.append("&fw=");
        sbS.append(this.n ? "1" : "0");
        return sbS;
    }

    public final void g(StringBuilder sb) {
        sb.append("&na=");
        sb.append(Utility.f(this.k));
        sb.append("&it=");
        sb.append(Thread.currentThread().getId());
        sb.append("&pa=");
        sb.append(this.d);
        sb.append("&s0=");
        sb.append(this.g);
        sb.append("&t0=");
        sb.append(this.b);
    }

    public long h() {
        return 0L;
    }

    public int i() {
        return this.l;
    }

    public final void j() {
        long jH = h();
        if (jH > 0) {
            k(jH);
        } else {
            k(this.h.d());
        }
    }

    public final void k(long j) {
        if (this.e) {
            return;
        }
        this.c = j;
        this.e = true;
        if (this.d == 0) {
            this.h.k(TimeLineProvider.b.a());
        }
    }

    public CustomSegment(String str, int i, Session session, int i2, boolean z) {
        this.b = -1L;
        this.c = -1L;
        this.d = 0L;
        this.e = false;
        this.f = true;
        this.k = "";
        this.m = 0L;
        this.l = i;
        this.m = Utility.c.incrementAndGet();
        this.h = session;
        this.i = i2;
        if (str == null) {
            this.k = "";
        } else {
            this.k = Utility.e(250, str);
        }
        this.n = z;
    }
}
