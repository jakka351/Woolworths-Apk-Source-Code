package com.woolworths.shop.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.graphql.common.fragment.ProductReviewResponse;
import au.com.woolworths.shop.graphql.type.UpdateProductReviewProductQuantitiesInput;
import au.com.woolworths.shop.graphql.type.adapter.UpdateProductReviewProductQuantitiesInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.adapter.UpdateProductReviewProductQuantitiesMutation_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$Data;", "Data", "UpdateProductReviewProductQuantities", "OnProductReviewResult", "OnProductReviewError", "Error", "OnUpdateProductReviewProductQuantitiesError", "OnProductReviewEmpty", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateProductReviewProductQuantitiesMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final UpdateProductReviewProductQuantitiesInput f21574a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateProductReviewProductQuantities f21575a;

        public Data(UpdateProductReviewProductQuantities updateProductReviewProductQuantities) {
            this.f21575a = updateProductReviewProductQuantities;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21575a, ((Data) obj).f21575a);
        }

        public final int hashCode() {
            return this.f21575a.hashCode();
        }

        public final String toString() {
            return "Data(updateProductReviewProductQuantities=" + this.f21575a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$Error;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error {

        /* renamed from: a, reason: collision with root package name */
        public final String f21576a;
        public final OnUpdateProductReviewProductQuantitiesError b;

        public Error(String str, OnUpdateProductReviewProductQuantitiesError onUpdateProductReviewProductQuantitiesError) {
            this.f21576a = str;
            this.b = onUpdateProductReviewProductQuantitiesError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.c(this.f21576a, error.f21576a) && Intrinsics.c(this.b, error.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21576a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(__typename=" + this.f21576a + ", onUpdateProductReviewProductQuantitiesError=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$OnProductReviewEmpty;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductReviewEmpty {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f21577a;

        public OnProductReviewEmpty(boolean z) {
            this.f21577a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnProductReviewEmpty) && this.f21577a == ((OnProductReviewEmpty) obj).f21577a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f21577a);
        }

        public final String toString() {
            return a.n("OnProductReviewEmpty(requiresProductReview=", ")", this.f21577a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$OnProductReviewError;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductReviewError {

        /* renamed from: a, reason: collision with root package name */
        public final List f21578a;

        public OnProductReviewError(List list) {
            this.f21578a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnProductReviewError) && Intrinsics.c(this.f21578a, ((OnProductReviewError) obj).f21578a);
        }

        public final int hashCode() {
            List list = this.f21578a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.l("OnProductReviewError(errors=", ")", this.f21578a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$OnProductReviewResult;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductReviewResult {

        /* renamed from: a, reason: collision with root package name */
        public final String f21579a;
        public final OnProductReviewError b;
        public final OnProductReviewEmpty c;
        public final ProductReviewResponse d;

        public OnProductReviewResult(String __typename, OnProductReviewError onProductReviewError, OnProductReviewEmpty onProductReviewEmpty, ProductReviewResponse productReviewResponse) {
            Intrinsics.h(__typename, "__typename");
            this.f21579a = __typename;
            this.b = onProductReviewError;
            this.c = onProductReviewEmpty;
            this.d = productReviewResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductReviewResult)) {
                return false;
            }
            OnProductReviewResult onProductReviewResult = (OnProductReviewResult) obj;
            return Intrinsics.c(this.f21579a, onProductReviewResult.f21579a) && Intrinsics.c(this.b, onProductReviewResult.b) && Intrinsics.c(this.c, onProductReviewResult.c) && Intrinsics.c(this.d, onProductReviewResult.d);
        }

        public final int hashCode() {
            int iHashCode = this.f21579a.hashCode() * 31;
            OnProductReviewError onProductReviewError = this.b;
            int iHashCode2 = (iHashCode + (onProductReviewError == null ? 0 : onProductReviewError.hashCode())) * 31;
            OnProductReviewEmpty onProductReviewEmpty = this.c;
            int iHashCode3 = (iHashCode2 + (onProductReviewEmpty == null ? 0 : Boolean.hashCode(onProductReviewEmpty.f21577a))) * 31;
            ProductReviewResponse productReviewResponse = this.d;
            return iHashCode3 + (productReviewResponse != null ? productReviewResponse.hashCode() : 0);
        }

        public final String toString() {
            return "OnProductReviewResult(__typename=" + this.f21579a + ", onProductReviewError=" + this.b + ", onProductReviewEmpty=" + this.c + ", productReviewResponse=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$OnUpdateProductReviewProductQuantitiesError;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUpdateProductReviewProductQuantitiesError {

        /* renamed from: a, reason: collision with root package name */
        public final String f21580a;
        public final String b;

        public OnUpdateProductReviewProductQuantitiesError(String str, String str2) {
            this.f21580a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnUpdateProductReviewProductQuantitiesError)) {
                return false;
            }
            OnUpdateProductReviewProductQuantitiesError onUpdateProductReviewProductQuantitiesError = (OnUpdateProductReviewProductQuantitiesError) obj;
            return Intrinsics.c(this.f21580a, onUpdateProductReviewProductQuantitiesError.f21580a) && Intrinsics.c(this.b, onUpdateProductReviewProductQuantitiesError.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21580a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.j("OnUpdateProductReviewProductQuantitiesError(productId=", this.f21580a, ", message=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$UpdateProductReviewProductQuantities;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateProductReviewProductQuantities {

        /* renamed from: a, reason: collision with root package name */
        public final String f21581a;
        public final OnProductReviewResult b;

        public UpdateProductReviewProductQuantities(String str, OnProductReviewResult onProductReviewResult) {
            this.f21581a = str;
            this.b = onProductReviewResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateProductReviewProductQuantities)) {
                return false;
            }
            UpdateProductReviewProductQuantities updateProductReviewProductQuantities = (UpdateProductReviewProductQuantities) obj;
            return Intrinsics.c(this.f21581a, updateProductReviewProductQuantities.f21581a) && Intrinsics.c(this.b, updateProductReviewProductQuantities.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21581a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateProductReviewProductQuantities(__typename=" + this.f21581a + ", onProductReviewResult=" + this.b + ")";
        }
    }

    public UpdateProductReviewProductQuantitiesMutation(UpdateProductReviewProductQuantitiesInput updateProductReviewProductQuantitiesInput) {
        this.f21574a = updateProductReviewProductQuantitiesInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UpdateProductReviewProductQuantitiesMutation_ResponseAdapter.Data.f21628a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation UpdateProductReviewProductQuantities($input: UpdateProductReviewProductQuantitiesInput!) { updateProductReviewProductQuantities(updateProductReviewProductQuantitiesInput: $input) { __typename ... on ProductReviewResult { __typename ...productReviewResponse ... on ProductReviewError { errors { __typename ... on UpdateProductReviewProductQuantitiesError { productId message } } } ... on ProductReviewEmpty { requiresProductReview } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productReviewResponse on ProductReviewResponse { message feed { __typename ... on ProductReviewGroup { banner { displayType message iconUrl bannerTitle: title action { placement type label url } } type products { title productId quantity imageUrl badge { label type } quantityInfo { minimum maximum increment defaultValue: default unit } price isAvailable alternative { title type } availableLimit } analytics { __typename ...analyticsFields } } } analytics { __typename ...analyticsFields } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateProductReviewProductQuantitiesMutation) && Intrinsics.c(this.f21574a, ((UpdateProductReviewProductQuantitiesMutation) obj).f21574a);
    }

    public final int hashCode() {
        return this.f21574a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "4054cd2ca2c12926eaf00aa636a8a6f09ec9b72f2326dd29608220dcecd17ecd";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UpdateProductReviewProductQuantities";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.c(UpdateProductReviewProductQuantitiesInput_InputAdapter.f12139a, false).toJson(jsonWriter, customScalarAdapters, this.f21574a);
    }

    public final String toString() {
        return "UpdateProductReviewProductQuantitiesMutation(input=" + this.f21574a + ")";
    }
}
