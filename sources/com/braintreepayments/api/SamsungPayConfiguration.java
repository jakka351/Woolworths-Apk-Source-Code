package com.braintreepayments.api;

import android.text.TextUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/SamsungPayConfiguration;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SamsungPayConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final String f13746a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/SamsungPayConfiguration$Companion;", "", "", "DISPLAY_NAME_KEY", "Ljava/lang/String;", "ENVIRONMENT", "SAMSUNG_AUTHORIZATION_KEY", "SERVICE_ID_KEY", "SUPPORTED_CARD_BRANDS_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public SamsungPayConfiguration(JSONObject jSONObject) throws JSONException {
        String strA = Json.a(jSONObject, "environment", "");
        Intrinsics.g(strA, "optString(json, ENVIRONMENT, \"\")");
        String strA2 = Json.a(jSONObject, "serviceId", "");
        Intrinsics.g(strA2, "optString(json, SERVICE_ID_KEY, \"\")");
        String strA3 = Json.a(jSONObject, "displayName", "");
        Intrinsics.g(strA3, "optString(json, DISPLAY_NAME_KEY, \"\")");
        JSONArray jSONArrayOptJSONArray = jSONObject != null ? jSONObject.optJSONArray("supportedCardBrands") : null;
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArrayOptJSONArray.getString(i);
                Intrinsics.g(string, "array.getString(i)");
                arrayList.add(string);
            }
        }
        String strA4 = Json.a(jSONObject, "samsungAuthorization", "");
        Intrinsics.g(strA4, "optString(json, SAMSUNG_AUTHORIZATION_KEY, \"\")");
        this.f13746a = strA;
        this.b = strA2;
        this.c = strA3;
        this.d = arrayList;
        this.e = strA4;
        TextUtils.isEmpty(strA4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SamsungPayConfiguration)) {
            return false;
        }
        SamsungPayConfiguration samsungPayConfiguration = (SamsungPayConfiguration) obj;
        return Intrinsics.c(this.f13746a, samsungPayConfiguration.f13746a) && Intrinsics.c(this.b, samsungPayConfiguration.b) && Intrinsics.c(this.c, samsungPayConfiguration.c) && Intrinsics.c(this.d, samsungPayConfiguration.d) && Intrinsics.c(this.e, samsungPayConfiguration.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + androidx.compose.ui.input.pointer.a.b(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(this.f13746a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SamsungPayConfiguration(environment=");
        sb.append(this.f13746a);
        sb.append(", serviceId=");
        sb.append(this.b);
        sb.append(", merchantDisplayName=");
        sb.append(this.c);
        sb.append(", supportedCardBrands=");
        sb.append(this.d);
        sb.append(", samsungAuthorization=");
        return androidx.camera.core.impl.b.r(sb, this.e, ')');
    }
}
