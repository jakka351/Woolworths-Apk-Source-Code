package com.braintreepayments.api;

import android.text.TextUtils;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/PayPalConfiguration;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class PayPalConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final String f13735a;
    public final String b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/braintreepayments/api/PayPalConfiguration$Companion;", "", "", "CLIENT_ID_KEY", "Ljava/lang/String;", "CURRENCY_ISO_CODE_KEY", "DIRECT_BASE_URL_KEY", "DISPLAY_NAME_KEY", "ENVIRONMENT_KEY", "PRIVACY_URL_KEY", "TOUCH_DISABLED_KEY", "USER_AGREEMENT_URL_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public PayPalConfiguration(JSONObject jSONObject) {
        TextUtils.isEmpty(Json.a(jSONObject, "directBaseUrl", null));
        String strA = Json.a(jSONObject, "displayName", null);
        Json.a(jSONObject, "clientId", null);
        Json.a(jSONObject, "privacyUrl", null);
        Json.a(jSONObject, "userAgreementUrl", null);
        Json.a(jSONObject, "environment", null);
        if (jSONObject != null) {
            jSONObject.optBoolean("touchDisabled", true);
        }
        String strA2 = Json.a(jSONObject, "currencyIsoCode", null);
        this.f13735a = strA;
        this.b = strA2;
    }
}
