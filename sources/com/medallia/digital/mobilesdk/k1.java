package com.medallia.digital.mobilesdk;

import android.app.ActivityManager;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class k1 extends y5<String> {
    public k1(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private double s() {
        ActivityManager.MemoryInfo memoryInfoH = this.g.h();
        if (memoryInfoH == null) {
            a4.c("MemoryInfo is null");
            return 0.0d;
        }
        long j = memoryInfoH.availMem;
        if (j == 0) {
            return 0.0d;
        }
        return j;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.f16690a;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strB = m1.b(s());
        Locale locale = Locale.US;
        a4.b(YU.a.A("Collectors > Device free memory: ", strB));
        return strB;
    }
}
