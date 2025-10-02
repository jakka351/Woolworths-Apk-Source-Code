package com.dynatrace.android.agent;

import YU.a;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* loaded from: classes4.dex */
public class ErrorSegment extends CustomSegment {
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public boolean t;

    public ErrorSegment(String str, String str2, String str3, String str4, long j, Session session, int i, String str5, boolean z) {
        this(str, 6, EventType.r, str2, str3, str4, j, session, i, str5, z);
    }

    @Override // com.dynatrace.android.agent.CustomSegment
    public StringBuilder f() {
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
        CustomSegment.e(sbS, "&rs=", Utility.f(this.q));
        CustomSegment.e(sbS, "&ev=", Utility.f(this.p));
        CustomSegment.e(sbS, "&st=", Utility.f(this.r));
        sbS.append("&tt=");
        sbS.append(this.s);
        sbS.append("&fw=");
        sbS.append(this.t ? "1" : "0");
        return sbS;
    }

    public ErrorSegment(String str, int i, EventType eventType, String str2, String str3, String str4, long j, Session session, int i2, String str5, boolean z) {
        super(str, i, eventType, j, session, i2, z);
        this.p = str2;
        this.q = str3;
        this.r = str4;
        this.s = str5;
        this.t = z;
    }
}
