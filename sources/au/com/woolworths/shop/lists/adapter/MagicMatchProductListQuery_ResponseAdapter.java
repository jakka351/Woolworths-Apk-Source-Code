package au.com.woolworths.shop.lists.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.shop.lists.MagicMatchProductListQuery;
import au.com.woolworths.shop.lists.data.remote.SuggestedProductListQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/MagicMatchProductListQuery_ResponseAdapter;", "", "Data", "MagicMatchProductList", "ProductList", "MatchedProduct", "Product", "SuggestedProductList", "Product1", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MagicMatchProductListQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/MagicMatchProductListQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$Data;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<MagicMatchProductListQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f12246a = new Data();
        public static final List b = CollectionsKt.Q("magicMatchProductList");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            MagicMatchProductListQuery.MagicMatchProductList magicMatchProductList = null;
            while (reader.o2(b) == 0) {
                magicMatchProductList = (MagicMatchProductListQuery.MagicMatchProductList) Adapters.c(MagicMatchProductList.f12247a, false).fromJson(reader, customScalarAdapters);
            }
            if (magicMatchProductList != null) {
                return new MagicMatchProductListQuery.Data(magicMatchProductList);
            }
            Assertions.a(reader, "magicMatchProductList");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MagicMatchProductListQuery.Data value = (MagicMatchProductListQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("magicMatchProductList");
            Adapters.c(MagicMatchProductList.f12247a, false).toJson(writer, customScalarAdapters, value.f12228a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/MagicMatchProductListQuery_ResponseAdapter$MagicMatchProductList;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$MagicMatchProductList;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MagicMatchProductList implements Adapter<MagicMatchProductListQuery.MagicMatchProductList> {

        /* renamed from: a, reason: collision with root package name */
        public static final MagicMatchProductList f12247a = new MagicMatchProductList();
        public static final List b = CollectionsKt.Q("productList");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(ProductList.f12251a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new MagicMatchProductListQuery.MagicMatchProductList(arrayListFromJson);
            }
            Assertions.a(reader, "productList");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MagicMatchProductListQuery.MagicMatchProductList value = (MagicMatchProductListQuery.MagicMatchProductList) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productList");
            Adapters.a(Adapters.c(ProductList.f12251a, false)).toJson(writer, customScalarAdapters, value.f12229a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/MagicMatchProductListQuery_ResponseAdapter$MatchedProduct;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$MatchedProduct;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MatchedProduct implements Adapter<MagicMatchProductListQuery.MatchedProduct> {

        /* renamed from: a, reason: collision with root package name */
        public static final MatchedProduct f12248a = new MatchedProduct();
        public static final List b = CollectionsKt.R("quantity", "product");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            MagicMatchProductListQuery.Product product = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    product = (MagicMatchProductListQuery.Product) Adapters.c(Product.f12249a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (d == null) {
                Assertions.a(reader, "quantity");
                throw null;
            }
            double dDoubleValue = d.doubleValue();
            if (product != null) {
                return new MagicMatchProductListQuery.MatchedProduct(dDoubleValue, product);
            }
            Assertions.a(reader, "product");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MagicMatchProductListQuery.MatchedProduct value = (MagicMatchProductListQuery.MatchedProduct) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("quantity");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.f12230a));
            writer.F1("product");
            Adapters.c(Product.f12249a, true).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/MagicMatchProductListQuery_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$Product;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product implements Adapter<MagicMatchProductListQuery.Product> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product f12249a = new Product();
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
                return new MagicMatchProductListQuery.Product(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MagicMatchProductListQuery.Product value = (MagicMatchProductListQuery.Product) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12231a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/MagicMatchProductListQuery_ResponseAdapter$Product1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$Product1;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product1 implements Adapter<MagicMatchProductListQuery.Product1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product1 f12250a = new Product1();
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
                return new MagicMatchProductListQuery.Product1(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MagicMatchProductListQuery.Product1 value = (MagicMatchProductListQuery.Product1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12232a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/MagicMatchProductListQuery_ResponseAdapter$ProductList;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$ProductList;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductList implements Adapter<MagicMatchProductListQuery.ProductList> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductList f12251a = new ProductList();
        public static final List b = CollectionsKt.R("searchText", "listItemId", "matchedProduct", SuggestedProductListQuery.OPERATION_NAME);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            MagicMatchProductListQuery.MatchedProduct matchedProduct = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    matchedProduct = (MagicMatchProductListQuery.MatchedProduct) Adapters.b(Adapters.c(MatchedProduct.f12248a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(SuggestedProductList.f12252a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "searchText");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "listItemId");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new MagicMatchProductListQuery.ProductList(str, str2, matchedProduct, arrayListFromJson);
            }
            Assertions.a(reader, SuggestedProductListQuery.OPERATION_NAME);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MagicMatchProductListQuery.ProductList value = (MagicMatchProductListQuery.ProductList) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("searchText");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12233a);
            writer.F1("listItemId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("matchedProduct");
            Adapters.b(Adapters.c(MatchedProduct.f12248a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1(SuggestedProductListQuery.OPERATION_NAME);
            Adapters.a(Adapters.c(SuggestedProductList.f12252a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/MagicMatchProductListQuery_ResponseAdapter$SuggestedProductList;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/MagicMatchProductListQuery$SuggestedProductList;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SuggestedProductList implements Adapter<MagicMatchProductListQuery.SuggestedProductList> {

        /* renamed from: a, reason: collision with root package name */
        public static final SuggestedProductList f12252a = new SuggestedProductList();
        public static final List b = CollectionsKt.R("quantity", "product");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            MagicMatchProductListQuery.Product1 product1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    product1 = (MagicMatchProductListQuery.Product1) Adapters.c(Product1.f12250a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (d == null) {
                Assertions.a(reader, "quantity");
                throw null;
            }
            double dDoubleValue = d.doubleValue();
            if (product1 != null) {
                return new MagicMatchProductListQuery.SuggestedProductList(dDoubleValue, product1);
            }
            Assertions.a(reader, "product");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MagicMatchProductListQuery.SuggestedProductList value = (MagicMatchProductListQuery.SuggestedProductList) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("quantity");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.f12234a));
            writer.F1("product");
            Adapters.c(Product1.f12250a, true).toJson(writer, customScalarAdapters, value.b);
        }
    }
}
