package com.braintreepayments.api;

import android.text.TextUtils;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/Configuration;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public class Configuration {

    /* renamed from: a, reason: collision with root package name */
    public final String f13715a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final LinkedHashSet h;
    public final String i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/braintreepayments/api/Configuration$Companion;", "", "", "ASSETS_URL_KEY", "Ljava/lang/String;", "BRAINTREE_API_KEY", "CARDINAL_AUTHENTICATION_JWT", "CARD_KEY", "CHALLENGES_KEY", "CLIENT_API_URL_KEY", "ENVIRONMENT_KEY", "GOOGLE_PAY_KEY", "GRAPHQL_KEY", "MERCHANT_ACCOUNT_ID_KEY", "MERCHANT_ID_KEY", "PAYPAL_ENABLED_KEY", "PAYPAL_KEY", "PAY_WITH_VENMO_KEY", "SAMSUNG_PAY_KEY", "THREE_D_SECURE_ENABLED_KEY", "UNIONPAY_KEY", "VISA_CHECKOUT_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public Configuration(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Configuration cannot be null");
        }
        this.i = str;
        JSONObject jSONObject = new JSONObject(str);
        Intrinsics.g(Json.a(jSONObject, "assetsUrl", ""), "optString(json, ASSETS_URL_KEY, \"\")");
        String string = jSONObject.getString("clientApiUrl");
        Intrinsics.g(string, "json.getString(CLIENT_API_URL_KEY)");
        this.f13715a = string;
        this.h = new LinkedHashSet();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("challenges");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                LinkedHashSet linkedHashSet = this.h;
                String strOptString = jSONArrayOptJSONArray.optString(i, "");
                Intrinsics.g(strOptString, "challengesArray.optString(i, \"\")");
                linkedHashSet.add(strOptString);
            }
        }
        new BraintreeApiConfiguration(jSONObject.optJSONObject("braintreeApi"));
        new CardConfiguration(jSONObject.optJSONObject("creditCards"));
        Json.a(jSONObject, "cardinalAuthenticationJWT", null);
        String string2 = jSONObject.getString("environment");
        Intrinsics.g(string2, "json.getString(ENVIRONMENT_KEY)");
        this.b = string2;
        new GooglePayConfiguration(jSONObject.optJSONObject("androidPay"));
        new GraphQLConfiguration(jSONObject.optJSONObject("graphQL"));
        this.c = jSONObject.optBoolean("paypalEnabled", false);
        jSONObject.optBoolean("threeDSecureEnabled", false);
        Json.a(jSONObject, "merchantAccountId", null);
        String string3 = jSONObject.getString("merchantId");
        Intrinsics.g(string3, "json.getString(MERCHANT_ID_KEY)");
        this.d = string3;
        PayPalConfiguration payPalConfiguration = new PayPalConfiguration(jSONObject.optJSONObject("paypal"));
        SamsungPayConfiguration samsungPayConfiguration = new SamsungPayConfiguration(jSONObject.optJSONObject("samsungPay"));
        new UnionPayConfiguration(jSONObject.optJSONObject("unionPay"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payWithVenmo");
        String strA = Json.a(jSONObjectOptJSONObject, "accessToken", "");
        Intrinsics.g(strA, "optString(json, ACCESS_TOKEN_KEY, \"\")");
        Intrinsics.g(Json.a(jSONObjectOptJSONObject, "environment", ""), "optString(json, ENVIRONMENT_KEY, \"\")");
        Intrinsics.g(Json.a(jSONObjectOptJSONObject, "merchantId", ""), "optString(json, MERCHANT_ID_KEY, \"\")");
        if (jSONObjectOptJSONObject != null && !jSONObjectOptJSONObject.isNull("enrichedCustomerDataEnabled")) {
            jSONObjectOptJSONObject.optBoolean("enrichedCustomerDataEnabled", false);
        }
        TextUtils.isEmpty(strA);
        new VisaCheckoutConfiguration(jSONObject.optJSONObject("visaCheckout"));
        this.h.contains("cvv");
        this.h.contains("postal_code");
        this.e = payPalConfiguration.b;
        this.f = payPalConfiguration.f13735a;
        this.g = CollectionsKt.G0(samsungPayConfiguration.d);
    }
}
