package com.woolworths.shop.payment.fragment;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/shop/payment/fragment/ZeroPaymentResponse;", "Lcom/apollographql/apollo/api/Fragment$Data;", "OnPaymentSuccess", "OnPaymentValidationFailure", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ZeroPaymentResponse implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f23391a;
    public final OnPaymentSuccess b;
    public final OnPaymentValidationFailure c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/payment/fragment/ZeroPaymentResponse$OnPaymentSuccess;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPaymentSuccess {

        /* renamed from: a, reason: collision with root package name */
        public final int f23392a;
        public final boolean b;

        public OnPaymentSuccess(int i, boolean z) {
            this.f23392a = i;
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
            return this.f23392a == onPaymentSuccess.f23392a && this.b == onPaymentSuccess.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.f23392a) * 31);
        }

        public final String toString() {
            return "OnPaymentSuccess(orderId=" + this.f23392a + ", placed=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/payment/fragment/ZeroPaymentResponse$OnPaymentValidationFailure;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPaymentValidationFailure {

        /* renamed from: a, reason: collision with root package name */
        public final String f23393a;
        public final String b;

        public OnPaymentValidationFailure(String str, String str2) {
            this.f23393a = str;
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
            return Intrinsics.c(this.f23393a, onPaymentValidationFailure.f23393a) && Intrinsics.c(this.b, onPaymentValidationFailure.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23393a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnPaymentValidationFailure(errorMessage=", this.f23393a, ", errorCode=", this.b, ")");
        }
    }

    public ZeroPaymentResponse(String __typename, OnPaymentSuccess onPaymentSuccess, OnPaymentValidationFailure onPaymentValidationFailure) {
        Intrinsics.h(__typename, "__typename");
        this.f23391a = __typename;
        this.b = onPaymentSuccess;
        this.c = onPaymentValidationFailure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZeroPaymentResponse)) {
            return false;
        }
        ZeroPaymentResponse zeroPaymentResponse = (ZeroPaymentResponse) obj;
        return Intrinsics.c(this.f23391a, zeroPaymentResponse.f23391a) && Intrinsics.c(this.b, zeroPaymentResponse.b) && Intrinsics.c(this.c, zeroPaymentResponse.c);
    }

    public final int hashCode() {
        int iHashCode = this.f23391a.hashCode() * 31;
        OnPaymentSuccess onPaymentSuccess = this.b;
        int iHashCode2 = (iHashCode + (onPaymentSuccess == null ? 0 : onPaymentSuccess.hashCode())) * 31;
        OnPaymentValidationFailure onPaymentValidationFailure = this.c;
        return iHashCode2 + (onPaymentValidationFailure != null ? onPaymentValidationFailure.hashCode() : 0);
    }

    public final String toString() {
        return "ZeroPaymentResponse(__typename=" + this.f23391a + ", onPaymentSuccess=" + this.b + ", onPaymentValidationFailure=" + this.c + ")";
    }
}
