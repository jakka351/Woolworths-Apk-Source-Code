package com.woolworths.shop.product.details.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.product.details.FetchNodeContentQuery;
import com.woolworths.shop.productcard.data.fragment.ProductTile;
import com.woolworths.shop.productcard.data.fragment.ProductTileImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/FetchNodeContentQuery_ResponseAdapter;", "", "Data", "FetchNodeContent", "OnHorizontalList", "Item", "OnProductCard", "OnProductTile", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FetchNodeContentQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/FetchNodeContentQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/FetchNodeContentQuery$Data;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<FetchNodeContentQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f23502a = new Data();
        public static final List b = CollectionsKt.Q("fetchNodeContent");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FetchNodeContentQuery.FetchNodeContent fetchNodeContent = null;
            while (reader.o2(b) == 0) {
                fetchNodeContent = (FetchNodeContentQuery.FetchNodeContent) Adapters.b(Adapters.c(FetchNodeContent.f23503a, true)).fromJson(reader, customScalarAdapters);
            }
            return new FetchNodeContentQuery.Data(fetchNodeContent);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FetchNodeContentQuery.Data value = (FetchNodeContentQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("fetchNodeContent");
            Adapters.b(Adapters.c(FetchNodeContent.f23503a, true)).toJson(writer, customScalarAdapters, value.f23402a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/FetchNodeContentQuery_ResponseAdapter$FetchNodeContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/FetchNodeContentQuery$FetchNodeContent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FetchNodeContent implements Adapter<FetchNodeContentQuery.FetchNodeContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final FetchNodeContent f23503a = new FetchNodeContent();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FetchNodeContentQuery.OnHorizontalList onHorizontalListA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("HorizontalList"))) {
                reader.o();
                onHorizontalListA = OnHorizontalList.a(reader, customScalarAdapters);
            }
            return new FetchNodeContentQuery.FetchNodeContent(str, onHorizontalListA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FetchNodeContentQuery.FetchNodeContent value = (FetchNodeContentQuery.FetchNodeContent) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23403a);
            FetchNodeContentQuery.OnHorizontalList onHorizontalList = value.b;
            if (onHorizontalList != null) {
                OnHorizontalList.b(writer, customScalarAdapters, onHorizontalList);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/FetchNodeContentQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/FetchNodeContentQuery$Item;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<FetchNodeContentQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f23504a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            FetchNodeContentQuery.OnProductCard onProductCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            FetchNodeContentQuery.OnProductTile onProductTileA = null;
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
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ProductTile"), BooleanExpressions.d("isProductTileUpliftEnabled")))) {
                reader.o();
                onProductTileA = OnProductTile.a(reader, customScalarAdapters);
            }
            return new FetchNodeContentQuery.Item(str, onProductCardA, onProductTileA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FetchNodeContentQuery.Item value = (FetchNodeContentQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23404a);
            FetchNodeContentQuery.OnProductCard onProductCard = value.b;
            if (onProductCard != null) {
                OnProductCard.b(writer, customScalarAdapters, onProductCard);
            }
            FetchNodeContentQuery.OnProductTile onProductTile = value.c;
            if (onProductTile != null) {
                OnProductTile.b(writer, customScalarAdapters, onProductTile);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/FetchNodeContentQuery_ResponseAdapter$OnHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/FetchNodeContentQuery$OnHorizontalList;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHorizontalList implements Adapter<FetchNodeContentQuery.OnHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23505a = CollectionsKt.Q("items");

        public static FetchNodeContentQuery.OnHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f23505a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Item.f23504a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new FetchNodeContentQuery.OnHorizontalList(arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FetchNodeContentQuery.OnHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f23504a, true)).toJson(writer, customScalarAdapters, value.f23405a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FetchNodeContentQuery.OnHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/FetchNodeContentQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/FetchNodeContentQuery$OnProductCard;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<FetchNodeContentQuery.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23506a = CollectionsKt.Q("__typename");

        public static FetchNodeContentQuery.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23506a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new FetchNodeContentQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FetchNodeContentQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23406a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FetchNodeContentQuery.OnProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/FetchNodeContentQuery_ResponseAdapter$OnProductTile;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/FetchNodeContentQuery$OnProductTile;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductTile implements Adapter<FetchNodeContentQuery.OnProductTile> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23507a = CollectionsKt.Q("__typename");

        public static FetchNodeContentQuery.OnProductTile a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23507a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductTile productTileA = ProductTileImpl_ResponseAdapter.ProductTile.a(reader, customScalarAdapters);
            if (str != null) {
                return new FetchNodeContentQuery.OnProductTile(str, productTileA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FetchNodeContentQuery.OnProductTile value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23407a);
            List list = ProductTileImpl_ResponseAdapter.ProductTile.f23692a;
            ProductTileImpl_ResponseAdapter.ProductTile.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FetchNodeContentQuery.OnProductTile) obj);
        }
    }
}
