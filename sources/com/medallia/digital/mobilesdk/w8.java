package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class w8 extends z1<String> {
    public w8(n0 n0Var) {
        super(n0Var);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.D;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public void a(String str) {
        super.a((w8) str);
        Locale locale = Locale.US;
        a4.b(YU.a.A("Collectors > set username: ", str));
    }
}
