package com.medallia.digital.mobilesdk;

import android.os.Build;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.l8;
import com.medallia.digital.mobilesdk.o6;
import com.medallia.digital.mobilesdk.r0;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class s4 implements m8 {
    private static final String n = "tre-version";
    private static final String o = "deviceModel";
    private static final String p = "osVersion";
    private static final String q = "sdkVersion";
    private static final String r = "osType";
    private static final String s = "deviceVendor";
    private static final String t = "locale";
    private static final String u = "mimeType";
    private static final String v = "customDomain";
    private static final String w = "ttlMinutes";
    private static final String x = "60";
    private static final String y = "staticCollectors";
    private static s4 z;
    private w4 c;
    private String d;
    private String e;
    private String f;
    private long g;
    private long h;
    private r1 i;
    private boolean j;
    private HashMap<String, String> k;
    private b5 l;
    private String m;
    private int b;

    /* renamed from: a, reason: collision with root package name */
    private o6 f16696a = new o6(this.b);

    public class a implements r0.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HashMap f16697a;

        public a(HashMap map) {
            this.f16697a = map;
        }

        @Override // com.medallia.digital.mobilesdk.r0.b
        public l0 a() {
            return new l0(w2.c().a().c(), null, this.f16697a, null);
        }
    }

    public enum c {
        API_TOKEN,
        ACCESS_TOKEN
    }

    private s4() {
    }

    private String a() {
        return a(this.l);
    }

    private HashMap<String, String> d() {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put("sdkVersion", URLEncoder.encode("4.8.1", "UTF-8"));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
        try {
            map.put(r, URLEncoder.encode("android", "UTF-8"));
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
        return map;
    }

    public static s4 f() {
        if (z == null) {
            z = new s4();
        }
        return z;
    }

    public long b() {
        return this.g;
    }

    public int c() {
        if (e() == null || e().a() == null) {
            return 512;
        }
        return e().a().intValue();
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a4.a("s4");
        this.f16696a = null;
        z = null;
    }

    public r1 e() {
        return this.i;
    }

    public long g() {
        return this.h;
    }

    public o6 h() {
        return this.f16696a;
    }

    public w4 i() {
        return this.c;
    }

    public String j() {
        return this.e;
    }

    public String k() {
        return this.d;
    }

    public int l() {
        return this.b;
    }

    public String m() {
        return this.f;
    }

    public boolean n() {
        return this.j;
    }

    /* loaded from: classes6.dex */
    public class b implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f16698a;

        public b(n6 n6Var) {
            this.f16698a = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            this.f16698a.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            this.f16698a.a((n6) str);
        }
    }

    public String a(b5 b5Var) {
        return b5Var.d() + b5Var.c() + b5Var.b() + b5Var.f() + b5Var.a();
    }

    public HashMap<String, String> a(e5 e5Var) {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put(u, e5Var.f());
            map.put(v, "true");
            map.put(w, x);
            return map;
        } catch (Exception e) {
            a4.c(e.getMessage());
            return map;
        }
    }

    private JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("appId", CollectorsInfrastructure.getInstance().getAppId());
            jSONObject2.put("appName", CollectorsInfrastructure.getInstance().getAppName());
            jSONObject2.put(o, CollectorsInfrastructure.getInstance().getDeviceModel());
            jSONObject2.put("sdkFramework", CollectorsInfrastructure.getInstance().getSDKFramework());
            jSONObject2.put("osName", CollectorsInfrastructure.getInstance().getOSName());
            jSONObject2.put("propertyId", CollectorsInfrastructure.getInstance().getPropertyId());
            jSONObject2.put("accountId", CollectorsInfrastructure.getInstance().getAccountId());
            jSONObject2.put("deviceId", CollectorsInfrastructure.getInstance().getDeviceId());
            jSONObject.put(y, jSONObject2);
            return jSONObject;
        } catch (Exception e) {
            a4.c(e.getMessage());
            return jSONObject;
        }
    }

    public void a(int i, int i2, long j, long j2) {
        a4.b(f().getClass().getSimpleName().concat(" initialized"));
        a(i, i2, (String) null, j, j2, (String) null);
    }

    public void a(int i, int i2, String str, long j, long j2, String str2) {
        this.b = i;
        this.c = new w4(new u4(i2));
        this.e = str;
        this.f = d7.b().a(d7.a.UUID_URL, (String) null);
        this.h = j;
        this.g = j2;
        this.d = str2;
        o6 o6Var = this.f16696a;
        if (o6Var != null) {
            o6Var.a(i, j);
        }
        a4.b("MedalliaDigitalClient updated configuration");
    }

    public void a(int i, w4 w4Var, String str, long j, long j2, String str2) {
        this.b = i;
        this.c = w4Var;
        this.e = str;
        this.f = d7.b().a(d7.a.UUID_URL, (String) null);
        this.h = j;
        this.g = j2;
        this.d = str2;
        o6 o6Var = this.f16696a;
        if (o6Var != null) {
            o6Var.a(i, j);
        }
        a4.b("MedalliaDigitalClient updated configuration");
    }

    public void a(ConfigurationContract configurationContract) {
        if (configurationContract == null || configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalClientConfig() == null) {
            return;
        }
        this.h = (configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getSessionInactivityTime() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getSessionInactivityTime().longValue() <= 0) ? l8.b.b : configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getSessionInactivityTime().longValue();
        if (configurationContract.getPropertyConfiguration() != null) {
            this.j = configurationContract.getPropertyConfiguration().isDigitalAnalyticsEnabled();
        }
        MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfig = configurationContract.getSdkConfiguration().getMedalliaDigitalClientConfig();
        if (medalliaDigitalClientConfig.getHttpRequestTimeout() != null) {
            this.b = medalliaDigitalClientConfig.getHttpRequestTimeout().intValue();
        }
        if (medalliaDigitalClientConfig.getServerHttpRequestsConfiguration() != null) {
            this.c = medalliaDigitalClientConfig.getServerHttpRequestsConfiguration();
        }
        if (medalliaDigitalClientConfig.getSubmitUrlPrefix() != null && medalliaDigitalClientConfig.getSubmitUrlSuffix() != null) {
            this.e = YU.a.g(medalliaDigitalClientConfig.getSubmitUrlPrefix(), medalliaDigitalClientConfig.getSubmitUrlSuffix());
        }
        if (configurationContract.getConfigurationUUID() != null) {
            this.f = configurationContract.getConfigurationUUID().getUrl();
        }
        this.g = medalliaDigitalClientConfig.getAccessTokenValidationBufferTime();
        if (medalliaDigitalClientConfig.getMediaCaptureConfiguration() != null) {
            b5 mediaCaptureConfiguration = medalliaDigitalClientConfig.getMediaCaptureConfiguration();
            this.l = mediaCaptureConfiguration;
            if (mediaCaptureConfiguration.a() != null && this.l.b() != null && this.l.d() != null) {
                this.d = a();
            }
        }
        if (medalliaDigitalClientConfig.getDigitalAnalyticsConfigurationContract() != null && medalliaDigitalClientConfig.getDigitalAnalyticsConfigurationContract().f() != null) {
            this.k = medalliaDigitalClientConfig.getDigitalAnalyticsConfigurationContract().f();
        }
        a(this.b, this.c, this.e, this.h, this.g, this.d);
        a(medalliaDigitalClientConfig);
    }

    private void a(MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfigurationContract) {
        if (medalliaDigitalClientConfigurationContract == null) {
            a4.f("MedalliaDigitalClientConfigurationContract is null");
            return;
        }
        if (medalliaDigitalClientConfigurationContract.getHttpRequestTimeout() != null) {
            this.b = medalliaDigitalClientConfigurationContract.getHttpRequestTimeout().intValue();
        }
        if (medalliaDigitalClientConfigurationContract.getServerHttpRequestsConfiguration() != null) {
            this.c = medalliaDigitalClientConfigurationContract.getServerHttpRequestsConfiguration();
        }
        if (medalliaDigitalClientConfigurationContract.getSubmitUrlPrefix() != null && medalliaDigitalClientConfigurationContract.getSubmitUrlSuffix() != null) {
            this.e = YU.a.g(medalliaDigitalClientConfigurationContract.getSubmitUrlPrefix(), medalliaDigitalClientConfigurationContract.getSubmitUrlSuffix());
        }
        if (medalliaDigitalClientConfigurationContract.getDigitalAnalyticsConfigurationContract() != null) {
            this.i = medalliaDigitalClientConfigurationContract.getDigitalAnalyticsConfigurationContract();
        }
        if (medalliaDigitalClientConfigurationContract.getMediaCaptureConfiguration() != null) {
            this.l = medalliaDigitalClientConfigurationContract.getMediaCaptureConfiguration();
            this.d = a();
        }
        this.m = medalliaDigitalClientConfigurationContract.getQuarantineValidationEndpoint();
        a4.b("MedalliaDigitalClientConfiguration updated");
    }

    public void a(c2 c2Var, n6<Void> n6Var) {
        a4.b("Submit Feedback called with feedback: " + c2Var);
        new g7(this.f16696a, new l0(this.e, null, d(), null), c2Var, n6Var).c();
    }

    public void a(e5 e5Var, b5 b5Var, Boolean bool, n6<String> n6Var) {
        a4.b("LivingLens Submit Media Feedback called with: " + e5Var.d());
        String strA = this.d;
        if (b5Var == null) {
            b5Var = this.l;
        }
        b5 b5Var2 = b5Var;
        if (bool.booleanValue()) {
            strA = a(b5Var2);
        }
        new h7(e5Var, b5Var2, this.f16696a, new l0(strA, null, a(e5Var), null), new b(n6Var)).c();
    }

    public void a(n6<Void> n6Var, JSONObject jSONObject) throws JSONException {
        a4.b("submitDigitalAnalytics was called");
        if (this.j) {
            new f7(this.f16696a, new l0(this.i.g(), this.k, null, a(jSONObject)), n6Var).c();
        }
    }

    public void a(o6.a aVar) {
        a4.b("getConfigurationUuid was called");
        String str = this.f;
        if ((str == null || str.isEmpty()) && t0.c() != null && t0.c().a() != null && t0.c().a().configurationUUID != null) {
            this.f = t0.c().a().configurationUUID.getUrl();
        }
        new k8(this.f16696a, this.f).a(aVar);
    }

    public void a(o6 o6Var) {
        this.f16696a = o6Var;
    }

    public void a(String str, n6<u0> n6Var) {
        a4.b(YU.a.A("getConfiguration called with tre-version: ", str));
        HashMap map = new HashMap();
        try {
            map.put(n, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            a4.c(e.getMessage());
        }
        String str2 = Build.MANUFACTURER;
        if (str2 != null) {
            try {
                map.put(s, URLEncoder.encode(str2, "UTF-8"));
            } catch (UnsupportedEncodingException e2) {
                a4.c(e2.getMessage());
            }
        }
        String str3 = Build.MODEL;
        if (str3 != null) {
            try {
                map.put(o, URLEncoder.encode(str3, "UTF-8"));
            } catch (Exception e3) {
                a4.c(e3.getMessage());
            }
        }
        String str4 = Build.VERSION.RELEASE;
        if (str4 != null) {
            try {
                map.put(p, URLEncoder.encode(str4, "UTF-8"));
            } catch (Exception e4) {
                a4.c(e4.getMessage());
            }
        }
        try {
            map.put("sdkVersion", URLEncoder.encode("4.8.1", "UTF-8"));
        } catch (Exception e5) {
            a4.c(e5.getMessage());
        }
        try {
            String strC = x3.e().c();
            if (strC == null) {
                strC = x3.e().d();
            }
            map.put("locale", URLEncoder.encode(strC, "UTF-8"));
        } catch (UnsupportedEncodingException e6) {
            a4.c(e6.getMessage());
        }
        map.putAll(d());
        new r0(this.f16696a, new l0(this.f, null, d(), null), new a(map), n6Var).c();
    }

    public void a(String str, String str2, n6<File> n6Var) {
        a(false, str, str2, n6Var);
    }

    public void a(JSONObject jSONObject, n6<f6> n6Var) {
        a4.b("QuarantineValidationRules was called");
        new e6(this.f16696a, new l0(this.m, d(), jSONObject), n6Var).c();
    }

    public void a(boolean z2, String str, String str2, n6<File> n6Var) {
        a4.b(YU.a.A("getResource called with url: ", str));
        new t2(this.f16696a, new l0(str), str2, n6Var, z2).c();
    }
}
