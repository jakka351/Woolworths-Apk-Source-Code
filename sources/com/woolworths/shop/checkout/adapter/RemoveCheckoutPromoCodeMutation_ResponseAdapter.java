package com.woolworths.shop.checkout.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.RemoveCheckoutPromoCodeMutation;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummaryImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/RemoveCheckoutPromoCodeMutation_ResponseAdapter;", "", "Data", "RemoveCheckoutPromoCode", "CheckoutSummary", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RemoveCheckoutPromoCodeMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/RemoveCheckoutPromoCodeMutation_ResponseAdapter$CheckoutSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/RemoveCheckoutPromoCodeMutation$CheckoutSummary;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckoutSummary implements Adapter<RemoveCheckoutPromoCodeMutation.CheckoutSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final CheckoutSummary f22013a = new CheckoutSummary();
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
                return new RemoveCheckoutPromoCodeMutation.CheckoutSummary(str, checkoutContentSummaryA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RemoveCheckoutPromoCodeMutation.CheckoutSummary value = (RemoveCheckoutPromoCodeMutation.CheckoutSummary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21880a);
            List list = CheckoutContentSummaryImpl_ResponseAdapter.CheckoutContentSummary.f22303a;
            CheckoutContentSummaryImpl_ResponseAdapter.CheckoutContentSummary.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/RemoveCheckoutPromoCodeMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/RemoveCheckoutPromoCodeMutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<RemoveCheckoutPromoCodeMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22014a = new Data();
        public static final List b = CollectionsKt.Q("removeCheckoutPromoCode");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RemoveCheckoutPromoCodeMutation.RemoveCheckoutPromoCode removeCheckoutPromoCode = null;
            while (reader.o2(b) == 0) {
                removeCheckoutPromoCode = (RemoveCheckoutPromoCodeMutation.RemoveCheckoutPromoCode) Adapters.c(RemoveCheckoutPromoCode.f22015a, false).fromJson(reader, customScalarAdapters);
            }
            if (removeCheckoutPromoCode != null) {
                return new RemoveCheckoutPromoCodeMutation.Data(removeCheckoutPromoCode);
            }
            Assertions.a(reader, "removeCheckoutPromoCode");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RemoveCheckoutPromoCodeMutation.Data value = (RemoveCheckoutPromoCodeMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("removeCheckoutPromoCode");
            Adapters.c(RemoveCheckoutPromoCode.f22015a, false).toJson(writer, customScalarAdapters, value.f21881a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/RemoveCheckoutPromoCodeMutation_ResponseAdapter$RemoveCheckoutPromoCode;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/RemoveCheckoutPromoCodeMutation$RemoveCheckoutPromoCode;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoveCheckoutPromoCode implements Adapter<RemoveCheckoutPromoCodeMutation.RemoveCheckoutPromoCode> {

        /* renamed from: a, reason: collision with root package name */
        public static final RemoveCheckoutPromoCode f22015a = new RemoveCheckoutPromoCode();
        public static final List b = CollectionsKt.R("success", "message", "checkoutSummary");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            RemoveCheckoutPromoCodeMutation.CheckoutSummary checkoutSummary = null;
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
                    checkoutSummary = (RemoveCheckoutPromoCodeMutation.CheckoutSummary) Adapters.b(Adapters.c(CheckoutSummary.f22013a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (bool == null) {
                Assertions.a(reader, "success");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (str != null) {
                return new RemoveCheckoutPromoCodeMutation.RemoveCheckoutPromoCode(zBooleanValue, str, checkoutSummary);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RemoveCheckoutPromoCodeMutation.RemoveCheckoutPromoCode value = (RemoveCheckoutPromoCodeMutation.RemoveCheckoutPromoCode) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("success");
            d.B(value.f21882a, Adapters.f, writer, customScalarAdapters, "message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("checkoutSummary");
            Adapters.b(Adapters.c(CheckoutSummary.f22013a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }
}
