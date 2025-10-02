package com.braintreepayments.api;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.storage.db.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/MetadataBuilder;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
/* loaded from: classes4.dex */
public final class MetadataBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f13730a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/braintreepayments/api/MetadataBuilder$Companion;", "", "", "INTEGRATION_KEY", "Ljava/lang/String;", "META_KEY", "PLATFORM_KEY", "SESSION_ID_KEY", "SOURCE_KEY", "VERSION_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public MetadataBuilder() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.f13730a = jSONObject;
        try {
            jSONObject.put(k.a.b, "android");
        } catch (JSONException unused) {
        }
    }

    public final String toString() {
        String string = this.f13730a.toString();
        Intrinsics.g(string, "json.toString()");
        return string;
    }
}
