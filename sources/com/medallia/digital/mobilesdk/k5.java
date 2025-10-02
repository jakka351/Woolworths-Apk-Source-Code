package com.medallia.digital.mobilesdk;

import android.telephony.TelephonyManager;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class k5 extends y5<String> {
    private static final String k = "UNKNOWN";

    public k5(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        TelephonyManager telephonyManagerK = this.g.k();
        if (telephonyManagerK != null) {
            return telephonyManagerK.getSimOperatorName() == null ? k : telephonyManagerK.getSimOperatorName();
        }
        a4.c("TelephonyManager memory is not available");
        return k;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.i;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        Locale locale = Locale.US;
        a4.b(YU.a.A("Collectors > Network carrier : ", strS));
        return strS;
    }
}
