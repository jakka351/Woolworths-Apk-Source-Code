package com.woolworths.shop.payment.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.payment.MakeZeroPaymentMutation;
import com.woolworths.shop.payment.fragment.ZeroPaymentResponse;
import com.woolworths.shop.payment.fragment.ZeroPaymentResponseImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/shop/payment/adapter/MakeZeroPaymentMutation_ResponseAdapter;", "", "Data", "ZeroPayment", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MakeZeroPaymentMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/payment/adapter/MakeZeroPaymentMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/payment/MakeZeroPaymentMutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<MakeZeroPaymentMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f23377a = new Data();
        public static final List b = CollectionsKt.Q("zeroPayment");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            MakeZeroPaymentMutation.ZeroPayment zeroPayment = null;
            while (reader.o2(b) == 0) {
                zeroPayment = (MakeZeroPaymentMutation.ZeroPayment) Adapters.c(ZeroPayment.f23378a, true).fromJson(reader, customScalarAdapters);
            }
            if (zeroPayment != null) {
                return new MakeZeroPaymentMutation.Data(zeroPayment);
            }
            Assertions.a(reader, "zeroPayment");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MakeZeroPaymentMutation.Data value = (MakeZeroPaymentMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("zeroPayment");
            Adapters.c(ZeroPayment.f23378a, true).toJson(writer, customScalarAdapters, value.f23373a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/payment/adapter/MakeZeroPaymentMutation_ResponseAdapter$ZeroPayment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/payment/MakeZeroPaymentMutation$ZeroPayment;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ZeroPayment implements Adapter<MakeZeroPaymentMutation.ZeroPayment> {

        /* renamed from: a, reason: collision with root package name */
        public static final ZeroPayment f23378a = new ZeroPayment();
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
            ZeroPaymentResponse zeroPaymentResponseA = ZeroPaymentResponseImpl_ResponseAdapter.ZeroPaymentResponse.a(reader, customScalarAdapters);
            if (str != null) {
                return new MakeZeroPaymentMutation.ZeroPayment(str, zeroPaymentResponseA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MakeZeroPaymentMutation.ZeroPayment value = (MakeZeroPaymentMutation.ZeroPayment) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23374a);
            List list = ZeroPaymentResponseImpl_ResponseAdapter.ZeroPaymentResponse.f23396a;
            ZeroPaymentResponseImpl_ResponseAdapter.ZeroPaymentResponse.b(writer, customScalarAdapters, value.b);
        }
    }
}
