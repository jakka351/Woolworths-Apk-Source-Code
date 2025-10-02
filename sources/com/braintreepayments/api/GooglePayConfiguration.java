package com.braintreepayments.api;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/GooglePayConfiguration;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GooglePayConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13723a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final String f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/braintreepayments/api/GooglePayConfiguration$Companion;", "", "", "DISPLAY_NAME_KEY", "Ljava/lang/String;", "ENABLED_KEY", "ENVIRONMENT_KEY", "GOOGLE_AUTHORIZATION_FINGERPRINT_KEY", "PAYPAL_CLIENT_ID_KEY", "SUPPORTED_NETWORKS_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public GooglePayConfiguration(JSONObject jSONObject) throws JSONException {
        boolean zOptBoolean = jSONObject != null ? jSONObject.optBoolean("enabled", false) : false;
        String strA = Json.a(jSONObject, "googleAuthorizationFingerprint", null);
        String strA2 = Json.a(jSONObject, "environment", null);
        String strA3 = Json.a(jSONObject, "displayName", "");
        Intrinsics.g(strA3, "optString(json, DISPLAY_NAME_KEY, \"\")");
        JSONArray jSONArrayOptJSONArray = jSONObject != null ? jSONObject.optJSONArray("supportedNetworks") : null;
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArrayOptJSONArray.getString(i);
                    Intrinsics.g(string, "array.getString(i)");
                    arrayList.add(string);
                } catch (JSONException unused) {
                }
            }
        }
        String strA4 = Json.a(jSONObject, "paypalClientId", "");
        Intrinsics.g(strA4, "optString(json, PAYPAL_CLIENT_ID_KEY, \"\")");
        this.f13723a = zOptBoolean;
        this.b = strA;
        this.c = strA2;
        this.d = strA3;
        this.e = arrayList;
        this.f = strA4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayConfiguration)) {
            return false;
        }
        GooglePayConfiguration googlePayConfiguration = (GooglePayConfiguration) obj;
        return this.f13723a == googlePayConfiguration.f13723a && Intrinsics.c(this.b, googlePayConfiguration.b) && Intrinsics.c(this.c, googlePayConfiguration.c) && Intrinsics.c(this.d, googlePayConfiguration.d) && Intrinsics.c(this.e, googlePayConfiguration.e) && Intrinsics.c(this.f, googlePayConfiguration.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.f13723a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.b;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.f.hashCode() + androidx.compose.ui.input.pointer.a.b(androidx.camera.core.impl.b.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GooglePayConfiguration(isEnabled=");
        sb.append(this.f13723a);
        sb.append(", googleAuthorizationFingerprint=");
        sb.append(this.b);
        sb.append(", environment=");
        sb.append(this.c);
        sb.append(", displayName=");
        sb.append(this.d);
        sb.append(", supportedNetworks=");
        sb.append(this.e);
        sb.append(", paypalClientId=");
        return androidx.camera.core.impl.b.r(sb, this.f, ')');
    }
}
