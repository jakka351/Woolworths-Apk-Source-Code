package com.woolworths.shop.deliveryunlimited.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedSubscribeSubmissionInput;
import au.com.woolworths.shop.graphql.type.adapter.DeliveryUnlimitedSubscribeSubmissionInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.deliveryunlimited.payment.adapter.DeliveryUnlimitedSubscribeSubmissionMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeSubmissionMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeSubmissionMutation$Data;", "Data", "DeliveryUnlimitedSubscribeSubmission", "Companion", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DeliveryUnlimitedSubscribeSubmissionMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final DeliveryUnlimitedSubscribeSubmissionInput f22585a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeSubmissionMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeSubmissionMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final DeliveryUnlimitedSubscribeSubmission f22586a;

        public Data(DeliveryUnlimitedSubscribeSubmission deliveryUnlimitedSubscribeSubmission) {
            this.f22586a = deliveryUnlimitedSubscribeSubmission;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f22586a, ((Data) obj).f22586a);
        }

        public final int hashCode() {
            return this.f22586a.hashCode();
        }

        public final String toString() {
            return "Data(deliveryUnlimitedSubscribeSubmission=" + this.f22586a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeSubmissionMutation$DeliveryUnlimitedSubscribeSubmission;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryUnlimitedSubscribeSubmission {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f22587a;
        public final String b;

        public DeliveryUnlimitedSubscribeSubmission(boolean z, String str) {
            this.f22587a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryUnlimitedSubscribeSubmission)) {
                return false;
            }
            DeliveryUnlimitedSubscribeSubmission deliveryUnlimitedSubscribeSubmission = (DeliveryUnlimitedSubscribeSubmission) obj;
            return this.f22587a == deliveryUnlimitedSubscribeSubmission.f22587a && Intrinsics.c(this.b, deliveryUnlimitedSubscribeSubmission.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f22587a) * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.m("DeliveryUnlimitedSubscribeSubmission(success=", this.f22587a, ", message=", this.b, ")");
        }
    }

    public DeliveryUnlimitedSubscribeSubmissionMutation(DeliveryUnlimitedSubscribeSubmissionInput submissionInput) {
        Intrinsics.h(submissionInput, "submissionInput");
        this.f22585a = submissionInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(DeliveryUnlimitedSubscribeSubmissionMutation_ResponseAdapter.Data.f22601a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation DeliveryUnlimitedSubscribeSubmission($submissionInput: DeliveryUnlimitedSubscribeSubmissionInput!) { deliveryUnlimitedSubscribeSubmission(submissionInput: $submissionInput) { success message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryUnlimitedSubscribeSubmissionMutation) && Intrinsics.c(this.f22585a, ((DeliveryUnlimitedSubscribeSubmissionMutation) obj).f22585a);
    }

    public final int hashCode() {
        return this.f22585a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "3de251cec173e74fecb11f6b8865de78ee1cbbeb6229e64f084c927cb6be4399";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "DeliveryUnlimitedSubscribeSubmission";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("submissionInput");
        Adapters.c(DeliveryUnlimitedSubscribeSubmissionInput_InputAdapter.f12065a, false).toJson(jsonWriter, customScalarAdapters, this.f22585a);
    }

    public final String toString() {
        return "DeliveryUnlimitedSubscribeSubmissionMutation(submissionInput=" + this.f22585a + ")";
    }
}
