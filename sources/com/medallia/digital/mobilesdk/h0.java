package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.MedalliaWebView;
import com.medallia.digital.mobilesdk.r2;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes.dex */
class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final g0 f16505a;

    public h0(g0 g0Var) {
        this.f16505a = g0Var;
    }

    public class a implements r2.f<JSONObject> {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.r2.f
        public void a() {
        }

        @Override // com.medallia.digital.mobilesdk.r2.f
        public void a(JSONObject jSONObject) {
            if (jSONObject != null) {
                v0.b(jSONObject.toString());
                t0.c().a(new PropertyConfigurationContract(jSONObject));
            }
            if (LifeCycle.b().a("com.medallia.digital.mobilesdk.MedalliaFullFormActivity") || LifeCycle.b().a("com.medallia.digital.mobilesdk.MedalliaModalFormActivity")) {
                return;
            }
            y8.b().b(MedalliaWebView.f.preload);
            h0.this.f16505a.a(r2.e().f());
        }
    }

    public void a(String str) {
        r2.e().a(str, new a());
    }

    public void a(Locale locale, boolean z) {
        if (locale == null) {
            return;
        }
        x3.e().a(locale);
        if (z) {
            a(x3.e().d());
        }
    }

    public boolean a() {
        if (x3.e().c() != null) {
            return false;
        }
        return x3.e().i();
    }
}
