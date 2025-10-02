package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.u1;
import com.medallia.digital.mobilesdk.x7;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;

/* loaded from: classes6.dex */
class m7 implements LifeCycle.h, m8, x7.b<u1.b>, j7 {
    protected static final String q = "2.0.0";
    private static final String r = "targetRuleEngine/tre-%s.js";
    private static final String s = "targetRuleEngine/index.html";
    private static final String t = "targetRuleEngine";
    private static final String u = "getFormToTrigger";
    private static final String v = "getFormToTriggerWithPath";
    private static final String w = "<html lang=\"en\"><body><script src=\"TRE_NAME_TEMP\"></script></body></html>";
    private static final String x = "TRE_NAME_TEMP";
    private static final int y = 2;

    /* renamed from: a, reason: collision with root package name */
    private long f16596a;
    private String d;
    private Long e;
    protected String f;
    protected File g;
    private u1.b j;
    private WebView k;
    protected boolean m;
    private boolean n;
    protected x7 b = new x7(500, this);
    protected boolean c = false;
    private final ArrayList<t1> h = new ArrayList<>();
    protected boolean i = true;
    private final Handler o = new Handler(Looper.getMainLooper());
    private final v4 p = new a();
    protected boolean l = d7.b().a(d7.a.SDK_STOPPED, false);

    public class a extends v4 {

