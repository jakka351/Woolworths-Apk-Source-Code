package com.woolworths.shop.cart.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.cart.data.common.fragment.Cart;
import au.com.woolworths.shop.cart.data.common.fragment.CartImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.ClearCartMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ClearCartMutation_ResponseAdapter;", "", "Data", "ClearCart", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClearCartMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ClearCartMutation_ResponseAdapter$ClearCart;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ClearCartMutation$ClearCart;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClearCart implements Adapter<ClearCartMutation.ClearCart> {

        /* renamed from: a, reason: collision with root package name */
        public static final ClearCart f21588a = new ClearCart();
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
            Cart cartA = CartImpl_ResponseAdapter.Cart.a(reader, customScalarAdapters);
            if (str != null) {
                return new ClearCartMutation.ClearCart(str, cartA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ClearCartMutation.ClearCart value = (ClearCartMutation.ClearCart) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21528a);
            List list = CartImpl_ResponseAdapter.Cart.f10362a;
            CartImpl_ResponseAdapter.Cart.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ClearCartMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ClearCartMutation$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ClearCartMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21589a = new Data();
        public static final List b = CollectionsKt.Q("clearCart");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ClearCartMutation.ClearCart clearCart = null;
            while (reader.o2(b) == 0) {
                clearCart = (ClearCartMutation.ClearCart) Adapters.c(ClearCart.f21588a, true).fromJson(reader, customScalarAdapters);
            }
            if (clearCart != null) {
                return new ClearCartMutation.Data(clearCart);
            }
            Assertions.a(reader, "clearCart");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ClearCartMutation.Data value = (ClearCartMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("clearCart");
            Adapters.c(ClearCart.f21588a, true).toJson(writer, customScalarAdapters, value.f21529a);
        }
    }
}
