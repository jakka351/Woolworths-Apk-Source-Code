package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
public class i3 extends z1<Boolean> {
    public i3(n0 n0Var) {
        super(n0Var);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public void a(Boolean bool) {
        super.a((i3) bool);
        Locale locale = Locale.US;
        a4.b(YU.a.A("Collectors > IsSessionSampledEventsCollector : ", bool.toString()));
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.V;
    }
}
