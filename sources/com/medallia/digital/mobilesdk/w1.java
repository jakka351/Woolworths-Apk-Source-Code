package com.medallia.digital.mobilesdk;

/* loaded from: classes.dex */
abstract class w1<T> extends m0<T> {
    protected o0 f;

    public w1(n0 n0Var) {
        super(n0Var);
        this.f = new o0();
    }

    public void a(o0 o0Var) {
        this.f = o0Var;
    }

    public T j() {
        return null;
    }

    public void k() {
        if (h()) {
            a((w1<T>) j());
        }
    }

    public void l() {
        if (h()) {
            m();
        }
    }

    public void m() {
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public void a(boolean z) {
        super.a(z);
        if (!z) {
            m();
        } else {
            k();
            l();
        }
    }
}
