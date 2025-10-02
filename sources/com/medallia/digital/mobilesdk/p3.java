package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class p3 extends y5<String> {
    public p3(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        o0 o0Var = this.g;
        if (o0Var != null) {
            return o0Var.g().toString();
        }
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.j;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        Locale locale = Locale.US;
        a4.b(YU.a.A("Collectors > Language : ", strS));
        return strS;
    }
}
