package com.woolworths.shop.cart.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.common.fragment.ProductReviewResponse;
import au.com.woolworths.graphql.common.fragment.ProductReviewResponseImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.ProductReviewQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewQuery_ResponseAdapter;", "", "Data", "ProductReview", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductReviewQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ProductReviewQuery$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ProductReviewQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21608a = new Data();
        public static final List b = CollectionsKt.Q("productReview");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductReviewQuery.ProductReview productReview = null;
            while (reader.o2(b) == 0) {
                productReview = (ProductReviewQuery.ProductReview) Adapters.c(ProductReview.f21609a, true).fromJson(reader, customScalarAdapters);
            }
            if (productReview != null) {
                return new ProductReviewQuery.Data(productReview);
            }
            Assertions.a(reader, "productReview");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewQuery.Data value = (ProductReviewQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productReview");
            Adapters.c(ProductReview.f21609a, true).toJson(writer, customScalarAdapters, value.f21551a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewQuery_ResponseAdapter$ProductReview;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ProductReviewQuery$ProductReview;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductReview implements Adapter<ProductReviewQuery.ProductReview> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductReview f21609a = new ProductReview();
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
            ProductReviewResponse productReviewResponseA = ProductReviewResponseImpl_ResponseAdapter.ProductReviewResponse.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductReviewQuery.ProductReview(str, productReviewResponseA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewQuery.ProductReview value = (ProductReviewQuery.ProductReview) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21552a);
            List list = ProductReviewResponseImpl_ResponseAdapter.ProductReviewResponse.f9023a;
            ProductReviewResponseImpl_ResponseAdapter.ProductReviewResponse.b(writer, customScalarAdapters, value.b);
        }
    }
}
