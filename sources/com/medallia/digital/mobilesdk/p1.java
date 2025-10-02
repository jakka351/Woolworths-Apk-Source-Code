package com.medallia.digital.mobilesdk;

import android.app.ActivityManager;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class p1 extends y5<Long> {
    private static final int k = 100;

    public p1(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private long s() {
        ActivityManager.MemoryInfo memoryInfoH = this.g.h();
        if (memoryInfoH == null) {
            a4.c("MemoryInfo is null");
            return 0L;
        }
        long j = memoryInfoH.totalMem;
        long j2 = j - memoryInfoH.availMem;
        if (j2 == 0) {
            return 0L;
        }
        return (long) ((j2 / j) * 100.0d);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.d;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long j() {
        long jS = s();
        Locale locale = Locale.US;
        a4.b(androidx.camera.core.impl.b.l(jS, "Collectors > Used memory: ", "%"));
        return Long.valueOf(jS);
    }
}
