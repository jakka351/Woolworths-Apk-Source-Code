package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class y2 extends z1<Boolean> {
    public y2(n0 n0Var) {
        super(n0Var);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public void a(Boolean bool) {
        super.a((y2) bool);
        Locale locale = Locale.US;
        a4.b("Collectors > Intercept Enabled : " + bool);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.I;
    }
}
