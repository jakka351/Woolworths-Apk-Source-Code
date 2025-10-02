package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s4;
import java.util.HashMap;

/* loaded from: classes.dex */
abstract class k0<T> {

    /* renamed from: a, reason: collision with root package name */
    protected o6 f16560a;
    protected l0 b;
    protected w c;
    protected n6<T> d;
    private boolean e = true;
    private int f;

    public k0(o6 o6Var, l0 l0Var, n6<T> n6Var) {
        this.f16560a = o6Var;
        this.b = l0Var == null ? new l0() : l0Var;
        this.c = new w(o6Var);
        this.d = n6Var;
    }

    public abstract h4 a(i6 i6Var);

    public HashMap<String, String> a(s4.c cVar) {
        return this.c.a(cVar);
    }

    public abstract void b();

    public void b(i6 i6Var) {
        int i;
        if (i6Var.b() == 401 && (i = this.f) < 2) {
            this.f = i + 1;
            a();
        } else {
            n6<T> n6Var = this.d;
            if (n6Var != null) {
                n6Var.a(a(i6Var));
            }
        }
    }

    public void c() {
        if (this.e) {
            a();
        } else {
            b();
        }
    }

    public abstract h4 d();

    public class a implements n6<Void> {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            k0.this.d.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(Void r1) {
            k0.this.b();
        }
    }

    public HashMap<String, String> a(String str) {
        return this.c.a(str);
    }

    public void a() {
        this.c.a(new a());
    }

    public void a(boolean z) {
        this.e = z;
    }
}
