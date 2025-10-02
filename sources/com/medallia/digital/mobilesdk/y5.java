package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;
import com.medallia.digital.mobilesdk.x5;

/* loaded from: classes.dex */
abstract class y5<T> extends m0<T> {
    private long f;
    protected o0 g;
    private x5 h;
    private final Handler i;
    private final Runnable j;

    public class a extends v4 {

        /* renamed from: com.medallia.digital.mobilesdk.y5$a$a, reason: collision with other inner class name */
        public class C0345a extends v4 {
            public C0345a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                y5 y5Var = y5.this;
                y5Var.a((y5) y5Var.j());
                y5.this.i.postDelayed(y5.this.j, y5.this.k().a());
            }
        }

        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            w7.b().a().execute(new C0345a());
        }
    }

    public y5(x5 x5Var, n0 n0Var) {
        super(n0Var);
        this.i = new Handler(Looper.getMainLooper());
        this.j = new a();
        this.h = x5Var == null ? new x5() : x5Var;
        this.g = new o0();
    }

    private boolean l() {
        return System.currentTimeMillis() - this.f >= this.h.a();
    }

    private void o() {
        if (k().b() == x5.a.ONCE) {
            a((y5<T>) j());
        } else {
            n();
        }
    }

    private void p() {
        this.i.removeCallbacks(this.j);
    }

    public T j() {
        return null;
    }

    public x5 k() {
        return this.h;
    }

    public void m() {
        if (h()) {
            a((y5<T>) j());
        }
    }

    public void n() {
        if (h() && this.h.b() == x5.a.FREQUENCY) {
            p();
            if (l()) {
                this.i.post(this.j);
            } else {
                this.i.postDelayed(this.j, this.h.a());
            }
            this.f = System.currentTimeMillis();
        }
    }

    public void q() {
        p();
    }

    public void a(o0 o0Var) {
        this.g = o0Var;
    }

    public void a(x5 x5Var) {
        this.h = x5Var;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public void a(boolean z) {
        super.a(z);
        if (z) {
            o();
        } else {
            p();
        }
    }
}
