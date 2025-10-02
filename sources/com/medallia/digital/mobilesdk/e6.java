package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d6;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.i6;
import com.medallia.digital.mobilesdk.j8;
import com.medallia.digital.mobilesdk.o6;
import com.medallia.digital.mobilesdk.s4;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class e6 extends k0<f6> {
    public static final String g = "CUUID file does not exist";
    public static final int h = 403;

    public class a implements o6.a {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            StringBuilder sb = new StringBuilder("Fetch cUuid failed ");
            sb.append(i6Var != null ? i6Var.a() : "");
            a4.b(sb.toString());
            if (i6Var == null || i6Var.b() != 403) {
                e6.this.c(null);
            } else if (e6.this.d(e6.g)) {
                a4.b("should validate rules - calling rules validation");
                e6.this.c(e6.g);
            } else {
                a4.b("should not validate rules - using local rules");
                e6.this.d.a((n6<T>) new f6());
            }
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            a4.b("Fetch cUuid finish successfully");
            if (k6Var == null || k6Var.b() == null) {
                a4.b("CUuid fetch response is null");
                e6.this.c(null);
                return;
            }
            String cUuid = ModelFactory.getInstance().getCUuid(k6Var.b());
            if (e6.this.d(cUuid)) {
                a4.b("should validate rules - calling rules validation");
                e6.this.c(cUuid);
            } else {
                a4.b("should not validate rules - using local rules");
                e6.this.d.a((n6<T>) new f6());
            }
        }
    }

    public class b implements o6.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16448a;

        public class a implements o6.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f6 f16449a;

            public a(f6 f6Var) {
                this.f16449a = f6Var;
            }

            @Override // com.medallia.digital.mobilesdk.o6.a
            public void a(i6 i6Var) {
                StringBuilder sb = new StringBuilder("Fetch cUuid failed ");
                sb.append(i6Var != null ? i6Var.a() : "");
                a4.b(sb.toString());
                if (i6Var != null && i6Var.b() == 403) {
                    this.f16449a.a(e6.g);
                }
                e6.this.d.a((n6<T>) this.f16449a);
            }

            @Override // com.medallia.digital.mobilesdk.o6.a
            public void a(k6 k6Var) {
                if (k6Var == null || k6Var.b() == null) {
                    a4.b("CUuid fetch response is null");
                } else {
                    String cUuid = ModelFactory.getInstance().getCUuid(k6Var.b());
                    a4.b("CUuid fetched successfully");
                    this.f16449a.a(cUuid);
                }
                e6.this.d.a((n6<T>) this.f16449a);
            }
        }

        public b(String str) {
            this.f16448a = str;
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            if (i6Var != null && i6Var.a() != null) {
                a4.c("QuarantineValidationClient error " + i6Var.a().name());
            }
            e6 e6Var = e6.this;
            e6Var.d.a(e6Var.a(i6Var));
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            a4.b("QuarantineValidationClient success");
            if (k6Var != null) {
                f6 f6VarCreateQuarantineValidation = ModelFactory.getInstance().createQuarantineValidation(k6Var.b());
                f6VarCreateQuarantineValidation.a(true);
                String str = this.f16448a;
                if (str == null) {
                    j8.c(j8.b.C_UUID, f6VarCreateQuarantineValidation.b());
                    e6.this.a(new a(f6VarCreateQuarantineValidation));
                } else {
                    f6VarCreateQuarantineValidation.a(str);
                    e6.this.d.a((n6<T>) f6VarCreateQuarantineValidation);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e6(o6 o6Var, l0 l0Var, n6<f6> n6Var) {
        super(o6Var, l0Var, n6Var);
        this.b = l0Var;
        this.d = n6Var;
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 a(i6 i6Var) {
        s1 s1Var = new s1(h4.a.c0);
        if (i6Var != null) {
            if (i6.a.NO_CONNECTION.equals(i6Var.a())) {
                s1Var = new s1(h4.a.g0);
            } else if (i6.a.TIMEOUT.equals(i6Var.a())) {
                s1Var = new s1(h4.a.e0);
            }
        }
        a4.c(s1Var.getMessage());
        return s1Var;
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public void b() {
        h4 h4VarD = d();
        if (h4VarD != null) {
            a4.b("Quarantine Validation - validation Error");
            this.d.a(h4VarD);
            return;
        }
        j8.b bVar = j8.b.C_UUID;
        if (j8.b(bVar) != null || j8.c(bVar) != null) {
            a(new a());
        } else {
            a4.b("CUuid and CUuid Url are both null - Probably first quarantine validation");
            c(null);
        }
    }

    public void c(String str) {
        String strE = this.b.e();
        if (strE != null && !strE.isEmpty()) {
            this.f16560a.b(strE, null, a(s4.c.ACCESS_TOKEN), this.b.a(), s4.f().i().g().a().intValue(), new b(str));
            return;
        }
        h4.a aVar = h4.a.d0;
        a4.c(aVar.toString());
        this.d.a((h4) new s1(aVar));
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 d() {
        if (w2.c().a() == null) {
            h4.a aVar = h4.a.t;
            a4.c(aVar.toString());
            return new s1(aVar);
        }
        if (x8.b()) {
            return null;
        }
        h4.a aVar2 = h4.a.g0;
        a4.c(aVar2.toString());
        return new s1(aVar2);
    }

    public boolean e() {
        if (t0.c() == null || t0.c().b() == null) {
            a4.b("can't get OcqUuid value");
            return true;
        }
        boolean zA = j8.a(j8.b.OCQ_UUID, t0.c().b().getOcqUuid());
        a4.b("OcqUuids are equals: " + zA);
        return !zA;
    }

    public boolean b(String str) {
        boolean zA = j8.a(j8.b.C_UUID, str);
        a4.b("cUuids are equals: " + zA);
        return !zA;
    }

    public boolean d(String str) {
        String str2;
        Long l;
        if (e()) {
            str2 = "Should validate quarantine - OCQ UUID changed";
        } else if (b(str)) {
            str2 = "Should validate quarantine - CUuid changed";
        } else {
            f1 f1VarA = f1.a();
            b0.a aVar = b0.a.QuarantineRule;
            ArrayList<? extends b0> arrayListC = f1VarA.c(aVar, new Object[0]);
            if (arrayListC == null || arrayListC.isEmpty()) {
                str2 = "Should validate quarantine - DB rules are not valid";
            } else {
                g6 g6Var = (g6) f1.a().b(aVar, d6.d.ASC_EXPIRATION);
                if (g6Var == null || (l = g6Var.b) == null || l.longValue() == 0 || g6Var.b.longValue() >= System.currentTimeMillis()) {
                    return false;
                }
                str2 = "Should validate quarantine - DB rules expired: " + g6Var.b;
            }
        }
        a4.e(str2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(o6.a aVar) {
        String strC = j8.c(j8.b.C_UUID);
        if (strC != null && !strC.isEmpty()) {
            new k8(this.f16560a, strC).a(aVar);
        } else {
            a4.c(h4.a.f0.b());
            aVar.a((i6) null);
        }
    }
}
