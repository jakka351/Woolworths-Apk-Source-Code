package com.woolworths.shop.checkout.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.PayWithRewardsDollarMutation;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummaryImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/PayWithRewardsDollarMutation_ResponseAdapter;", "", "Data", "PayWithRewardsDollar", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PayWithRewardsDollarMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/PayWithRewardsDollarMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/PayWithRewardsDollarMutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<PayWithRewardsDollarMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22008a = new Data();
        public static final List b = CollectionsKt.Q("payWithRewardsDollar");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            PayWithRewardsDollarMutation.PayWithRewardsDollar payWithRewardsDollar = null;
            while (reader.o2(b) == 0) {
                payWithRewardsDollar = (PayWithRewardsDollarMutation.PayWithRewardsDollar) Adapters.b(Adapters.c(PayWithRewardsDollar.f22009a, true)).fromJson(reader, customScalarAdapters);
            }
            return new PayWithRewardsDollarMutation.Data(payWithRewardsDollar);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PayWithRewardsDollarMutation.Data value = (PayWithRewardsDollarMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("payWithRewardsDollar");
            Adapters.b(Adapters.c(PayWithRewardsDollar.f22009a, true)).toJson(writer, customScalarAdapters, value.f21873a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/PayWithRewardsDollarMutation_ResponseAdapter$PayWithRewardsDollar;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/PayWithRewardsDollarMutation$PayWithRewardsDollar;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PayWithRewardsDollar implements Adapter<PayWithRewardsDollarMutation.PayWithRewardsDollar> {

        /* renamed from: a, reason: collision with root package name */
        public static final PayWithRewardsDollar f22009a = new PayWithRewardsDollar();
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
            CheckoutContentSummary checkoutContentSummaryA = CheckoutContentSummaryImpl_ResponseAdapter.CheckoutContentSummary.a(reader, customScalarAdapters);
            if (str != null) {
                return new PayWithRewardsDollarMutation.PayWithRewardsDollar(str, checkoutContentSummaryA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PayWithRewardsDollarMutation.PayWithRewardsDollar value = (PayWithRewardsDollarMutation.PayWithRewardsDollar) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21874a);
            List list = CheckoutContentSummaryImpl_ResponseAdapter.CheckoutContentSummary.f22303a;
            CheckoutContentSummaryImpl_ResponseAdapter.CheckoutContentSummary.b(writer, customScalarAdapters, value.b);
        }
    }
}
