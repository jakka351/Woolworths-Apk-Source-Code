package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.i6;
import com.medallia.digital.mobilesdk.o6;
import org.json.JSONException;

/* loaded from: classes6.dex */
class g7 extends k0<Void> {
    private final c2 g;
    private String h;
    private boolean i;
    private boolean j;

    public class a implements o6.a {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) throws JSONException {
            if (g7.this.i) {
                return;
            }
            g7 g7Var = g7.this;
            g7Var.a(g7Var.g, g7.this.j);
            g7.this.b(i6Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
        @Override // com.medallia.digital.mobilesdk.o6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.medallia.digital.mobilesdk.k6 r7) throws org.json.JSONException {
            /*
                r6 = this;
                java.lang.String r0 = "uuid"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Submit Feedback - success "
                r1.<init>(r2)
                java.lang.String r2 = r7.b()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.medallia.digital.mobilesdk.a4.e(r1)
                com.medallia.digital.mobilesdk.g7 r1 = com.medallia.digital.mobilesdk.g7.this
                r1.e()
                java.lang.String r1 = r7.b()
                if (r1 == 0) goto L46
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3d
                java.lang.String r7 = r7.b()     // Catch: org.json.JSONException -> L3d
                r1.<init>(r7)     // Catch: org.json.JSONException -> L3d
                boolean r7 = r1.has(r0)     // Catch: org.json.JSONException -> L3d
                if (r7 == 0) goto L46
                boolean r7 = r1.isNull(r0)     // Catch: org.json.JSONException -> L3d
                if (r7 != 0) goto L46
                java.lang.String r7 = r1.getString(r0)     // Catch: org.json.JSONException -> L3d
            L3b:
                r5 = r7
                goto L49
            L3d:
                r0 = move-exception
                r7 = r0
                java.lang.String r7 = r7.getMessage()
                com.medallia.digital.mobilesdk.a4.c(r7)
            L46:
                java.lang.String r7 = ""
                goto L3b
            L49:
                com.medallia.digital.mobilesdk.g7 r7 = com.medallia.digital.mobilesdk.g7.this
                boolean r7 = com.medallia.digital.mobilesdk.g7.a(r7)
                if (r7 != 0) goto L64
                com.medallia.digital.mobilesdk.AnalyticsBridge r0 = com.medallia.digital.mobilesdk.AnalyticsBridge.getInstance()
                com.medallia.digital.mobilesdk.g7 r7 = com.medallia.digital.mobilesdk.g7.this
                com.medallia.digital.mobilesdk.c2 r1 = com.medallia.digital.mobilesdk.g7.b(r7)
                long r2 = java.lang.System.currentTimeMillis()
                com.medallia.digital.mobilesdk.AnalyticsBridge$c r4 = com.medallia.digital.mobilesdk.AnalyticsBridge.c.success
                r0.reportSubmitFeedbackEvent(r1, r2, r4, r5)
            L64:
                com.medallia.digital.mobilesdk.g7 r7 = com.medallia.digital.mobilesdk.g7.this
                com.medallia.digital.mobilesdk.n6<T> r7 = r7.d
                if (r7 == 0) goto L6e
                r0 = 0
                r7.a(r0)
            L6e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.g7.a.a(com.medallia.digital.mobilesdk.k6):void");
        }
    }

    public g7(o6 o6Var, l0 l0Var, c2 c2Var, n6<Void> n6Var) {
        super(o6Var, l0Var, n6Var);
        this.g = c2Var;
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 a(i6 i6Var) {
        s1 s1Var = i6.a.NO_CONNECTION.equals(i6Var.a()) ? new s1(h4.a.i) : i6.a.TIMEOUT.equals(i6Var.a()) ? new s1(h4.a.G) : new s1(h4.a.F);
        a4.c(s1Var.getMessage());
        return s1Var;
    }

    @Override // com.medallia.digital.mobilesdk.k0
    public h4 d() {
        if (w2.c().a() == null) {
            h4.a aVar = h4.a.t;
            a4.c(aVar.toString());
            return new s1(aVar);
        }
        if (TextUtils.isEmpty(this.b.e())) {
            h4.a aVar2 = h4.a.I;
            a4.c(aVar2.toString());
            return new s1(aVar2);
        }
        c2 c2Var = this.g;
        if (c2Var != null && !TextUtils.isEmpty(c2Var.a())) {
            return null;
        }
        h4.a aVar3 = h4.a.J;
        a4.c(aVar3.toString());
        return new s1(aVar3);
    }

    public void e() {
        if (this.g == null) {
            return;
        }
        f1.a().a(this.g);
        a4.b("Feedback deleted");
    }

    public boolean f() {
        if (this.g == null) {
            return false;
        }
        return f1.a().c(this.g);
    }

    public g7(o6 o6Var, l0 l0Var, c2 c2Var, Boolean bool, String str, n6<Void> n6Var) {
        super(o6Var, l0Var, n6Var);
        this.g = c2Var;
        this.i = bool.booleanValue();
        this.h = str;
        if (bool.booleanValue()) {
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c2 c2Var, boolean z) throws JSONException {
        if (z) {
            AnalyticsBridge.getInstance().reportSubmitFeedbackEvent(c2Var, 0L, AnalyticsBridge.c.pending, null);
        } else {
            AnalyticsBridge.getInstance().reportSubmitFeedbackEvent(c2Var, 0L, AnalyticsBridge.c.failure, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    @Override // com.medallia.digital.mobilesdk.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() throws org.json.JSONException {
        /*
            r9 = this;
            java.lang.String r0 = "uuid"
            com.medallia.digital.mobilesdk.h4 r1 = r9.d()
            if (r1 == 0) goto L10
            com.medallia.digital.mobilesdk.n6<T> r0 = r9.d
            if (r0 == 0) goto Lf
            r0.a(r1)
        Lf:
            return
        L10:
            boolean r1 = r9.i
            if (r1 != 0) goto L1a
            boolean r1 = r9.f()
            r9.j = r1
        L1a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3f
            com.medallia.digital.mobilesdk.c2 r2 = r9.g     // Catch: org.json.JSONException -> L3f
            java.lang.String r2 = r2.a()     // Catch: org.json.JSONException -> L3f
            r1.<init>(r2)     // Catch: org.json.JSONException -> L3f
            boolean r2 = r1.has(r0)     // Catch: org.json.JSONException -> L3b
            if (r2 == 0) goto L3d
            boolean r2 = r1.isNull(r0)     // Catch: org.json.JSONException -> L3b
            if (r2 != 0) goto L3d
            java.lang.String r2 = "clientCorrelationId"
            java.lang.Object r0 = r1.get(r0)     // Catch: org.json.JSONException -> L3b
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L3b
            goto L3d
        L3b:
            r0 = move-exception
            goto L41
        L3d:
            r6 = r1
            goto L49
        L3f:
            r0 = move-exception
            r1 = 0
        L41:
            java.lang.String r0 = r0.getMessage()
            com.medallia.digital.mobilesdk.a4.c(r0)
            goto L3d
        L49:
            boolean r0 = r9.i
            if (r0 == 0) goto L55
            java.lang.String r0 = r9.h
            java.util.HashMap r0 = r9.a(r0)
        L53:
            r5 = r0
            goto L5c
        L55:
            com.medallia.digital.mobilesdk.s4$c r0 = com.medallia.digital.mobilesdk.s4.c.ACCESS_TOKEN
            java.util.HashMap r0 = r9.a(r0)
            goto L53
        L5c:
            com.medallia.digital.mobilesdk.o6 r2 = r9.f16560a
            com.medallia.digital.mobilesdk.l0 r0 = r9.b
            java.lang.String r3 = r0.e()
            com.medallia.digital.mobilesdk.s4 r0 = com.medallia.digital.mobilesdk.s4.f()
            com.medallia.digital.mobilesdk.w4 r0 = r0.i()
            com.medallia.digital.mobilesdk.u4 r0 = r0.e()
            java.lang.Integer r0 = r0.a()
            int r7 = r0.intValue()
            com.medallia.digital.mobilesdk.g7$a r8 = new com.medallia.digital.mobilesdk.g7$a
            r8.<init>()
            r4 = 0
            r2.b(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.g7.b():void");
    }
}
