package com.woolworths.feature.shop.marketplace.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.ProductListChannelType;
import au.com.woolworths.shop.graphql.type.ProductListFacetType;
import au.com.woolworths.shop.graphql.type.adapter.ProductListChannelType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ProductListFacetType_ResponseAdapter;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/SectionItemImpl_ResponseAdapter;", "", "SectionItem", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SectionItemImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/SectionItemImpl_ResponseAdapter$SectionItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/fragment/SectionItem;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SectionItem implements Adapter<com.woolworths.feature.shop.marketplace.fragment.SectionItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19845a = CollectionsKt.R("displayName", "channel", "facet");

        public static com.woolworths.feature.shop.marketplace.fragment.SectionItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ProductListChannelType productListChannelTypeA = null;
            ProductListFacetType productListFacetTypeA = null;
            while (true) {
                int iO2 = reader.o2(f19845a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    productListChannelTypeA = ProductListChannelType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    productListFacetTypeA = ProductListFacetType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "displayName");
                throw null;
            }
            if (productListChannelTypeA == null) {
                Assertions.a(reader, "channel");
                throw null;
            }
            if (productListFacetTypeA != null) {
                return new com.woolworths.feature.shop.marketplace.fragment.SectionItem(str, productListChannelTypeA, productListFacetTypeA);
            }
            Assertions.a(reader, "facet");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.feature.shop.marketplace.fragment.SectionItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19844a);
            writer.F1("channel");
            ProductListChannelType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("facet");
            ProductListFacetType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.feature.shop.marketplace.fragment.SectionItem) obj);
        }
    }
}
