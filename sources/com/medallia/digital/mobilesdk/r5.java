package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class r5 extends y5<String> {
    private static final String k = "Android";

    public r5(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        return "Android";
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.f;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        Locale locale = Locale.US;
        a4.b(YU.a.A("Collectors > Os name: ", strS));
        return strS;
    }
}
