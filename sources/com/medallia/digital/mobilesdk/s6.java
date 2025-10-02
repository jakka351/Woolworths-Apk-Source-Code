package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class s6 extends z1<MDSdkFrameworkType> {
    public s6(n0 n0Var) {
        super(n0Var);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public void a(MDSdkFrameworkType mDSdkFrameworkType) {
        super.a((s6) mDSdkFrameworkType);
        Locale locale = Locale.US;
        a4.b(YU.a.A("Collectors > set SDK Framework : ", mDSdkFrameworkType.toString()));
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.P;
    }
}
