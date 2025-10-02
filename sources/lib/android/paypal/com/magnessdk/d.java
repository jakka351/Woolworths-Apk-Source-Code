package lib.android.paypal.com.magnessdk;

import android.content.Context;
import android.os.Handler;
import lib.android.paypal.com.magnessdk.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f24892a;

    public d(MagnesSettings magnesSettings, Handler handler) throws JSONException {
        JSONObject jSONObjectE;
        Context context = magnesSettings.c;
        try {
            jSONObjectE = b.a(context, "RAMP_CONFIG");
            c.h.d dVar = c.h.d.RAMP_CONFIG_URL;
            if (jSONObjectE == null) {
                new lib.android.paypal.com.magnessdk.network.a(dVar, magnesSettings, handler, null).a();
                jSONObjectE = e();
            } else if (b.c(jSONObjectE, Long.parseLong(d(context, "RAMP_CONFIG")), c.EnumC0411c.RAMP)) {
                lib.android.paypal.com.magnessdk.log.a.a("Cached config used while fetching.", 0, getClass());
                new lib.android.paypal.com.magnessdk.network.a(dVar, magnesSettings, handler, null).a();
            }
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, getClass());
            jSONObjectE = e();
        }
        this.f24892a = jSONObjectE;
        try {
            lib.android.paypal.com.magnessdk.log.a.a(this.f24892a.toString(2), 0, getClass());
        } catch (JSONException unused) {
        }
    }

    public final JSONObject e() throws JSONException {
        lib.android.paypal.com.magnessdk.log.a.a("entering getDefaultConfig", 0, getClass());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("s", f());
            jSONObject.put("hw", f());
            jSONObject.put("ts", f());
            jSONObject.put("td", f());
            jSONObject.put("cr_ti", 7200);
            return jSONObject;
        } catch (JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, getClass());
            return jSONObject;
        }
    }

    public final JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("o", false);
            jSONObject.put("r", 0);
            jSONObject.put("m", "4.4.0");
            jSONObject.put("e", new JSONArray());
            jSONObject.put("ai", new JSONArray());
            jSONObject.put("as", new JSONArray());
            return jSONObject;
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a("Failed to create deafult config due to " + e.getLocalizedMessage(), 3, getClass());
            return jSONObject;
        }
    }
}
