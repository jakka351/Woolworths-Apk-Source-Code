package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PayPalVaultRequest extends PayPalRequest implements Parcelable {
    public static final Parcelable.Creator<PayPalVaultRequest> CREATOR = new AnonymousClass1();
    public boolean p;

    /* renamed from: com.braintreepayments.api.PayPalVaultRequest$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<PayPalVaultRequest> {
        @Override // android.os.Parcelable.Creator
        public final PayPalVaultRequest createFromParcel(Parcel parcel) {
            PayPalVaultRequest payPalVaultRequest = new PayPalVaultRequest(parcel);
            payPalVaultRequest.p = parcel.readByte() != 0;
            return payPalVaultRequest;
        }

        @Override // android.os.Parcelable.Creator
        public final PayPalVaultRequest[] newArray(int i) {
            return new PayPalVaultRequest[i];
        }
    }

    @Override // com.braintreepayments.api.PayPalRequest
    public final String a(Configuration configuration, Authorization authorization, String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("return_url", str).put("cancel_url", str2).put("offer_paypal_credit", this.p);
        if (authorization instanceof ClientToken) {
            jSONObjectPut.put("authorization_fingerprint", ((ClientToken) authorization).c);
        } else {
            jSONObjectPut.put("client_key", authorization.getC());
        }
        String str3 = this.e;
        if (!TextUtils.isEmpty(str3)) {
            jSONObjectPut.put(lqlqqlq.mmm006Dm006Dm, str3);
        }
        jSONObjectPut.putOpt("payer_email", null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("no_shipping", !this.f);
        jSONObject.put("landing_page_type", this.i);
        String str4 = this.j;
        if (TextUtils.isEmpty(str4)) {
            str4 = configuration.f;
        }
        jSONObject.put("brand_name", str4);
        String str5 = this.d;
        if (str5 != null) {
            jSONObject.put("locale_code", str5);
        }
        PostalAddress postalAddress = this.h;
        if (postalAddress != null) {
            jSONObject.put("address_override", !this.g);
            JSONObject jSONObject2 = new JSONObject();
            jSONObjectPut.put("shipping_address", jSONObject2);
            jSONObject2.put("line1", postalAddress.f);
            jSONObject2.put("line2", postalAddress.g);
            jSONObject2.put("city", postalAddress.h);
            jSONObject2.put("state", postalAddress.i);
            jSONObject2.put("postal_code", postalAddress.j);
            jSONObject2.put("country_code", postalAddress.l);
            jSONObject2.put("recipient_name", postalAddress.d);
        } else {
            jSONObject.put("address_override", false);
        }
        Object obj = this.k;
        if (obj != null) {
            jSONObjectPut.put("merchant_account_id", obj);
        }
        Object obj2 = this.l;
        if (obj2 != null) {
            jSONObjectPut.put("correlation_id", obj2);
        }
        jSONObjectPut.put("experience_profile", jSONObject);
        return jSONObjectPut.toString();
    }

    @Override // com.braintreepayments.api.PayPalRequest, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.braintreepayments.api.PayPalRequest, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
    }
}
