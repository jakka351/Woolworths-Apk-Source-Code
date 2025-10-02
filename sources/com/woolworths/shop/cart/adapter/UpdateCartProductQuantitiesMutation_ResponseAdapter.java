package com.woolworths.shop.cart.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.foundation.shop.prompt.handler.fragment.Prompts;
import au.com.woolworths.foundation.shop.prompt.handler.fragment.PromptsImpl_ResponseAdapter;
import au.com.woolworths.shop.cart.data.common.fragment.CartImpl_ResponseAdapter;
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
import com.woolworths.shop.cart.UpdateCartProductQuantitiesMutation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateCartProductQuantitiesMutation_ResponseAdapter;", "", "Data", "UpdateCartProductQuantities", "UpdatedProductQuantity", "Error", "Cart", "ErrorPrompt", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateCartProductQuantitiesMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateCartProductQuantitiesMutation_ResponseAdapter$Cart;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation$Cart;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cart implements Adapter<UpdateCartProductQuantitiesMutation.Cart> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cart f21615a = new Cart();
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
            au.com.woolworths.shop.cart.data.common.fragment.Cart cartA = CartImpl_ResponseAdapter.Cart.a(reader, customScalarAdapters);
            if (str != null) {
                return new UpdateCartProductQuantitiesMutation.Cart(str, cartA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartProductQuantitiesMutation.Cart value = (UpdateCartProductQuantitiesMutation.Cart) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21560a);
            List list = CartImpl_ResponseAdapter.Cart.f10362a;
            CartImpl_ResponseAdapter.Cart.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateCartProductQuantitiesMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UpdateCartProductQuantitiesMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21616a = new Data();
        public static final List b = CollectionsKt.Q("updateCartProductQuantities");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdateCartProductQuantitiesMutation.UpdateCartProductQuantities updateCartProductQuantities = null;
            while (reader.o2(b) == 0) {
                updateCartProductQuantities = (UpdateCartProductQuantitiesMutation.UpdateCartProductQuantities) Adapters.c(UpdateCartProductQuantities.f21619a, false).fromJson(reader, customScalarAdapters);
            }
            if (updateCartProductQuantities != null) {
                return new UpdateCartProductQuantitiesMutation.Data(updateCartProductQuantities);
            }
            Assertions.a(reader, "updateCartProductQuantities");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartProductQuantitiesMutation.Data value = (UpdateCartProductQuantitiesMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("updateCartProductQuantities");
            Adapters.c(UpdateCartProductQuantities.f21619a, false).toJson(writer, customScalarAdapters, value.f21561a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateCartProductQuantitiesMutation_ResponseAdapter$Error;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation$Error;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error implements Adapter<UpdateCartProductQuantitiesMutation.Error> {

        /* renamed from: a, reason: collision with root package name */
        public static final Error f21617a = new Error();
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
                return new UpdateCartProductQuantitiesMutation.Error(updateCartProductQuantityFailedReasonA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartProductQuantitiesMutation.Error value = (UpdateCartProductQuantitiesMutation.Error) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("reason");
            UpdateCartProductQuantityFailedReason_ResponseAdapter.b(writer, customScalarAdapters, value.f21562a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateCartProductQuantitiesMutation_ResponseAdapter$ErrorPrompt;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation$ErrorPrompt;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorPrompt implements Adapter<UpdateCartProductQuantitiesMutation.ErrorPrompt> {

        /* renamed from: a, reason: collision with root package name */
        public static final ErrorPrompt f21618a = new ErrorPrompt();
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
                return new UpdateCartProductQuantitiesMutation.ErrorPrompt(str, promptsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartProductQuantitiesMutation.ErrorPrompt value = (UpdateCartProductQuantitiesMutation.ErrorPrompt) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21563a);
            List list = PromptsImpl_ResponseAdapter.Prompts.f8883a;
            PromptsImpl_ResponseAdapter.Prompts.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateCartProductQuantitiesMutation_ResponseAdapter$UpdateCartProductQuantities;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation$UpdateCartProductQuantities;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateCartProductQuantities implements Adapter<UpdateCartProductQuantitiesMutation.UpdateCartProductQuantities> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdateCartProductQuantities f21619a = new UpdateCartProductQuantities();
        public static final List b = CollectionsKt.R("productCount", "totalProductCount", "updatedProductQuantities", "cart", "errorPrompt");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            ArrayList arrayListFromJson = null;
            UpdateCartProductQuantitiesMutation.Cart cart = null;
            UpdateCartProductQuantitiesMutation.ErrorPrompt errorPrompt = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(UpdatedProductQuantity.f21620a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    cart = (UpdateCartProductQuantitiesMutation.Cart) Adapters.c(Cart.f21615a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    errorPrompt = (UpdateCartProductQuantitiesMutation.ErrorPrompt) Adapters.b(Adapters.c(ErrorPrompt.f21618a, true)).fromJson(reader, customScalarAdapters);
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
            if (arrayListFromJson == null) {
                Assertions.a(reader, "updatedProductQuantities");
                throw null;
            }
            if (cart != null) {
                return new UpdateCartProductQuantitiesMutation.UpdateCartProductQuantities(iIntValue, iIntValue2, arrayListFromJson, cart, errorPrompt);
            }
            Assertions.a(reader, "cart");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartProductQuantitiesMutation.UpdateCartProductQuantities value = (UpdateCartProductQuantitiesMutation.UpdateCartProductQuantities) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productCount");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f21564a, adapters$IntAdapter$1, writer, customScalarAdapters, "totalProductCount");
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "updatedProductQuantities");
            Adapters.a(Adapters.c(UpdatedProductQuantity.f21620a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("cart");
            Adapters.c(Cart.f21615a, true).toJson(writer, customScalarAdapters, value.d);
            writer.F1("errorPrompt");
            Adapters.b(Adapters.c(ErrorPrompt.f21618a, true)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/UpdateCartProductQuantitiesMutation_ResponseAdapter$UpdatedProductQuantity;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation$UpdatedProductQuantity;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdatedProductQuantity implements Adapter<UpdateCartProductQuantitiesMutation.UpdatedProductQuantity> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdatedProductQuantity f21620a = new UpdatedProductQuantity();
        public static final List b = CollectionsKt.R("productId", "updatedQuantity", "success", "error", "deltaQuantity", "deltaSubtotal", "productQuantityAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d2 = null;
            String str = null;
            Boolean bool = null;
            UpdateCartProductQuantitiesMutation.Error error = null;
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
                        error = (UpdateCartProductQuantitiesMutation.Error) Adapters.b(Adapters.c(Error.f21617a, false)).fromJson(reader, customScalarAdapters);
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
                            return new UpdateCartProductQuantitiesMutation.UpdatedProductQuantity(str, dDoubleValue, bool2.booleanValue(), error, d3, str2, cartProductQuantityAction);
                        }
                        Assertions.a(reader, "success");
                        throw null;
                }
                d2 = d;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCartProductQuantitiesMutation.UpdatedProductQuantity value = (UpdateCartProductQuantitiesMutation.UpdatedProductQuantity) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21565a);
            writer.F1("updatedQuantity");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1("success");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "error");
            Adapters.b(Adapters.c(Error.f21617a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("deltaQuantity");
            Adapters.j.toJson(writer, customScalarAdapters, value.e);
            writer.F1("deltaSubtotal");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
            writer.F1("productQuantityAction");
            Adapters.b(CartProductQuantityAction_ResponseAdapter.f12044a).toJson(writer, customScalarAdapters, value.g);
        }
    }
}
