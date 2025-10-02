package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class a8 extends w1<Long> implements LifeCycle.h, LifeCycle.g {
    private Long g;

    public a8(n0 n0Var) {
        super(n0Var);
        this.g = Long.valueOf(System.currentTimeMillis());
    }

    private Long p() {
        if (this.g == null || !h()) {
            return null;
        }
        return Long.valueOf(System.currentTimeMillis() - this.g.longValue());
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.g
    public void a(long j) {
        this.g = Long.valueOf(this.g.longValue() + j);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.H;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public void l() {
        super.l();
        try {
            LifeCycle.b().a((LifeCycle.g) this);
            LifeCycle.b().a((LifeCycle.h) this);
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public void m() {
        super.m();
        try {
            LifeCycle.b().b((LifeCycle.g) this);
            LifeCycle.b().b((LifeCycle.h) this);
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Long j() {
        return f();
    }

    public c0 o() {
        return new c0(f().toString(), GroupType.collector, d(), g(), e());
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        a((a8) f());
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() {
    }

    @Override // com.medallia.digital.mobilesdk.m0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long f() {
        Long lP = p();
        Locale locale = Locale.US;
        a4.b("Collectors > Time in foreground: " + lP);
        return lP;
    }

    public void r() {
        this.g = Long.valueOf(System.currentTimeMillis());
    }
}
