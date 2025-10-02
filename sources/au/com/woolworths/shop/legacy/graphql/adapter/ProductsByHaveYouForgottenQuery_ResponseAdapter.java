package au.com.woolworths.shop.legacy.graphql.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.shop.legacy.graphql.ProductsByHaveYouForgottenQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByHaveYouForgottenQuery_ResponseAdapter;", "", "Data", "ProductsByHaveYouForgotten", "ProductsFeed", "OnProductCard", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductsByHaveYouForgottenQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByHaveYouForgottenQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByHaveYouForgottenQuery$Data;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ProductsByHaveYouForgottenQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f12193a = new Data();
        public static final List b = CollectionsKt.Q("productsByHaveYouForgotten");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductsByHaveYouForgottenQuery.ProductsByHaveYouForgotten productsByHaveYouForgotten = null;
            while (reader.o2(b) == 0) {
                productsByHaveYouForgotten = (ProductsByHaveYouForgottenQuery.ProductsByHaveYouForgotten) Adapters.b(Adapters.c(ProductsByHaveYouForgotten.f12195a, false)).fromJson(reader, customScalarAdapters);
            }
            return new ProductsByHaveYouForgottenQuery.Data(productsByHaveYouForgotten);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByHaveYouForgottenQuery.Data value = (ProductsByHaveYouForgottenQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productsByHaveYouForgotten");
            Adapters.b(Adapters.c(ProductsByHaveYouForgotten.f12195a, false)).toJson(writer, customScalarAdapters, value.f12160a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByHaveYouForgottenQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByHaveYouForgottenQuery$OnProductCard;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<ProductsByHaveYouForgottenQuery.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12194a = CollectionsKt.Q("__typename");

        public static ProductsByHaveYouForgottenQuery.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f12194a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductsByHaveYouForgottenQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductsByHaveYouForgottenQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12161a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductsByHaveYouForgottenQuery.OnProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByHaveYouForgottenQuery_ResponseAdapter$ProductsByHaveYouForgotten;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByHaveYouForgottenQuery$ProductsByHaveYouForgotten;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductsByHaveYouForgotten implements Adapter<ProductsByHaveYouForgottenQuery.ProductsByHaveYouForgotten> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductsByHaveYouForgotten f12195a = new ProductsByHaveYouForgotten();
        public static final List b = CollectionsKt.R("totalNumberOfProducts", "productsFeed");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(ProductsFeed.f12196a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new ProductsByHaveYouForgottenQuery.ProductsByHaveYouForgotten(num, arrayListFromJson);
            }
            Assertions.a(reader, "productsFeed");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByHaveYouForgottenQuery.ProductsByHaveYouForgotten value = (ProductsByHaveYouForgottenQuery.ProductsByHaveYouForgotten) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalNumberOfProducts");
            Adapters.k.toJson(writer, customScalarAdapters, value.f12162a);
            writer.F1("productsFeed");
            Adapters.a(Adapters.c(ProductsFeed.f12196a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByHaveYouForgottenQuery_ResponseAdapter$ProductsFeed;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByHaveYouForgottenQuery$ProductsFeed;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductsFeed implements Adapter<ProductsByHaveYouForgottenQuery.ProductsFeed> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductsFeed f12196a = new ProductsFeed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductsByHaveYouForgottenQuery.OnProductCard onProductCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCardA = OnProductCard.a(reader, customScalarAdapters);
            }
            return new ProductsByHaveYouForgottenQuery.ProductsFeed(str, onProductCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByHaveYouForgottenQuery.ProductsFeed value = (ProductsByHaveYouForgottenQuery.ProductsFeed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12163a);
            ProductsByHaveYouForgottenQuery.OnProductCard onProductCard = value.b;
            if (onProductCard != null) {
                OnProductCard.b(writer, customScalarAdapters, onProductCard);
            }
        }
    }
}
