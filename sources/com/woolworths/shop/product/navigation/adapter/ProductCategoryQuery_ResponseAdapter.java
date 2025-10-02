package com.woolworths.shop.product.navigation.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.product.navigation.ProductCategoryQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/shop/product/navigation/adapter/ProductCategoryQuery_ResponseAdapter;", "", "Data", "ProductCategories", "Category", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductCategoryQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/navigation/adapter/ProductCategoryQuery_ResponseAdapter$Category;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/navigation/ProductCategoryQuery$Category;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Category implements Adapter<ProductCategoryQuery.Category> {

        /* renamed from: a, reason: collision with root package name */
        public static final Category f23616a = new Category();
        public static final List b = CollectionsKt.R("iconUrl", "isFinalLevel", "headerTitle", "title", "categoryId", "source");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool = bool2;
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (bool3 == null) {
                Assertions.a(reader, "isFinalLevel");
                throw null;
            }
            boolean zBooleanValue = bool3.booleanValue();
            if (str2 == null) {
                Assertions.a(reader, "headerTitle");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str4 != null) {
                return new ProductCategoryQuery.Category(str, zBooleanValue, str2, str3, str4, str5);
            }
            Assertions.a(reader, "categoryId");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCategoryQuery.Category value = (ProductCategoryQuery.Category) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23609a);
            writer.F1("isFinalLevel");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "headerTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("categoryId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("source");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/navigation/adapter/ProductCategoryQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/navigation/ProductCategoryQuery$Data;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ProductCategoryQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f23617a = new Data();
        public static final List b = CollectionsKt.Q("productCategories");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductCategoryQuery.ProductCategories productCategories = null;
            while (reader.o2(b) == 0) {
                productCategories = (ProductCategoryQuery.ProductCategories) Adapters.b(Adapters.c(ProductCategories.f23618a, false)).fromJson(reader, customScalarAdapters);
            }
            return new ProductCategoryQuery.Data(productCategories);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCategoryQuery.Data value = (ProductCategoryQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productCategories");
            Adapters.b(Adapters.c(ProductCategories.f23618a, false)).toJson(writer, customScalarAdapters, value.f23610a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/navigation/adapter/ProductCategoryQuery_ResponseAdapter$ProductCategories;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/navigation/ProductCategoryQuery$ProductCategories;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductCategories implements Adapter<ProductCategoryQuery.ProductCategories> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductCategories f23618a = new ProductCategories();
        public static final List b = CollectionsKt.R("headerTitle", "categories");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            List list = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    list = (List) Adapters.b(Adapters.a(Adapters.c(Category.f23616a, false))).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new ProductCategoryQuery.ProductCategories(str, list);
            }
            Assertions.a(reader, "headerTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCategoryQuery.ProductCategories value = (ProductCategoryQuery.ProductCategories) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("headerTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23611a);
            writer.F1("categories");
            Adapters.b(Adapters.a(Adapters.c(Category.f23616a, false))).toJson(writer, customScalarAdapters, value.b);
        }
    }
}