        /* renamed from: com.medallia.digital.mobilesdk.m7$a$a, reason: collision with other inner class name */
        public class C0338a extends v4 {
            public C0338a() {
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                m7.this.a(u1.b.evaluationTimerFG);
            }
        }

        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            w7.b().a().execute(new C0338a());
        }
    }

    public class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f16599a;

        public class a extends WebViewClient {

            /* renamed from: com.medallia.digital.mobilesdk.m7$b$a$a, reason: collision with other inner class name */
            public class C0339a implements ValueCallback<String> {

                /* renamed from: com.medallia.digital.mobilesdk.m7$b$a$a$a, reason: collision with other inner class name */
                public class C0340a extends v4 {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ String f16602a;

                    public C0340a(String str) {
                        this.f16602a = str;
                    }

                    @Override // com.medallia.digital.mobilesdk.v4
                    public void a() {
                        m7.this.a(this.f16602a);
                    }
                }

                public C0339a() {
                }

                @Override // android.webkit.ValueCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onReceiveValue(String str) {
                    w7.b().a().execute(new C0340a(str));
                }
            }

            public a() {
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (m7.this.k == null && webView != null) {
                    m7.this.k = webView;
                }
                if (m7.this.k == null) {
                    a4.c("targetEngineWebView is null");
                } else {
                    m7.this.k.evaluateJavascript(m7.this.d, new C0339a());
                    m7.this.d = null;
                }
            }
        }

        public b(File file) {
            this.f16599a = file;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            m7 m7Var = m7.this;
            m7Var.k = m7Var.f();
            if (this.f16599a != null) {
                m7.this.k.loadUrl("file://" + this.f16599a.getPath());
                m7.this.k.setWebViewClient(new a());
            }
        }
    }

    public class c extends v4 {
        public c() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (m7.this.k != null) {
                m7.this.k.setWebChromeClient(null);
                m7.this.k.setWebViewClient(null);
                m7.this.k.stopLoading();
                m7.this.k.clearHistory();
                m7.this.k.removeAllViews();
                m7.this.k.destroyDrawingCache();
                m7.this.k.destroy();
                m7.this.k = null;
            }
        }
    }

    public class d implements n6<File> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TargetRuleEngineContract f16604a;

        public d(TargetRuleEngineContract targetRuleEngineContract) {
            this.f16604a = targetRuleEngineContract;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            a4.c("Failed to download and store target engine " + h4Var.getMessage());
            if (g2.d(m7.this.g)) {
                a4.f("Using previous TRE " + m7.this.g.getName());
                m7.this.a(u1.b.sdkInit);
            }
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(File file) throws JSONException {
            a4.b("TRE download completed successfully");
            m7.this.a(file);
            m7 m7Var = m7.this;
            m7Var.g = file;
            m7Var.a(u1.b.sdkInit);
            m7 m7Var2 = m7.this;
            m7Var2.a(m7Var2.g, this.f16604a);
            m7.this.e();
        }
    }

    private void d() {
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new c());
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() throws JSONException {
        AnalyticsBridge.getInstance().setTreResourceReady(true);
        AnalyticsBridge.getInstance().reportResourcesSizeEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WebView f() {
        WebView webView = new WebView(i4.c().a().getApplicationContext());
        webView.setWillNotDraw(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBlockNetworkLoads(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setCacheMode(2);
        return webView;
    }

    private TargetRuleEngineContract h() {
        String strA = d7.b().a(d7.a.TARGET_ENGINE, (String) null);
        if (strA == null) {
            return null;
        }
        return ModelFactory.getInstance().createTargetRuleEngine(strA);
    }

    private void j() {
        l();
        k();
    }

    private void k() {
        Long l = this.e;
        if (l != null) {
            this.o.postDelayed(this.p, l.longValue());
        }
    }

    private void l() {
        a4.b("Evaluation timer stopped");
        this.o.removeCallbacks(this.p);
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a4.a("TargetEvaluator");
        l();
    }

    public void g() {
        LifeCycle.b().a(this);
    }

    public File i() {
        TargetRuleEngineContract targetRuleEngineContractH = h();
        if (targetRuleEngineContractH != null) {
            return g2.d(b(targetRuleEngineContractH));
        }
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        l();
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() {
        if (this.e != null) {
            this.e = Long.valueOf((CollectorsInfrastructure.getInstance() == null || CollectorsInfrastructure.getInstance().getTimeInBackground() == null || this.e.longValue() <= CollectorsInfrastructure.getInstance().getTimeInBackground().longValue()) ? 1000L : this.e.longValue() - CollectorsInfrastructure.getInstance().getTimeInBackground().longValue());
        }
        j();
    }

    public String b(TargetRuleEngineContract targetRuleEngineContract) {
        return YU.a.h("targetRuleEngine/tre-", targetRuleEngineContract.getVersion(), ".js");
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public boolean c() {
        return this.i;
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public i7 a() {
        return i7.V1;
    }

    public boolean c(TargetRuleEngineContract targetRuleEngineContract) {
        TargetRuleEngineContract targetRuleEngineContractH;
        if (!g2.d(this.g) || (targetRuleEngineContractH = h()) == null || targetRuleEngineContractH.getVersion() == null) {
            return false;
        }
        return targetRuleEngineContractH.getVersion().equals(targetRuleEngineContract.getVersion());
    }

    private String a(String str, String str2) {
        String strB = t8.g().b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbV = YU.a.v("targetRuleEngine.", str, "(", strB, ",");
        sbV.append(str2);
        sbV.append(",");
        sbV.append(jCurrentTimeMillis);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public ArrayList<t1> b() {
        return this.h;
    }

    @Override // com.medallia.digital.mobilesdk.x7.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(u1.b bVar) {
        String strC;
        String str;
        if (this.l) {
            a4.e("Evaluate can’t be trigger because of stop sdk");
            return;
        }
        if (this.i) {
            this.j = bVar;
            t8.g().b(CollectorsInfrastructure.getInstance().timeInForegroundCollector.o());
            this.f16596a = System.currentTimeMillis();
            a4.e("Evaluate with TRE " + this.g.getName());
            File fileA = g2.a(s, w.replace(x, this.g.getName()));
            this.d = "";
            if (this.n) {
                File fileC = v0.c();
                if (fileC == null) {
                    a4.c("Can't evaluate with TE configuration file is null");
                    return;
                } else {
                    strC = l3.c(fileC.getPath());
                    str = v;
                }
            } else {
                strC = this.f;
                str = u;
            }
            this.d = a(str, strC);
            try {
                ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new b(fileA));
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void b(boolean z) {
        b(z, true);
    }

    public void b(boolean z, boolean z2) {
        boolean z3 = this.i;
        if (z3 == z) {
            a4.e("Intercept already ".concat(z3 ? "enabled" : "disabled"));
            return;
        }
        this.i = z;
        if (z) {
            a4.e("Intercept enabled");
            CollectorsInfrastructure.getInstance().interceptEnabledCollector.a(Boolean.TRUE);
            AnalyticsBridge.getInstance().reportEnableInterceptEvent();
        } else {
            a4.e("Intercept disabled");
            CollectorsInfrastructure.getInstance().interceptDisabledCollector.a(Boolean.TRUE);
            AnalyticsBridge.getInstance().reportDisableInterceptEvent();
        }
        if (z2) {
            if (!z3 || this.i) {
                a(u1.b.enableIntercept);
            } else {
                l();
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void a(ConfigurationContract configurationContract) throws JSONException {
        if (configurationContract == null || configurationContract.getTargetRuleEngine() == null) {
            return;
        }
        if (configurationContract.getTargetRuleEngine().getUrl() == null && configurationContract.getTargetRuleEngine().getVersion() == null) {
            return;
        }
        this.c = false;
        if (configurationContract.getSdkConfiguration() != null && configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() != null) {
            this.m = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isCanBlockAfterOneSuccess();
            this.n = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isEvaluateWithConfigurationFile();
        }
        if (!this.n) {
            this.f = configurationContract.toJsonString();
        }
        if (c(configurationContract.getTargetRuleEngine())) {
            a(u1.b.updateConfiguration);
            e();
            return;
        }
        this.g = i();
        if (!c(configurationContract.getTargetRuleEngine())) {
            a(configurationContract.getTargetRuleEngine());
        } else {
            e();
            a(u1.b.updateConfiguration);
        }
    }

    public void a(TargetRuleEngineContract targetRuleEngineContract) {
        if (targetRuleEngineContract == null) {
            return;
        }
        s4.f().a(true, targetRuleEngineContract.getUrl(), b(targetRuleEngineContract), (n6<File>) new d(targetRuleEngineContract));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.medallia.digital.mobilesdk.j7
    public synchronized void a(u1.b bVar) {
        if (u1.a(bVar).contains(u1.d.FOREGROUND)) {
            if (!this.i) {
                a4.b("Intercept is not enabled, evaluate won't run");
                return;
            }
            if (this.m && this.c) {
                a4.b("Skip evaluation intercept was already shown in session");
                return;
            }
            if (!g2.d(this.g)) {
                a4.c("Target engine is missing");
                return;
            }
            x7 x7Var = this.b;
            if (x7Var == null) {
                a4.c("Throttle is null");
                return;
            }
            x7Var.a((x7) bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file) throws JSONException {
        ArrayList<Pair<String, Boolean>> arrayListA = g2.a(t, file);
        if (arrayListA != null) {
            Iterator<Pair<String, Boolean>> it = arrayListA.iterator();
            while (it.hasNext()) {
                Pair<String, Boolean> next = it.next();
                if (next != null) {
                    AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) next.first, ((Boolean) next.second).booleanValue());
                }
            }
        }
        d7.b().b(d7.a.TARGET_ENGINE, (String) null);
    }

    public void a(File file, TargetRuleEngineContract targetRuleEngineContract) {
        if (targetRuleEngineContract == null || !g2.d(file)) {
            return;
        }
        d7.b().b(d7.a.TARGET_ENGINE, targetRuleEngineContract.toJsonString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        EvaluationResult evaluationResultCreateEvaluationResult;
        a4.b(str);
        t1 t1Var = new t1(Long.valueOf(System.currentTimeMillis()), new Throwable().getStackTrace()[2].getMethodName());
        try {
            try {
                evaluationResultCreateEvaluationResult = ModelFactory.getInstance().createEvaluationResult(str);
            } catch (Exception e) {
                t1Var.b = System.currentTimeMillis();
                t1Var.d = e.getMessage();
                Locale locale = Locale.US;
                a4.c("[" + t1Var.f16708a + "] - [" + t1Var.b + "] failure: Evaluate crashed with exception. Message : " + t1Var.d);
            }
            if (evaluationResultCreateEvaluationResult == null) {
                throw new Exception("Parsing result failed");
            }
            t1Var.b = System.currentTimeMillis();
            t1Var.d = str;
            this.e = evaluationResultCreateEvaluationResult.getNextEvaluationTime();
            if (evaluationResultCreateEvaluationResult.getEngagementId() != null) {
                Locale locale2 = Locale.US;
                a4.b("[" + t1Var.f16708a + "] - [" + t1Var.b + "] success: Calling InterceptProducer - with engagement id: " + evaluationResultCreateEvaluationResult.getEngagementId());
                this.c = true;
                c3.d().b(evaluationResultCreateEvaluationResult.getEngagementId(), evaluationResultCreateEvaluationResult.getEngagementType(), System.currentTimeMillis());
            } else if (this.e != null) {
                Locale locale3 = Locale.US;
                a4.b("[" + t1Var.f16708a + "] - [" + t1Var.b + "] success: Calling evaluate with timestamp " + this.e);
                j();
            }
            a(evaluationResultCreateEvaluationResult.getEngagementId(), str, this.j);
            this.h.add(t1Var);
            d();
        } catch (Throwable th) {
            this.h.add(t1Var);
            d();
            throw th;
        }
    }

    private void a(String str, String str2, u1.b bVar) throws JSONException {
        j2 j2VarC = r2.e().c(str);
        AnalyticsBridge analyticsBridge = AnalyticsBridge.getInstance();
        long j = this.f16596a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j2VarC == null) {
            str = null;
        }
        analyticsBridge.reportTargetEvaluatorEvent(j, jCurrentTimeMillis, str, j2VarC != null ? j2VarC.c() : null, str2, bVar.name());
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void a(boolean z) {
        this.l = z;
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void a(boolean z, boolean z2) {
        this.i = z;
        this.l = z2;
    }
}
