package lib.android.paypal.com.magnessdk.network;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import lib.android.paypal.com.magnessdk.Environment;
import lib.android.paypal.com.magnessdk.MagnesSDK;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.f;
import lib.android.paypal.com.magnessdk.network.base.MagnesNetworking;
import lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactoryImpl;
import lib.android.paypal.com.magnessdk.network.base.c;
import me.oriient.internal.infra.rest.RequestBuilder;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b extends c {
    public final c.h.d d;
    public HashMap e = new HashMap();
    public final Handler f;
    public final MagnesNetworkingFactoryImpl g;
    public final MagnesSettings h;
    public final JSONObject i;
    public final boolean j;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24901a;

        static {
            int[] iArr = new int[c.h.d.values().length];
            f24901a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24901a[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24901a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24901a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b(c.h.d dVar, JSONObject jSONObject, boolean z, MagnesSettings magnesSettings, Handler handler) {
        this.d = dVar;
        this.i = jSONObject;
        this.j = z;
        this.f = handler;
        this.h = magnesSettings;
        magnesSettings.getClass();
        this.g = new MagnesNetworkingFactoryImpl();
    }

    public final String b() {
        String string;
        JSONObject jSONObject = this.i;
        if (jSONObject == null) {
            return null;
        }
        int i = a.f24901a[this.d.ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            return jSONObject.toString();
        }
        if (jSONObject == null) {
            string = null;
        } else {
            HashMap map = new HashMap();
            map.put("appGuid", jSONObject.optString("app_guid"));
            map.put("libraryVersion", String.format(Locale.US, "Dyson/%S (%S %S)", jSONObject.optString("comp_version"), jSONObject.optString("os_type"), Build.VERSION.RELEASE));
            map.put("additionalData", jSONObject.toString());
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : map.entrySet()) {
                if (z) {
                    z = false;
                } else {
                    sb.append("&");
                }
                sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
            }
            lib.android.paypal.com.magnessdk.log.a.a("Encoded Device info payload : " + sb.toString(), 0, getClass());
            string = sb.toString();
        }
        if (string == null) {
            return null;
        }
        return string;
    }

    public final String c() {
        MagnesSettings magnesSettings = this.h;
        if (magnesSettings == null || this.f == null) {
            return null;
        }
        int[] iArr = a.f24901a;
        c.h.d dVar = this.d;
        int i = iArr[dVar.ordinal()];
        Environment environment = Environment.d;
        return (i == 1 || i == 2) ? magnesSettings.e == environment ? MagnesSDK.b().f24888a.f24893a.optString("endpoint_url", "https://c.paypal.com/r/v1/device/client-metadata") : "https://c.sandbox.paypal.com/r/v1/device/client-metadata" : (i == 3 || i == 4) ? magnesSettings.e == environment ? this.j ? "https://c.paypal.com/r/v1/device/mg-audit" : "https://c.paypal.com/r/v1/device/mg" : "https://c.sandbox.paypal.com/r/v1/device/mg-audit" : dVar.d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = this.f;
        if (handler == null) {
            return;
        }
        MagnesSettings magnesSettings = this.h;
        if (magnesSettings != null) {
            try {
                Context context = magnesSettings.c;
                int i = a.f24901a[this.d.ordinal()];
                HashMap map = null;
                if (i == 1 || i == 2) {
                    if (context != null) {
                        map = new HashMap();
                        map.put("X-PAYPAL-RESPONSE-DATA-FORMAT", "NV");
                        map.put("X-PAYPAL-REQUEST-DATA-FORMAT", "NV");
                        map.put("X-PAYPAL-SERVICE-VERSION", "1.0.0");
                        map.put(RequestBuilder.CONTENT_TYPE, "application/x-www-form-urlencoded");
                        f.e(context, map);
                    }
                    if (map != null) {
                        this.e = map;
                    }
                } else {
                    if (context != null) {
                        map = new HashMap();
                        map.put(RequestBuilder.CONTENT_TYPE, "application/json");
                        f.e(context, map);
                    }
                    if (map != null) {
                        this.e = map;
                    }
                }
            } catch (Exception e) {
                lib.android.paypal.com.magnessdk.log.a.b(e, f.class);
            }
        }
        try {
            MagnesNetworkingFactoryImpl magnesNetworkingFactoryImpl = this.g;
            c.h.b bVar = c.h.b.POST;
            magnesNetworkingFactoryImpl.getClass();
            MagnesNetworking magnesNetworkingA = MagnesNetworkingFactoryImpl.a(bVar);
            String strC = c();
            String strB = b();
            if (strC != null && strB != null) {
                magnesNetworkingA.e(Uri.parse(strC));
                magnesNetworkingA.d(this.e);
                handler.sendMessage(Message.obtain(handler, 53, strC));
                int iA = magnesNetworkingA.a(strB.getBytes("UTF-8"));
                String str = new String(magnesNetworkingA.b(), "UTF-8");
                Log.d("MagnesPostRequest", "MagnesPostRequest returned PayPal-Debug-Id: " + magnesNetworkingA.c());
                lib.android.paypal.com.magnessdk.log.a.a("MagnesPostRequest for " + strC + " returned status code " + iA + ", and responseString: " + str, 0, getClass());
                handler.sendMessage(iA == 200 ? Message.obtain(handler, 55, str) : Message.obtain(handler, 54, Integer.valueOf(iA)));
            }
        } catch (Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.b(e2, getClass());
            if (handler != null) {
                handler.sendMessage(Message.obtain(handler, 54, e2));
            }
        }
    }
}
