package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
public class z7 extends w1<Long> implements LifeCycle.h {
    private Long g;

    public z7(n0 n0Var) {
        super(n0Var);
        this.g = Long.valueOf(System.currentTimeMillis());
        a4.b("timeInCurrentForeground field set: " + this.g);
    }

    private Long p() {
        if (this.g == null || !h()) {
            return null;
        }
        return Long.valueOf(System.currentTimeMillis() - this.g.longValue());
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
        return s0.a.S;
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

    public c0 o() {
        return new c0(f() != null ? f().toString() : "null", GroupType.collector, d(), g(), e());
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        this.g = null;
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() {
        this.g = Long.valueOf(System.currentTimeMillis());
        a4.b("TimeInCurrentForeground value set: " + this.g);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long f() {
        Long lP = p();
        Locale locale = Locale.US;
        a4.b("Collectors > TimeInCurrentForeground : " + lP);
        a((z7) lP);
        return lP;
    }
}
