package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.e3;
import com.medallia.digital.mobilesdk.f2;
import com.medallia.digital.mobilesdk.j0;
import com.medallia.digital.mobilesdk.j8;
import com.medallia.digital.mobilesdk.r2;
import com.medallia.digital.mobilesdk.u1;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class r4 implements LifeCycle.g, m8, u8 {
    private static final long s = 2000;
    private long d;
    private final g0 h;
    private final h0 i;
    private final MedalliaExceptionHandler m;
    private boolean n;
    private boolean o;
    private Boolean p;
    private boolean q;
    private boolean r;

    /* renamed from: a, reason: collision with root package name */
    private boolean f16660a = false;
    private boolean b = false;
    private MDSdkFrameworkType c = MDSdkFrameworkType.Native;
    private boolean e = false;
    private boolean f = false;
    private final j0 g = new j0();
    private y6 j = new y6();
    private final f2 k = new f2();
    private final m3 l = new m3();

    /* loaded from: classes6.dex */
    public class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDCallback f16661a;
        final /* synthetic */ String b;

        public a(MDCallback mDCallback, String str) {
            this.f16661a = mDCallback;
            this.b = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f16661a.onSuccess(this.b);
        }
    }

    public class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f16662a;

        public b(MDResultCallback mDResultCallback) {
            this.f16662a = mDResultCallback;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f16662a.onSuccess();
        }
    }

    public class c implements n6<u0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f16663a;

        public c(MDResultCallback mDResultCallback) {
            this.f16663a = mDResultCallback;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) throws JSONException {
            r4.this.a(h4Var, this.f16663a);
            r4.this.clearAndDisconnect();
            r4.this.e = false;
            r4.this.h.a(r4.this.f16660a, r4.this.e);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(u0 u0Var) {
            if (u0Var == null || u0Var.a() == null) {
                r4.this.a(new MDExternalError(MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_16), this.f16663a);
                return;
            }
            ConfigurationContract configurationContractA = u0Var.a();
            PropertyConfigurationContract propertyConfigurationContract = configurationContractA.propertyConfiguration;
            if (propertyConfigurationContract != null && propertyConfigurationContract.getPropertyType() != null && !configurationContractA.propertyConfiguration.getPropertyType().equalsIgnoreCase("mobileAndroid")) {
                a4.e("SDK init failed, property type: " + configurationContractA.propertyConfiguration.getPropertyType());
                r4.this.c(new MDExternalError(MDExternalError.ExternalError.WRONG_PROPERTY_TYPE), this.f16663a);
                return;
            }
            a4.e("SDK init finished successfully");
            r4.this.e = false;
            r4.this.f16660a = true;
            r4.this.h.a(r4.this.f16660a, r4.this.e);
            if (r4.this.b(configurationContractA)) {
                LifeCycle.b().k();
                r4.this.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED), this.f16663a);
            } else {
                r4.this.c(this.f16663a);
                r4.this.a(u0Var);
            }
        }
    }

    public class d implements MDResultCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConfigurationContract f16664a;

        public class a extends v4 {

            /* renamed from: com.medallia.digital.mobilesdk.r4$d$a$a, reason: collision with other inner class name */
            public class C0342a extends v4 {
                public C0342a() {
                }

                @Override // com.medallia.digital.mobilesdk.v4
                public void a() {
                    k7.b().b(d.this.f16664a);
                }
            }

            public a() {
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                w7.b().a().execute(new C0342a());
            }
        }

        public d(ConfigurationContract configurationContract) {
            this.f16664a = configurationContract;
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onError(MDExternalError mDExternalError) {
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onSuccess() {
            new Handler(Looper.getMainLooper()).postDelayed(new a(), r4.s);
        }
    }

    public class e implements n6<com.medallia.digital.mobilesdk.m> {
        public e() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(com.medallia.digital.mobilesdk.m mVar) throws JSONException {
            a4.b(YU.a.m(new StringBuilder("Analytics submission was successful - clearing "), mVar.b(), " Analytics records"));
            t8.g().a(true, Long.valueOf(mVar.d()), mVar.a());
            if (mVar.e()) {
                r4.this.n = true;
                r4.this.h();
            }
        }
    }

    public class f implements f2.b {
        public f() {
        }

        @Override // com.medallia.digital.mobilesdk.f2.b
        public void a() {
        }

        @Override // com.medallia.digital.mobilesdk.f2.b
        public void onSuccess() throws JSONException {
            r4.this.o = true;
            r4.this.h();
        }
    }

    public class g implements r2.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConfigurationContract f16669a;

        public g(ConfigurationContract configurationContract) {
            this.f16669a = configurationContract;
        }

        @Override // com.medallia.digital.mobilesdk.r2.g
        public void a() {
            r4.this.h.a(this.f16669a);
            r4.this.h.a(r2.e().f());
        }
    }

    /* loaded from: classes6.dex */
    public class i implements n6<u0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f16671a;
        final /* synthetic */ long b;

        public i(long j, long j2) {
            this.f16671a = j;
            this.b = j2;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            a4.c("Refresh session failed " + h4Var.getMessage());
            r4.this.a(AnalyticsBridge.c.failure, this.f16671a, this.b);
            r4.this.j();
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(u0 u0Var) {
            ConfigurationContract configurationContractA = u0Var.a();
            a4.e("Refresh session success");
            if (!r4.this.b(configurationContractA)) {
                r4.this.a(u0Var, this.f16671a, this.b);
                return;
            }
            CollectorsInfrastructure.getInstance().stopCollectors();
            k7.b().a(false, true);
            LifeCycle.b().k();
            a4.c("SDK functionality has been turned off");
        }
    }

    /* loaded from: classes6.dex */
    public class j implements n6<com.medallia.digital.mobilesdk.m> {
        public j() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(com.medallia.digital.mobilesdk.m mVar) throws JSONException {
            a4.b(YU.a.m(new StringBuilder("Analytics submission was successful - clearing "), mVar.b(), " Analytics records"));
            t8.g().b(true, Long.valueOf(mVar.d()), mVar.a());
            if (mVar.e()) {
                r4.this.n = true;
                r4.this.h();
            }
        }
    }

    public class k extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16673a;
        final /* synthetic */ MDResultCallback b;

        public k(String str, MDResultCallback mDResultCallback) {
            this.f16673a = str;
            this.b = mDResultCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
        @Override // com.medallia.digital.mobilesdk.v4
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a() throws org.json.JSONException {
            /*
                Method dump skipped, instructions count: 433
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.r4.k.a():void");
        }
    }

    /* loaded from: classes6.dex */
    public class l implements f2.b {
        public l() {
        }

        @Override // com.medallia.digital.mobilesdk.f2.b
        public void a() {
        }

        @Override // com.medallia.digital.mobilesdk.f2.b
        public void onSuccess() throws JSONException {
            r4.this.o = true;
            r4.this.h();
        }
    }

    /* loaded from: classes6.dex */
    public class m implements r2.g {
        public m() {
        }

        @Override // com.medallia.digital.mobilesdk.r2.g
        public void a() {
            r4.this.h.a(r2.e().f());
        }
    }

    /* loaded from: classes6.dex */
    public class o implements n6<com.medallia.digital.mobilesdk.m> {
        public o() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            r4.this.r = false;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(com.medallia.digital.mobilesdk.m mVar) {
            a4.b(YU.a.m(new StringBuilder("Analytics submission was successful - clearing "), mVar.b(), " Analytics records"));
            t8.g().a(Long.valueOf(mVar.d()), mVar.a());
            r4.this.r = false;
        }
    }

    /* loaded from: classes6.dex */
    public class p extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16678a;

        public p(String str) {
            this.f16678a = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            s8 s8VarB = s8.b();
            String str = this.f16678a;
            boolean z = true;
            s8VarB.a(str, str == null || str.isEmpty(), r4.this.f16660a);
            AnalyticsBridge analyticsBridge = AnalyticsBridge.getInstance();
            String str2 = this.f16678a;
            if (str2 != null && !str2.isEmpty()) {
                z = false;
            }
            analyticsBridge.reportSetUserIdEvent(Boolean.valueOf(z));
        }
    }

    /* loaded from: classes6.dex */
    public class q extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16679a;
        final /* synthetic */ Object b;

        public q(String str, Object obj) {
            this.f16679a = str;
            this.b = obj;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            e1.b().a(this.f16679a, this.b, r4.this.f16660a);
        }
    }

    /* loaded from: classes6.dex */
    public class r extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HashMap f16680a;

        public r(HashMap map) {
            this.f16680a = map;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            e1.b().a(this.f16680a, r4.this.f16660a);
        }
    }

    /* loaded from: classes6.dex */
    public class s extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16681a;

        public class a implements n6<com.medallia.digital.mobilesdk.m> {
            public a() {
            }

            @Override // com.medallia.digital.mobilesdk.n6
            public void a(h4 h4Var) throws JSONException {
                s sVar = s.this;
                r4.this.d(sVar.f16681a);
            }

            @Override // com.medallia.digital.mobilesdk.n6
            public void a(com.medallia.digital.mobilesdk.m mVar) throws JSONException {
                a4.b(YU.a.m(new StringBuilder("Analytics submission was successful - clearing "), mVar.b(), " Analytics records"));
                t8.g().a(Long.valueOf(mVar.d()), mVar.a());
                if (mVar.c() >= s4.f().i().b().a().intValue() || mVar.b() < s4.f().c()) {
                    s sVar = s.this;
                    r4.this.d(sVar.f16681a);
                }
            }
        }

        public s(boolean z) {
            this.f16681a = z;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            if (d7.b().a(d7.a.SDK_STOPPED, false)) {
                a4.e("SDK is already stopped");
                return;
            }
            AnalyticsBridge.getInstance().reportStopSDKEventImmediated(this.f16681a);
            new com.medallia.digital.mobilesdk.l(System.currentTimeMillis(), new a()).c();
            t8.g().a(Lifetime.Session);
            x6 x6Var = x6.f16771a;
            if (x6Var.h()) {
                x6Var.k();
            }
        }
    }

    /* loaded from: classes6.dex */
    public class t extends v4 {
        public t() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            d7 d7VarB = d7.b();
            d7.a aVar = d7.a.SDK_STOPPED;
            if (!d7VarB.a(aVar, false)) {
                a4.e("SDK is not stopped");
                return;
            }
            if (r4.this.m != null) {
                r4.this.m.register();
            }
            a4.e("SDK stop is reverting");
            d7.b().b(aVar, false);
            t8.g().b(false);
            k7.b().a(false);
            AnalyticsBridge.getInstance().reportRevertStopSdkEvent();
            d7.b().b(d7.a.MISSING_EVENTS_V2, AnalyticsBridge.getInstance().exportPendingEventsToJson());
            if (r4.this.f16660a) {
                x6 x6Var = x6.f16771a;
                if (x6Var.h() && x6Var.i()) {
                    x6Var.j();
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public class u extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f16684a;
        final /* synthetic */ MDExternalError b;

        public u(MDResultCallback mDResultCallback, MDExternalError mDExternalError) {
            this.f16684a = mDResultCallback;
            this.b = mDExternalError;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f16684a.onError(this.b);
        }
    }

    /* loaded from: classes6.dex */
    public class v extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDCallback f16685a;
        final /* synthetic */ MDExternalError b;

        public v(MDCallback mDCallback, MDExternalError mDExternalError) {
            this.f16685a = mDCallback;
            this.b = mDExternalError;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f16685a.onError(this.b);
        }
    }

    /* loaded from: classes6.dex */
    public class w extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDFailureCallback f16686a;
        final /* synthetic */ MDExternalError b;

        public w(MDFailureCallback mDFailureCallback, MDExternalError mDExternalError) {
            this.f16686a = mDFailureCallback;
            this.b = mDExternalError;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f16686a.onError(this.b);
        }
    }

    public r4() {
        g0 g0Var = new g0();
        this.h = g0Var;
        this.i = new h0(g0Var);
        MedalliaExceptionHandler medalliaExceptionHandler = new MedalliaExceptionHandler(i4.c().a());
        this.m = medalliaExceptionHandler;
        a(medalliaExceptionHandler);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(com.medallia.digital.mobilesdk.ConfigurationContract r7) {
        /*
            r6 = this;
            com.medallia.digital.mobilesdk.t0 r0 = com.medallia.digital.mobilesdk.t0.c()
            r0.a(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            if (r7 == 0) goto L43
            com.medallia.digital.mobilesdk.SDKConfigurationContract r3 = r7.getSdkConfiguration()
            if (r3 == 0) goto L43
            com.medallia.digital.mobilesdk.SDKConfigurationContract r3 = r7.getSdkConfiguration()
            com.medallia.digital.mobilesdk.CollectorsConfigurationContract r3 = r3.getCollectorsConfigurations()
            com.medallia.digital.mobilesdk.SDKConfigurationContract r4 = r7.getSdkConfiguration()
            com.medallia.digital.mobilesdk.MedalliaDigitalBrainConfigurationContract r4 = r4.getMedalliaDigitalBrain()
            if (r4 == 0) goto L41
            com.medallia.digital.mobilesdk.SDKConfigurationContract r2 = r7.getSdkConfiguration()
            com.medallia.digital.mobilesdk.MedalliaDigitalBrainConfigurationContract r2 = r2.getMedalliaDigitalBrain()
            boolean r2 = r2.isSessionPercentageSupportDouble()
            com.medallia.digital.mobilesdk.SDKConfigurationContract r4 = r7.getSdkConfiguration()
            com.medallia.digital.mobilesdk.MedalliaDigitalBrainConfigurationContract r4 = r4.getMedalliaDigitalBrain()
            boolean r4 = r4.isSkipSetUnattachedCustomParams()
            goto L45
        L41:
            r4 = r2
            goto L45
        L43:
            r3 = r1
            goto L41
        L45:
            if (r7 == 0) goto L71
            com.medallia.digital.mobilesdk.PropertyConfigurationContract r5 = r7.getPropertyConfiguration()
            if (r5 == 0) goto L71
            com.medallia.digital.mobilesdk.PropertyConfigurationContract r5 = r7.getPropertyConfiguration()
            java.util.ArrayList r5 = r5.getCustomParameters()
            if (r5 == 0) goto L5f
            com.medallia.digital.mobilesdk.PropertyConfigurationContract r0 = r7.getPropertyConfiguration()
            java.util.ArrayList r0 = r0.getCustomParameters()
        L5f:
            com.medallia.digital.mobilesdk.PropertyConfigurationContract r5 = r7.getPropertyConfiguration()
            java.lang.Integer r5 = r5.getAccountId()
            if (r5 == 0) goto L71
            com.medallia.digital.mobilesdk.PropertyConfigurationContract r1 = r7.getPropertyConfiguration()
            java.lang.Integer r1 = r1.getAccountId()
        L71:
            com.medallia.digital.mobilesdk.e1 r5 = com.medallia.digital.mobilesdk.e1.b()
            r5.a(r4, r0)
            com.medallia.digital.mobilesdk.y6 r0 = r6.j
            r0.a(r7)
            com.medallia.digital.mobilesdk.t8 r0 = com.medallia.digital.mobilesdk.t8.g()
            r0.a(r7)
            com.medallia.digital.mobilesdk.CollectorsInfrastructure r0 = com.medallia.digital.mobilesdk.CollectorsInfrastructure.getInstance()
            r0.updateConfiguration(r3, r2)
            com.medallia.digital.mobilesdk.CollectorsInfrastructure r0 = com.medallia.digital.mobilesdk.CollectorsInfrastructure.getInstance()
            r0.pollAll()
            if (r1 == 0) goto L9b
            com.medallia.digital.mobilesdk.CollectorsInfrastructure r0 = com.medallia.digital.mobilesdk.CollectorsInfrastructure.getInstance()
            r0.setAccountId(r1)
        L9b:
            com.medallia.digital.mobilesdk.p5 r0 = com.medallia.digital.mobilesdk.p5.a()
            com.medallia.digital.mobilesdk.r4$d r1 = new com.medallia.digital.mobilesdk.r4$d
            r1.<init>(r7)
            r0.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.r4.d(com.medallia.digital.mobilesdk.ConfigurationContract):void");
    }

    private void g() throws JSONException {
        try {
            File file = new File(g2.f(".crashes/crash.txt"));
            String strE = g2.e(file);
            if (strE != null) {
                if (strE.indexOf(BuildConfig.LIBRARY_PACKAGE_NAME) != -1) {
                    JSONObject jSONObject = new JSONObject(strE);
                    long j2 = jSONObject.getLong("timestamp");
                    if (!AnalyticsBridge.getInstance().reportMedalliaCrashEventImmediate(jSONObject.getString("stacktrace"), j2, d7.b().a(d7.a.SESSION_ID, UUID.randomUUID().toString()), Long.valueOf(d7.b().a(d7.a.PROPERTY_ID, -1L)))) {
                        return;
                    }
                }
                a(file);
            }
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.b = true;
        CollectorsInfrastructure.getInstance().stopCollectors();
        r2.e().b();
    }

    private void k() {
        this.j.c();
        l();
        CollectorsInfrastructure.getInstance().setSDKFramework(this.c);
    }

    private void l() {
        long jD = w2.c().a().d();
        CollectorsInfrastructure.getInstance().setPropertyId(Long.valueOf(jD));
        d7.b().b(d7.a.PROPERTY_ID, jD);
    }

    public f2 c() {
        return this.k;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        if (this.f16660a || this.f) {
            a4.a("Medallia SDK");
            this.f16660a = false;
            this.j = null;
            this.e = false;
            this.h.a(false, false);
            if (!this.f) {
                LifeCycle.b().clearAndDisconnect();
            }
            CollectorsInfrastructure.getInstance().clearAndDisconnect();
            g2.a();
            r2.e().clearAndDisconnect();
            e1.b().clearAndDisconnect();
            t8.g().clearAndDisconnect();
            s4.f().clearAndDisconnect();
            f1.a().clearAndDisconnect();
            d7.b().clearAndDisconnect();
            t4.e().clearAndDisconnect();
            AnalyticsBridge.getInstance().clearAndDisconnect();
            w2.c().clearAndDisconnect();
            s8.b().clearAndDisconnect();
            a4.e("Disconnected from Medallia SDK");
            a4.a().clearAndDisconnect();
        }
    }

    public void i() {
        w7.b().a().execute(new t());
    }

    public class h implements r2.f<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16670a;
        final /* synthetic */ ConfigurationContract b;

        public h(String str, ConfigurationContract configurationContract) {
            this.f16670a = str;
            this.b = configurationContract;
        }

        @Override // com.medallia.digital.mobilesdk.r2.f
        public void a() throws JSONException {
            r2.e().b(this.b.getPropertyConfiguration());
        }

        @Override // com.medallia.digital.mobilesdk.r2.f
        public void a(Void r2) {
            r4.this.i.a(this.f16670a);
        }
    }

    /* loaded from: classes6.dex */
    public class n implements r2.f<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16676a;
        final /* synthetic */ ConfigurationContract b;

        public n(String str, ConfigurationContract configurationContract) {
            this.f16676a = str;
            this.b = configurationContract;
        }

        @Override // com.medallia.digital.mobilesdk.r2.f
        public void a() throws JSONException {
            r2.e().b(this.b.getPropertyConfiguration());
        }

        @Override // com.medallia.digital.mobilesdk.r2.f
        public void a(Void r2) {
            r4.this.i.a(this.f16676a);
        }
    }

    private void a() {
        SharedPreferences sharedPreferencesC = d7.b().c();
        d7.a aVar = d7.a.PREVIOUS_ANALYTICS_V2;
        if (sharedPreferencesC.contains(aVar.toString())) {
            d7.b().a(aVar);
            a4.e("PREVIOUS_ANALYTICS_V2 indication cleared from storage");
        }
        SharedPreferences sharedPreferencesC2 = d7.b().c();
        d7.a aVar2 = d7.a.PREVIOUS_DIGITAL_ANALYTICS;
        if (sharedPreferencesC2.contains(aVar2.toString())) {
            d7.b().a(aVar2);
            a4.e("PREVIOUS_DIGITAL_ANALYTICS indication cleared from storage");
        }
        SharedPreferences sharedPreferencesC3 = d7.b().c();
        d7.a aVar3 = d7.a.PREVIOUS_SEND_USER_JOURNEY;
        if (sharedPreferencesC3.contains(aVar3.toString())) {
            d7.b().a(aVar3);
            a4.e("PREVIOUS_SEND_USER_JOURNEY indication cleared from storage");
        }
        SharedPreferences sharedPreferencesC4 = d7.b().c();
        d7.a aVar4 = d7.a.MISSING_EVENTS;
        if (sharedPreferencesC4.contains(aVar4.toString())) {
            d7.b().a(aVar4);
            a4.e("MISSING_EVENTS indication cleared from storage");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() throws JSONException {
        j8.a(j8.b.CONFIGURATION_UUID);
        List<Pair<String, Boolean>> listA = v0.a();
        if (listA != null) {
            for (Pair<String, Boolean> pair : listA) {
                if (pair != null) {
                    AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) pair.first, ((Boolean) pair.second).booleanValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MDResultCallback mDResultCallback) {
        if (mDResultCallback == null) {
            a4.f("Missing listener, however, method will run regardless");
        }
    }

    private boolean f() {
        return d7.b().a(d7.a.SDK_STOPPED, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() throws JSONException {
        if (this.n && this.o) {
            this.o = false;
            this.n = false;
            a((String) null);
        }
    }

    public void c(long j2) {
        try {
            if (f()) {
                return;
            }
            if (this.j.a(j2)) {
                b(j2);
            } else if (this.i.a()) {
                this.i.a(Locale.getDefault(), e());
            }
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    public boolean e() {
        return this.f16660a;
    }

    private void b(long j2) {
        a4.e("Refresh session started");
        c3.d().a(e3.b.refreshSession);
        s7.e().j();
        s4.f().a("2.0.0", new i(System.currentTimeMillis(), j2));
    }

    private void c(ConfigurationContract configurationContract) {
        if (configurationContract == null || configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null) {
            return;
        }
        d7.b().b(d7.a.IS_BLACKBOX_ENABLED, configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isBlackBoxEnabled());
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.g
    public void a(long j2) {
        c(j2);
        k7.b().a(u1.b.backToForeground);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MDExternalError mDExternalError, MDResultCallback mDResultCallback) throws JSONException {
        a4.e("Failure");
        a4.c("End - " + mDExternalError.getMessage());
        a(mDExternalError, mDResultCallback);
        AnalyticsBridge.getInstance().reportInitCallbackEvent(AnalyticsBridge.c.failure, Integer.valueOf(mDExternalError.getErrorCode()), mDExternalError.getMessage(), System.currentTimeMillis() - this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MDExternalError mDExternalError, MDResultCallback mDResultCallback) {
        a4.e("Failure");
        a4.f("End - " + mDExternalError.getMessage());
        a(mDExternalError, mDResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) throws JSONException {
        d7.b().b(d7.a.SDK_STOPPED, true);
        a4.e("SDK is stopped");
        k7.b().a(true);
        MedalliaExceptionHandler medalliaExceptionHandler = this.m;
        if (medalliaExceptionHandler != null) {
            medalliaExceptionHandler.unregister();
        }
        if (z) {
            t8.g().b(true);
            t8.g().a(Lifetime.Forever);
            e1.b().a();
            f1.a().a(b0.a.Feedback, Long.valueOf(System.currentTimeMillis()));
            a(new File(g2.f(".crashes/crash.txt")));
        }
        c3.d().a(e3.b.stopApi);
        s7.e().j();
    }

    public void a(Activity activity) {
        if (d() || activity == null) {
            return;
        }
        try {
        } catch (Exception unused) {
            i4.a(activity.getApplication());
            i4.c().a(activity);
            LifeCycle.b().a(activity);
            AnalyticsBridge.getInstance().reportSetActivityEvent(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AnalyticsBridge.c cVar, long j2, long j3) {
        try {
            AnalyticsBridge.getInstance().reportRefreshSessionEvent(j2, System.currentTimeMillis(), j3, this.j.a(), d7.b().a(d7.a.PREVIOUS_SESSION_ID, (String) null), cVar);
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MDResultCallback mDResultCallback) {
        s4.f().a("2.0.0", new c(mDResultCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MDResultCallback mDResultCallback) {
        if (mDResultCallback == null) {
            return;
        }
        w7.b().c().execute(new b(mDResultCallback));
    }

    public boolean d() {
        return this.b;
    }

    public void a(MDAppearanceMode mDAppearanceMode) {
        if (d()) {
            return;
        }
        if (e() && !v7.c().a(mDAppearanceMode)) {
            a4.e("updateCustomAppearance = " + mDAppearanceMode.toString() + ", isSuccess = true");
        }
        AnalyticsBridge.getInstance().reportSetCustomAppearanceEvent(mDAppearanceMode);
        v7.c().b(mDAppearanceMode);
    }

    private void a(MDCallback mDCallback, String str) {
        if (mDCallback == null) {
            return;
        }
        w7.b().c().execute(new a(mDCallback, str));
    }

    public void a(MDCustomInterceptListener mDCustomInterceptListener) {
        try {
            if (d()) {
                return;
            }
            this.g.a(j0.a.CustomIntercept, mDCustomInterceptListener);
            a4.e("CustomInterceptListener was successfully set");
            AnalyticsBridge.getInstance().reportSetCustomInterceptListenerEvent();
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    public void c(String str, MDResultCallback mDResultCallback) {
        if (d()) {
            a(new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED), mDResultCallback);
        } else {
            this.h.a(FormDisplayType.CODE, str, mDResultCallback);
        }
    }

    private void a(MDExternalError mDExternalError, MDCallback mDCallback) {
        if (mDCallback == null) {
            return;
        }
        w7.b().c().execute(new v(mDCallback, mDExternalError));
    }

    public void b(String str) {
        if (d()) {
            return;
        }
        w7.b().a().execute(new p(str));
    }

    public void c(boolean z) {
        w7.b().a().execute(new s(z));
    }

    private void a(MDExternalError mDExternalError, MDFailureCallback mDFailureCallback) {
        if (mDFailureCallback == null) {
            return;
        }
        w7.b().c().execute(new w(mDFailureCallback, mDExternalError));
    }

    public void b(String str, MDResultCallback mDResultCallback) {
        w7.b().a().execute(new k(str, mDResultCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MDExternalError mDExternalError, MDResultCallback mDResultCallback) {
        if (mDResultCallback == null) {
            return;
        }
        w7.b().c().execute(new u(mDResultCallback, mDExternalError));
    }

    public void b(boolean z) {
        if (d()) {
            return;
        }
        if (!e()) {
            this.p = Boolean.valueOf(z);
            return;
        }
        this.q = true;
        d7 d7VarB = d7.b();
        d7.a aVar = d7.a.IS_DEBUG_FORM;
        if (d7VarB.a(aVar, false) == z) {
            return;
        }
        d7.b().b(aVar, z);
    }

    public void a(MDFeedbackListener mDFeedbackListener) {
        try {
            if (d()) {
                return;
            }
            this.g.a(j0.a.Feedback, mDFeedbackListener);
            a4.e("FeedbackListener was successfully set");
            AnalyticsBridge.getInstance().reportSetFeedbackListenerEvent();
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    public boolean b(ConfigurationContract configurationContract) throws JSONException {
        if (configurationContract != null && configurationContract.getKillStatus() != null) {
            if (this.l.a(configurationContract.getKillStatus())) {
                this.l.b(configurationContract.getKillStatus());
                List<Pair<String, Boolean>> listA = v0.a();
                if (listA == null) {
                    return true;
                }
                for (Pair<String, Boolean> pair : listA) {
                    if (pair != null) {
                        AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) pair.first, ((Boolean) pair.second).booleanValue());
                    }
                }
                return true;
            }
            if (this.l.c(configurationContract.getKillStatus())) {
                AnalyticsBridge.getInstance().reportRestoreFromKillSDKEvent(System.currentTimeMillis());
            }
        }
        this.l.clear();
        return false;
    }

    public void a(MDFormListener mDFormListener) {
        try {
            if (d()) {
                return;
            }
            this.g.a(j0.a.Form, mDFormListener);
            a4.e("FormListener was set successfully");
            AnalyticsBridge.getInstance().reportSetFormListenerEvent();
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    public void a(MDInterceptListener mDInterceptListener) {
        try {
            if (d()) {
                return;
            }
            this.g.a(j0.a.Intercept, mDInterceptListener);
            a4.e("InterceptListener was successfully set");
            AnalyticsBridge.getInstance().reportSetInterceptListenerEvent();
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    public void a(MDLogLevel mDLogLevel) {
        try {
            if (d()) {
                return;
            }
            if (mDLogLevel != null) {
                if (!mDLogLevel.equals(MDLogLevel.OFF)) {
                    Log.w("com.medallia.digital", "setLogLevel method is to be used in integration stages only. Remove in app production rollout!");
                }
                a4.a().a(mDLogLevel);
                a4.e("Log level was set to " + mDLogLevel);
            }
            AnalyticsBridge.getInstance().reportLoggerEvent(mDLogLevel);
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    public void a(MDResultCallback mDResultCallback) {
        if (this.e) {
            mDResultCallback.onError(new MDExternalError(MDExternalError.ExternalError.SDK_INITIALIZATION_IN_PROGRESS));
            return;
        }
        if (LifeCycle.b().f()) {
            mDResultCallback.onError(new MDExternalError(MDExternalError.ExternalError.APP_IS_IN_BG));
            return;
        }
        if (c3.d().c()) {
            mDResultCallback.onSuccess();
            a4.e("Close Engagement Api completed");
        } else {
            if (r2.e().a(true)) {
                mDResultCallback.onSuccess();
                a4.e("Close Engagement Api completed");
                return;
            }
            boolean zD = s7.e().d();
            mDResultCallback.onSuccess();
            if (zD) {
                a4.e("Close Engagement Api completed");
            } else {
                a4.e("Close Engagement Api completed - no engagement was open");
            }
        }
    }

    public void a(MDSdkFrameworkType mDSdkFrameworkType) {
        if (d() || this.c == null) {
            return;
        }
        this.c = mDSdkFrameworkType;
        a4.e("SDK Framework was successfully set to " + this.c.toString());
    }

    public void a(MDTouchListener mDTouchListener) {
        try {
            if (d()) {
                return;
            }
            this.g.a(j0.a.TouchEvent, mDTouchListener);
            a4.e("TouchEventListener was successfully set");
            AnalyticsBridge.getInstance().reportSetTouchEventListenerEvent();
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    private void a(MedalliaExceptionHandler medalliaExceptionHandler) {
        if (d7.b().a(d7.a.IS_BLACKBOX_ENABLED, false) && medalliaExceptionHandler != null) {
            medalliaExceptionHandler.register();
            a4.e("Register to Blackbox");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a3 a3Var, MDResultCallback mDResultCallback) throws JSONException {
        MDExternalError mDExternalErrorA = a3Var.a();
        a4.e("Failure");
        if (mDExternalErrorA == null || mDResultCallback == null) {
            return;
        }
        LifeCycle.b().k();
        a4.c(mDExternalErrorA.getMessage());
        a(mDExternalErrorA, mDResultCallback);
        AnalyticsBridge.getInstance().reportInitCallbackEvent(AnalyticsBridge.c.failure, Integer.valueOf(mDExternalErrorA.getErrorCode()), mDExternalErrorA.getMessage(), System.currentTimeMillis() - this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01ce A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x000f, B:7:0x0019, B:9:0x003a, B:11:0x0044, B:13:0x004a, B:15:0x0054, B:16:0x0077, B:18:0x00aa, B:24:0x00c5, B:29:0x00f9, B:31:0x010a, B:32:0x0115, B:36:0x011f, B:45:0x015d, B:47:0x01a8, B:49:0x01b2, B:51:0x01c0, B:53:0x01d3, B:55:0x01fc, B:57:0x0202, B:58:0x0209, B:59:0x020c, B:52:0x01ce, B:38:0x0129, B:42:0x013e, B:43:0x0146, B:44:0x0151, B:19:0x00b2, B:21:0x00b6, B:23:0x00c2), top: B:63:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fc A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x000f, B:7:0x0019, B:9:0x003a, B:11:0x0044, B:13:0x004a, B:15:0x0054, B:16:0x0077, B:18:0x00aa, B:24:0x00c5, B:29:0x00f9, B:31:0x010a, B:32:0x0115, B:36:0x011f, B:45:0x015d, B:47:0x01a8, B:49:0x01b2, B:51:0x01c0, B:53:0x01d3, B:55:0x01fc, B:57:0x0202, B:58:0x0209, B:59:0x020c, B:52:0x01ce, B:38:0x0129, B:42:0x013e, B:43:0x0146, B:44:0x0151, B:19:0x00b2, B:21:0x00b6, B:23:0x00c2), top: B:63:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.medallia.digital.mobilesdk.u0 r11) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.r4.a(com.medallia.digital.mobilesdk.u0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:2:0x0000, B:4:0x0026, B:6:0x0030, B:8:0x0036, B:12:0x0043, B:13:0x0066, B:16:0x00ac, B:17:0x00b7, B:20:0x00de, B:21:0x00e5, B:23:0x0104, B:25:0x010a, B:26:0x0112, B:27:0x0118, B:19:0x00be), top: B:31:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.medallia.digital.mobilesdk.u0 r11, long r12, long r14) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.r4.a(com.medallia.digital.mobilesdk.u0, long, long):void");
    }

    private void a(File file) throws JSONException {
        Boolean boolA = g2.a(file);
        if (boolA != null) {
            AnalyticsBridge.getInstance().reportDeleteStorageEvent(g2.f(".crashes/crash.txt"), boolA.booleanValue());
        }
    }

    @Override // com.medallia.digital.mobilesdk.u8
    public void a(String str) throws JSONException {
        if (this.r) {
            AnalyticsBridge.getInstance().reportAnalyticsSubmissionBlockedEvent(str);
            return;
        }
        this.r = true;
        new com.medallia.digital.mobilesdk.l(System.currentTimeMillis(), new o()).c();
        t8.g().a();
    }

    public void a(String str, MDCallback mDCallback) {
        if (d()) {
            return;
        }
        if (e() && !x3.e().a(str)) {
            AnalyticsBridge.getInstance().updateCustomLocaleEvent(str, true);
            a4.e(YU.a.h("updateCustomLocale = ", str, ", isSuccess = true"));
            a(mDCallback, (String) null);
            return;
        }
        this.g.a(j0.a.Localization, mDCallback);
        MDExternalError mDExternalErrorE = x3.e().e(str);
        if (mDExternalErrorE == null) {
            if (e()) {
                this.i.a(str);
            }
            AnalyticsBridge.getInstance().updateCustomLocaleEvent(str, true);
        } else {
            AnalyticsBridge.getInstance().updateCustomLocaleEvent(str, false);
            a4.e(YU.a.h("updateCustomLocale = ", str, ", isSuccess = false"));
            a(mDExternalErrorE, mDCallback);
        }
    }

    public void a(String str, MDInterceptActionType mDInterceptActionType, MDFailureCallback mDFailureCallback) {
        if (d()) {
            a(new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED), mDFailureCallback);
        } else {
            c3.d().a(str, mDInterceptActionType, mDFailureCallback);
        }
    }

    public void a(String str, MDResultCallback mDResultCallback) {
        if (d()) {
            a(new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED), mDResultCallback);
        } else {
            this.h.a(FormDisplayType.NOTIFICATION, str, mDResultCallback);
        }
    }

    public void a(String str, Object obj) {
        if (d()) {
            return;
        }
        w7.b().a().execute(new q(str, obj));
    }

    public void a(HashMap<String, Object> map) {
        if (d()) {
            return;
        }
        w7.b().a().execute(new r(map));
    }

    public void a(boolean z) {
        try {
            if (d()) {
                return;
            }
            k7.b().a(z, this.f16660a);
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    private boolean a(ConfigurationContract configurationContract) {
        return (configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null || !configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isBridgeSDKIntegrationEnabled()) ? false : true;
    }
}
