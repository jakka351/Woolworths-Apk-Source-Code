package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class x2 extends z1<Boolean> {
    public x2(n0 n0Var) {
        super(n0Var);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public void a(Boolean bool) {
        super.a((x2) bool);
        Locale locale = Locale.US;
        a4.b("Collectors > Intercept Disabled : " + bool);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.J;
    }
}
