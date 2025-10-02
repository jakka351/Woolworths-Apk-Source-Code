package com.woolworths.shop.catalogue.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.catalogue.CatalogueLandingQuery;
import com.woolworths.shop.catalogue.fragment.CatalogueActionableCard;
import com.woolworths.shop.catalogue.fragment.CatalogueActionableCardImpl_ResponseAdapter;
import com.woolworths.shop.catalogue.fragment.CatalogueLandingCard;
import com.woolworths.shop.catalogue.fragment.CatalogueLandingCardImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueLandingQuery_ResponseAdapter;", "", "Data", "CatalogueLanding", "Item", "OnCatalogueLandingHeader", "OnCatalogueLandingCategoryCard", "OnActionableCard", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CatalogueLandingQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueLandingQuery_ResponseAdapter$CatalogueLanding;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueLandingQuery$CatalogueLanding;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CatalogueLanding implements Adapter<CatalogueLandingQuery.CatalogueLanding> {

        /* renamed from: a, reason: collision with root package name */
        public static final CatalogueLanding f21716a = new CatalogueLanding();
        public static final List b = CollectionsKt.Q("items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Item.f21718a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new CatalogueLandingQuery.CatalogueLanding(arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueLandingQuery.CatalogueLanding value = (CatalogueLandingQuery.CatalogueLanding) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f21718a, true)).toJson(writer, customScalarAdapters, value.f21665a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueLandingQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueLandingQuery$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<CatalogueLandingQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21717a = new Data();
        public static final List b = CollectionsKt.Q("catalogueLanding");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CatalogueLandingQuery.CatalogueLanding catalogueLanding = null;
            while (reader.o2(b) == 0) {
                catalogueLanding = (CatalogueLandingQuery.CatalogueLanding) Adapters.b(Adapters.c(CatalogueLanding.f21716a, false)).fromJson(reader, customScalarAdapters);
            }
            return new CatalogueLandingQuery.Data(catalogueLanding);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueLandingQuery.Data value = (CatalogueLandingQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("catalogueLanding");
            Adapters.b(Adapters.c(CatalogueLanding.f21716a, false)).toJson(writer, customScalarAdapters, value.f21666a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueLandingQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueLandingQuery$Item;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<CatalogueLandingQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f21718a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CatalogueLandingQuery.OnCatalogueLandingHeader onCatalogueLandingHeaderA;
            CatalogueLandingQuery.OnCatalogueLandingCategoryCard onCatalogueLandingCategoryCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CatalogueLandingQuery.OnActionableCard onActionableCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CatalogueLandingHeader"))) {
                reader.o();
                onCatalogueLandingHeaderA = OnCatalogueLandingHeader.a(reader, customScalarAdapters);
            } else {
                onCatalogueLandingHeaderA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CatalogueLandingCategoryCard"))) {
                reader.o();
                onCatalogueLandingCategoryCardA = OnCatalogueLandingCategoryCard.a(reader, customScalarAdapters);
            } else {
                onCatalogueLandingCategoryCardA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ActionableCard"), BooleanExpressions.d("includeActionableCard")))) {
                reader.o();
                onActionableCardA = OnActionableCard.a(reader, customScalarAdapters);
            }
            return new CatalogueLandingQuery.Item(str, onCatalogueLandingHeaderA, onCatalogueLandingCategoryCardA, onActionableCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueLandingQuery.Item value = (CatalogueLandingQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21667a);
            CatalogueLandingQuery.OnCatalogueLandingHeader onCatalogueLandingHeader = value.b;
            if (onCatalogueLandingHeader != null) {
                OnCatalogueLandingHeader.b(writer, customScalarAdapters, onCatalogueLandingHeader);
            }
            CatalogueLandingQuery.OnCatalogueLandingCategoryCard onCatalogueLandingCategoryCard = value.c;
            if (onCatalogueLandingCategoryCard != null) {
                OnCatalogueLandingCategoryCard.b(writer, customScalarAdapters, onCatalogueLandingCategoryCard);
            }
            CatalogueLandingQuery.OnActionableCard onActionableCard = value.d;
            if (onActionableCard != null) {
                OnActionableCard.b(writer, customScalarAdapters, onActionableCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueLandingQuery_ResponseAdapter$OnActionableCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueLandingQuery$OnActionableCard;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard implements Adapter<CatalogueLandingQuery.OnActionableCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21719a = CollectionsKt.Q("__typename");

        public static CatalogueLandingQuery.OnActionableCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21719a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CatalogueActionableCard catalogueActionableCardA = CatalogueActionableCardImpl_ResponseAdapter.CatalogueActionableCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new CatalogueLandingQuery.OnActionableCard(str, catalogueActionableCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CatalogueLandingQuery.OnActionableCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21668a);
            List list = CatalogueActionableCardImpl_ResponseAdapter.CatalogueActionableCard.f21748a;
            CatalogueActionableCardImpl_ResponseAdapter.CatalogueActionableCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CatalogueLandingQuery.OnActionableCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueLandingQuery_ResponseAdapter$OnCatalogueLandingCategoryCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueLandingQuery$OnCatalogueLandingCategoryCard;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCatalogueLandingCategoryCard implements Adapter<CatalogueLandingQuery.OnCatalogueLandingCategoryCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21720a = CollectionsKt.R("__typename", "id");

        public static CatalogueLandingQuery.OnCatalogueLandingCategoryCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f21720a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            reader.o();
            CatalogueLandingCard catalogueLandingCardA = CatalogueLandingCardImpl_ResponseAdapter.CatalogueLandingCard.a(reader, customScalarAdapters);
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 != null) {
                return new CatalogueLandingQuery.OnCatalogueLandingCategoryCard(str, str2, catalogueLandingCardA);
            }
            Assertions.a(reader, "id");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CatalogueLandingQuery.OnCatalogueLandingCategoryCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21669a);
            writer.F1("id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            List list = CatalogueLandingCardImpl_ResponseAdapter.CatalogueLandingCard.f21782a;
            CatalogueLandingCardImpl_ResponseAdapter.CatalogueLandingCard.b(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CatalogueLandingQuery.OnCatalogueLandingCategoryCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueLandingQuery_ResponseAdapter$OnCatalogueLandingHeader;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueLandingQuery$OnCatalogueLandingHeader;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCatalogueLandingHeader implements Adapter<CatalogueLandingQuery.OnCatalogueLandingHeader> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21721a = CollectionsKt.Q("headerImage");

        public static CatalogueLandingQuery.OnCatalogueLandingHeader a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21721a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new CatalogueLandingQuery.OnCatalogueLandingHeader(str);
            }
            Assertions.a(reader, "headerImage");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CatalogueLandingQuery.OnCatalogueLandingHeader value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("headerImage");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21670a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CatalogueLandingQuery.OnCatalogueLandingHeader) obj);
        }
    }
}
