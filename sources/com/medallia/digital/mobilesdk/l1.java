package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
class l1 extends y5<String> {
    public l1(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String r() {
        d7 d7VarJ = this.g.j();
        if (d7VarJ == null) {
            a4.c("Storage is null");
            return null;
        }
        d7.a aVar = d7.a.DEVICE_ID;
        String strA = d7VarJ.a(aVar, (String) null);
        if (strA != null) {
            return strA;
        }
        String string = UUID.randomUUID().toString();
        d7VarJ.b(aVar, string);
        return string;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.n;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strR = r();
        Locale locale = Locale.US;
        a4.b(YU.a.A("Collectors > Device id : ", strR));
        return strR;
    }
}
