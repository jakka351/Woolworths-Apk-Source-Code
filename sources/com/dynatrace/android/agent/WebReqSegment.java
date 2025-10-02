package com.dynatrace.android.agent;

import YU.a;
import com.dynatrace.android.agent.util.Utility;

/* loaded from: classes.dex */
public class WebReqSegment extends CustomSegment {
    public String p;
    public int q;
    public long r;
    public long s;
    public long t;
    public String u;
    public boolean v;

    @Override // com.dynatrace.android.agent.CustomSegment
    public final StringBuilder f() {
        String str = this.u;
        long j = this.t;
        long j2 = this.s;
        String str2 = this.p;
        StringBuilder sbS = a.s("et=");
        sbS.append(this.j.d);
        sbS.append("&na=");
        sbS.append(Utility.f(this.k));
        sbS.append("&it=");
        sbS.append(Thread.currentThread().getId());
        sbS.append("&pa=");
        sbS.append(this.d);
        sbS.append("&s0=");
        sbS.append(this.g);
        sbS.append("&t0=");
        sbS.append(this.b);
        sbS.append("&s1=");
        sbS.append(this.r);
        sbS.append("&t1=");
        sbS.append(this.c - this.b);
        int i = this.q;
        if (i > 0) {
            sbS.append("&rc=");
            sbS.append(i);
        } else if (str2 != null) {
            sbS.append("&rc=");
            sbS.append(Utility.f(str2));
        }
        if (j2 >= 0 && j >= 0) {
            androidx.constraintlayout.core.state.a.A(sbS, "&bs=", j2, "&br=");
            sbS.append(j);
        }
        if (str != null) {
            sbS.append("&si=");
            sbS.append(Utility.f(str));
        }
        sbS.append("&fw=");
        sbS.append(this.v ? "1" : "0");
        return sbS;
    }
}
