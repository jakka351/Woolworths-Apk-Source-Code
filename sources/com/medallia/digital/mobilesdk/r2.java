package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.InviteData;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.j2;
import com.medallia.digital.mobilesdk.m6;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class r2 implements m8 {
    private static r2 y;
    protected String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private Long g;
    private boolean h;
    private y3 l;
    private String m;
    private String n;
    private boolean o;
    private g u;
    private boolean w;
    private String x;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    protected LinkedHashMap<String, j2> p = new LinkedHashMap<>();
    protected List<ResourceContract> q = new ArrayList();
    protected List<ResourceContract> r = new ArrayList();
    private HashMap<String, Boolean> s = new HashMap<>();
    private HashMap<String, h2> t = new HashMap<>();
    protected LinkedHashMap<String, q> v = new LinkedHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    protected s2 f16653a = new s2();

    public class a implements m6.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f16654a;

        public a(f fVar) {
            this.f16654a = fVar;
        }

        @Override // com.medallia.digital.mobilesdk.m6.b
        public void a(ResourceContract resourceContract) {
            f fVar;
            r2.this.r.remove(resourceContract);
            if (r2.this.r.isEmpty() && (fVar = this.f16654a) != null) {
                fVar.a(null);
            }
            a4.b("finished downloading localization resource");
        }

        @Override // com.medallia.digital.mobilesdk.m6.b
        public void b(ResourceContract resourceContract) {
            f fVar;
            r2.this.r.remove(resourceContract);
            if (!r2.this.r.isEmpty() || (fVar = this.f16654a) == null) {
                return;
            }
            fVar.a(null);
        }
    }

    public class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f16655a;
        final /* synthetic */ String b;

        public b(f fVar, String str) {
            this.f16655a = fVar;
            this.b = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws IOException {
            boolean z;
            g2.h(r2.this.m);
            if (r2.this.l == null) {
                f fVar = this.f16655a;
                if (fVar != null) {
                    fVar.a();
                }
                a4.e("UpdateCustomLocale = Missing localizationContract, isSuccess = false");
                return;
            }
            String strA = x3.e().a(this.b, r2.this.l.a());
            if (strA == null) {
                strA = r2.this.l.b();
                z = false;
            } else {
                z = true;
            }
            r2 r2Var = r2.this;
            String strA2 = r2Var.a(strA, r2Var.l);
            String str = "";
            if (strA2 == null) {
                a4.c("");
                f fVar2 = this.f16655a;
                if (fVar2 != null) {
                    fVar2.a();
                }
                a4.e("UpdateCustomLocale = Failed unzip translation isSuccess = false");
                return;
            }
            String strG = g2.g(strA2);
            if (TextUtils.isEmpty(strG)) {
                f fVar3 = this.f16655a;
                if (fVar3 != null) {
                    fVar3.a();
                    return;
                }
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(strG);
                r2.this.b(new PropertyConfigurationContract(jSONObject));
                f fVar4 = this.f16655a;
                if (fVar4 != null) {
                    fVar4.a(jSONObject);
                }
                a4.e("updateCustomLocale = " + x3.e().b() + ", isSuccess = true");
                if (!z) {
                    str = "Language not available. Language fallback logic applied";
                }
                Broadcasts.f.a(str);
            } catch (Exception e) {
                f fVar5 = this.f16655a;
                if (fVar5 != null) {
                    fVar5.a();
                }
                a4.e("UpdateCustomLocale = Cant parse property configuration from localization:" + e.getMessage() + ", isSuccess = false");
                Broadcasts.f.a(new MDExternalError(MDExternalError.ExternalError.TRANSLATION_INVALID_FORMAT));
            }
        }
    }

    public class c implements m6.b {
        public c() {
        }

        @Override // com.medallia.digital.mobilesdk.m6.b
        public void a(ResourceContract resourceContract) throws JSONException {
            r2.this.q.remove(resourceContract);
            if (r2.this.h()) {
                r2.this.j();
            }
            a4.b("finished downloading global resources");
        }

        @Override // com.medallia.digital.mobilesdk.m6.b
        public void b(ResourceContract resourceContract) {
            if (r2.this.t != null) {
                for (Map.Entry entry : r2.this.t.entrySet()) {
                    if (entry.getValue() != null) {
                        ((h2) entry.getValue()).a();
                        r2.this.t.put((String) entry.getKey(), null);
                    }
                }
                r2.this.t = null;
            }
        }
    }

    public class d implements n2 {
        public d() {
        }

        @Override // com.medallia.digital.mobilesdk.n2
        public void a(j2 j2Var) throws JSONException {
            j2 j2Var2;
            h2 h2Var;
            if (j2Var == null) {
                return;
            }
            r2.this.p.put(j2Var.getFormId(), j2Var);
            if (j2Var.getFormType() == FormTriggerType.code) {
                a4.e("Code Form " + j2Var.getFormId() + " is ready to be shown");
                Broadcasts.d.a(Broadcasts.d.a.codeFormReady, j2Var.getFormId(), j2Var.getFormType(), j2Var.getFormViewType());
            }
            if (j2Var.getFormId().equals(r2.this.n)) {
                r2.this.n = null;
                j2Var2 = j2Var;
                y8.b().a(j2Var2, null, j2Var.l() ? MedalliaWebView.f.preload : MedalliaWebView.f.showForm, Boolean.FALSE, Boolean.TRUE);
                AnalyticsBridge.getInstance().reportLoadingIndicatorCompletedEvent(j2Var2.getFormId(), j2Var2.getFormType(), j2Var2.getFormViewType());
            } else {
                j2Var2 = j2Var;
            }
            if (r2.this.t == null || (h2Var = (h2) r2.this.t.get(j2Var2.getFormId())) == null) {
                return;
            }
            h2Var.onSuccess();
            r2.this.t.put(j2Var2.getFormId(), null);
        }
    }

    public interface f<T> {
        void a();

        void a(T t);
    }

    public interface g {
        void a();
    }

    private r2() {
    }

    private void i(j2 j2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (j2Var == null || sDKConfigurationFormContract == null) {
            return;
        }
        j2Var.a(sDKConfigurationFormContract);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() throws JSONException {
        this.f16653a.a(this.o);
        this.f16653a.a(this.p, new d());
        g gVar = this.u;
        if (gVar != null) {
            gVar.a();
        }
    }

    public q b(String str) {
        LinkedHashMap<String, q> linkedHashMap = this.v;
        if (linkedHashMap == null || str == null) {
            return null;
        }
        return linkedHashMap.get(str);
    }

    public j2 c(String str) {
        LinkedHashMap<String, j2> linkedHashMap = this.p;
        if (linkedHashMap == null || str == null) {
            return null;
        }
        return linkedHashMap.get(str);
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a4.a("Forms");
        y = null;
    }

    public String d(String str) {
        p7 p7Var = (p7) f1.a().b(b0.a.Template, str);
        if (p7Var == null) {
            return null;
        }
        return p7Var.b() + " : " + p7Var.a();
    }

    public j2 e(String str) {
        if (str == null) {
            return null;
        }
        return (j2) f1.a().b(b0.a.FormData, str);
    }

    public ArrayList<j2> f() {
        if (this.p == null) {
            return null;
        }
        ArrayList<j2> arrayList = new ArrayList<>();
        Iterator<Map.Entry<String, j2>> it = this.p.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public HashMap<String, Boolean> g() {
        return this.s;
    }

    public boolean h() {
        List<ResourceContract> list = this.q;
        return list == null || list.isEmpty();
    }

    public void k() throws JSONException {
        c();
        List<ResourceContract> list = this.q;
        if (list == null || list.isEmpty()) {
            j();
        } else {
            new m6(this.q, true, new c());
        }
    }

    public class e implements f<Void> {
        public e() {
        }

        @Override // com.medallia.digital.mobilesdk.r2.f
        public void a() throws JSONException {
            r2.this.k();
        }

        @Override // com.medallia.digital.mobilesdk.r2.f
        public void a(Void r1) throws JSONException {
            r2.this.k();
        }
    }

    private j2 a(SDKConfigurationFormContract sDKConfigurationFormContract) throws JSONException {
        j2 j2VarE = e(sDKConfigurationFormContract.getFormId());
        if (j2VarE == null) {
            j2VarE = new j2(sDKConfigurationFormContract);
        } else {
            boolean zA = a(j2VarE, sDKConfigurationFormContract);
            i(j2VarE, sDKConfigurationFormContract);
            boolean z = false;
            boolean z2 = j2VarE.getUrlVersion().equals("V2") && j2VarE.n() != this.w;
            if (j2VarE.getUrlVersion().equals("V2") && this.w) {
                z = true;
            }
            j2VarE.d(z);
            boolean zA2 = a(j2VarE.f(), sDKConfigurationFormContract.getResources());
            if (b(sDKConfigurationFormContract) && zA2 && zA && !z2) {
                j2VarE.a(j2.a.AVAILABLE);
            } else {
                j2VarE.a(j2.a.IN_PROGRESS);
                if (!zA2) {
                    j2VarE.a(sDKConfigurationFormContract.getResources());
                }
                j2VarE.d(sDKConfigurationFormContract.getTemplateRemoteUrl());
                j2VarE.c(sDKConfigurationFormContract.getTemplateLocalUrl());
            }
        }
        ConfigurationContract configurationContractA = t0.c().a();
        if (configurationContractA != null && configurationContractA.sdkConfiguration.getFormConfigurations().getRedirectLinks() != null) {
            j2VarE.a(configurationContractA.sdkConfiguration.getFormConfigurations().getRedirectLinks());
        }
        if (configurationContractA != null && configurationContractA.sdkConfiguration.getMedalliaDigitalClientConfig().getBlockNetworkInForm() != null) {
            j2VarE.a(configurationContractA.sdkConfiguration.getMedalliaDigitalClientConfig().getBlockNetworkInForm().booleanValue());
        }
        return j2VarE;
    }

    public static r2 e() {
        if (y == null) {
            y = new r2();
        }
        return y;
    }

    private boolean f(j2 j2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        return j2Var.isPoweredByVisible() == sDKConfigurationFormContract.isPoweredByVisible();
    }

    private boolean g(j2 j2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        return j2Var.l() == sDKConfigurationFormContract.isPreloaded();
    }

    private boolean h(j2 j2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (j2Var.g() == null && sDKConfigurationFormContract.getTemplateLocalUrl() == null) {
            return true;
        }
        return (j2Var.g() == null || TextUtils.isEmpty(sDKConfigurationFormContract.getTemplateLocalUrl()) || !j2Var.g().contains(sDKConfigurationFormContract.getTemplateLocalUrl())) ? false : true;
    }

    public File c(j2 j2Var) {
        if (j2Var == null) {
            return null;
        }
        String str = "var formJson = " + j2Var.a() + "; var kpl_formJson = formJson;";
        StringBuilder sb = new StringBuilder("kplConfig.submitUrlPrefix = \"");
        sb.append(this.e);
        sb.append("\";kplConfig.submitUrlSuffix = \"");
        g2.a(this.d, YU.a.o(sb, this.f, "\";"));
        a4.b("Form data prepared");
        return g2.a(j2Var.l() ? this.c : this.b, str);
    }

    public ArrayList<ResourceContract> d() {
        ArrayList<? extends b0> arrayListC = f1.a().c(b0.a.Resource, new Object[0]);
        ArrayList<ResourceContract> arrayList = new ArrayList<>();
        Iterator<? extends b0> it = arrayListC.iterator();
        while (it.hasNext()) {
            ResourceContract resourceContract = (ResourceContract) it.next();
            if (TextUtils.isEmpty(resourceContract.getFormId())) {
                arrayList.add(resourceContract);
            }
        }
        return arrayList;
    }

    public boolean i() {
        return this.i;
    }

    public void b() {
        LinkedHashMap<String, j2> linkedHashMap = this.p;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
        LinkedHashMap<String, q> linkedHashMap2 = this.v;
        if (linkedHashMap2 != null) {
            linkedHashMap2.clear();
        }
        List<ResourceContract> list = this.q;
        if (list != null) {
            list.clear();
        }
        List<ResourceContract> list2 = this.r;
        if (list2 != null) {
            list2.clear();
        }
    }

    public boolean f(String str) {
        j2 j2Var = this.p.get(str);
        if (j2Var != null && j2Var.c() == j2.a.AVAILABLE) {
            return false;
        }
        j2 j2VarC = c(str);
        s2 s2Var = this.f16653a;
        if (s2Var == null || j2VarC == null) {
            return false;
        }
        return s2Var.b(j2VarC);
    }

    private boolean d(j2 j2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (j2Var.getFormType() == null && sDKConfigurationFormContract.getFormType() == null) {
            return true;
        }
        return j2Var.getFormType() != null && j2Var.getFormType().equals(sDKConfigurationFormContract.getFormType());
    }

    private boolean e(j2 j2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        if ((j2Var.getFormViewType() == null || j2Var.getFormViewType() == FormViewType.none) && sDKConfigurationFormContract.getFormViewType() == null) {
            return true;
        }
        return j2Var.getFormViewType() != null && j2Var.getFormViewType().equals(sDKConfigurationFormContract.getFormViewType());
    }

    public void b(ConfigurationContract configurationContract) {
        a4.b("LoadForms - start updating forms");
        if (configurationContract == null || configurationContract.getPropertyConfiguration() == null) {
            return;
        }
        y8.b().a(configurationContract);
        if (configurationContract.getSdkConfiguration() != null) {
            SDKConfigurationContract sdkConfiguration = configurationContract.getSdkConfiguration();
            if (sdkConfiguration.getFormConfigurations() != null) {
                this.g = sdkConfiguration.getFormConfigurations().getLoadFormIndicatorDelay();
                this.h = sdkConfiguration.getFormConfigurations().isVulnEnabled();
                this.j = sdkConfiguration.getFormConfigurations().isInheritOrientation();
                this.o = sdkConfiguration.getFormConfigurations().isFormsIterativeLoadingEnabled();
            }
            if (sdkConfiguration.getMedalliaDigitalBrain() != null) {
                this.k = sdkConfiguration.getMedalliaDigitalBrain().isRemoveTaskContainingFormActivityOnly();
            }
            if (sdkConfiguration.getMedalliaDigitalClientConfig() != null) {
                MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfig = sdkConfiguration.getMedalliaDigitalClientConfig();
                this.f = medalliaDigitalClientConfig.getSubmitUrlSuffix();
                this.e = medalliaDigitalClientConfig.getSubmitUrlPrefix();
            }
        }
        this.l = configurationContract.getLocalization();
    }

    public String a(String str, y3 y3Var) {
        if (str == null || y3Var == null) {
            return null;
        }
        return y3Var.c().replace(y3Var.d(), str);
    }

    public void b(PropertyConfigurationContract propertyConfigurationContract) throws JSONException {
        boolean zC = c(propertyConfigurationContract);
        boolean zA = a(propertyConfigurationContract);
        if (zC || zA) {
            a(new e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(j2 j2Var) throws JSONException {
        if (this.n != null) {
            this.n = null;
            a(false);
            AnalyticsBridge.getInstance().reportLoadingIndicatorTimeoutEvent(j2Var.getFormId(), j2Var.getFormType(), j2Var.getFormViewType());
        }
    }

    private void a() throws JSONException {
        ArrayList<? extends b0> arrayListC = f1.a().c(b0.a.Template, new Object[0]);
        if (arrayListC != null) {
            Iterator<? extends b0> it = arrayListC.iterator();
            while (it.hasNext()) {
                p7 p7Var = (p7) it.next();
                f1.a().a(p7Var);
                a(p7Var.a());
            }
        }
        ArrayList<? extends b0> arrayListC2 = f1.a().c(b0.a.Resource, new Object[0]);
        if (arrayListC2 != null) {
            Iterator<? extends b0> it2 = arrayListC2.iterator();
            while (it2.hasNext()) {
                ResourceContract resourceContract = (ResourceContract) it2.next();
                if (f1.a().a(resourceContract)) {
                    a(resourceContract.getLocalUrl());
                }
            }
        }
        ArrayList<? extends b0> arrayListC3 = f1.a().c(b0.a.FormData, new Object[0]);
        if (arrayListC3 != null) {
            Iterator<? extends b0> it3 = arrayListC3.iterator();
            while (it3.hasNext()) {
                f1.a().a((j2) it3.next());
            }
        }
        g2.b("localization.zip");
    }

    public boolean b(SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (TextUtils.isEmpty(sDKConfigurationFormContract.getTemplateRemoteUrl()) || TextUtils.isEmpty(sDKConfigurationFormContract.getTemplateLocalUrl())) {
            return true;
        }
        p7 p7Var = (p7) f1.a().b(b0.a.Template, sDKConfigurationFormContract.getTemplateRemoteUrl());
        return p7Var != null && p7Var.b().equals(sDKConfigurationFormContract.getTemplateRemoteUrl());
    }

    public void c() throws JSONException {
        List<ResourceContract> list = this.q;
        if (list == null || list.isEmpty()) {
            if (f1.a().a(b0.a.Resource, Boolean.TRUE)) {
                g2.a("resources");
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        for (ResourceContract resourceContract : this.q) {
            map.put(resourceContract.getRemoteUrl(), resourceContract);
        }
        ArrayList<? extends b0> arrayListC = f1.a().c(b0.a.Resource, Boolean.TRUE);
        if (arrayListC != null) {
            Iterator<? extends b0> it = arrayListC.iterator();
            while (it.hasNext()) {
                ResourceContract resourceContract2 = (ResourceContract) it.next();
                if (map.get(resourceContract2.getRemoteUrl()) == null && f1.a().a(resourceContract2)) {
                    a(resourceContract2.getLocalUrl());
                    a4.b("Cleaned global resource: " + resourceContract2.getLocalUrl());
                }
            }
        }
    }

    private boolean b(j2 j2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (j2Var.getInviteData() == null && sDKConfigurationFormContract.getInviteData() == null) {
            return true;
        }
        return (j2Var.getInviteData() == null || sDKConfigurationFormContract.getInviteData() == null || !j2Var.getInviteData().equals(sDKConfigurationFormContract.getInviteData())) ? false : true;
    }

    public void a(ConfigurationContract configurationContract) {
        a(configurationContract, true, false, null);
    }

    public void a(ConfigurationContract configurationContract, boolean z, boolean z2, g gVar) {
        this.u = gVar;
        this.w = z2;
        b(configurationContract);
    }

    public boolean c(PropertyConfigurationContract propertyConfigurationContract) throws JSONException {
        LinkedHashMap<String, j2> linkedHashMap = this.p;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
        LinkedHashMap<String, q> linkedHashMap2 = this.v;
        if (linkedHashMap2 != null) {
            linkedHashMap2.clear();
        }
        this.d = propertyConfigurationContract.getGlobalConfigurationFileLocalUrl();
        this.b = propertyConfigurationContract.getFormJsonFileLocalUrl();
        this.c = propertyConfigurationContract.getPreloadFormJsonFileLocalUrl();
        this.s = propertyConfigurationContract.getProvisions();
        this.q = propertyConfigurationContract.getGlobalResources();
        if (x3.e().j()) {
            Broadcasts.f.a(x3.e().a(x3.e().c(), this.l.a()) == null ? "PreInit Language not available. Language fallback logic applied" : "PreInit");
            a4.e(YU.a.o(new StringBuilder("pre init updateCustomLocale = "), x3.e().b(), ", isSuccess = true"));
        }
        List<SDKConfigurationFormContract> forms = propertyConfigurationContract.getForms();
        if (forms == null || forms.isEmpty()) {
            a();
            this.i = true;
            return false;
        }
        Iterator<SDKConfigurationFormContract> it = forms.iterator();
        while (it.hasNext()) {
            j2 j2VarA = a(it.next());
            this.p.put(j2VarA.getFormId(), j2VarA);
        }
        this.i = true;
        return true;
    }

    private void a(MDExternalError.ExternalError externalError, MDResultCallback mDResultCallback) throws JSONException {
        if (externalError != null) {
            a4.c(externalError.getMessage());
            if (mDResultCallback != null) {
                mDResultCallback.onError(new MDExternalError(externalError));
            }
            AnalyticsBridge.getInstance().reportShowFormCallbackEvent(AnalyticsBridge.c.failure, Integer.valueOf(externalError.getErrorCode()), externalError.getMessage());
        }
    }

    private void a(final j2 j2Var, MDResultCallback mDResultCallback) throws JSONException {
        long loadingIndicatorTimeout;
        boolean zIsShowUnavailableForms;
        ConfigurationContract configurationContractA = t0.c().a();
        if (configurationContractA == null || configurationContractA.getSdkConfiguration() == null || configurationContractA.getSdkConfiguration().getFormConfigurations() == null) {
            loadingIndicatorTimeout = 0;
            zIsShowUnavailableForms = false;
        } else {
            zIsShowUnavailableForms = configurationContractA.getSdkConfiguration().getFormConfigurations().isShowUnavailableForms();
            loadingIndicatorTimeout = configurationContractA.getSdkConfiguration().getFormConfigurations().getLoadingIndicatorTimeout();
        }
        if (!zIsShowUnavailableForms) {
            a(MDExternalError.ExternalError.FORM_IS_NOT_AVAILABLE, mDResultCallback);
            return;
        }
        this.n = j2Var.getFormId();
        a(j2Var, false, mDResultCallback);
        AnalyticsBridge.getInstance().reportLoadingIndicatorShownEvent(j2Var.getFormId(), j2Var.getFormType(), j2Var.getFormViewType());
        new Handler().postDelayed(new Runnable() { // from class: com.medallia.digital.mobilesdk.d9
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                this.d.b(j2Var);
            }
        }, loadingIndicatorTimeout);
    }

    private void a(j2 j2Var, boolean z, MDResultCallback mDResultCallback) throws JSONException {
        if (!a(j2Var) && LifeCycle.b().e()) {
            a(MDExternalError.ExternalError.FORM_IS_ALREADY_DISPLAYED, mDResultCallback);
            return;
        }
        c(j2Var);
        if (j2Var.l() && y8.b().c(MedalliaWebView.f.preload) == null) {
            a4.c("Preload form wasn't loaded yet");
        }
        y8.b().a(j2Var, null, j2Var.l() ? MedalliaWebView.f.preload : MedalliaWebView.f.showForm, Boolean.TRUE, Boolean.valueOf(z));
        Intent intent = new Intent(i4.c().b(), (Class<?>) (j2Var.getFormViewType() == FormViewType.modal ? MedalliaModalFormActivity.class : MedalliaFullFormActivity.class));
        intent.addFlags(268435456);
        intent.putExtra("com.medallia.digital.mobilesdk.form_data", j2Var);
        intent.putExtra("com.medallia.digital.mobilesdk.is_show_form", true);
        intent.putExtra("com.medallia.digital.mobilesdk.is_form_available", z);
        intent.putExtra("com.medallia.digital.mobilesdk.spinner_delay", this.g);
        intent.putExtra("com.medallia.digital.mobilesdk.vuln_enabled", this.h);
        intent.putExtra("com.medallia.digital.mobilesdk.inherit_orientation", this.j);
        intent.putExtra("com.medallia.digital.mobilesdk.remove_task", this.k);
        i4.c().b().startActivity(intent);
        a4.e("Form shown successfully");
        if (mDResultCallback != null) {
            mDResultCallback.onSuccess();
        }
        AnalyticsBridge.getInstance().reportShowFormCallbackEvent(AnalyticsBridge.c.success, null, null);
    }

    public void a(f<Void> fVar) {
        y3 y3Var = this.l;
        if (y3Var == null || y3Var.e() == null || this.l.e().getRemoteUrl() == null) {
            if (fVar != null) {
                fVar.a();
                return;
            }
            return;
        }
        this.r = new ArrayList();
        if (this.l.e() != null) {
            this.r.add(this.l.e());
            this.m = this.l.e().getLocalUrl();
        }
        if (this.l.f() != null) {
            this.r.add(this.l.f());
        }
        if (!this.r.isEmpty()) {
            new m6(this.r, new a(fVar));
        } else if (fVar != null) {
            fVar.a();
        }
    }

    private void a(String str) throws JSONException {
        Boolean boolB = g2.b(str);
        if (boolB != null) {
            AnalyticsBridge.getInstance().reportDeleteStorageEvent(str, boolB.booleanValue());
        }
    }

    private boolean c(j2 j2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (j2Var.a() == null && sDKConfigurationFormContract.getFormJson() == null) {
            return true;
        }
        if (TextUtils.isEmpty(j2Var.a()) && sDKConfigurationFormContract.getFormJson() != null && sDKConfigurationFormContract.getFormJson().length() == 0) {
            return true;
        }
        return (j2Var.a() == null || sDKConfigurationFormContract.getFormJson() == null || j2Var.a().compareTo(sDKConfigurationFormContract.getFormJson().toString()) != 0) ? false : true;
    }

    public void a(String str, MDResultCallback mDResultCallback) throws JSONException {
        LinkedHashMap<String, j2> linkedHashMap = this.p;
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            j2 j2Var = this.p.get(str);
            this.x = str;
            if (j2Var != null && j2Var.c() != j2.a.NOT_EXISTS) {
                if (j2Var.c() == j2.a.NOT_STARTED) {
                    f(str);
                    a(j2Var, mDResultCallback);
                    return;
                } else if (j2Var.c() == j2.a.IN_PROGRESS) {
                    a(j2Var, mDResultCallback);
                    return;
                } else if (j2Var.c() == j2.a.FAILED) {
                    a(MDExternalError.ExternalError.FORM_IS_NOT_AVAILABLE, mDResultCallback);
                    return;
                } else {
                    if (j2Var.c() == j2.a.AVAILABLE) {
                        a(j2Var, true, mDResultCallback);
                        return;
                    }
                    return;
                }
            }
        }
        a(MDExternalError.ExternalError.FORM_NOT_EXISTS_OR_NOT_PUBLISH, mDResultCallback);
    }

    public void a(String str, h2 h2Var) {
        if (!f(str)) {
            h2Var.onSuccess();
            return;
        }
        this.t.put(str, h2Var);
        a4.e("Promoting form: " + str);
    }

    public void a(String str, f<JSONObject> fVar) {
        if (this.m != null) {
            w7.b().a().execute(new b(fVar, str));
            return;
        }
        if (fVar != null) {
            fVar.a();
        }
        a4.e("UpdateCustomLocale = localizationFilePath is missing, isSuccess = false");
    }

    private boolean a(PropertyConfigurationContract propertyConfigurationContract) {
        if (propertyConfigurationContract == null) {
            return false;
        }
        List<AppRatingContract> appRatings = propertyConfigurationContract.getAppRatings();
        LinkedHashMap<String, q> linkedHashMap = this.v;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        } else {
            this.v = new LinkedHashMap<>();
        }
        if (appRatings == null || appRatings.isEmpty()) {
            return false;
        }
        Iterator<AppRatingContract> it = appRatings.iterator();
        while (it.hasNext()) {
            q qVar = new q(it.next());
            this.v.put(qVar.a(), qVar);
        }
        return true;
    }

    public boolean a(j2 j2Var) {
        if (j2Var.getFormType() != FormTriggerType.mobileInvitation || j2Var.getInviteData() == null) {
            return false;
        }
        return j2Var.getInviteData().getType() == InviteData.a.PUSH_NOTIFICATION || j2Var.getInviteData().getType() == InviteData.a.LOCAL_NOTIFICATION;
    }

    public boolean a(j2 j2Var, SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (j2Var != null && sDKConfigurationFormContract != null) {
            boolean zH = h(j2Var, sDKConfigurationFormContract);
            boolean zA = a(j2Var.getTitle(), sDKConfigurationFormContract.getTitle());
            boolean zA2 = a(j2Var.getTitleBackgroundColor(), sDKConfigurationFormContract.getTitleBackgroundColor());
            boolean zA3 = a(j2Var.getTitleTextColor(), sDKConfigurationFormContract.getTitleTextColor());
            boolean zC = c(j2Var, sDKConfigurationFormContract);
            boolean zD = d(j2Var, sDKConfigurationFormContract);
            boolean zE = e(j2Var, sDKConfigurationFormContract);
            boolean zB = b(j2Var, sDKConfigurationFormContract);
            boolean zG = g(j2Var, sDKConfigurationFormContract);
            boolean zF = f(j2Var, sDKConfigurationFormContract);
            if (zH && zA && zA2 && zA3 && zC && zD && zE && zB && zG && zF) {
                return true;
            }
        }
        return false;
    }

    private boolean a(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        return str != null && str.equals(str2);
    }

    public boolean a(List<ResourceContract> list, List<ResourceContract> list2) throws JSONException {
        if (list == null || list.isEmpty()) {
            return list2 == null || list2.isEmpty();
        }
        if (list2 == null) {
            for (ResourceContract resourceContract : list) {
                f1.a().a(resourceContract);
                a(resourceContract.getLocalUrl());
            }
            return true;
        }
        if (list2.size() > list.size()) {
            return false;
        }
        HashMap map = new HashMap();
        for (ResourceContract resourceContract2 : list2) {
            map.put(resourceContract2.getRemoteUrl(), resourceContract2);
        }
        for (ResourceContract resourceContract3 : list) {
            ResourceContract resourceContract4 = (ResourceContract) map.get(resourceContract3.getRemoteUrl());
            if (resourceContract4 == null) {
                f1.a().a(resourceContract3);
                a(resourceContract3.getLocalUrl());
            } else if (resourceContract4.getChecksum() != null && resourceContract4.getChecksum().equals(resourceContract3.getChecksum())) {
                map.remove(resourceContract3.getRemoteUrl());
            }
        }
        return map.isEmpty();
    }

    public boolean a(boolean z) {
        try {
            Activity activity = (Activity) i4.c().d().getBaseContext();
            if (activity == null || (!activity.getClass().getName().equals("com.medallia.digital.mobilesdk.MedalliaModalFormActivity") && !activity.getClass().getName().equals("com.medallia.digital.mobilesdk.MedalliaFullFormActivity"))) {
                a4.e("Form activity is not opened");
                return false;
            }
            activity.finish();
            if (z) {
                AnalyticsBridge.getInstance().reportCloseEngagementEvent(MDEngagementType.form.toString(), z2.FORM.toString(), this.x);
            }
            a4.e("Form Closed successfully");
            return true;
        } catch (Exception e2) {
            a4.e(YU.a.f(e2, new StringBuilder("Unable to close form at this stage. Message: ")));
            return false;
        }
    }
}
