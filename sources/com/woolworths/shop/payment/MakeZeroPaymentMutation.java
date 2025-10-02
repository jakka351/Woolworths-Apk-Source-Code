package com.woolworths.shop.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.payment.adapter.MakeZeroPaymentMutation_ResponseAdapter;
import com.woolworths.shop.payment.fragment.ZeroPaymentResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/payment/MakeZeroPaymentMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/payment/MakeZeroPaymentMutation$Data;", "Data", "ZeroPayment", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MakeZeroPaymentMutation implements Mutation<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/payment/MakeZeroPaymentMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/payment/MakeZeroPaymentMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ZeroPayment f23373a;

        public Data(ZeroPayment zeroPayment) {
            this.f23373a = zeroPayment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f23373a, ((Data) obj).f23373a);
        }

        public final int hashCode() {
            return this.f23373a.hashCode();
        }

        public final String toString() {
            return "Data(zeroPayment=" + this.f23373a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/payment/MakeZeroPaymentMutation$ZeroPayment;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ZeroPayment {

        /* renamed from: a, reason: collision with root package name */
        public final String f23374a;
        public final ZeroPaymentResponse b;

        public ZeroPayment(String str, ZeroPaymentResponse zeroPaymentResponse) {
            this.f23374a = str;
            this.b = zeroPaymentResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZeroPayment)) {
                return false;
            }
            ZeroPayment zeroPayment = (ZeroPayment) obj;
            return Intrinsics.c(this.f23374a, zeroPayment.f23374a) && Intrinsics.c(this.b, zeroPayment.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23374a.hashCode() * 31);
        }

        public final String toString() {
            return "ZeroPayment(__typename=" + this.f23374a + ", zeroPaymentResponse=" + this.b + ")";
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(MakeZeroPaymentMutation_ResponseAdapter.Data.f23377a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation MakeZeroPayment { zeroPayment { __typename ...zeroPaymentResponse } }  fragment zeroPaymentResponse on ZeroPaymentResponse { __typename ... on PaymentSuccess { orderId placed } ... on PaymentValidationFailure { errorMessage errorCode } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == MakeZeroPaymentMutation.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(MakeZeroPaymentMutation.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "5879681e03e33a79b8ff5dd52d614cfb8ce7c969e63c7750e93d399cb0a3141a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "MakeZeroPayment";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
