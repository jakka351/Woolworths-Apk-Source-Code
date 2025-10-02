package com.woolworths.shop.product.navigation;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.graphql.type.adapter.CategoriesType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.product.navigation.adapter.ProductCategoryQuery_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/shop/product/navigation/ProductCategoryQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/product/navigation/ProductCategoryQuery$Data;", "Data", "ProductCategories", "Category", "Companion", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProductCategoryQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f23608a;
    public final Optional b;
    public final Optional c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/navigation/ProductCategoryQuery$Category;", "", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Category {

        /* renamed from: a, reason: collision with root package name */
        public final String f23609a;
        public final boolean b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public Category(String str, boolean z, String str2, String str3, String str4, String str5) {
            this.f23609a = str;
            this.b = z;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Category)) {
                return false;
            }
            Category category = (Category) obj;
            return Intrinsics.c(this.f23609a, category.f23609a) && this.b == category.b && Intrinsics.c(this.c, category.c) && Intrinsics.c(this.d, category.d) && Intrinsics.c(this.e, category.e) && Intrinsics.c(this.f, category.f);
        }

        public final int hashCode() {
            String str = this.f23609a;
            int iC = b.c(b.c(b.c(b.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
            String str2 = this.f;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = a.q("Category(iconUrl=", this.f23609a, ", isFinalLevel=", ", headerTitle=", this.b);
            a.B(sbQ, this.c, ", title=", this.d, ", categoryId=");
            return a.l(sbQ, this.e, ", source=", this.f, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/product/navigation/ProductCategoryQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/navigation/ProductCategoryQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ProductCategories f23610a;

        public Data(ProductCategories productCategories) {
            this.f23610a = productCategories;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f23610a, ((Data) obj).f23610a);
        }

        public final int hashCode() {
            ProductCategories productCategories = this.f23610a;
            if (productCategories == null) {
                return 0;
            }
            return productCategories.hashCode();
        }

        public final String toString() {
            return "Data(productCategories=" + this.f23610a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/navigation/ProductCategoryQuery$ProductCategories;", "", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductCategories {

        /* renamed from: a, reason: collision with root package name */
        public final String f23611a;
        public final List b;

        public ProductCategories(String str, List list) {
            this.f23611a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductCategories)) {
                return false;
            }
            ProductCategories productCategories = (ProductCategories) obj;
            return Intrinsics.c(this.f23611a, productCategories.f23611a) && Intrinsics.c(this.b, productCategories.b);
        }

        public final int hashCode() {
            int iHashCode = this.f23611a.hashCode() * 31;
            List list = this.b;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.i("ProductCategories(headerTitle=", this.f23611a, ", categories=", ")", this.b);
        }
    }

    public ProductCategoryQuery(Optional optional, Optional optional2, Optional optional3) {
        this.f23608a = optional;
        this.b = optional2;
        this.c = optional3;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ProductCategoryQuery_ResponseAdapter.Data.f23617a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query ProductCategory($categoryId: String, $storeId: String, $categoriesType: CategoriesType) { productCategories(categoryId: $categoryId, storeId: $storeId, categoriesType: $categoriesType) { headerTitle categories { iconUrl isFinalLevel headerTitle title categoryId source } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCategoryQuery)) {
            return false;
        }
        ProductCategoryQuery productCategoryQuery = (ProductCategoryQuery) obj;
        return Intrinsics.c(this.f23608a, productCategoryQuery.f23608a) && Intrinsics.c(this.b, productCategoryQuery.b) && Intrinsics.c(this.c, productCategoryQuery.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f23608a.hashCode() * 31, 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "0ff8b97c1a58c8016a846c2159f1451245393ee0f53f945ca2ff09a0d8f657bd";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ProductCategory";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f23608a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("categoryId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        Optional optional2 = this.b;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("storeId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        Optional optional3 = this.c;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("categoriesType");
            Adapters.d(Adapters.b(CategoriesType_ResponseAdapter.f12049a)).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        }
    }

    public final String toString() {
        return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.o(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.p("ProductCategoryQuery(categoryId=", this.f23608a, ", storeId=", this.b, ", categoriesType="), this.c, ")");
    }
}
