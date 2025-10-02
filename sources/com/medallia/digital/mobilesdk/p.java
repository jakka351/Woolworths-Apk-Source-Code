package com.medallia.digital.mobilesdk;

import android.content.pm.ApplicationInfo;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class p extends y5<String> {
    public p(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        ApplicationInfo applicationInfoA = this.g.a();
        if (applicationInfoA == null) {
            a4.c("Context is null");
            return null;
        }
        int i = applicationInfoA.labelRes;
        if (i != 0) {
            return i4.c().b().getString(i);
        }
        CharSequence charSequence = applicationInfoA.nonLocalizedLabel;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.o;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        Locale locale = Locale.US;
        a4.b(YU.a.A("Collectors > App name : ", strS));
        return strS;
    }
}
