package com.dynatrace.android.agent;

import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* loaded from: classes.dex */
public class WebReqTag {

    /* renamed from: a, reason: collision with root package name */
    public final int f14082a;
    public final Session b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;

    public WebReqTag(long j, int i, Session session) {
        String str = AdkSettings.i;
        long id = Thread.currentThread().getId();
        int andIncrement = Utility.b.getAndIncrement();
        this.f14082a = i;
        this.b = session;
        this.c = str;
        this.d = j;
        this.e = id;
        this.f = andIncrement;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MT_3_");
        sb.append(this.f14082a);
        sb.append("_");
        Session session = this.b;
        sb.append(session.b);
        sb.append("_");
        sb.append(session.c);
        sb.append("-0_");
        session.getClass();
        sb.append(this.c);
        sb.append("_");
        sb.append(this.d);
        sb.append("_");
        sb.append(this.e);
        sb.append("_");
        sb.append(this.f);
        return sb.toString();
    }
}
