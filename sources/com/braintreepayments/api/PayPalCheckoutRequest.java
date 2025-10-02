package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PayPalCheckoutRequest extends PayPalRequest implements Parcelable {
    public static final Parcelable.Creator<PayPalCheckoutRequest> CREATOR = new AnonymousClass1();
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final boolean t;
    public final boolean u;

    /* renamed from: com.braintreepayments.api.PayPalCheckoutRequest$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<PayPalCheckoutRequest> {
        @Override // android.os.Parcelable.Creator
        public final PayPalCheckoutRequest createFromParcel(Parcel parcel) {
            return new PayPalCheckoutRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PayPalCheckoutRequest[] newArray(int i) {
            return new PayPalCheckoutRequest[i];
        }
    }

    public PayPalCheckoutRequest(Parcel parcel) {
        super(parcel);
        this.p = "authorize";
        this.q = "";
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readString();
        this.t = parcel.readByte() != 0;
        this.u = parcel.readByte() != 0;
    }

    @Override // com.braintreepayments.api.PayPalRequest
    public final String a(Configuration configuration, Authorization authorization, String str, String str2) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObjectPut = new JSONObject().put("return_url", str).put("cancel_url", str2).put("offer_pay_later", this.u);
        if (authorization instanceof ClientToken) {
            jSONObjectPut.put("authorization_fingerprint", ((ClientToken) authorization).c);
        } else {
            jSONObjectPut.put("client_key", authorization.getC());
        }
        boolean z = this.t;
        if (z) {
            jSONObjectPut.put("request_billing_agreement", true);
        }
        if (z) {
            String str3 = this.e;
            if (!TextUtils.isEmpty(str3)) {
                jSONObjectPut.put("billing_agreement_details", new JSONObject().put(lqlqqlq.mmm006Dm006Dm, str3));
            }
        }
        Object obj = this.s;
        if (obj == null) {
            obj = configuration.e;
        }
        jSONObjectPut.put("amount", this.r).put("currency_iso_code", obj).put("intent", this.p);
        ArrayList arrayList = this.m;
        if (!arrayList.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                PayPalLineItem payPalLineItem = (PayPalLineItem) it.next();
                payPalLineItem.getClass();
                try {
                    jSONObject = new JSONObject().putOpt(lqlqqlq.mmm006Dm006Dm, payPalLineItem.d).putOpt("image_url", payPalLineItem.e).putOpt("kind", payPalLineItem.f).putOpt(AppMeasurementSdk.ConditionalUserProperty.NAME, payPalLineItem.g).putOpt("product_code", payPalLineItem.h).putOpt("quantity", payPalLineItem.i).putOpt("unit_amount", payPalLineItem.j).putOpt("unit_tax_amount", payPalLineItem.k).putOpt("upc_code", payPalLineItem.l).putOpt("upc_type", payPalLineItem.m).putOpt("url", payPalLineItem.n);
                } catch (JSONException unused) {
                    jSONObject = new JSONObject();
                }
                jSONArray.put(jSONObject);
            }
            jSONObjectPut.put("line_items", jSONArray);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("no_shipping", !this.f);
        jSONObject2.put("landing_page_type", this.i);
        String str4 = this.j;
        if (TextUtils.isEmpty(str4)) {
            str4 = configuration.f;
        }
        jSONObject2.put("brand_name", str4);
        String str5 = this.d;
        if (str5 != null) {
            jSONObject2.put("locale_code", str5);
        }
        String str6 = this.q;
        if (str6 != "") {
            jSONObject2.put("user_action", str6);
        }
        PostalAddress postalAddress = this.h;
        if (postalAddress != null) {
            jSONObject2.put("address_override", true ^ this.g);
            jSONObjectPut.put("line1", postalAddress.f);
            jSONObjectPut.put("line2", postalAddress.g);
            jSONObjectPut.put("city", postalAddress.h);
            jSONObjectPut.put("state", postalAddress.i);
            jSONObjectPut.put("postal_code", postalAddress.j);
            jSONObjectPut.put("country_code", postalAddress.l);
            jSONObjectPut.put("recipient_name", postalAddress.d);
        } else {
            jSONObject2.put("address_override", false);
        }
        Object obj2 = this.k;
        if (obj2 != null) {
            jSONObjectPut.put("merchant_account_id", obj2);
        }
        Object obj3 = this.l;
        if (obj3 != null) {
            jSONObjectPut.put("correlation_id", obj3);
        }
        jSONObjectPut.put("experience_profile", jSONObject2);
        return jSONObjectPut.toString();
    }

    @Override // com.braintreepayments.api.PayPalRequest, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.braintreepayments.api.PayPalRequest, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.u ? (byte) 1 : (byte) 0);
    }
}
