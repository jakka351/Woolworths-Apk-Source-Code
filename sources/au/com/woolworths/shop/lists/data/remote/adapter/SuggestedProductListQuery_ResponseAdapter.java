package au.com.woolworths.shop.lists.data.remote.adapter;

import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.shop.lists.data.remote.SuggestedProductListQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/adapter/SuggestedProductListQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "SuggestedListItems", "Product", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestedProductListQuery_ResponseAdapter {

    @NotNull
    public static final SuggestedProductListQuery_ResponseAdapter INSTANCE = new SuggestedProductListQuery_ResponseAdapter();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/adapter/SuggestedProductListQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery$Data;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SuggestedProductListQuery.Data> {

        @NotNull
        public static final Data INSTANCE = new Data();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("suggestedListItems");

        private Data() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public SuggestedProductListQuery.Data fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SuggestedProductListQuery.SuggestedListItems suggestedListItems = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                suggestedListItems = (SuggestedProductListQuery.SuggestedListItems) Adapters.b(Adapters.c(SuggestedListItems.INSTANCE, false)).fromJson(reader, customScalarAdapters);
            }
            return new SuggestedProductListQuery.Data(suggestedListItems);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull SuggestedProductListQuery.Data value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("suggestedListItems");
            Adapters.b(Adapters.c(SuggestedListItems.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getSuggestedListItems());
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/adapter/SuggestedProductListQuery_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery$Product;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product implements Adapter<SuggestedProductListQuery.Product> {

        @NotNull
        public static final Product INSTANCE = new Product();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");

        private Product() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public SuggestedProductListQuery.Product fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new SuggestedProductListQuery.Product(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull SuggestedProductListQuery.Product value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.getProductCard());
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/adapter/SuggestedProductListQuery_ResponseAdapter$SuggestedListItems;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery$SuggestedListItems;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SuggestedListItems implements Adapter<SuggestedProductListQuery.SuggestedListItems> {

        @NotNull
        public static final SuggestedListItems INSTANCE = new SuggestedListItems();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("totalNumberOfProducts", "nextPage", "products");

        private SuggestedListItems() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public SuggestedProductListQuery.SuggestedListItems fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Product.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new SuggestedProductListQuery.SuggestedListItems(num, num2, arrayListFromJson);
            }
            Assertions.a(reader, "products");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull SuggestedProductListQuery.SuggestedListItems value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalNumberOfProducts");
            NullableAdapter nullableAdapter = Adapters.k;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getTotalNumberOfProducts());
            writer.F1("nextPage");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getNextPage());
            writer.F1("products");
            Adapters.a(Adapters.c(Product.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getProducts());
        }
    }

    private SuggestedProductListQuery_ResponseAdapter() {
    }
}
