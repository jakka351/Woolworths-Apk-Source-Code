package com.woolworths.shop.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.payment.graphql.type.PaymentsInput;
import au.com.woolworths.payment.graphql.type.adapter.PaymentsInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.payment.adapter.MakePaymentMutation_ResponseAdapter;
import com.woolworths.shop.payment.fragment.PaymentResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/payment/MakePaymentMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/payment/MakePaymentMutation$Data;", "Data", "MakePayment", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MakePaymentMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentsInput f23370a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/payment/MakePaymentMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/payment/MakePaymentMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final MakePayment f23371a;

        public Data(MakePayment makePayment) {
            this.f23371a = makePayment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f23371a, ((Data) obj).f23371a);
        }

        public final int hashCode() {
            return this.f23371a.hashCode();
        }

        public final String toString() {
            return "Data(makePayment=" + this.f23371a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/payment/MakePaymentMutation$MakePayment;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MakePayment {

        /* renamed from: a, reason: collision with root package name */
        public final String f23372a;
        public final PaymentResponse b;

        public MakePayment(String str, PaymentResponse paymentResponse) {
            this.f23372a = str;
            this.b = paymentResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MakePayment)) {
                return false;
            }
            MakePayment makePayment = (MakePayment) obj;
            return Intrinsics.c(this.f23372a, makePayment.f23372a) && Intrinsics.c(this.b, makePayment.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23372a.hashCode() * 31);
        }

        public final String toString() {
            return "MakePayment(__typename=" + this.f23372a + ", paymentResponse=" + this.b + ")";
        }
    }

    public MakePaymentMutation(PaymentsInput paymentsInput) {
        this.f23370a = paymentsInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(MakePaymentMutation_ResponseAdapter.Data.f23375a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation MakePayment($paymentsInput: PaymentsInput!) { makePayment(paymentsInput: $paymentsInput) { __typename ...paymentResponse } }  fragment paymentResponse on PaymentResponse { __typename ... on PaymentSuccess { orderId placed } ... on PaymentFailure { paymentErrors { paymentInstrumentId errorCode errorMessage stepUp { mandatory url } } } ... on PaymentValidationFailure { errorMessage errorCode } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MakePaymentMutation) && Intrinsics.c(this.f23370a, ((MakePaymentMutation) obj).f23370a);
    }

    public final int hashCode() {
        return this.f23370a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "69f4595c49a3ffc8b1107bfbf044e5a73b55134a44471658a013f79d15a975a6";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "MakePayment";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("paymentsInput");
        Adapters.c(PaymentsInput_InputAdapter.f9219a, false).toJson(jsonWriter, customScalarAdapters, this.f23370a);
    }

    public final String toString() {
        return "MakePaymentMutation(paymentsInput=" + this.f23370a + ")";
    }
}
