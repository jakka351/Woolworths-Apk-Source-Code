package com.braintreepayments.api;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/CardConfiguration;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CardConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13713a;
    public final boolean b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/CardConfiguration$Companion;", "", "", "COLLECT_DEVICE_DATA_KEY", "Ljava/lang/String;", "SUPPORTED_CARD_TYPES_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public CardConfiguration(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject != null ? jSONObject.optJSONArray("supportedCardTypes") : null;
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i, "");
                Intrinsics.g(strOptString, "array.optString(i, \"\")");
                arrayList.add(strOptString);
            }
        }
        boolean zOptBoolean = jSONObject != null ? jSONObject.optBoolean("collectDeviceData", false) : false;
        this.f13713a = arrayList;
        this.b = zOptBoolean;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardConfiguration)) {
            return false;
        }
        CardConfiguration cardConfiguration = (CardConfiguration) obj;
        return Intrinsics.c(this.f13713a, cardConfiguration.f13713a) && this.b == cardConfiguration.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.f13713a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardConfiguration(supportedCardTypes=");
        sb.append(this.f13713a);
        sb.append(", isFraudDataCollectionEnabled=");
        return androidx.camera.core.impl.b.s(sb, this.b, ')');
    }
}
