package com.braintreepayments.api;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class BrowserSwitchRequest {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13711a;
    public final int b;
    public final JSONObject c;
    public final String d;
    public final Uri e;
    public boolean f;

    public BrowserSwitchRequest(int i, Uri uri, JSONObject jSONObject, String str, Uri uri2, boolean z) {
        this.f13711a = uri;
        this.b = i;
        this.c = jSONObject;
        this.d = str;
        this.e = uri2;
        this.f = z;
    }

    public static BrowserSwitchRequest a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        int i = jSONObject.getInt("requestCode");
        String string = jSONObject.getString("url");
        return new BrowserSwitchRequest(i, Uri.parse(string), jSONObject.optJSONObject("metadata"), jSONObject.has("returnUrlScheme") ? jSONObject.getString("returnUrlScheme") : null, jSONObject.has("appLinkUri") ? Uri.parse(jSONObject.getString("appLinkUri")) : null, jSONObject.optBoolean("shouldNotify", true));
    }

    public final String b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestCode", this.b);
        jSONObject.put("url", this.f13711a.toString());
        jSONObject.put("returnUrlScheme", this.d);
        jSONObject.put("shouldNotify", this.f);
        JSONObject jSONObject2 = this.c;
        if (jSONObject2 != null) {
            jSONObject.put("metadata", jSONObject2);
        }
        Uri uri = this.e;
        if (uri != null) {
            jSONObject.put("appLinkUri", uri.toString());
        }
        return jSONObject.toString();
    }
}
