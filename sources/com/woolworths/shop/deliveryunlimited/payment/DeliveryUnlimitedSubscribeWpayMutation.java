package com.woolworths.shop.deliveryunlimited.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedSubscribeWpayInput;
import au.com.woolworths.shop.graphql.type.adapter.DeliveryUnlimitedSubscribeWpayInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.deliveryunlimited.payment.adapter.DeliveryUnlimitedSubscribeWpayMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeWpayMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeWpayMutation$Data;", "Data", "DeliveryUnlimitedSubscribeWpay", "ErrorAnalytics", "Companion", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DeliveryUnlimitedSubscribeWpayMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final DeliveryUnlimitedSubscribeWpayInput f22588a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeWpayMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeWpayMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final DeliveryUnlimitedSubscribeWpay f22589a;

        public Data(DeliveryUnlimitedSubscribeWpay deliveryUnlimitedSubscribeWpay) {
            this.f22589a = deliveryUnlimitedSubscribeWpay;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f22589a, ((Data) obj).f22589a);
        }

        public final int hashCode() {
            return this.f22589a.hashCode();
        }

        public final String toString() {
            return "Data(deliveryUnlimitedSubscribeWpay=" + this.f22589a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeWpayMutation$DeliveryUnlimitedSubscribeWpay;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryUnlimitedSubscribeWpay {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f22590a;
        public final String b;
        public final ErrorAnalytics c;

        public DeliveryUnlimitedSubscribeWpay(boolean z, String str, ErrorAnalytics errorAnalytics) {
            this.f22590a = z;
            this.b = str;
            this.c = errorAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryUnlimitedSubscribeWpay)) {
                return false;
            }
            DeliveryUnlimitedSubscribeWpay deliveryUnlimitedSubscribeWpay = (DeliveryUnlimitedSubscribeWpay) obj;
            return this.f22590a == deliveryUnlimitedSubscribeWpay.f22590a && Intrinsics.c(this.b, deliveryUnlimitedSubscribeWpay.b) && Intrinsics.c(this.c, deliveryUnlimitedSubscribeWpay.c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f22590a) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ErrorAnalytics errorAnalytics = this.c;
            return iHashCode2 + (errorAnalytics != null ? errorAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbT = a.t("DeliveryUnlimitedSubscribeWpay(success=", ", message=", this.b, ", errorAnalytics=", this.f22590a);
            sbT.append(this.c);
            sbT.append(")");
            return sbT.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeWpayMutation$ErrorAnalytics;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ErrorAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22591a;
        public final AnalyticsFields b;

        public ErrorAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22591a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorAnalytics)) {
                return false;
            }
            ErrorAnalytics errorAnalytics = (ErrorAnalytics) obj;
            return Intrinsics.c(this.f22591a, errorAnalytics.f22591a) && Intrinsics.c(this.b, errorAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22591a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ErrorAnalytics(__typename=", this.f22591a, ", analyticsFields=", this.b, ")");
        }
    }

    public DeliveryUnlimitedSubscribeWpayMutation(DeliveryUnlimitedSubscribeWpayInput deliveryUnlimitedSubscribeWpayInput) {
        this.f22588a = deliveryUnlimitedSubscribeWpayInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(DeliveryUnlimitedSubscribeWpayMutation_ResponseAdapter.Data.f22603a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation DeliveryUnlimitedSubscribeWpay($deliveryUnlimitedSubscribeWpayInput: DeliveryUnlimitedSubscribeWpayInput!) { deliveryUnlimitedSubscribeWpay(input: $deliveryUnlimitedSubscribeWpayInput) { success message errorAnalytics { __typename ...analyticsFields } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryUnlimitedSubscribeWpayMutation) && Intrinsics.c(this.f22588a, ((DeliveryUnlimitedSubscribeWpayMutation) obj).f22588a);
    }

    public final int hashCode() {
        return this.f22588a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "5aceb63fea01e06fcdc8a63db7f097004516fa326a7d6cc36b056e5c533be5b3";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "DeliveryUnlimitedSubscribeWpay";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("deliveryUnlimitedSubscribeWpayInput");
        Adapters.c(DeliveryUnlimitedSubscribeWpayInput_InputAdapter.f12067a, false).toJson(jsonWriter, customScalarAdapters, this.f22588a);
    }

    public final String toString() {
        return "DeliveryUnlimitedSubscribeWpayMutation(deliveryUnlimitedSubscribeWpayInput=" + this.f22588a + ")";
    }
}
