package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.o6;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class p8 extends k0<String> {
    private final e5 g;
    private final d5 h;

    public class a implements o6.a {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            p8.this.b(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            a4.b("LivingLens UploadMediaClient - success");
            p8.this.d.a((n6<T>) k6Var.b());
        }
    }

    public p8(o6 o6Var, l0 l0Var, n6<String> n6Var, d5 d5Var, e5 e5Var) {
        super(o6Var, l0Var, n6Var);
        this.g = e5Var;
        this.h = d5Var;
        a(false);
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 a(i6 i6Var) {
        return new s1(h4.a.V);
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public void b() {
        h4 h4VarD = d();
        if (h4VarD != null) {
            n6<T> n6Var = this.d;
            if (n6Var != 0) {
                n6Var.a(h4VarD);
                return;
            }
            return;
        }
        try {
            this.f16560a.a(this.h.b(), (HashMap<String, String>) null, (HashMap<String, String>) null, (JSONObject) null, this.g.e(), s4.f().i().f().a().intValue(), new a());
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 d() {
        if (TextUtils.isEmpty(this.h.b())) {
            h4.a aVar = h4.a.U;
            a4.c(aVar.toString());
            return new s1(aVar);
        }
        if (this.g != null) {
            return null;
        }
        h4.a aVar2 = h4.a.V;
        a4.c(aVar2.toString());
        return new s1(aVar2);
    }
}
