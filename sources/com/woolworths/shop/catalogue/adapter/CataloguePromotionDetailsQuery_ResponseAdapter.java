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
import com.woolworths.shop.catalogue.CataloguePromotionDetailsQuery;
import com.woolworths.shop.catalogue.fragment.CatalogueInsetBanner;
import com.woolworths.shop.catalogue.fragment.CatalogueInsetBannerImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionDetailsQuery_ResponseAdapter;", "", "Data", "CataloguePromotionDetails", "Item", "OnPromotionDetailsHeader", "OnInsetBanner", "OnTermsAndConditions", "OnProductCard", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CataloguePromotionDetailsQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionDetailsQuery_ResponseAdapter$CataloguePromotionDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$CataloguePromotionDetails;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CataloguePromotionDetails implements Adapter<CataloguePromotionDetailsQuery.CataloguePromotionDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final CataloguePromotionDetails f21727a = new CataloguePromotionDetails();
        public static final List b = CollectionsKt.Q("items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Item.f21729a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new CataloguePromotionDetailsQuery.CataloguePromotionDetails(arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CataloguePromotionDetailsQuery.CataloguePromotionDetails value = (CataloguePromotionDetailsQuery.CataloguePromotionDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f21729a, true)).toJson(writer, customScalarAdapters, value.f21678a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionDetailsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<CataloguePromotionDetailsQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21728a = new Data();
        public static final List b = CollectionsKt.Q("cataloguePromotionDetails");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CataloguePromotionDetailsQuery.CataloguePromotionDetails cataloguePromotionDetails = null;
            while (reader.o2(b) == 0) {
                cataloguePromotionDetails = (CataloguePromotionDetailsQuery.CataloguePromotionDetails) Adapters.b(Adapters.c(CataloguePromotionDetails.f21727a, false)).fromJson(reader, customScalarAdapters);
            }
            return new CataloguePromotionDetailsQuery.Data(cataloguePromotionDetails);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CataloguePromotionDetailsQuery.Data value = (CataloguePromotionDetailsQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("cataloguePromotionDetails");
            Adapters.b(Adapters.c(CataloguePromotionDetails.f21727a, false)).toJson(writer, customScalarAdapters, value.f21679a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionDetailsQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$Item;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<CataloguePromotionDetailsQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f21729a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CataloguePromotionDetailsQuery.OnPromotionDetailsHeader onPromotionDetailsHeaderA;
            CataloguePromotionDetailsQuery.OnInsetBanner onInsetBannerA;
            CataloguePromotionDetailsQuery.OnTermsAndConditions onTermsAndConditionsA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CataloguePromotionDetailsQuery.OnProductCard onProductCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PromotionDetailsHeader"))) {
                reader.o();
                onPromotionDetailsHeaderA = OnPromotionDetailsHeader.a(reader, customScalarAdapters);
            } else {
                onPromotionDetailsHeaderA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("InsetBanner"))) {
                reader.o();
                onInsetBannerA = OnInsetBanner.a(reader, customScalarAdapters);
            } else {
                onInsetBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("TermsAndConditions"))) {
                reader.o();
                onTermsAndConditionsA = OnTermsAndConditions.a(reader, customScalarAdapters);
            } else {
                onTermsAndConditionsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCardA = OnProductCard.a(reader, customScalarAdapters);
            }
            return new CataloguePromotionDetailsQuery.Item(str, onPromotionDetailsHeaderA, onInsetBannerA, onTermsAndConditionsA, onProductCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CataloguePromotionDetailsQuery.Item value = (CataloguePromotionDetailsQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21680a);
            CataloguePromotionDetailsQuery.OnPromotionDetailsHeader onPromotionDetailsHeader = value.b;
            if (onPromotionDetailsHeader != null) {
                OnPromotionDetailsHeader.b(writer, customScalarAdapters, onPromotionDetailsHeader);
            }
            CataloguePromotionDetailsQuery.OnInsetBanner onInsetBanner = value.c;
            if (onInsetBanner != null) {
                OnInsetBanner.b(writer, customScalarAdapters, onInsetBanner);
            }
            CataloguePromotionDetailsQuery.OnTermsAndConditions onTermsAndConditions = value.d;
            if (onTermsAndConditions != null) {
                OnTermsAndConditions.b(writer, customScalarAdapters, onTermsAndConditions);
            }
            CataloguePromotionDetailsQuery.OnProductCard onProductCard = value.e;
            if (onProductCard != null) {
                OnProductCard.b(writer, customScalarAdapters, onProductCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionDetailsQuery_ResponseAdapter$OnInsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$OnInsetBanner;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInsetBanner implements Adapter<CataloguePromotionDetailsQuery.OnInsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21730a = CollectionsKt.Q("__typename");

        public static CataloguePromotionDetailsQuery.OnInsetBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21730a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CatalogueInsetBanner catalogueInsetBannerA = CatalogueInsetBannerImpl_ResponseAdapter.CatalogueInsetBanner.a(reader, customScalarAdapters);
            if (str != null) {
                return new CataloguePromotionDetailsQuery.OnInsetBanner(str, catalogueInsetBannerA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CataloguePromotionDetailsQuery.OnInsetBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21681a);
            List list = CatalogueInsetBannerImpl_ResponseAdapter.CatalogueInsetBanner.f21780a;
            CatalogueInsetBannerImpl_ResponseAdapter.CatalogueInsetBanner.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CataloguePromotionDetailsQuery.OnInsetBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionDetailsQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$OnProductCard;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<CataloguePromotionDetailsQuery.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21731a = CollectionsKt.Q("__typename");

        public static CataloguePromotionDetailsQuery.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21731a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new CataloguePromotionDetailsQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CataloguePromotionDetailsQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21682a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CataloguePromotionDetailsQuery.OnProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionDetailsQuery_ResponseAdapter$OnPromotionDetailsHeader;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$OnPromotionDetailsHeader;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPromotionDetailsHeader implements Adapter<CataloguePromotionDetailsQuery.OnPromotionDetailsHeader> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21732a = CollectionsKt.R("promotionDetailsHeaderTitle", "promotionDetailsHeaderTitleColor", "promotionDetailsHeaderSubtitle", "promotionDetailsHeaderImage");

        public static CataloguePromotionDetailsQuery.OnPromotionDetailsHeader a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f21732a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new CataloguePromotionDetailsQuery.OnPromotionDetailsHeader(str, str2, str3, str4);
            }
            Assertions.a(reader, "promotionDetailsHeaderTitle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CataloguePromotionDetailsQuery.OnPromotionDetailsHeader value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("promotionDetailsHeaderTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21683a);
            writer.F1("promotionDetailsHeaderTitleColor");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("promotionDetailsHeaderSubtitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("promotionDetailsHeaderImage");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CataloguePromotionDetailsQuery.OnPromotionDetailsHeader) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CataloguePromotionDetailsQuery_ResponseAdapter$OnTermsAndConditions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CataloguePromotionDetailsQuery$OnTermsAndConditions;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnTermsAndConditions implements Adapter<CataloguePromotionDetailsQuery.OnTermsAndConditions> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21733a = CollectionsKt.R("termsAndConditionsTitle", "termsAndConditionsContent");

        public static CataloguePromotionDetailsQuery.OnTermsAndConditions a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f21733a);
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
                Assertions.a(reader, "termsAndConditionsTitle");
                throw null;
            }
            if (str2 != null) {
                return new CataloguePromotionDetailsQuery.OnTermsAndConditions(str, str2);
            }
            Assertions.a(reader, "termsAndConditionsContent");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CataloguePromotionDetailsQuery.OnTermsAndConditions value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("termsAndConditionsTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21684a);
            writer.F1("termsAndConditionsContent");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CataloguePromotionDetailsQuery.OnTermsAndConditions) obj);
        }
    }
}
