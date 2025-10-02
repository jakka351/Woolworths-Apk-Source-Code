package com.swrve.sdk.messaging;

import android.graphics.Point;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public class SwrveButton extends SwrveWidget {
    public String A;
    public JSONArray B;
    public JSONArray C;
    public SwrveButtonTheme D;
    public String u;
    public long v;
    public String w;
    public String x;
    public SwrveMessage y;
    public SwrveActionType z;

    @Override // com.swrve.sdk.messaging.SwrveWidget
    public final String a() {
        return this.A;
    }

    @Override // com.swrve.sdk.messaging.SwrveWidget
    public final String b() {
        return this.d;
    }

    @Override // com.swrve.sdk.messaging.SwrveWidget
    public final int c() {
        return this.t;
    }

    @Override // com.swrve.sdk.messaging.SwrveWidget
    public final Point d() {
        return this.f19105a;
    }

    @Override // com.swrve.sdk.messaging.SwrveWidget
    public final Point e() {
        return this.b;
    }

    @Override // com.swrve.sdk.messaging.SwrveWidget
    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.x;
    }

    public final SwrveActionType h() {
        return this.z;
    }

    public final long i() {
        return this.v;
    }

    public final SwrveMessage j() {
        return this.y;
    }

    public final String k() {
        return this.u;
    }
}
