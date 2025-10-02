package io.branch.referral;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.URLUtil;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import com.salesforce.marketingcloud.storage.db.k;
import io.branch.referral.Defines;
import io.branch.referral.QRCode.ServerRequestCreateQRCode;
import io.branch.referral.SystemObserver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class ServerRequest {
    public static final Defines.RequestPath[] h = {Defines.RequestPath.RegisterInstall, Defines.RequestPath.RegisterOpen, Defines.RequestPath.ContentEvent, Defines.RequestPath.TrackStandardEvent, Defines.RequestPath.TrackCustomEvent};

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f23862a;
    public final Defines.RequestPath b;
    public final PrefHelper c;
    public final Context d;
    public final HashSet e;
    public boolean f;
    public int g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BRANCH_API_VERSION {
        public static final BRANCH_API_VERSION d;
        public static final BRANCH_API_VERSION e;
        public static final BRANCH_API_VERSION f;
        public static final /* synthetic */ BRANCH_API_VERSION[] g;

        static {
            BRANCH_API_VERSION branch_api_version = new BRANCH_API_VERSION("V1", 0);
            d = branch_api_version;
            BRANCH_API_VERSION branch_api_version2 = new BRANCH_API_VERSION("V1_LATD", 1);
            e = branch_api_version2;
            BRANCH_API_VERSION branch_api_version3 = new BRANCH_API_VERSION("V2", 2);
            f = branch_api_version3;
            g = new BRANCH_API_VERSION[]{branch_api_version, branch_api_version2, branch_api_version3};
        }

        public static BRANCH_API_VERSION valueOf(String str) {
            return (BRANCH_API_VERSION) Enum.valueOf(BRANCH_API_VERSION.class, str);
        }

        public static BRANCH_API_VERSION[] values() {
            return (BRANCH_API_VERSION[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PROCESS_WAIT_LOCK {
        public static final PROCESS_WAIT_LOCK d;
        public static final PROCESS_WAIT_LOCK e;
        public static final PROCESS_WAIT_LOCK f;
        public static final PROCESS_WAIT_LOCK g;
        public static final PROCESS_WAIT_LOCK h;
        public static final /* synthetic */ PROCESS_WAIT_LOCK[] i;

        static {
            PROCESS_WAIT_LOCK process_wait_lock = new PROCESS_WAIT_LOCK("SDK_INIT_WAIT_LOCK", 0);
            d = process_wait_lock;
            PROCESS_WAIT_LOCK process_wait_lock2 = new PROCESS_WAIT_LOCK("GAID_FETCH_WAIT_LOCK", 1);
            e = process_wait_lock2;
            PROCESS_WAIT_LOCK process_wait_lock3 = new PROCESS_WAIT_LOCK("INTENT_PENDING_WAIT_LOCK", 2);
            f = process_wait_lock3;
            PROCESS_WAIT_LOCK process_wait_lock4 = new PROCESS_WAIT_LOCK("USER_SET_WAIT_LOCK", 3);
            PROCESS_WAIT_LOCK process_wait_lock5 = new PROCESS_WAIT_LOCK("INSTALL_REFERRER_FETCH_WAIT_LOCK", 4);
            g = process_wait_lock5;
            PROCESS_WAIT_LOCK process_wait_lock6 = new PROCESS_WAIT_LOCK("USER_AGENT_STRING_LOCK", 5);
            h = process_wait_lock6;
            i = new PROCESS_WAIT_LOCK[]{process_wait_lock, process_wait_lock2, process_wait_lock3, process_wait_lock4, process_wait_lock5, process_wait_lock6};
        }

        public static PROCESS_WAIT_LOCK valueOf(String str) {
            return (PROCESS_WAIT_LOCK) Enum.valueOf(PROCESS_WAIT_LOCK.class, str);
        }

        public static PROCESS_WAIT_LOCK[] values() {
            return (PROCESS_WAIT_LOCK[]) i.clone();
        }
    }

    public ServerRequest(Context context, Defines.RequestPath requestPath) {
        this.f = false;
        this.g = 0;
        this.d = context;
        this.b = requestPath;
        this.c = PrefHelper.d(context);
        this.f23862a = new JSONObject();
        this.e = new HashSet();
    }

    public static ServerRequest a(JSONObject jSONObject, Context context) throws JSONException {
        String string = "";
        try {
        } catch (JSONException e) {
            c.z(e, new StringBuilder("Caught JSONException "));
        }
        JSONObject jSONObject2 = jSONObject.has("REQ_POST") ? jSONObject.getJSONObject("REQ_POST") : null;
        try {
            if (jSONObject.has("REQ_POST_PATH")) {
                string = jSONObject.getString("REQ_POST_PATH");
            }
        } catch (JSONException e2) {
            c.z(e2, new StringBuilder("Caught JSONException "));
        }
        try {
        } catch (JSONException e3) {
            c.z(e3, new StringBuilder("Caught JSONException "));
        }
        boolean z = jSONObject.has("INITIATED_BY_CLIENT") ? jSONObject.getBoolean("INITIATED_BY_CLIENT") : true;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (string.equalsIgnoreCase("v1/url")) {
            ServerRequestCreateUrl serverRequestCreateUrl = new ServerRequestCreateUrl(Defines.RequestPath.GetURL, jSONObject2, context);
            serverRequestCreateUrl.j = true;
            serverRequestCreateUrl.l = true;
            return serverRequestCreateUrl;
        }
        if (string.equalsIgnoreCase("v1/install")) {
            return new ServerRequestRegisterInstall(Defines.RequestPath.RegisterInstall, jSONObject2, context, z);
        }
        if (string.equalsIgnoreCase("v1/open")) {
            return new ServerRequestRegisterOpen(Defines.RequestPath.RegisterOpen, jSONObject2, context, z);
        }
        return null;
    }

    public BRANCH_API_VERSION b() {
        return BRANCH_API_VERSION.d;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        this.c.getClass();
        sb.append(URLUtil.isHttpsUrl(PrefHelper.g) ? PrefHelper.g : "https://api2.branch.io/");
        sb.append(this.b.d);
        return sb.toString();
    }

    public abstract void d(int i, String str);

    public abstract boolean e();

    public void f() throws JSONException {
        PrefHelper prefHelper = this.c;
        BranchLogger.e("onPreExecute " + this);
        if ((this instanceof ServerRequestRegisterOpen) || (this instanceof ServerRequestLogEvent)) {
            try {
                ReferringUrlUtility referringUrlUtility = new ReferringUrlUtility(prefHelper);
                referringUrlUtility.b(prefHelper.j("bnc_external_intent_uri"));
                JSONObject jSONObjectA = referringUrlUtility.a(this);
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    this.f23862a.put(next, jSONObjectA.get(next));
                }
            } catch (Exception e) {
                BranchLogger.b("Caught exception in onPreExecute: " + e.getMessage() + " stacktrace " + BranchLogger.d(e));
            }
        }
    }

    public void g() {
        System.currentTimeMillis();
    }

    public abstract void h(ServerResponse serverResponse, Branch branch);

    public boolean i() {
        return this instanceof ServerRequestCreateQRCode;
    }

    public void j(JSONObject jSONObject) throws JSONException {
        ServerRequest serverRequest;
        DeviceInfo deviceInfo;
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        String str5;
        this.f23862a = jSONObject;
        BRANCH_API_VERSION branch_api_versionB = b();
        BRANCH_API_VERSION branch_api_version = BRANCH_API_VERSION.d;
        Defines.RequestPath requestPath = this.b;
        Defines.RequestPath[] requestPathArr = h;
        if (branch_api_versionB == branch_api_version) {
            DeviceInfo deviceInfoC = DeviceInfo.c();
            JSONObject jSONObject2 = this.f23862a;
            Defines.RequestPath requestPath2 = requestPath;
            Context context = deviceInfoC.b;
            try {
                SystemObserver.UniqueId uniqueIdB = deviceInfoC.b();
                String str6 = uniqueIdB.f23867a;
                if (DeviceInfo.d(str6)) {
                    str3 = "local_ip";
                } else {
                    str3 = "local_ip";
                    jSONObject2.put("hardware_id", str6);
                    jSONObject2.put("is_hardware_id_real", uniqueIdB.b);
                }
                String strA = SystemObserver.a(context);
                if (!DeviceInfo.d(strA)) {
                    jSONObject2.put("anon_id", strA);
                }
                String str7 = Build.MANUFACTURER;
                if (!DeviceInfo.d(str7)) {
                    jSONObject2.put("brand", str7);
                }
                String str8 = Build.MODEL;
                if (!DeviceInfo.d(str8)) {
                    jSONObject2.put("model", str8);
                }
                DisplayMetrics displayMetricsG = SystemObserver.g(context);
                jSONObject2.put("screen_dpi", displayMetricsG.densityDpi);
                jSONObject2.put("screen_height", displayMetricsG.heightPixels);
                jSONObject2.put("screen_width", displayMetricsG.widthPixels);
                jSONObject2.put("wifi", "wifi".equalsIgnoreCase(SystemObserver.b(context)));
                jSONObject2.put("ui_mode", SystemObserver.h(context));
                String strE = SystemObserver.e(context);
                if (!DeviceInfo.d(strE)) {
                    jSONObject2.put("os", strE);
                }
                jSONObject2.put("os_version", Build.VERSION.SDK_INT);
                String country = Locale.getDefault().getCountry();
                if (!TextUtils.isEmpty(country)) {
                    jSONObject2.put("country", country);
                }
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject2.put("language", language);
                }
                String strC = SystemObserver.c();
                if (!TextUtils.isEmpty(strC)) {
                    jSONObject2.put(str3, strC);
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= 5) {
                        z = false;
                        break;
                    }
                    Defines.RequestPath requestPath3 = requestPath2;
                    if (requestPathArr[i3].equals(requestPath3)) {
                        z = true;
                        break;
                    } else {
                        i3++;
                        requestPath2 = requestPath3;
                    }
                }
                if (z) {
                    jSONObject2.put("cpu_type", System.getProperty("os.arch"));
                    jSONObject2.put("build", Build.DISPLAY);
                    jSONObject2.put(k.a.n, SystemObserver.d());
                    jSONObject2.put("connection_type", SystemObserver.b(context));
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        str5 = "device_carrier";
                        str4 = null;
                        jSONObject2.put(str5, str4);
                        jSONObject2.put("os_version_android", Build.VERSION.RELEASE);
                    } else {
                        String networkOperatorName = telephonyManager.getNetworkOperatorName();
                        if (TextUtils.isEmpty(networkOperatorName)) {
                            str5 = "device_carrier";
                            str4 = null;
                            jSONObject2.put(str5, str4);
                            jSONObject2.put("os_version_android", Build.VERSION.RELEASE);
                        } else {
                            str4 = networkOperatorName;
                            str5 = "device_carrier";
                            jSONObject2.put(str5, str4);
                            jSONObject2.put("os_version_android", Build.VERSION.RELEASE);
                        }
                    }
                }
            } catch (JSONException e) {
                c.z(e, new StringBuilder("Caught JSONException"));
            }
            serverRequest = this;
        } else {
            JSONObject jSONObject3 = new JSONObject();
            serverRequest = this;
            Defines.RequestPath requestPath4 = requestPath;
            serverRequest.f23862a.put("user_data", jSONObject3);
            DeviceInfo deviceInfoC2 = DeviceInfo.c();
            Context context2 = deviceInfoC2.b;
            try {
                String str9 = deviceInfoC2.b().f23867a;
                if (DeviceInfo.d(str9)) {
                    deviceInfo = deviceInfoC2;
                } else {
                    deviceInfo = deviceInfoC2;
                    jSONObject3.put(nnlllnn.nnlllln.w007700770077www, str9);
                }
                String strA2 = SystemObserver.a(context2);
                if (!DeviceInfo.d(strA2)) {
                    jSONObject3.put("anon_id", strA2);
                }
                String str10 = Build.MANUFACTURER;
                if (!DeviceInfo.d(str10)) {
                    jSONObject3.put("brand", str10);
                }
                String str11 = Build.MODEL;
                if (!DeviceInfo.d(str11)) {
                    jSONObject3.put("model", str11);
                }
                DisplayMetrics displayMetricsG2 = SystemObserver.g(context2);
                jSONObject3.put("screen_dpi", displayMetricsG2.densityDpi);
                jSONObject3.put("screen_height", displayMetricsG2.heightPixels);
                jSONObject3.put("screen_width", displayMetricsG2.widthPixels);
                jSONObject3.put("ui_mode", SystemObserver.h(context2));
                String strE2 = SystemObserver.e(context2);
                if (!DeviceInfo.d(strE2)) {
                    jSONObject3.put("os", strE2);
                }
                jSONObject3.put("os_version", Build.VERSION.SDK_INT);
                String country2 = Locale.getDefault().getCountry();
                if (!TextUtils.isEmpty(country2)) {
                    jSONObject3.put("country", country2);
                }
                String language2 = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language2)) {
                    jSONObject3.put("language", language2);
                }
                String strC2 = SystemObserver.c();
                if (!TextUtils.isEmpty(strC2)) {
                    jSONObject3.put("local_ip", strC2);
                }
                PrefHelper prefHelper = serverRequest.c;
                if (prefHelper != null) {
                    if (!DeviceInfo.d(prefHelper.g())) {
                        jSONObject3.put("randomized_device_token", prefHelper.g());
                    }
                    String strJ = prefHelper.j("bnc_identity");
                    if (!DeviceInfo.d(strJ)) {
                        jSONObject3.put("developer_identity", strJ);
                    }
                    String strJ2 = prefHelper.j("bnc_app_store_source");
                    if (!"bnc_no_value".equals(strJ2)) {
                        jSONObject3.put("app_store", strJ2);
                    }
                }
                jSONObject3.put(k.a.q, deviceInfo.a());
                jSONObject3.put("sdk", "android");
                jSONObject3.put(k.a.r, "5.12.3");
                deviceInfo.e(jSONObject3);
                if (serverRequest instanceof ServerRequestGetLATD) {
                    i = 0;
                    jSONObject3.put("attribution_window", 0);
                } else {
                    i = 0;
                }
                int i4 = i;
                while (true) {
                    if (i4 >= 5) {
                        i2 = i;
                        break;
                    }
                    Defines.RequestPath requestPath5 = requestPath4;
                    if (requestPathArr[i4].equals(requestPath5)) {
                        i2 = 1;
                        break;
                    } else {
                        i4++;
                        requestPath4 = requestPath5;
                    }
                }
                if (i2 != 0) {
                    jSONObject3.put("cpu_type", System.getProperty("os.arch"));
                    jSONObject3.put("build", Build.DISPLAY);
                    jSONObject3.put(k.a.n, SystemObserver.d());
                    jSONObject3.put("connection_type", SystemObserver.b(context2));
                    TelephonyManager telephonyManager2 = (TelephonyManager) context2.getSystemService("phone");
                    if (telephonyManager2 == null) {
                        str2 = "device_carrier";
                        str = null;
                        jSONObject3.put(str2, str);
                        jSONObject3.put("os_version_android", Build.VERSION.RELEASE);
                    } else {
                        String networkOperatorName2 = telephonyManager2.getNetworkOperatorName();
                        if (TextUtils.isEmpty(networkOperatorName2)) {
                            str2 = "device_carrier";
                            str = null;
                            jSONObject3.put(str2, str);
                            jSONObject3.put("os_version_android", Build.VERSION.RELEASE);
                        } else {
                            str = networkOperatorName2;
                            str2 = "device_carrier";
                            jSONObject3.put(str2, str);
                            jSONObject3.put("os_version_android", Build.VERSION.RELEASE);
                        }
                    }
                }
            } catch (JSONException e2) {
                c.z(e2, new StringBuilder("Caught JSONException"));
            }
        }
        serverRequest.f23862a.put("debug", Branch.p);
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return this instanceof ServerRequestGetLATD;
    }

    public JSONObject m() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("REQ_POST", this.f23862a);
            jSONObject.put("REQ_POST_PATH", this.b.d);
            return jSONObject;
        } catch (JSONException e) {
            c.z(e, new StringBuilder("Caught JSONException "));
            return null;
        }
    }

    public final void n(JSONObject jSONObject) throws JSONException {
        PackageManager packageManager;
        boolean z;
        try {
            Context context = DeviceInfo.c().b;
            if (context != null) {
                try {
                    packageManager = context.getPackageManager();
                } catch (Exception e) {
                    BranchLogger.b("Caught Exception, error obtaining PackageInfo " + e.getMessage());
                }
                z = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()) == null ? false : !packageManager.queryIntentActivities(r0, 65536).isEmpty();
            }
            String str = z ? "FULL_APP" : "INSTANT_APP";
            if (b() != BRANCH_API_VERSION.f) {
                jSONObject.put("environment", str);
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_data");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.put("environment", str);
            }
        } catch (Exception e2) {
            BranchLogger.a(e2.getMessage());
        }
    }

    public ServerRequest(Defines.RequestPath requestPath, JSONObject jSONObject, Context context) {
        this.f = false;
        this.g = 0;
        this.d = context;
        this.b = requestPath;
        this.f23862a = jSONObject;
        this.c = PrefHelper.d(context);
        this.e = new HashSet();
    }
}
