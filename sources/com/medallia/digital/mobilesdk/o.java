package com.medallia.digital.mobilesdk;

import android.content.pm.ApplicationInfo;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class o extends y5<String> {
    public o(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        ApplicationInfo applicationInfoA = this.g.a();
        if (applicationInfoA != null) {
            return applicationInfoA.packageName;
        }
        a4.c("ApplicationInfo is null");
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.p;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        Locale locale = Locale.US;
        a4.b(YU.a.A("Collectors > App id : ", strS));
        return strS;
    }
}
