package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzflt implements WebViewCompat.WebMessageListener {
    final /* synthetic */ zzflv zza;

    public zzflt(zzflv zzflvVar) {
        Objects.requireNonNull(zzflvVar);
        this.zza = zzflvVar;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) throws JSONException {
        int i = webMessageCompat.b;
        if (i != 0) {
            throw new IllegalStateException(YU.a.o(new StringBuilder("Wrong data accessor type detected. "), i != 0 ? i != 1 ? "Unknown" : "ArrayBuffer" : "String", " expected, but got String"));
        }
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.f3841a);
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                zzflg.zza.getClass();
            }
        } catch (JSONException e) {
            zzfne.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
