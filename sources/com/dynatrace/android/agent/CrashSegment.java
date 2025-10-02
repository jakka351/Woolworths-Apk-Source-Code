package com.dynatrace.android.agent;

import YU.a;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* loaded from: classes4.dex */
public class CrashSegment extends ErrorSegment {
    public boolean u;

    public CrashSegment(String str, String str2, String str3, Session session, int i, String str4, boolean z) {
        super(str, 11, EventType.s, str, str2, str3, 0L, session, i, str4, z);
        this.t = z;
        this.u = true;
    }

    @Override // com.dynatrace.android.agent.ErrorSegment, com.dynatrace.android.agent.CustomSegment
    public final StringBuilder f() {
        StringBuilder sbS = a.s("et=");
        sbS.append(this.j.d);
        sbS.append("&na=");
        sbS.append(Utility.f(this.k));
        sbS.append("&it=");
        sbS.append(Thread.currentThread().getId());
        sbS.append("&pa=0&s0=");
        sbS.append(this.g);
        sbS.append("&t0=");
        sbS.append(this.b);
        CustomSegment.e(sbS, "&rs=", Utility.f(this.q));
        CustomSegment.e(sbS, "&st=", Utility.f(this.r));
        sbS.append("&tt=");
        sbS.append(this.s);
        sbS.append("&im=");
        sbS.append(this.u ? "1" : "0");
        sbS.append("&fw=");
        sbS.append(this.t ? "1" : "0");
        return sbS;
    }

    public final void l() {
        this.u = false;
    }
}
