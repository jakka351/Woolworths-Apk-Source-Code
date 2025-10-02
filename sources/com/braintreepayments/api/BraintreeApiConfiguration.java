package com.braintreepayments.api;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/BraintreeApiConfiguration;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BraintreeApiConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final String f13700a;
    public final String b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/BraintreeApiConfiguration$Companion;", "", "", "ACCESS_TOKEN_KEY", "Ljava/lang/String;", "URL_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public BraintreeApiConfiguration(JSONObject jSONObject) {
        String strA = Json.a(jSONObject, "accessToken", "");
        Intrinsics.g(strA, "optString(json, ACCESS_TOKEN_KEY, \"\")");
        String strA2 = Json.a(jSONObject, "url", "");
        Intrinsics.g(strA2, "optString(json, URL_KEY, \"\")");
        this.f13700a = strA;
        this.b = strA2;
        TextUtils.isEmpty(strA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BraintreeApiConfiguration)) {
            return false;
        }
        BraintreeApiConfiguration braintreeApiConfiguration = (BraintreeApiConfiguration) obj;
        return Intrinsics.c(this.f13700a, braintreeApiConfiguration.f13700a) && Intrinsics.c(this.b, braintreeApiConfiguration.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13700a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BraintreeApiConfiguration(accessToken=");
        sb.append(this.f13700a);
        sb.append(", url=");
        return androidx.camera.core.impl.b.r(sb, this.b, ')');
    }
}
