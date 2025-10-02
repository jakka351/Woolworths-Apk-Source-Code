package com.dynatrace.android.agent.events.eventsapi;

import YU.a;
import com.dynatrace.android.agent.CustomSegment;

/* loaded from: classes4.dex */
public class EventSegment extends CustomSegment {

    public static class Builder {
    }

    @Override // com.dynatrace.android.agent.CustomSegment
    public final StringBuilder f() {
        StringBuilder sbS = a.s("et=");
        sbS.append(this.j.d);
        sbS.append("&pl=null&fw=0");
        return sbS;
    }
}
