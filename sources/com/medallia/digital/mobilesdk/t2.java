package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.i6;
import com.medallia.digital.mobilesdk.o6;
import com.medallia.digital.mobilesdk.s4;
import java.io.File;

/* loaded from: classes.dex */
class t2 extends k0<File> {
    private final boolean g;
    private final String h;

    public class a implements o6.a {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            t2.this.b(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            a4.e("getResource - success");
            File fileA = g2.a(t2.this.h, k6Var.a());
            n6<T> n6Var = t2.this.d;
            if (n6Var != 0) {
                n6Var.a((n6<T>) fileA);
            }
        }
    }

    public t2(o6 o6Var, l0 l0Var, String str, n6<File> n6Var, boolean z) {
        super(o6Var, l0Var, n6Var);
        this.h = str;
        this.g = z;
        a(z);
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 a(i6 i6Var) {
        s1 s1Var = i6.a.NO_CONNECTION.equals(i6Var.a()) ? new s1(h4.a.i) : i6.a.TIMEOUT.equals(i6Var.a()) ? new s1(h4.a.S) : new s1(h4.a.R);
        a4.c(s1Var.getMessage());
        return s1Var;
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public void b() {
        h4 h4VarD = d();
        if (h4VarD == null) {
            this.f16560a.a(l3.a(this.b.e(), true), this.g ? a(s4.c.ACCESS_TOKEN) : null, s4.f().i().h().a().intValue(), new a());
            return;
        }
        n6<T> n6Var = this.d;
        if (n6Var != 0) {
            n6Var.a(h4VarD);
        }
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 d() {
        if (w2.c().a() == null) {
            h4.a aVar = h4.a.t;
            a4.c(aVar.toString());
            return new s1(aVar);
        }
        if (!TextUtils.isEmpty(this.b.e())) {
            return null;
        }
        h4.a aVar2 = h4.a.v;
        a4.c(aVar2.toString());
        return new s1(aVar2);
    }
}
