package com.woolworths.shop.checkout.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.FulfilmentWindowsFooterIcon;
import au.com.woolworths.shop.graphql.type.adapter.FulfilmentWindowsFooterIcon_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/SelectionInfoImpl_ResponseAdapter;", "", "SelectionInfo", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionInfoImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/SelectionInfoImpl_ResponseAdapter$SelectionInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/SelectionInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectionInfo implements Adapter<com.woolworths.shop.checkout.fragment.SelectionInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22537a = CollectionsKt.R("descriptionMd", "iconType");

        public static com.woolworths.shop.checkout.fragment.SelectionInfo a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            FulfilmentWindowsFooterIcon fulfilmentWindowsFooterIconA = null;
            while (true) {
                int iO2 = reader.o2(f22537a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    fulfilmentWindowsFooterIconA = FulfilmentWindowsFooterIcon_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (fulfilmentWindowsFooterIconA != null) {
                return new com.woolworths.shop.checkout.fragment.SelectionInfo(str, fulfilmentWindowsFooterIconA);
            }
            Assertions.a(reader, "iconType");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.shop.checkout.fragment.SelectionInfo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("descriptionMd");
            Adapters.i.toJson(writer, customScalarAdapters, value.f22536a);
            writer.F1("iconType");
            writer.v0(value.b.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.shop.checkout.fragment.SelectionInfo) obj);
        }
    }
}
