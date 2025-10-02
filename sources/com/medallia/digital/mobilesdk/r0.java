package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.i6;
import com.medallia.digital.mobilesdk.o6;
import com.medallia.digital.mobilesdk.s4;

/* loaded from: classes.dex */
class r0 extends k0<u0> {
    private final b g;

    public class a implements o6.a {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            a4.b("Fetch uuid failed fetching remote configuration");
            r0.this.f();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
        @Override // com.medallia.digital.mobilesdk.o6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.medallia.digital.mobilesdk.k6 r4) {
            /*
                r3 = this;
                java.lang.String r0 = r4.b()
                if (r0 == 0) goto L26
                com.medallia.digital.mobilesdk.ModelFactory r0 = com.medallia.digital.mobilesdk.ModelFactory.getInstance()
                java.lang.String r4 = r4.b()
                com.medallia.digital.mobilesdk.ConfigurationUUID r4 = r0.createUUID(r4)
                com.medallia.digital.mobilesdk.t0 r0 = com.medallia.digital.mobilesdk.t0.c()
                r0.a(r4)
                if (r4 == 0) goto L26
                com.medallia.digital.mobilesdk.j8$b r0 = com.medallia.digital.mobilesdk.j8.b.CONFIGURATION_UUID
                java.lang.String r4 = r4.getUuid()
                boolean r4 = com.medallia.digital.mobilesdk.j8.a(r0, r4)
                goto L27
            L26:
                r4 = 0
            L27:
                if (r4 == 0) goto L4a
                java.lang.String r4 = "Fetch uuid success - using offline configuration"
                com.medallia.digital.mobilesdk.a4.b(r4)
                long r0 = java.lang.System.currentTimeMillis()
                com.medallia.digital.mobilesdk.d7 r4 = com.medallia.digital.mobilesdk.d7.b()
                com.medallia.digital.mobilesdk.d7$a r2 = com.medallia.digital.mobilesdk.d7.a.LOCAL_CONFIGURATION_TIMESTAMP
                r4.b(r2, r0)
                java.lang.String r4 = "Local configuration timestamp was updated to: "
                java.lang.String r4 = androidx.camera.core.impl.b.k(r0, r4)
                com.medallia.digital.mobilesdk.a4.b(r4)
                com.medallia.digital.mobilesdk.r0 r4 = com.medallia.digital.mobilesdk.r0.this
                r4.e()
                return
            L4a:
                java.lang.String r4 = "Fetch uuid success - Uuid changed generate remote configuration"
                com.medallia.digital.mobilesdk.a4.b(r4)
                com.medallia.digital.mobilesdk.r0 r4 = com.medallia.digital.mobilesdk.r0.this
                r4.f()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.r0.a.a(com.medallia.digital.mobilesdk.k6):void");
        }
    }

    public interface b {
        l0 a();
    }

    public r0(o6 o6Var, l0 l0Var, b bVar, n6<u0> n6Var) {
        super(o6Var, l0Var, n6Var);
        this.g = bVar;
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 a(i6 i6Var) {
        s1 s1Var = i6.a.NO_CONNECTION.equals(i6Var.a()) ? new s1(h4.a.i) : i6.a.TIMEOUT.equals(i6Var.a()) ? new s1(h4.a.x) : new s1(h4.a.w);
        a4.c(s1Var.getMessage());
        return s1Var;
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public void b() {
        if (d() == null) {
            new k8(this.f16560a, this.b.e()).a(new a());
        } else {
            a4.b("Get config - Error trying to fetch offline configuration");
            e();
        }
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 d() {
        if (w2.c().a() == null) {
            h4.a aVar = h4.a.t;
            a4.c(aVar.toString());
            return new s1(aVar);
        }
        if (!TextUtils.isEmpty(w2.c().a().c())) {
            return null;
        }
        h4.a aVar2 = h4.a.o;
        a4.c(aVar2.toString());
        return new s1(aVar2);
    }

    public void e() {
        new s3().a(this.d);
    }

    public void f() {
        b bVar = this.g;
        if (bVar != null) {
            this.b = bVar.a();
        }
        new h6(this.f16560a, this.b.e(), this.b.c(), a(s4.c.ACCESS_TOKEN)).a((n6<u0>) this.d);
    }
}
