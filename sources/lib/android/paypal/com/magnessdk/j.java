package lib.android.paypal.com.magnessdk;

import android.content.Context;
import lib.android.paypal.com.magnessdk.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
final class j extends g {
    public static j l;
    public String c;
    public JSONObject d;
    public e e;
    public JSONArray f;
    public lib.android.paypal.com.magnessdk.network.base.e g;
    public MagnesSettings h;
    public m i;
    public m j;
    public m k;

    class a implements Runnable {
        public final /* synthetic */ JSONObject d;

        public a(JSONObject jSONObject) {
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() throws JSONException {
            JSONObject jSONObjectC;
            j jVar = j.this;
            m mVar = jVar.i;
            boolean z = false;
            JSONObject jSONObject = this.d;
            if (mVar != null && jSONObject.optBoolean("ac", false)) {
                jVar.f.put(jVar.i.b());
            }
            if (jVar.j != null && jSONObject.optBoolean("gy", false)) {
                jVar.f.put(jVar.j.b());
            }
            if (jVar.k != null && jSONObject.optBoolean("mg", false)) {
                jVar.f.put(jVar.k.b());
            }
            try {
                MagnesSDK magnesSDKB = MagnesSDK.b();
                if (magnesSDKB.f == null) {
                    magnesSDKB.f = new d(magnesSDKB.b, magnesSDKB.c);
                }
                JSONObject jSONObjectOptJSONObject = magnesSDKB.f.f24892a.optJSONObject("s");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt("r", 0) < 0) {
                    z = true;
                }
                boolean z2 = z;
                if (z2) {
                    jSONObjectC = g.c(jVar.c, "s", jVar.f);
                } else {
                    String str = jVar.c;
                    JSONArray jSONArray = jVar.f;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("pairing_id", str);
                    jSONObject2.put("s", jSONArray);
                    jSONObjectC = jSONObject2;
                }
                lib.android.paypal.com.magnessdk.network.b bVar = new lib.android.paypal.com.magnessdk.network.b(c.h.d.PRODUCTION_JSON_URL, jSONObjectC, z2, jVar.h, jVar.g);
                bVar.h.getClass();
                bVar.a();
            } catch (Exception e) {
                lib.android.paypal.com.magnessdk.log.a.b(e, j.class);
            }
        }
    }

    public final void i(int i, MagnesSettings magnesSettings) {
        m mVar;
        try {
            Context context = magnesSettings.c;
            if (i == 96) {
                this.e.getClass();
                if (!e.b.get(i)) {
                    return;
                }
                this.i = new m(context, this.g, 1);
                if (!this.d.optBoolean("ac", false)) {
                    return;
                } else {
                    mVar = this.i;
                }
            } else if (i == 97) {
                this.e.getClass();
                if (!e.b.get(i)) {
                    return;
                }
                this.j = new m(context, this.g, 4);
                if (!this.d.optBoolean("gy", false)) {
                    return;
                } else {
                    mVar = this.j;
                }
            } else {
                if (i != 102) {
                    return;
                }
                this.e.getClass();
                if (!e.b.get(i)) {
                    return;
                }
                this.k = new m(context, this.g, 2);
                if (!this.d.optBoolean("mg", false)) {
                    return;
                } else {
                    mVar = this.k;
                }
            }
            mVar.getClass();
            mVar.f = new JSONObject();
            mVar.i = new JSONArray();
            mVar.g = new JSONArray();
            mVar.a();
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, j.class);
        }
    }
}
