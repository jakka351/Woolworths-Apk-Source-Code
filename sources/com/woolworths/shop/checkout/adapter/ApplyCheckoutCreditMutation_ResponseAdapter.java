package com.woolworths.shop.checkout.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.ApplyCheckoutCreditMutation;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummaryImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutCreditMutation_ResponseAdapter;", "", "Data", "ApplyCheckoutCredit", "CheckoutSummary", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ApplyCheckoutCreditMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutCreditMutation_ResponseAdapter$ApplyCheckoutCredit;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutCreditMutation$ApplyCheckoutCredit;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ApplyCheckoutCredit implements Adapter<ApplyCheckoutCreditMutation.ApplyCheckoutCredit> {

        /* renamed from: a, reason: collision with root package name */
        public static final ApplyCheckoutCredit f21947a = new ApplyCheckoutCredit();
        public static final List b = CollectionsKt.R("success", "message", "checkoutSummary");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            ApplyCheckoutCreditMutation.CheckoutSummary checkoutSummary = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    checkoutSummary = (ApplyCheckoutCreditMutation.CheckoutSummary) Adapters.b(Adapters.c(CheckoutSummary.f21948a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (bool == null) {
                Assertions.a(reader, "success");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (str != null) {
                return new ApplyCheckoutCreditMutation.ApplyCheckoutCredit(zBooleanValue, str, checkoutSummary);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ApplyCheckoutCreditMutation.ApplyCheckoutCredit value = (ApplyCheckoutCreditMutation.ApplyCheckoutCredit) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("success");
            d.B(value.f21803a, Adapters.f, writer, customScalarAdapters, "message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("checkoutSummary");
            Adapters.b(Adapters.c(CheckoutSummary.f21948a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutCreditMutation_ResponseAdapter$CheckoutSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutCreditMutation$CheckoutSummary;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckoutSummary implements Adapter<ApplyCheckoutCreditMutation.CheckoutSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final CheckoutSummary f21948a = new CheckoutSummary();
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
                return new ApplyCheckoutCreditMutation.CheckoutSummary(str, checkoutContentSummaryA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ApplyCheckoutCreditMutation.CheckoutSummary value = (ApplyCheckoutCreditMutation.CheckoutSummary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21804a);
            List list = CheckoutContentSummaryImpl_ResponseAdapter.CheckoutContentSummary.f22303a;
            CheckoutContentSummaryImpl_ResponseAdapter.CheckoutContentSummary.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/ApplyCheckoutCreditMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/ApplyCheckoutCreditMutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ApplyCheckoutCreditMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21949a = new Data();
        public static final List b = CollectionsKt.Q("applyCheckoutCredit");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ApplyCheckoutCreditMutation.ApplyCheckoutCredit applyCheckoutCredit = null;
            while (reader.o2(b) == 0) {
                applyCheckoutCredit = (ApplyCheckoutCreditMutation.ApplyCheckoutCredit) Adapters.c(ApplyCheckoutCredit.f21947a, false).fromJson(reader, customScalarAdapters);
            }
            if (applyCheckoutCredit != null) {
                return new ApplyCheckoutCreditMutation.Data(applyCheckoutCredit);
            }
            Assertions.a(reader, "applyCheckoutCredit");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ApplyCheckoutCreditMutation.Data value = (ApplyCheckoutCreditMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("applyCheckoutCredit");
            Adapters.c(ApplyCheckoutCredit.f21947a, false).toJson(writer, customScalarAdapters, value.f21805a);
        }
    }
}
