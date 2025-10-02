package com.woolworths.shop.catalogue.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.catalogue.CataloguePromotionListingQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionListingQuery_ResponseAdapter;", "", "Data", "CataloguePromotionListing", "Header", "Item", "OnProductCard", "OnProductHeroCard", "ProductHeroCardProduct", "OnCataloguePromotionGroup", "CataloguePromotionGroupBadge", "CataloguePromotionGroupItem", "OnProductCard1", "OnProductHeroCard1", "ProductHeroCardProduct1", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CataloguePromotionListingQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionListingQuery_ResponseAdapter$CataloguePromotionGroupBadge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$CataloguePromotionGroupBadge;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CataloguePromotionGroupBadge implements Adapter<CataloguePromotionListingQuery.CataloguePromotionGroupBadge> {

        /* renamed from: a, reason: collision with root package name */
        public static final CataloguePromotionGroupBadge f21734a = new CataloguePromotionGroupBadge();
        public static final List b = CollectionsKt.R("altText", "imageUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "altText");
                throw null;
            }
            if (str2 != null) {
                return new CataloguePromotionListingQuery.CataloguePromotionGroupBadge(str, str2);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CataloguePromotionListingQuery.CataloguePromotionGroupBadge value = (CataloguePromotionListingQuery.CataloguePromotionGroupBadge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("altText");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21686a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionListingQuery_ResponseAdapter$CataloguePromotionGroupItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$CataloguePromotionGroupItem;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CataloguePromotionGroupItem implements Adapter<CataloguePromotionListingQuery.CataloguePromotionGroupItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final CataloguePromotionGroupItem f21735a = new CataloguePromotionGroupItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CataloguePromotionListingQuery.OnProductCard1 onProductCard1A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CataloguePromotionListingQuery.OnProductHeroCard1 onProductHeroCard1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCard1A = OnProductCard1.a(reader, customScalarAdapters);
            } else {
                onProductCard1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductHeroCard"))) {
                reader.o();
                onProductHeroCard1A = OnProductHeroCard1.a(reader, customScalarAdapters);
            }
            return new CataloguePromotionListingQuery.CataloguePromotionGroupItem(str, onProductCard1A, onProductHeroCard1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CataloguePromotionListingQuery.CataloguePromotionGroupItem value = (CataloguePromotionListingQuery.CataloguePromotionGroupItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21687a);
            CataloguePromotionListingQuery.OnProductCard1 onProductCard1 = value.b;
            if (onProductCard1 != null) {
                OnProductCard1.b(writer, customScalarAdapters, onProductCard1);
            }
            CataloguePromotionListingQuery.OnProductHeroCard1 onProductHeroCard1 = value.c;
            if (onProductHeroCard1 != null) {
                OnProductHeroCard1.b(writer, customScalarAdapters, onProductHeroCard1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionListingQuery_ResponseAdapter$CataloguePromotionListing;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$CataloguePromotionListing;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CataloguePromotionListing implements Adapter<CataloguePromotionListingQuery.CataloguePromotionListing> {

        /* renamed from: a, reason: collision with root package name */
        public static final CataloguePromotionListing f21736a = new CataloguePromotionListing();
        public static final List b = CollectionsKt.R("header", "items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CataloguePromotionListingQuery.Header header = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    header = (CataloguePromotionListingQuery.Header) Adapters.b(Adapters.c(Header.f21738a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f21739a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new CataloguePromotionListingQuery.CataloguePromotionListing(header, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CataloguePromotionListingQuery.CataloguePromotionListing value = (CataloguePromotionListingQuery.CataloguePromotionListing) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters.b(Adapters.c(Header.f21738a, false)).toJson(writer, customScalarAdapters, value.f21688a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f21739a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionListingQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<CataloguePromotionListingQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21737a = new Data();
        public static final List b = CollectionsKt.Q("cataloguePromotionListing");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CataloguePromotionListingQuery.CataloguePromotionListing cataloguePromotionListing = null;
            while (reader.o2(b) == 0) {
                cataloguePromotionListing = (CataloguePromotionListingQuery.CataloguePromotionListing) Adapters.b(Adapters.c(CataloguePromotionListing.f21736a, false)).fromJson(reader, customScalarAdapters);
            }
            return new CataloguePromotionListingQuery.Data(cataloguePromotionListing);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CataloguePromotionListingQuery.Data value = (CataloguePromotionListingQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("cataloguePromotionListing");
            Adapters.b(Adapters.c(CataloguePromotionListing.f21736a, false)).toJson(writer, customScalarAdapters, value.f21689a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionListingQuery_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$Header;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<CataloguePromotionListingQuery.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f21738a = new Header();
        public static final List b = CollectionsKt.R("title", "backgroundImageUrl", "backgroundColor");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new CataloguePromotionListingQuery.Header(str, str2, str3);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CataloguePromotionListingQuery.Header value = (CataloguePromotionListingQuery.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21690a);
            writer.F1("backgroundImageUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("backgroundColor");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionListingQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$Item;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<CataloguePromotionListingQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f21739a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CataloguePromotionListingQuery.OnProductCard onProductCardA;
            CataloguePromotionListingQuery.OnProductHeroCard onProductHeroCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CataloguePromotionListingQuery.OnCataloguePromotionGroup onCataloguePromotionGroupA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCardA = OnProductCard.a(reader, customScalarAdapters);
            } else {
                onProductCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductHeroCard"))) {
                reader.o();
                onProductHeroCardA = OnProductHeroCard.a(reader, customScalarAdapters);
            } else {
                onProductHeroCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CataloguePromotionGroup"))) {
                reader.o();
                onCataloguePromotionGroupA = OnCataloguePromotionGroup.a(reader, customScalarAdapters);
            }
            return new CataloguePromotionListingQuery.Item(str, onProductCardA, onProductHeroCardA, onCataloguePromotionGroupA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CataloguePromotionListingQuery.Item value = (CataloguePromotionListingQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21691a);
            CataloguePromotionListingQuery.OnProductCard onProductCard = value.b;
            if (onProductCard != null) {
                OnProductCard.b(writer, customScalarAdapters, onProductCard);
            }
            CataloguePromotionListingQuery.OnProductHeroCard onProductHeroCard = value.c;
            if (onProductHeroCard != null) {
                OnProductHeroCard.b(writer, customScalarAdapters, onProductHeroCard);
            }
            CataloguePromotionListingQuery.OnCataloguePromotionGroup onCataloguePromotionGroup = value.d;
            if (onCataloguePromotionGroup != null) {
                OnCataloguePromotionGroup.b(writer, customScalarAdapters, onCataloguePromotionGroup);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionListingQuery_ResponseAdapter$OnCataloguePromotionGroup;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$OnCataloguePromotionGroup;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCataloguePromotionGroup implements Adapter<CataloguePromotionListingQuery.OnCataloguePromotionGroup> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21740a = CollectionsKt.R("cataloguePromotionGroupBadge", "cataloguePromotionGroupBackgroundColor", "cataloguePromotionGroupItems");

        public static CataloguePromotionListingQuery.OnCataloguePromotionGroup a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CataloguePromotionListingQuery.CataloguePromotionGroupBadge cataloguePromotionGroupBadge = null;
            String str = null;
            List list = null;
            while (true) {
                int iO2 = reader.o2(f21740a);
                if (iO2 == 0) {
                    cataloguePromotionGroupBadge = (CataloguePromotionListingQuery.CataloguePromotionGroupBadge) Adapters.b(Adapters.c(CataloguePromotionGroupBadge.f21734a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new CataloguePromotionListingQuery.OnCataloguePromotionGroup(cataloguePromotionGroupBadge, str, list);
                    }
                    list = (List) Adapters.b(Adapters.a(Adapters.c(CataloguePromotionGroupItem.f21735a, true))).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CataloguePromotionListingQuery.OnCataloguePromotionGroup value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("cataloguePromotionGroupBadge");
            Adapters.b(Adapters.c(CataloguePromotionGroupBadge.f21734a, false)).toJson(writer, customScalarAdapters, value.f21692a);
            writer.F1("cataloguePromotionGroupBackgroundColor");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("cataloguePromotionGroupItems");
            Adapters.b(Adapters.a(Adapters.c(CataloguePromotionGroupItem.f21735a, true))).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CataloguePromotionListingQuery.OnCataloguePromotionGroup) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionListingQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$OnProductCard;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<CataloguePromotionListingQuery.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21741a = CollectionsKt.Q("__typename");

        public static CataloguePromotionListingQuery.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21741a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new CataloguePromotionListingQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CataloguePromotionListingQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21693a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CataloguePromotionListingQuery.OnProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionListingQuery_ResponseAdapter$OnProductCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$OnProductCard1;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard1 implements Adapter<CataloguePromotionListingQuery.OnProductCard1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21742a = CollectionsKt.Q("__typename");

        public static CataloguePromotionListingQuery.OnProductCard1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21742a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new CataloguePromotionListingQuery.OnProductCard1(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CataloguePromotionListingQuery.OnProductCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21694a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CataloguePromotionListingQuery.OnProductCard1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionListingQuery_ResponseAdapter$OnProductHeroCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$OnProductHeroCard;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductHeroCard implements Adapter<CataloguePromotionListingQuery.OnProductHeroCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21743a = CollectionsKt.Q("productHeroCardProduct");

        public static CataloguePromotionListingQuery.OnProductHeroCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CataloguePromotionListingQuery.ProductHeroCardProduct productHeroCardProduct = null;
            while (reader.o2(f21743a) == 0) {
                productHeroCardProduct = (CataloguePromotionListingQuery.ProductHeroCardProduct) Adapters.c(ProductHeroCardProduct.f21745a, true).fromJson(reader, customScalarAdapters);
            }
            if (productHeroCardProduct != null) {
                return new CataloguePromotionListingQuery.OnProductHeroCard(productHeroCardProduct);
            }
            Assertions.a(reader, "productHeroCardProduct");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CataloguePromotionListingQuery.OnProductHeroCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productHeroCardProduct");
            Adapters.c(ProductHeroCardProduct.f21745a, true).toJson(writer, customScalarAdapters, value.f21695a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CataloguePromotionListingQuery.OnProductHeroCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionListingQuery_ResponseAdapter$OnProductHeroCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$OnProductHeroCard1;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductHeroCard1 implements Adapter<CataloguePromotionListingQuery.OnProductHeroCard1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21744a = CollectionsKt.Q("productHeroCardProduct");

        public static CataloguePromotionListingQuery.OnProductHeroCard1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CataloguePromotionListingQuery.ProductHeroCardProduct1 productHeroCardProduct1 = null;
            while (reader.o2(f21744a) == 0) {
                productHeroCardProduct1 = (CataloguePromotionListingQuery.ProductHeroCardProduct1) Adapters.c(ProductHeroCardProduct1.f21746a, true).fromJson(reader, customScalarAdapters);
            }
            if (productHeroCardProduct1 != null) {
                return new CataloguePromotionListingQuery.OnProductHeroCard1(productHeroCardProduct1);
            }
            Assertions.a(reader, "productHeroCardProduct");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CataloguePromotionListingQuery.OnProductHeroCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productHeroCardProduct");
            Adapters.c(ProductHeroCardProduct1.f21746a, true).toJson(writer, customScalarAdapters, value.f21696a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CataloguePromotionListingQuery.OnProductHeroCard1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionListingQuery_ResponseAdapter$ProductHeroCardProduct;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$ProductHeroCardProduct;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductHeroCardProduct implements Adapter<CataloguePromotionListingQuery.ProductHeroCardProduct> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductHeroCardProduct f21745a = new ProductHeroCardProduct();
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
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new CataloguePromotionListingQuery.ProductHeroCardProduct(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CataloguePromotionListingQuery.ProductHeroCardProduct value = (CataloguePromotionListingQuery.ProductHeroCardProduct) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21697a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionListingQuery_ResponseAdapter$ProductHeroCardProduct1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$ProductHeroCardProduct1;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductHeroCardProduct1 implements Adapter<CataloguePromotionListingQuery.ProductHeroCardProduct1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductHeroCardProduct1 f21746a = new ProductHeroCardProduct1();
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
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new CataloguePromotionListingQuery.ProductHeroCardProduct1(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CataloguePromotionListingQuery.ProductHeroCardProduct1 value = (CataloguePromotionListingQuery.ProductHeroCardProduct1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21698a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }
    }
}
