package com.braintreepayments.api;

import androidx.annotation.RestrictTo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/PostalAddressParser;", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
/* loaded from: classes4.dex */
public final class PostalAddressParser {
    public static final PostalAddress a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new PostalAddress();
        }
        String strA = Json.a(jSONObject, "street1", null);
        String strA2 = Json.a(jSONObject, "street2", null);
        String strA3 = Json.a(jSONObject, "country", null);
        if (strA == null) {
            strA = Json.a(jSONObject, "line1", null);
        }
        if (strA2 == null) {
            strA2 = Json.a(jSONObject, "line2", null);
        }
        if (strA3 == null) {
            strA3 = Json.a(jSONObject, "countryCode", null);
        }
        if (strA == null) {
            strA = Json.a(jSONObject, "addressLine1", null);
        }
        if (strA2 == null) {
            strA2 = Json.a(jSONObject, "addressLine2", null);
        }
        if (strA == null && Json.a(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, null) != null) {
            PostalAddress postalAddress = new PostalAddress();
            postalAddress.d = Json.a(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
            postalAddress.e = Json.a(jSONObject, "phoneNumber", "");
            postalAddress.f = Json.a(jSONObject, "address1", "");
            postalAddress.g = StringsKt.k0(Json.a(jSONObject, "address2", "") + '\n' + Json.a(jSONObject, "address3", "") + '\n' + Json.a(jSONObject, "address4", "") + '\n' + Json.a(jSONObject, "address5", "")).toString();
            postalAddress.h = Json.a(jSONObject, "locality", "");
            postalAddress.i = Json.a(jSONObject, "administrativeArea", "");
            postalAddress.l = Json.a(jSONObject, "countryCode", "");
            postalAddress.j = Json.a(jSONObject, "postalCode", "");
            postalAddress.k = Json.a(jSONObject, "sortingCode", "");
            return postalAddress;
        }
        PostalAddress postalAddress2 = new PostalAddress();
        postalAddress2.d = Json.a(jSONObject, "recipientName", null);
        postalAddress2.f = strA;
        postalAddress2.g = strA2;
        postalAddress2.h = Json.a(jSONObject, "city", null);
        postalAddress2.i = Json.a(jSONObject, "state", null);
        postalAddress2.j = Json.a(jSONObject, "postalCode", null);
        postalAddress2.l = strA3;
        String strA4 = postalAddress2.d;
        if (strA4 == null) {
            strA4 = Json.a(jSONObject, "fullName", null);
        }
        postalAddress2.d = strA4;
        String strA5 = postalAddress2.h;
        if (strA5 == null) {
            strA5 = Json.a(jSONObject, "adminArea2", null);
        }
        postalAddress2.h = strA5;
        String strA6 = postalAddress2.i;
        if (strA6 == null) {
            strA6 = Json.a(jSONObject, "adminArea1", null);
        }
        postalAddress2.i = strA6;
        return postalAddress2;
    }
}
