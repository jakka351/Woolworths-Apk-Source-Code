package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.o6;

/* loaded from: classes6.dex */
class u2 extends k0<String> {
    private final String g;

    public class a implements o6.a {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            u2.this.b(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            a4.e("LivingLens GetUrlMediaClient - success");
            u2.this.d.a((n6<T>) k6Var.b());
        }
    }

    public u2(o6 o6Var, l0 l0Var, n6<String> n6Var) {
        super(o6Var, l0Var, n6Var);
        this.g = l0Var.e();
        a(false);
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 a(i6 i6Var) {
        return new s1(h4.a.U);
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public void b() {
        h4 h4VarD = d();
        if (h4VarD == null) {
            this.f16560a.a(this.g, this.b.c(), null, s4.f().i().f().a().intValue(), new a());
            return;
        }
        n6<T> n6Var = this.d;
        if (n6Var != 0) {
            n6Var.a(h4VarD);
        }
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 d() {
        if (!TextUtils.isEmpty(this.g)) {
            return null;
        }
        h4.a aVar = h4.a.U;
        a4.c(aVar.toString());
        return new s1(aVar);
    }
}
