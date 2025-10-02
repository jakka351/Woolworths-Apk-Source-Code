package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.security.SecureRandom;

/* loaded from: classes.dex */
class z6 extends y5<Object> {
    private static final int l = 100;
    private static final int m = 10000;
    private static final double n = 100.0d;
    private a k;

    public enum a {
        INTEGER,
        DOUBLE
    }

    public z6(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private Object r() {
        return this.k == a.DOUBLE ? Double.valueOf(r0.nextInt(10000) / n) : Integer.valueOf(new SecureRandom().nextInt(100));
    }

    public void a(a aVar) {
        this.k = aVar;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.s;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    public Object j() {
        Object objR = r();
        a4.b(androidx.camera.core.impl.b.m(objR, "SessionCalculatedPercentageCollector value: "));
        return objR;
    }
}
