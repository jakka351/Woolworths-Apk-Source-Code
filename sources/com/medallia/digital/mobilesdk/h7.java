package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.h4;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class h7 extends k0<String> {
    private d5 g;
    private final b5 h;
    private final e5 i;

    public h7(e5 e5Var, b5 b5Var, o6 o6Var, l0 l0Var, n6<String> n6Var) {
        super(o6Var, l0Var, n6Var);
        this.i = e5Var;
        this.h = b5Var;
        a(false);
    }

    public void c(n6<String> n6Var) {
        a4.b("LivingLens uploadMediaCapture was called");
        new p8(this.f16560a, new l0(), new c(n6Var), this.g, this.i).c();
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 d() {
        if (TextUtils.isEmpty(this.b.e())) {
            h4.a aVar = h4.a.a0;
            a4.c(aVar.toString());
            return new s1(aVar);
        }
        if (this.i != null) {
            return null;
        }
        h4.a aVar2 = h4.a.Y;
        a4.c(aVar2.toString());
        return new s1(aVar2);
    }

    public void e() {
        if (this.i == null) {
            return;
        }
        a4.b("LivingLens Media Feedback Delete from DB? " + f1.a().a(this.i) + " " + this.i.d());
        boolean zDelete = new File(this.i.e()).delete();
        StringBuilder sb = new StringBuilder("LivingLens Media File deleted? ");
        sb.append(zDelete);
        a4.b(sb.toString());
    }

    public boolean f() {
        if (this.i == null) {
            return false;
        }
        a4.b("LivingLens Media Feedback Saved in DB: " + this.i.d());
        return f1.a().c(this.i);
    }

    public class a implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16516a;

        /* renamed from: com.medallia.digital.mobilesdk.h7$a$a, reason: collision with other inner class name */
        public class C0336a implements n6<String> {
            public C0336a() {
            }

            @Override // com.medallia.digital.mobilesdk.n6
            public void a(h4 h4Var) {
                h7.this.d.a(h4Var);
            }

            /* renamed from: com.medallia.digital.mobilesdk.h7$a$a$a, reason: collision with other inner class name */
            public class C0337a implements n6<String> {
                public C0337a() {
                }

                @Override // com.medallia.digital.mobilesdk.n6
                public void a(h4 h4Var) {
                    h7.this.d.a(h4Var);
                }

                @Override // com.medallia.digital.mobilesdk.n6
                public void a(String str) throws JSONException {
                    h7.this.e();
                    AnalyticsBridge.getInstance().reportMediaCaptureSubmitEvent(h7.this.i, AnalyticsBridge.c.success, null, h7.this.h.b());
                    h7.this.d.a((n6<T>) str);
                }
            }

            @Override // com.medallia.digital.mobilesdk.n6
            public void a(String str) {
                h7.this.b(new C0337a());
            }
        }

        public a(boolean z) {
            this.f16516a = z;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) throws JSONException {
            h7.this.d.a(h4Var);
            h7 h7Var = h7.this;
            h7Var.a(h7Var.i, this.f16516a);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            try {
                h7.this.g = new d5(new JSONObject(str));
                h7.this.c(new C0336a());
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }
    }

    public class b implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f16519a;

        public b(n6 n6Var) {
            this.f16519a = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            this.f16519a.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            this.f16519a.a((n6) str);
        }
    }

    public class c implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f16520a;

        public c(n6 n6Var) {
            this.f16520a = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            this.f16520a.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            this.f16520a.a((n6) str);
        }
    }

    public class d implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f16521a;

        public d(n6 n6Var) {
            this.f16521a = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            this.f16521a.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            this.f16521a.a((n6) str);
        }
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
        boolean zF = f();
        if (x8.b()) {
            a(new a(zF));
        } else {
            this.d.a((h4) new s1(h4.a.b0));
        }
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 a(i6 i6Var) {
        return new s1(h4.a.Z);
    }

    public void b(n6<String> n6Var) {
        a4.b("LivingLens processMedia was called");
        new a6(this.f16560a, new l0(), this.i, this.h, this.g, new d(n6Var)).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e5 e5Var, boolean z) throws JSONException {
        AnalyticsBridge analyticsBridge;
        AnalyticsBridge.c cVar;
        if (z) {
            analyticsBridge = AnalyticsBridge.getInstance();
            cVar = AnalyticsBridge.c.pending;
        } else {
            analyticsBridge = AnalyticsBridge.getInstance();
            cVar = AnalyticsBridge.c.failure;
        }
        analyticsBridge.reportMediaCaptureSubmitEvent(e5Var, cVar, null, this.h.b());
    }

    public void a(n6<String> n6Var) {
        a4.b("LivingLens getMediaPresignedUrl URL was called");
        new u2(this.f16560a, new l0(this.b.e(), null, this.b.c(), null), new b(n6Var)).c();
    }
}
