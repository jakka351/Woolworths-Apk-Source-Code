package com.woolworths.feature.shop.payment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.payment.graphql.type.PaymentInput;
import au.com.woolworths.payment.graphql.type.adapter.PaymentInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.payment.adapter.PayMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/woolworths/feature/shop/payment/PayMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/payment/PayMutation$Data;", "Data", "Pay", "OnWpayPaymentResponse", "OnWpayPaymentSuccess", "OnWpayPaymentFailure", "Analytics", "OnWpayPaymentValidationFailure", "Analytics1", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PayMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentInput f20204a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/payment/PayMutation$Analytics;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20205a;
        public final com.woolworths.feature.shop.payment.fragment.Analytics b;

        public Analytics(String str, com.woolworths.feature.shop.payment.fragment.Analytics analytics) {
            this.f20205a = str;
            this.b = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return Intrinsics.c(this.f20205a, analytics.f20205a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20205a.hashCode() * 31);
        }

        public final String toString() {
            return "Analytics(__typename=" + this.f20205a + ", analytics=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/payment/PayMutation$Analytics1;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20206a;
        public final com.woolworths.feature.shop.payment.fragment.Analytics b;

        public Analytics1(String str, com.woolworths.feature.shop.payment.fragment.Analytics analytics) {
            this.f20206a = str;
            this.b = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics1)) {
                return false;
            }
            Analytics1 analytics1 = (Analytics1) obj;
            return Intrinsics.c(this.f20206a, analytics1.f20206a) && Intrinsics.c(this.b, analytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20206a.hashCode() * 31);
        }

        public final String toString() {
            return "Analytics1(__typename=" + this.f20206a + ", analytics=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/payment/PayMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/payment/PayMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final Pay f20207a;

        public Data(Pay pay) {
            this.f20207a = pay;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20207a, ((Data) obj).f20207a);
        }

        public final int hashCode() {
            return this.f20207a.hashCode();
        }

        public final String toString() {
            return "Data(pay=" + this.f20207a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/payment/PayMutation$OnWpayPaymentFailure;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnWpayPaymentFailure {

        /* renamed from: a, reason: collision with root package name */
        public final String f20208a;
        public final Analytics b;
        public final boolean c;

        public OnWpayPaymentFailure(String str, Analytics analytics, boolean z) {
            this.f20208a = str;
            this.b = analytics;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnWpayPaymentFailure)) {
                return false;
            }
            OnWpayPaymentFailure onWpayPaymentFailure = (OnWpayPaymentFailure) obj;
            return Intrinsics.c(this.f20208a, onWpayPaymentFailure.f20208a) && Intrinsics.c(this.b, onWpayPaymentFailure.b) && this.c == onWpayPaymentFailure.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f20208a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnWpayPaymentFailure(errorMessage=");
            sb.append(this.f20208a);
            sb.append(", analytics=");
            sb.append(this.b);
            sb.append(", regenerateIdempotencyKey=");
            return a.k(")", sb, this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/payment/PayMutation$OnWpayPaymentResponse;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnWpayPaymentResponse {

        /* renamed from: a, reason: collision with root package name */
        public final String f20209a;
        public final OnWpayPaymentSuccess b;
        public final OnWpayPaymentFailure c;
        public final OnWpayPaymentValidationFailure d;

        public OnWpayPaymentResponse(String __typename, OnWpayPaymentSuccess onWpayPaymentSuccess, OnWpayPaymentFailure onWpayPaymentFailure, OnWpayPaymentValidationFailure onWpayPaymentValidationFailure) {
            Intrinsics.h(__typename, "__typename");
            this.f20209a = __typename;
            this.b = onWpayPaymentSuccess;
            this.c = onWpayPaymentFailure;
            this.d = onWpayPaymentValidationFailure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnWpayPaymentResponse)) {
                return false;
            }
            OnWpayPaymentResponse onWpayPaymentResponse = (OnWpayPaymentResponse) obj;
            return Intrinsics.c(this.f20209a, onWpayPaymentResponse.f20209a) && Intrinsics.c(this.b, onWpayPaymentResponse.b) && Intrinsics.c(this.c, onWpayPaymentResponse.c) && Intrinsics.c(this.d, onWpayPaymentResponse.d);
        }

        public final int hashCode() {
            int iHashCode = this.f20209a.hashCode() * 31;
            OnWpayPaymentSuccess onWpayPaymentSuccess = this.b;
            int iHashCode2 = (iHashCode + (onWpayPaymentSuccess == null ? 0 : Integer.hashCode(onWpayPaymentSuccess.f20210a))) * 31;
            OnWpayPaymentFailure onWpayPaymentFailure = this.c;
            int iHashCode3 = (iHashCode2 + (onWpayPaymentFailure == null ? 0 : onWpayPaymentFailure.hashCode())) * 31;
            OnWpayPaymentValidationFailure onWpayPaymentValidationFailure = this.d;
            return iHashCode3 + (onWpayPaymentValidationFailure != null ? onWpayPaymentValidationFailure.hashCode() : 0);
        }

        public final String toString() {
            return "OnWpayPaymentResponse(__typename=" + this.f20209a + ", onWpayPaymentSuccess=" + this.b + ", onWpayPaymentFailure=" + this.c + ", onWpayPaymentValidationFailure=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/payment/PayMutation$OnWpayPaymentSuccess;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnWpayPaymentSuccess {

        /* renamed from: a, reason: collision with root package name */
        public final int f20210a;

        public OnWpayPaymentSuccess(int i) {
            this.f20210a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnWpayPaymentSuccess) && this.f20210a == ((OnWpayPaymentSuccess) obj).f20210a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f20210a);
        }

        public final String toString() {
            return a.e(this.f20210a, "OnWpayPaymentSuccess(orderId=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/payment/PayMutation$OnWpayPaymentValidationFailure;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnWpayPaymentValidationFailure {

        /* renamed from: a, reason: collision with root package name */
        public final String f20211a;
        public final String b;
        public final Analytics1 c;

        public OnWpayPaymentValidationFailure(String str, String str2, Analytics1 analytics1) {
            this.f20211a = str;
            this.b = str2;
            this.c = analytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnWpayPaymentValidationFailure)) {
                return false;
            }
            OnWpayPaymentValidationFailure onWpayPaymentValidationFailure = (OnWpayPaymentValidationFailure) obj;
            return Intrinsics.c(this.f20211a, onWpayPaymentValidationFailure.f20211a) && Intrinsics.c(this.b, onWpayPaymentValidationFailure.b) && Intrinsics.c(this.c, onWpayPaymentValidationFailure.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f20211a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnWpayPaymentValidationFailure(errorMessage=", this.f20211a, ", errorTitle=", this.b, ", analytics=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/payment/PayMutation$Pay;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Pay {

        /* renamed from: a, reason: collision with root package name */
        public final String f20212a;
        public final OnWpayPaymentResponse b;

        public Pay(String str, OnWpayPaymentResponse onWpayPaymentResponse) {
            this.f20212a = str;
            this.b = onWpayPaymentResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pay)) {
                return false;
            }
            Pay pay = (Pay) obj;
            return Intrinsics.c(this.f20212a, pay.f20212a) && Intrinsics.c(this.b, pay.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20212a.hashCode() * 31);
        }

        public final String toString() {
            return "Pay(__typename=" + this.f20212a + ", onWpayPaymentResponse=" + this.b + ")";
        }
    }

    public PayMutation(PaymentInput paymentInput) {
        this.f20204a = paymentInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(PayMutation_ResponseAdapter.Data.f20215a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation Pay($paymentInput: PaymentInput!) { pay(paymentInput: $paymentInput) { __typename ... on WpayPaymentResponse { __typename ... on WpayPaymentSuccess { orderId } ... on WpayPaymentFailure { errorMessage analytics { __typename ...analytics } regenerateIdempotencyKey } ... on WpayPaymentValidationFailure { errorMessage errorTitle analytics { __typename ...analytics } } } } }  fragment analytics on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PayMutation) && Intrinsics.c(this.f20204a, ((PayMutation) obj).f20204a);
    }

    public final int hashCode() {
        return this.f20204a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "7f7bad5e93151f08ae09edcf60b5215ee3dfa9fe1be442e832b8e936b279ebde";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "Pay";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("paymentInput");
        Adapters.c(PaymentInput_InputAdapter.f9216a, false).toJson(jsonWriter, customScalarAdapters, this.f20204a);
    }

    public final String toString() {
        return "PayMutation(paymentInput=" + this.f20204a + ")";
    }
}
