package com.dynatrace.android.agent.events.ragetap;

import YU.a;
import com.dynatrace.android.agent.CustomSegment;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* loaded from: classes4.dex */
public class RageTapSegment extends CustomSegment {
    public final String p;
    public final long q;
    public final long r;
    public final int s;
    public final boolean t;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f14127a;
        public long b;
        public long c;
        public int d;
        public int e;
        public int f;
        public Session g;
        public boolean h;

        public final RageTapSegment a() {
            return new RageTapSegment(this);
        }

        public final void b(String str) {
            this.f14127a = str;
        }

        public final void c(long j) {
            this.b = j;
        }

        public final void d() {
            this.h = true;
        }

        public final void e(long j) {
            this.c = j;
        }

        public final void f(int i) {
            this.d = i;
        }

        public final void g(int i) {
            this.f = i;
        }

        public final void h(int i) {
            this.e = i;
        }

        public final void i(Session session) {
            this.g = session;
        }
    }

    public RageTapSegment(Builder builder) {
        super(builder.f14127a, 16, builder.g, builder.e, builder.h);
        this.b = builder.b;
        this.j = EventType.u;
        this.g = builder.f;
        this.p = Utility.e(250, builder.f14127a);
        this.q = builder.b;
        this.r = builder.c;
        this.s = builder.d;
        this.e = true;
        this.t = builder.h;
    }

    @Override // com.dynatrace.android.agent.CustomSegment
    public final StringBuilder f() {
        StringBuilder sbS = a.s("et=");
        sbS.append(this.j.d);
        if (this.p != null) {
            sbS.append("&na=");
            sbS.append(Utility.f(this.k));
        }
        sbS.append("&s0=");
        sbS.append(this.g);
        sbS.append("&t0=");
        sbS.append(this.q);
        sbS.append("&t1=");
        sbS.append(this.r);
        sbS.append("&nt=");
        sbS.append(this.s);
        sbS.append("&fw=");
        sbS.append(this.t ? "1" : "0");
        return sbS;
    }
}
