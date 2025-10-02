package com.woolworths.shop.payment.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/shop/payment/fragment/PaymentResponse;", "Lcom/apollographql/apollo/api/Fragment$Data;", "OnPaymentSuccess", "OnPaymentFailure", "OnPaymentValidationFailure", "PaymentError", "StepUp", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PaymentResponse implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f23379a;
    public final OnPaymentSuccess b;
    public final OnPaymentFailure c;
    public final OnPaymentValidationFailure d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/payment/fragment/PaymentResponse$OnPaymentFailure;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPaymentFailure {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f23380a;

        public OnPaymentFailure(ArrayList arrayList) {
            this.f23380a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPaymentFailure) && this.f23380a.equals(((OnPaymentFailure) obj).f23380a);
        }

        public final int hashCode() {
            return this.f23380a.hashCode();
        }

        public final String toString() {
            return a.k("OnPaymentFailure(paymentErrors=", ")", this.f23380a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/payment/fragment/PaymentResponse$OnPaymentSuccess;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPaymentSuccess {

        /* renamed from: a, reason: collision with root package name */
        public final int f23381a;
        public final boolean b;

        public OnPaymentSuccess(int i, boolean z) {
            this.f23381a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPaymentSuccess)) {
                return false;
            }
            OnPaymentSuccess onPaymentSuccess = (OnPaymentSuccess) obj;
            return this.f23381a == onPaymentSuccess.f23381a && this.b == onPaymentSuccess.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.f23381a) * 31);
        }

        public final String toString() {
            return "OnPaymentSuccess(orderId=" + this.f23381a + ", placed=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/payment/fragment/PaymentResponse$OnPaymentValidationFailure;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPaymentValidationFailure {

        /* renamed from: a, reason: collision with root package name */
        public final String f23382a;
        public final String b;

        public OnPaymentValidationFailure(String str, String str2) {
            this.f23382a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPaymentValidationFailure)) {
                return false;
            }
            OnPaymentValidationFailure onPaymentValidationFailure = (OnPaymentValidationFailure) obj;
            return Intrinsics.c(this.f23382a, onPaymentValidationFailure.f23382a) && Intrinsics.c(this.b, onPaymentValidationFailure.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23382a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnPaymentValidationFailure(errorMessage=", this.f23382a, ", errorCode=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/payment/fragment/PaymentResponse$PaymentError;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentError {

        /* renamed from: a, reason: collision with root package name */
        public final String f23383a;
        public final String b;
        public final String c;
        public final StepUp d;

        public PaymentError(String str, String str2, String str3, StepUp stepUp) {
            this.f23383a = str;
            this.b = str2;
            this.c = str3;
            this.d = stepUp;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentError)) {
                return false;
            }
            PaymentError paymentError = (PaymentError) obj;
            return Intrinsics.c(this.f23383a, paymentError.f23383a) && Intrinsics.c(this.b, paymentError.b) && Intrinsics.c(this.c, paymentError.c) && Intrinsics.c(this.d, paymentError.d);
        }

        public final int hashCode() {
            String str = this.f23383a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            StepUp stepUp = this.d;
            return iHashCode3 + (stepUp != null ? stepUp.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("PaymentError(paymentInstrumentId=", this.f23383a, ", errorCode=", this.b, ", errorMessage=");
            sbV.append(this.c);
            sbV.append(", stepUp=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/payment/fragment/PaymentResponse$StepUp;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StepUp {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f23384a;
        public final String b;

        public StepUp(boolean z, String str) {
            this.f23384a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StepUp)) {
                return false;
            }
            StepUp stepUp = (StepUp) obj;
            return this.f23384a == stepUp.f23384a && Intrinsics.c(this.b, stepUp.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f23384a) * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.m("StepUp(mandatory=", this.f23384a, ", url=", this.b, ")");
        }
    }

    public PaymentResponse(String __typename, OnPaymentSuccess onPaymentSuccess, OnPaymentFailure onPaymentFailure, OnPaymentValidationFailure onPaymentValidationFailure) {
        Intrinsics.h(__typename, "__typename");
        this.f23379a = __typename;
        this.b = onPaymentSuccess;
        this.c = onPaymentFailure;
        this.d = onPaymentValidationFailure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentResponse)) {
            return false;
        }
        PaymentResponse paymentResponse = (PaymentResponse) obj;
        return Intrinsics.c(this.f23379a, paymentResponse.f23379a) && Intrinsics.c(this.b, paymentResponse.b) && Intrinsics.c(this.c, paymentResponse.c) && Intrinsics.c(this.d, paymentResponse.d);
    }

    public final int hashCode() {
        int iHashCode = this.f23379a.hashCode() * 31;
        OnPaymentSuccess onPaymentSuccess = this.b;
        int iHashCode2 = (iHashCode + (onPaymentSuccess == null ? 0 : onPaymentSuccess.hashCode())) * 31;
        OnPaymentFailure onPaymentFailure = this.c;
        int iHashCode3 = (iHashCode2 + (onPaymentFailure == null ? 0 : onPaymentFailure.f23380a.hashCode())) * 31;
        OnPaymentValidationFailure onPaymentValidationFailure = this.d;
        return iHashCode3 + (onPaymentValidationFailure != null ? onPaymentValidationFailure.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentResponse(__typename=" + this.f23379a + ", onPaymentSuccess=" + this.b + ", onPaymentFailure=" + this.c + ", onPaymentValidationFailure=" + this.d + ")";
    }
}
