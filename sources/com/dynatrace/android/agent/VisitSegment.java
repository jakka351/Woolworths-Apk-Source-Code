package com.dynatrace.android.agent;

import YU.a;

/* loaded from: classes4.dex */
public class VisitSegment extends CustomSegment {
    @Override // com.dynatrace.android.agent.CustomSegment
    public final StringBuilder f() {
        StringBuilder sbS = a.s("et=");
        sbS.append(this.j.d);
        sbS.append("&it=");
        sbS.append(Thread.currentThread().getId());
        sbS.append("&pa=");
        sbS.append(this.d);
        sbS.append("&s0=");
        sbS.append(this.g + 100);
        sbS.append("&t0=");
        sbS.append(this.b);
        sbS.append("&fw=");
        sbS.append("0");
        return sbS;
    }
}
