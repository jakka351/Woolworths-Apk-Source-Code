package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class PayPalAccountNonce extends PaymentMethodNonce {
    public static final Parcelable.Creator<PayPalAccountNonce> CREATOR = new AnonymousClass1();
    public final String f;
    public final PostalAddress g;
    public final PostalAddress h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final PayPalCreditFinancing n;
    public final String o;

    /* renamed from: com.braintreepayments.api.PayPalAccountNonce$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<PayPalAccountNonce> {
        @Override // android.os.Parcelable.Creator
        public final PayPalAccountNonce createFromParcel(Parcel parcel) {
            return new PayPalAccountNonce(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PayPalAccountNonce[] newArray(int i) {
            return new PayPalAccountNonce[i];
        }
    }

    public PayPalAccountNonce(String str, PostalAddress postalAddress, PostalAddress postalAddress2, String str2, String str3, String str4, String str5, String str6, PayPalCreditFinancing payPalCreditFinancing, String str7, String str8, boolean z) {
        super(str8, z);
        this.f = str;
        this.g = postalAddress;
        this.h = postalAddress2;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = str6;
        this.n = payPalCreditFinancing;
        this.o = str7;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:0|2|(1:4)(22:6|(1:8)|9|45|10|(1:12)(1:15)|43|16|(1:18)|20|49|21|47|22|41|23|(1:25)|29|30|(1:37)|38|39)|5|9|45|10|(0)(0)|43|16|(0)|20|49|21|47|22|41|23|(0)|29|30|(2:35|37)|38|39|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        r2 = "";
        r13 = r2;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        r7 = r3;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
    
        r7 = r3;
        r2 = "";
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        r7 = r3;
        r2 = "";
        r13 = r2;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
    
        r11 = new com.braintreepayments.api.PostalAddress();
        r16 = r2;
        r2 = new com.braintreepayments.api.PostalAddress();
        r12 = r4;
        r17 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006e A[Catch: JSONException -> 0x0077, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0077, blocks: (B:10:0x0068, B:12:0x006e), top: B:45:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f A[Catch: JSONException -> 0x0094, TryCatch #1 {JSONException -> 0x0094, blocks: (B:16:0x007d, B:18:0x008f, B:20:0x0096), top: B:43:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc A[Catch: JSONException -> 0x00c1, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00c1, blocks: (B:23:0x00b4, B:25:0x00bc), top: B:41:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.braintreepayments.api.PayPalAccountNonce a(org.json.JSONObject r21) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.PayPalAccountNonce.a(org.json.JSONObject):com.braintreepayments.api.PayPalAccountNonce");
    }

    @Override // com.braintreepayments.api.PaymentMethodNonce, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.l);
        parcel.writeString(this.k);
        parcel.writeString(this.m);
        parcel.writeParcelable(this.n, i);
        parcel.writeString(this.o);
    }

    public PayPalAccountNonce(Parcel parcel) {
        super(parcel);
        this.f = parcel.readString();
        this.g = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.h = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.l = parcel.readString();
        this.k = parcel.readString();
        this.m = parcel.readString();
        this.n = (PayPalCreditFinancing) parcel.readParcelable(PayPalCreditFinancing.class.getClassLoader());
        this.o = parcel.readString();
    }
}
