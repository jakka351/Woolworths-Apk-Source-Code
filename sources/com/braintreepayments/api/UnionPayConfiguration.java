package com.braintreepayments.api;

import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/UnionPayConfiguration;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UnionPayConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13751a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/braintreepayments/api/UnionPayConfiguration$Companion;", "", "", "ENABLED", "Ljava/lang/String;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public UnionPayConfiguration(JSONObject jSONObject) {
        this.f13751a = jSONObject != null ? jSONObject.optBoolean("enabled", false) : false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnionPayConfiguration) && this.f13751a == ((UnionPayConfiguration) obj).f13751a;
    }

    public final int hashCode() {
        boolean z = this.f13751a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return androidx.camera.core.impl.b.s(new StringBuilder("UnionPayConfiguration(isEnabled="), this.f13751a, ')');
    }
}
