package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.MutableContextWrapper;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* loaded from: classes.dex */
final class y8 {
    private static y8 e;

    /* renamed from: a, reason: collision with root package name */
    private MedalliaWebView.f f16786a;
    private final HashMap<MedalliaWebView.f, MedalliaWebView> b = new HashMap<>();
    private ConfigurationContract c;
    private long d;

    /* loaded from: classes6.dex */
    public class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MedalliaWebView.f f16787a;
        final /* synthetic */ Boolean b;
        final /* synthetic */ j2 c;
        final /* synthetic */ Boolean d;
        final /* synthetic */ MedalliaWebView.e e;

        public a(MedalliaWebView.f fVar, Boolean bool, j2 j2Var, Boolean bool2, MedalliaWebView.e eVar) {
            this.f16787a = fVar;
            this.b = bool;
            this.c = j2Var;
            this.d = bool2;
            this.e = eVar;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws UnsupportedEncodingException {
            MedalliaWebView medalliaWebViewA = (MedalliaWebView) y8.this.b.get(this.f16787a);
            if (this.b.booleanValue()) {
                if (medalliaWebViewA != null && this.f16787a == MedalliaWebView.f.preload && medalliaWebViewA.getFormData() != null && medalliaWebViewA.getFormData().equals(this.c)) {
                    return;
                }
                if (medalliaWebViewA != null) {
                    y8.this.a(this.f16787a);
                }
                if (LifeCycle.b().e()) {
                    y8 y8Var = y8.this;
                    y8Var.a(y8Var.f16786a);
                }
                medalliaWebViewA = y8.this.a(this.f16787a, this.c);
                medalliaWebViewA.setConfiguration(y8.this.c);
                y8.this.b.put(this.f16787a, medalliaWebViewA);
                if (!this.d.booleanValue()) {
                    return;
                }
            } else if (!this.d.booleanValue() || medalliaWebViewA == null) {
                return;
            }
            medalliaWebViewA.load(this.e);
        }
    }

    private y8() {
    }

    public ConfigurationContract a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MedalliaWebView a(MedalliaWebView.f fVar, j2 j2Var) {
        this.f16786a = fVar;
        MutableContextWrapper mutableContextWrapperD = i4.c().d();
        long j = 1 + this.d;
        this.d = j;
        MedalliaWebView medalliaWebView = new MedalliaWebView(mutableContextWrapperD, fVar, j2Var, j);
        medalliaWebView.loadUrl("about:blank");
        return medalliaWebView;
    }

    public static y8 b() {
        if (e == null) {
            e = new y8();
        }
        return e;
    }

    public MedalliaWebView c(MedalliaWebView.f fVar) {
        return this.b.get(fVar);
    }

    public void b(MedalliaWebView.f fVar) {
        MedalliaWebView medalliaWebViewC;
        if (fVar == null || (medalliaWebViewC = c(fVar)) == null) {
            return;
        }
        a(medalliaWebViewC, true);
    }

    public HashMap<MedalliaWebView.f, MedalliaWebView> c() {
        return this.b;
    }

    public void a(ConfigurationContract configurationContract) {
        this.c = configurationContract;
    }

    public void a(MedalliaWebView.f fVar) {
        if (fVar == MedalliaWebView.f.preload) {
            return;
        }
        a(this.b.get(fVar));
    }

    public void a(MedalliaWebView.f fVar, j2 j2Var, o2 o2Var, b5 b5Var, boolean z, boolean z2, int i, int i2, boolean z3, Integer num) throws UnsupportedEncodingException {
        MedalliaWebView medalliaWebView = new MedalliaWebView(i4.c().d(), true, o2Var, MedalliaWebView.f.showForm, j2Var, 0L, b5Var, z, z2, i, i2, z3, num);
        medalliaWebView.loadUrl("about:blank");
        medalliaWebView.load(null);
        medalliaWebView.setType(fVar);
        this.f16786a = fVar;
        this.b.put(fVar, medalliaWebView);
    }

    public void a(MedalliaWebView medalliaWebView) {
        a(medalliaWebView, false);
    }

    public void a(MedalliaWebView medalliaWebView, boolean z) {
        MedalliaWebView medalliaWebView2;
        if (medalliaWebView == null || z || medalliaWebView.isPreload() || (medalliaWebView2 = this.b.get(medalliaWebView.getWebViewType())) == null || medalliaWebView2.getWebViewId() != medalliaWebView.getWebViewId()) {
            return;
        }
        medalliaWebView2.clearAndDestroy();
        this.b.remove(medalliaWebView.getWebViewType());
    }

    public void a(j2 j2Var, MedalliaWebView.e eVar, MedalliaWebView.f fVar, Boolean bool, Boolean bool2) {
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new a(fVar, bool, j2Var, bool2, eVar));
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }
}
