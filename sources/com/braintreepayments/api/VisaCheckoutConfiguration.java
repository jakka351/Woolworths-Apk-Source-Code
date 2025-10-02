package com.braintreepayments.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/VisaCheckoutConfiguration;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VisaCheckoutConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final String f13752a;
    public final String b;
    public final ArrayList c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/VisaCheckoutConfiguration$Companion;", "", "", "API_KEY", "Ljava/lang/String;", "EXTERNAL_CLIENT_ID", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public VisaCheckoutConfiguration(JSONObject jSONObject) {
        String strA = Json.a(jSONObject, "apikey", "");
        Intrinsics.g(strA, "optString(json, API_KEY, \"\")");
        String strA2 = Json.a(jSONObject, "externalClientId", "");
        Intrinsics.g(strA2, "optString(json, EXTERNAL_CLIENT_ID, \"\")");
        CardConfiguration cardConfiguration = new CardConfiguration(jSONObject);
        ArrayList arrayList = new ArrayList();
        Iterator it = cardConfiguration.f13713a.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            switch (lowerCase.hashCode()) {
                case -2038717326:
                    if (!lowerCase.equals("mastercard")) {
                        break;
                    } else {
                        arrayList.add("MASTERCARD");
                        break;
                    }
                case -1120637072:
                    if (!lowerCase.equals("american express")) {
                        break;
                    } else {
                        arrayList.add("AMEX");
                        break;
                    }
                case 3619905:
                    if (!lowerCase.equals("visa")) {
                        break;
                    } else {
                        arrayList.add("VISA");
                        break;
                    }
                case 273184745:
                    if (!lowerCase.equals("discover")) {
                        break;
                    } else {
                        arrayList.add("DISCOVER");
                        break;
                    }
            }
        }
        this.f13752a = strA;
        this.b = strA2;
        this.c = arrayList;
        strA.equals("");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisaCheckoutConfiguration)) {
            return false;
        }
        VisaCheckoutConfiguration visaCheckoutConfiguration = (VisaCheckoutConfiguration) obj;
        return Intrinsics.c(this.f13752a, visaCheckoutConfiguration.f13752a) && Intrinsics.c(this.b, visaCheckoutConfiguration.b) && Intrinsics.c(this.c, visaCheckoutConfiguration.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.camera.core.impl.b.c(this.f13752a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "VisaCheckoutConfiguration(apiKey=" + this.f13752a + ", externalClientId=" + this.b + ", acceptedCardBrands=" + this.c + ')';
    }
}
