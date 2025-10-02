package com.woolworths.shop.deliveryunlimited.payment.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.deliveryunlimited.payment.DeliveryUnlimitedSubscribeWpayMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribeWpayMutation_ResponseAdapter;", "", "Data", "DeliveryUnlimitedSubscribeWpay", "ErrorAnalytics", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeliveryUnlimitedSubscribeWpayMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribeWpayMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeWpayMutation$Data;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<DeliveryUnlimitedSubscribeWpayMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22603a = new Data();
        public static final List b = CollectionsKt.Q("deliveryUnlimitedSubscribeWpay");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeliveryUnlimitedSubscribeWpayMutation.DeliveryUnlimitedSubscribeWpay deliveryUnlimitedSubscribeWpay = null;
            while (reader.o2(b) == 0) {
                deliveryUnlimitedSubscribeWpay = (DeliveryUnlimitedSubscribeWpayMutation.DeliveryUnlimitedSubscribeWpay) Adapters.c(DeliveryUnlimitedSubscribeWpay.f22604a, false).fromJson(reader, customScalarAdapters);
            }
            if (deliveryUnlimitedSubscribeWpay != null) {
                return new DeliveryUnlimitedSubscribeWpayMutation.Data(deliveryUnlimitedSubscribeWpay);
            }
            Assertions.a(reader, "deliveryUnlimitedSubscribeWpay");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeWpayMutation.Data value = (DeliveryUnlimitedSubscribeWpayMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("deliveryUnlimitedSubscribeWpay");
            Adapters.c(DeliveryUnlimitedSubscribeWpay.f22604a, false).toJson(writer, customScalarAdapters, value.f22589a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribeWpayMutation_ResponseAdapter$DeliveryUnlimitedSubscribeWpay;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeWpayMutation$DeliveryUnlimitedSubscribeWpay;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryUnlimitedSubscribeWpay implements Adapter<DeliveryUnlimitedSubscribeWpayMutation.DeliveryUnlimitedSubscribeWpay> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryUnlimitedSubscribeWpay f22604a = new DeliveryUnlimitedSubscribeWpay();
        public static final List b = CollectionsKt.R("success", "message", "errorAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            DeliveryUnlimitedSubscribeWpayMutation.ErrorAnalytics errorAnalytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    errorAnalytics = (DeliveryUnlimitedSubscribeWpayMutation.ErrorAnalytics) Adapters.b(Adapters.c(ErrorAnalytics.f22605a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                return new DeliveryUnlimitedSubscribeWpayMutation.DeliveryUnlimitedSubscribeWpay(bool.booleanValue(), str, errorAnalytics);
            }
            Assertions.a(reader, "success");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeWpayMutation.DeliveryUnlimitedSubscribeWpay value = (DeliveryUnlimitedSubscribeWpayMutation.DeliveryUnlimitedSubscribeWpay) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("success");
            d.B(value.f22590a, Adapters.f, writer, customScalarAdapters, "message");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("errorAnalytics");
            Adapters.b(Adapters.c(ErrorAnalytics.f22605a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribeWpayMutation_ResponseAdapter$ErrorAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribeWpayMutation$ErrorAnalytics;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorAnalytics implements Adapter<DeliveryUnlimitedSubscribeWpayMutation.ErrorAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ErrorAnalytics f22605a = new ErrorAnalytics();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new DeliveryUnlimitedSubscribeWpayMutation.ErrorAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeWpayMutation.ErrorAnalytics value = (DeliveryUnlimitedSubscribeWpayMutation.ErrorAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22591a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }
}
