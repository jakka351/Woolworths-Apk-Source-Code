package lib.android.paypal.com.magnessdk.network;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.medallia.digital.mobilesdk.q2;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.HashMap;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.e;
import lib.android.paypal.com.magnessdk.network.base.MagnesNetworking;
import lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactoryImpl;
import lib.android.paypal.com.magnessdk.network.base.c;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a extends c {
    public final c.h.d d;
    public final HashMap e = new HashMap();
    public final Handler f;
    public final MagnesNetworkingFactoryImpl g;
    public final MagnesSettings h;
    public final JSONObject i;

    /* renamed from: lib.android.paypal.com.magnessdk.network.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0417a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24900a;

        static {
            int[] iArr = new int[c.h.d.values().length];
            f24900a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24900a[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(c.h.d dVar, MagnesSettings magnesSettings, Handler handler, JSONObject jSONObject) {
        this.d = dVar;
        this.h = magnesSettings;
        this.f = handler;
        magnesSettings.getClass();
        this.g = new MagnesNetworkingFactoryImpl();
        this.i = jSONObject;
    }

    public final void b(String str) throws Throwable {
        int i = C0417a.f24900a[this.d.ordinal()];
        MagnesSettings magnesSettings = this.h;
        if (i == 1) {
            lib.android.paypal.com.magnessdk.b.b(magnesSettings.c, str, "RAMP_CONFIG");
            return;
        }
        if (i != 2) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        lib.android.paypal.com.magnessdk.b.b(magnesSettings.c, jSONObject.toString(), "REMOTE_CONFIG");
        e.g(jSONObject);
        if (jSONObject.optJSONArray("nc") != null) {
            e.c = true;
        }
    }

    public final String c() {
        c.h.d dVar = c.h.d.PRODUCTION_BEACON_URL;
        c.h.d dVar2 = this.d;
        if (dVar2 == dVar) {
            JSONObject jSONObject = this.i;
            if (jSONObject == null) {
                return null;
            }
            String str = "https://b.stats.paypal.com/counter.cgi?p=" + jSONObject.optString("pairing_id") + "&i=" + jSONObject.optString("ip_addrs") + "&t=" + String.valueOf(System.currentTimeMillis() / 1000) + "&a=" + this.h.f24889a;
            if (str != null && str.length() > 0) {
                return str;
            }
        }
        return dVar2.d;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Message messageObtain;
        JSONObject jSONObject;
        Handler handler = this.f;
        if (handler == null) {
            return;
        }
        c.h.d dVar = this.d;
        c.h.d dVar2 = c.h.d.PRODUCTION_BEACON_URL;
        HashMap map = this.e;
        if (dVar == dVar2 && (jSONObject = this.i) != null) {
            map.put("User-Agent", jSONObject.optString("app_id") + q2.c + jSONObject.optString(k.a.q) + q2.c + jSONObject.optString("app_guid") + "/Android");
            map.put("Accept-Language", "en-us");
        }
        try {
            MagnesNetworkingFactoryImpl magnesNetworkingFactoryImpl = this.g;
            c.h.b bVar = c.h.b.GET;
            magnesNetworkingFactoryImpl.getClass();
            MagnesNetworking magnesNetworkingA = MagnesNetworkingFactoryImpl.a(bVar);
            String strC = c();
            if (strC == null) {
                return;
            }
            magnesNetworkingA.e(Uri.parse(strC));
            if (map != null && !map.isEmpty()) {
                magnesNetworkingA.d(map);
            }
            if (handler != null) {
                handler.sendMessage(Message.obtain(handler, 50, "Magnes Request Started for URL: ".concat(strC)));
            }
            int iA = magnesNetworkingA.a(null);
            String str = new String(magnesNetworkingA.b(), "UTF-8");
            Class<?> cls = getClass();
            StringBuilder sb = new StringBuilder("MagesGetRequest for ");
            YU.a.x(iA, this.d.d, " returned status code ", ", and responseString: ", sb);
            sb.append(str);
            lib.android.paypal.com.magnessdk.log.a.a(sb.toString(), 0, cls);
            if (iA == 200) {
                b(str);
                if (handler == null) {
                    return;
                } else {
                    messageObtain = Message.obtain(handler, 52, str);
                }
            } else {
                if (handler == null) {
                    return;
                }
                messageObtain = Message.obtain(handler, 51, iA + " : " + str);
            }
            handler.sendMessage(messageObtain);
        } catch (Exception e) {
            if (handler != null) {
                handler.sendMessage(Message.obtain(handler, 51, e));
            }
        }
    }
}
