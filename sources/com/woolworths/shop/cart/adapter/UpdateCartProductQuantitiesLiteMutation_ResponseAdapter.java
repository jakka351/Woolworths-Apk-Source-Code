package com.woolworths.shop.cart.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.foundation.shop.prompt.handler.fragment.Prompts;
import au.com.woolworths.foundation.shop.prompt.handler.fragment.PromptsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.CartProductQuantityAction;
import au.com.woolworths.shop.graphql.type.UpdateCartProductQuantityFailedReason;
import au.com.woolworths.shop.graphql.type.adapter.CartProductQuantityAction_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.UpdateCartProductQuantityFailedReason_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.UpdateCartProductQuantitiesLiteMutation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateCartProductQuantitiesLiteMutation_ResponseAdapter;", "", "Data", "UpdateCartProductQuantities", "UpdatedProductQuantity", "Error", "ErrorPrompt", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateCartProductQuantitiesLiteMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateCartProductQuantitiesLiteMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesLiteMutation$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UpdateCartProductQuantitiesLiteMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21610a = new Data();
        public static final List b = CollectionsKt.Q("updateCartProductQuantities");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdateCartProductQuantitiesLiteMutation.UpdateCartProductQuantities updateCartProductQuantities = null;
            while (reader.o2(b) == 0) {
                updateCartProductQuantities = (UpdateCartProductQuantitiesLiteMutation.UpdateCartProductQuantities) Adapters.c(UpdateCartProductQuantities.f21613a, false).fromJson(reader, customScalarAdapters);
            }
            if (updateCartProductQuantities != null) {
                return new UpdateCartProductQuantitiesLiteMutation.Data(updateCartProductQuantities);
            }
            Assertions.a(reader, "updateCartProductQuantities");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartProductQuantitiesLiteMutation.Data value = (UpdateCartProductQuantitiesLiteMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("updateCartProductQuantities");
            Adapters.c(UpdateCartProductQuantities.f21613a, false).toJson(writer, customScalarAdapters, value.f21554a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateCartProductQuantitiesLiteMutation_ResponseAdapter$Error;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesLiteMutation$Error;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error implements Adapter<UpdateCartProductQuantitiesLiteMutation.Error> {

        /* renamed from: a, reason: collision with root package name */
        public static final Error f21611a = new Error();
        public static final List b = CollectionsKt.R("reason", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdateCartProductQuantityFailedReason updateCartProductQuantityFailedReasonA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    updateCartProductQuantityFailedReasonA = UpdateCartProductQuantityFailedReason_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (updateCartProductQuantityFailedReasonA == null) {
                Assertions.a(reader, "reason");
                throw null;
            }
            if (str != null) {
                return new UpdateCartProductQuantitiesLiteMutation.Error(updateCartProductQuantityFailedReasonA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartProductQuantitiesLiteMutation.Error value = (UpdateCartProductQuantitiesLiteMutation.Error) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("reason");
            UpdateCartProductQuantityFailedReason_ResponseAdapter.b(writer, customScalarAdapters, value.f21555a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateCartProductQuantitiesLiteMutation_ResponseAdapter$ErrorPrompt;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesLiteMutation$ErrorPrompt;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorPrompt implements Adapter<UpdateCartProductQuantitiesLiteMutation.ErrorPrompt> {

        /* renamed from: a, reason: collision with root package name */
        public static final ErrorPrompt f21612a = new ErrorPrompt();
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
            Prompts promptsA = PromptsImpl_ResponseAdapter.Prompts.a(reader, customScalarAdapters);
            if (str != null) {
                return new UpdateCartProductQuantitiesLiteMutation.ErrorPrompt(str, promptsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartProductQuantitiesLiteMutation.ErrorPrompt value = (UpdateCartProductQuantitiesLiteMutation.ErrorPrompt) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21556a);
            List list = PromptsImpl_ResponseAdapter.Prompts.f8883a;
            PromptsImpl_ResponseAdapter.Prompts.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateCartProductQuantitiesLiteMutation_ResponseAdapter$UpdateCartProductQuantities;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesLiteMutation$UpdateCartProductQuantities;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateCartProductQuantities implements Adapter<UpdateCartProductQuantitiesLiteMutation.UpdateCartProductQuantities> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdateCartProductQuantities f21613a = new UpdateCartProductQuantities();
        public static final List b = CollectionsKt.R("productCount", "totalProductCount", "updatedProductQuantities", "errorPrompt");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            ArrayList arrayListFromJson = null;
            UpdateCartProductQuantitiesLiteMutation.ErrorPrompt errorPrompt = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(UpdatedProductQuantity.f21614a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    errorPrompt = (UpdateCartProductQuantitiesLiteMutation.ErrorPrompt) Adapters.b(Adapters.c(ErrorPrompt.f21612a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "productCount");
                throw null;
            }
            int iIntValue = num.intValue();
            if (num2 == null) {
                Assertions.a(reader, "totalProductCount");
                throw null;
            }
            int iIntValue2 = num2.intValue();
            if (arrayListFromJson != null) {
                return new UpdateCartProductQuantitiesLiteMutation.UpdateCartProductQuantities(iIntValue, iIntValue2, arrayListFromJson, errorPrompt);
            }
            Assertions.a(reader, "updatedProductQuantities");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartProductQuantitiesLiteMutation.UpdateCartProductQuantities value = (UpdateCartProductQuantitiesLiteMutation.UpdateCartProductQuantities) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productCount");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f21557a, adapters$IntAdapter$1, writer, customScalarAdapters, "totalProductCount");
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "updatedProductQuantities");
            Adapters.a(Adapters.c(UpdatedProductQuantity.f21614a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("errorPrompt");
            Adapters.b(Adapters.c(ErrorPrompt.f21612a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateCartProductQuantitiesLiteMutation_ResponseAdapter$UpdatedProductQuantity;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesLiteMutation$UpdatedProductQuantity;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdatedProductQuantity implements Adapter<UpdateCartProductQuantitiesLiteMutation.UpdatedProductQuantity> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdatedProductQuantity f21614a = new UpdatedProductQuantity();
        public static final List b = CollectionsKt.R("productId", "updatedQuantity", "success", "error", "deltaQuantity", "deltaSubtotal", "productQuantityAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d2 = null;
            String str = null;
            Boolean bool = null;
            UpdateCartProductQuantitiesLiteMutation.Error error = null;
            Double d3 = null;
            String str2 = null;
            CartProductQuantityAction cartProductQuantityAction = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        d = d2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        d = d2;
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        error = (UpdateCartProductQuantitiesLiteMutation.Error) Adapters.b(Adapters.c(Error.f21611a, false)).fromJson(reader, customScalarAdapters);
                        d2 = d2;
                        bool = bool;
                        continue;
                    case 4:
                        d = d2;
                        d3 = (Double) Adapters.j.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        d = d2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        d = d2;
                        cartProductQuantityAction = (CartProductQuantityAction) Adapters.b(CartProductQuantityAction_ResponseAdapter.f12044a).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Double d4 = d2;
                        if (str == null) {
                            Assertions.a(reader, "productId");
                            throw null;
                        }
                        if (d4 == null) {
                            Assertions.a(reader, "updatedQuantity");
                            throw null;
                        }
                        Boolean bool2 = bool;
                        double dDoubleValue = d4.doubleValue();
                        if (bool2 != null) {
                            return new UpdateCartProductQuantitiesLiteMutation.UpdatedProductQuantity(str, dDoubleValue, bool2.booleanValue(), error, d3, str2, cartProductQuantityAction);
                        }
                        Assertions.a(reader, "success");
                        throw null;
                }
                d2 = d;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartProductQuantitiesLiteMutation.UpdatedProductQuantity value = (UpdateCartProductQuantitiesLiteMutation.UpdatedProductQuantity) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21558a);
            writer.F1("updatedQuantity");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1("success");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "error");
            Adapters.b(Adapters.c(Error.f21611a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("deltaQuantity");
            Adapters.j.toJson(writer, customScalarAdapters, value.e);
            writer.F1("deltaSubtotal");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
            writer.F1("productQuantityAction");
            Adapters.b(CartProductQuantityAction_ResponseAdapter.f12044a).toJson(writer, customScalarAdapters, value.g);
        }
    }
}
