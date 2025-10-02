package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
public class b3 extends w1<Boolean> {
    public b3(n0 n0Var) {
        super(n0Var);
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public /* bridge */ /* synthetic */ void a(o0 o0Var) {
        super.a(o0Var);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.F;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public void a(Boolean bool) {
        super.a((b3) bool);
        Locale locale = Locale.US;
        a4.b("Collectors > set invitation displayed collector: " + bool);
    }
}
