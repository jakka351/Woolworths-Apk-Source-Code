package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class b8 extends y5<String> {
    public b8(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        try {
            return this.g.b().getTimeZone().getDisplayName(false, 0);
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.k;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        Locale locale = Locale.US;
        a4.b(YU.a.A("Collectors > Timezone : ", strS));
        return strS;
    }
}
