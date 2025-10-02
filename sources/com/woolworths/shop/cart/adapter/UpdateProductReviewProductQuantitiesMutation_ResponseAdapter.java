package com.woolworths.shop.cart.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.graphql.common.fragment.ProductReviewResponse;
import au.com.woolworths.graphql.common.fragment.ProductReviewResponseImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.UpdateProductReviewProductQuantitiesMutation;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateProductReviewProductQuantitiesMutation_ResponseAdapter;", "", "Data", "UpdateProductReviewProductQuantities", "OnProductReviewResult", "OnProductReviewError", "Error", "OnUpdateProductReviewProductQuantitiesError", "OnProductReviewEmpty", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateProductReviewProductQuantitiesMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateProductReviewProductQuantitiesMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UpdateProductReviewProductQuantitiesMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21628a = new Data();
        public static final List b = CollectionsKt.Q("updateProductReviewProductQuantities");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdateProductReviewProductQuantitiesMutation.UpdateProductReviewProductQuantities updateProductReviewProductQuantities = null;
            while (reader.o2(b) == 0) {
                updateProductReviewProductQuantities = (UpdateProductReviewProductQuantitiesMutation.UpdateProductReviewProductQuantities) Adapters.c(UpdateProductReviewProductQuantities.f21634a, true).fromJson(reader, customScalarAdapters);
            }
            if (updateProductReviewProductQuantities != null) {
                return new UpdateProductReviewProductQuantitiesMutation.Data(updateProductReviewProductQuantities);
            }
            Assertions.a(reader, "updateProductReviewProductQuantities");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateProductReviewProductQuantitiesMutation.Data value = (UpdateProductReviewProductQuantitiesMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("updateProductReviewProductQuantities");
            Adapters.c(UpdateProductReviewProductQuantities.f21634a, true).toJson(writer, customScalarAdapters, value.f21575a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateProductReviewProductQuantitiesMutation_ResponseAdapter$Error;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$Error;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error implements Adapter<UpdateProductReviewProductQuantitiesMutation.Error> {

        /* renamed from: a, reason: collision with root package name */
        public static final Error f21629a = new Error();
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
            UpdateProductReviewProductQuantitiesMutation.OnUpdateProductReviewProductQuantitiesError onUpdateProductReviewProductQuantitiesErrorA = OnUpdateProductReviewProductQuantitiesError.a(reader, customScalarAdapters);
            if (str != null) {
                return new UpdateProductReviewProductQuantitiesMutation.Error(str, onUpdateProductReviewProductQuantitiesErrorA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateProductReviewProductQuantitiesMutation.Error value = (UpdateProductReviewProductQuantitiesMutation.Error) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21576a);
            List list = OnUpdateProductReviewProductQuantitiesError.f21633a;
            OnUpdateProductReviewProductQuantitiesError.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateProductReviewProductQuantitiesMutation_ResponseAdapter$OnProductReviewEmpty;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$OnProductReviewEmpty;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductReviewEmpty implements Adapter<UpdateProductReviewProductQuantitiesMutation.OnProductReviewEmpty> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21630a = CollectionsKt.Q("requiresProductReview");

        public static UpdateProductReviewProductQuantitiesMutation.OnProductReviewEmpty a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(f21630a) == 0) {
                bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
            }
            if (bool != null) {
                return new UpdateProductReviewProductQuantitiesMutation.OnProductReviewEmpty(bool.booleanValue());
            }
            Assertions.a(reader, "requiresProductReview");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, UpdateProductReviewProductQuantitiesMutation.OnProductReviewEmpty value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("requiresProductReview");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.f21577a));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (UpdateProductReviewProductQuantitiesMutation.OnProductReviewEmpty) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateProductReviewProductQuantitiesMutation_ResponseAdapter$OnProductReviewError;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$OnProductReviewError;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductReviewError implements Adapter<UpdateProductReviewProductQuantitiesMutation.OnProductReviewError> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21631a = CollectionsKt.Q("errors");

        public static UpdateProductReviewProductQuantitiesMutation.OnProductReviewError a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            List list = null;
            while (reader.o2(f21631a) == 0) {
                list = (List) Adapters.b(Adapters.a(Adapters.c(Error.f21629a, true))).fromJson(reader, customScalarAdapters);
            }
            return new UpdateProductReviewProductQuantitiesMutation.OnProductReviewError(list);
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, UpdateProductReviewProductQuantitiesMutation.OnProductReviewError value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("errors");
            Adapters.b(Adapters.a(Adapters.c(Error.f21629a, true))).toJson(writer, customScalarAdapters, value.f21578a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (UpdateProductReviewProductQuantitiesMutation.OnProductReviewError) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateProductReviewProductQuantitiesMutation_ResponseAdapter$OnProductReviewResult;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$OnProductReviewResult;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductReviewResult implements Adapter<UpdateProductReviewProductQuantitiesMutation.OnProductReviewResult> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21632a = CollectionsKt.Q("__typename");

        public static UpdateProductReviewProductQuantitiesMutation.OnProductReviewResult a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            UpdateProductReviewProductQuantitiesMutation.OnProductReviewError onProductReviewErrorA;
            UpdateProductReviewProductQuantitiesMutation.OnProductReviewEmpty onProductReviewEmptyA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductReviewResponse productReviewResponseA = null;
            String str = null;
            while (reader.o2(f21632a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductReviewError"))) {
                reader.o();
                onProductReviewErrorA = OnProductReviewError.a(reader, customScalarAdapters);
            } else {
                onProductReviewErrorA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductReviewEmpty"))) {
                reader.o();
                onProductReviewEmptyA = OnProductReviewEmpty.a(reader, customScalarAdapters);
            } else {
                onProductReviewEmptyA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductReviewResponse"))) {
                reader.o();
                productReviewResponseA = ProductReviewResponseImpl_ResponseAdapter.ProductReviewResponse.a(reader, customScalarAdapters);
            }
            return new UpdateProductReviewProductQuantitiesMutation.OnProductReviewResult(str, onProductReviewErrorA, onProductReviewEmptyA, productReviewResponseA);
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, UpdateProductReviewProductQuantitiesMutation.OnProductReviewResult value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21579a);
            UpdateProductReviewProductQuantitiesMutation.OnProductReviewError onProductReviewError = value.b;
            if (onProductReviewError != null) {
                OnProductReviewError.b(writer, customScalarAdapters, onProductReviewError);
            }
            UpdateProductReviewProductQuantitiesMutation.OnProductReviewEmpty onProductReviewEmpty = value.c;
            if (onProductReviewEmpty != null) {
                OnProductReviewEmpty.b(writer, customScalarAdapters, onProductReviewEmpty);
            }
            ProductReviewResponse productReviewResponse = value.d;
            if (productReviewResponse != null) {
                ProductReviewResponseImpl_ResponseAdapter.ProductReviewResponse.b(writer, customScalarAdapters, productReviewResponse);
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (UpdateProductReviewProductQuantitiesMutation.OnProductReviewResult) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateProductReviewProductQuantitiesMutation_ResponseAdapter$OnUpdateProductReviewProductQuantitiesError;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$OnUpdateProductReviewProductQuantitiesError;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnUpdateProductReviewProductQuantitiesError implements Adapter<UpdateProductReviewProductQuantitiesMutation.OnUpdateProductReviewProductQuantitiesError> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21633a = CollectionsKt.R("productId", "message");

        public static UpdateProductReviewProductQuantitiesMutation.OnUpdateProductReviewProductQuantitiesError a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f21633a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new UpdateProductReviewProductQuantitiesMutation.OnUpdateProductReviewProductQuantitiesError(str, str2);
            }
            Assertions.a(reader, "productId");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, UpdateProductReviewProductQuantitiesMutation.OnUpdateProductReviewProductQuantitiesError value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21580a);
            writer.F1("message");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (UpdateProductReviewProductQuantitiesMutation.OnUpdateProductReviewProductQuantitiesError) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateProductReviewProductQuantitiesMutation_ResponseAdapter$UpdateProductReviewProductQuantities;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateProductReviewProductQuantitiesMutation$UpdateProductReviewProductQuantities;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateProductReviewProductQuantities implements Adapter<UpdateProductReviewProductQuantitiesMutation.UpdateProductReviewProductQuantities> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdateProductReviewProductQuantities f21634a = new UpdateProductReviewProductQuantities();
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
            UpdateProductReviewProductQuantitiesMutation.OnProductReviewResult onProductReviewResultA = OnProductReviewResult.a(reader, customScalarAdapters);
            if (str != null) {
                return new UpdateProductReviewProductQuantitiesMutation.UpdateProductReviewProductQuantities(str, onProductReviewResultA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateProductReviewProductQuantitiesMutation.UpdateProductReviewProductQuantities value = (UpdateProductReviewProductQuantitiesMutation.UpdateProductReviewProductQuantities) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21581a);
            List list = OnProductReviewResult.f21632a;
            OnProductReviewResult.b(writer, customScalarAdapters, value.b);
        }
    }
}
