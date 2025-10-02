package com.woolworths.shop.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.common.fragment.ProductReviewResponse;
import au.com.woolworths.shop.graphql.type.ProductReviewInput;
import au.com.woolworths.shop.graphql.type.adapter.ProductReviewInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.adapter.ProductReviewQuery_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/cart/ProductReviewQuery$Data;", "Data", "ProductReview", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProductReviewQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ProductReviewInput f21550a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ProductReview f21551a;

        public Data(ProductReview productReview) {
            this.f21551a = productReview;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21551a, ((Data) obj).f21551a);
        }

        public final int hashCode() {
            return this.f21551a.hashCode();
        }

        public final String toString() {
            return "Data(productReview=" + this.f21551a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewQuery$ProductReview;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductReview {

        /* renamed from: a, reason: collision with root package name */
        public final String f21552a;
        public final ProductReviewResponse b;

        public ProductReview(String str, ProductReviewResponse productReviewResponse) {
            this.f21552a = str;
            this.b = productReviewResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductReview)) {
                return false;
            }
            ProductReview productReview = (ProductReview) obj;
            return Intrinsics.c(this.f21552a, productReview.f21552a) && Intrinsics.c(this.b, productReview.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21552a.hashCode() * 31);
        }

        public final String toString() {
            return "ProductReview(__typename=" + this.f21552a + ", productReviewResponse=" + this.b + ")";
        }
    }

    public ProductReviewQuery(ProductReviewInput productReviewInput) {
        this.f21550a = productReviewInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ProductReviewQuery_ResponseAdapter.Data.f21608a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query ProductReview($input: ProductReviewInput!) { productReview(productReviewInput: $input) { __typename ...productReviewResponse } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productReviewResponse on ProductReviewResponse { message feed { __typename ... on ProductReviewGroup { banner { displayType message iconUrl bannerTitle: title action { placement type label url } } type products { title productId quantity imageUrl badge { label type } quantityInfo { minimum maximum increment defaultValue: default unit } price isAvailable alternative { title type } availableLimit } analytics { __typename ...analyticsFields } } } analytics { __typename ...analyticsFields } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductReviewQuery) && Intrinsics.c(this.f21550a, ((ProductReviewQuery) obj).f21550a);
    }

    public final int hashCode() {
        return this.f21550a.f11777a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "9ceff56a0e0ba3bf183327087d00cbc4e4b69b036494485d1591499cf4fa1506";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ProductReview";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.c(ProductReviewInput_InputAdapter.f12106a, false).toJson(jsonWriter, customScalarAdapters, this.f21550a);
    }

    public final String toString() {
        return "ProductReviewQuery(input=" + this.f21550a + ")";
    }
}
