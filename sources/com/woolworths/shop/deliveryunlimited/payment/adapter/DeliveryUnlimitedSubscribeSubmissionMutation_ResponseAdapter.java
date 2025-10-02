package com.woolworths.shop.deliveryunlimited.payment.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.deliveryunlimited.payment.DeliveryUnlimitedSubscribeSubmissionMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribeSubmissionMutation_ResponseAdapter;", "", "Data", "DeliveryUnlimitedSubscribeSubmission", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeliveryUnlimitedSubscribeSubmissionMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribeSubmissionMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeSubmissionMutation$Data;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<DeliveryUnlimitedSubscribeSubmissionMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22601a = new Data();
        public static final List b = CollectionsKt.Q("deliveryUnlimitedSubscribeSubmission");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeliveryUnlimitedSubscribeSubmissionMutation.DeliveryUnlimitedSubscribeSubmission deliveryUnlimitedSubscribeSubmission = null;
            while (reader.o2(b) == 0) {
                deliveryUnlimitedSubscribeSubmission = (DeliveryUnlimitedSubscribeSubmissionMutation.DeliveryUnlimitedSubscribeSubmission) Adapters.c(DeliveryUnlimitedSubscribeSubmission.f22602a, false).fromJson(reader, customScalarAdapters);
            }
            if (deliveryUnlimitedSubscribeSubmission != null) {
                return new DeliveryUnlimitedSubscribeSubmissionMutation.Data(deliveryUnlimitedSubscribeSubmission);
            }
            Assertions.a(reader, "deliveryUnlimitedSubscribeSubmission");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeSubmissionMutation.Data value = (DeliveryUnlimitedSubscribeSubmissionMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("deliveryUnlimitedSubscribeSubmission");
            Adapters.c(DeliveryUnlimitedSubscribeSubmission.f22602a, false).toJson(writer, customScalarAdapters, value.f22586a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribeSubmissionMutation_ResponseAdapter$DeliveryUnlimitedSubscribeSubmission;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeSubmissionMutation$DeliveryUnlimitedSubscribeSubmission;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryUnlimitedSubscribeSubmission implements Adapter<DeliveryUnlimitedSubscribeSubmissionMutation.DeliveryUnlimitedSubscribeSubmission> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryUnlimitedSubscribeSubmission f22602a = new DeliveryUnlimitedSubscribeSubmission();
        public static final List b = CollectionsKt.R("success", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                return new DeliveryUnlimitedSubscribeSubmissionMutation.DeliveryUnlimitedSubscribeSubmission(bool.booleanValue(), str);
            }
            Assertions.a(reader, "success");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeSubmissionMutation.DeliveryUnlimitedSubscribeSubmission value = (DeliveryUnlimitedSubscribeSubmissionMutation.DeliveryUnlimitedSubscribeSubmission) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("success");
            d.B(value.f22587a, Adapters.f, writer, customScalarAdapters, "message");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
