package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class y7 extends w1<Long> implements LifeCycle.g {
    public y7(n0 n0Var) {
        super(n0Var);
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.g
    public void a(long j) {
        a((y7) Long.valueOf(j));
        Locale locale = Locale.US;
        a4.b(androidx.camera.core.impl.b.k(j, "Collectors > Time in background was: "));
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.G;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public void l() {
        super.l();
        try {
            LifeCycle.b().a(this);
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public void m() {
        super.m();
        try {
            LifeCycle.b().b(this);
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Long j() {
        return f();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long f() {
        if (super.f() == null) {
            return 0L;
        }
        return (Long) super.f();
    }

    public void p() {
        a((y7) 0L);
    }
}
