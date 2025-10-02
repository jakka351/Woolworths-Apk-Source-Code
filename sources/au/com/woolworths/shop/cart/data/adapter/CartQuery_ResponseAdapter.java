package au.com.woolworths.shop.cart.data.adapter;

import au.com.woolworths.shop.cart.data.CartQuery;
import au.com.woolworths.shop.cart.data.common.fragment.CartImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/cart/data/adapter/CartQuery_ResponseAdapter;", "", "Data", "Cart", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartQuery_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/adapter/CartQuery_ResponseAdapter$Cart;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/CartQuery$Cart;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cart implements Adapter<CartQuery.Cart> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cart f10308a = new Cart();
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
                return new CartQuery.Cart(str, cartA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartQuery.Cart value = (CartQuery.Cart) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10302a);
            List list = CartImpl_ResponseAdapter.Cart.f10362a;
            CartImpl_ResponseAdapter.Cart.b(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/adapter/CartQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/CartQuery$Data;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<CartQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f10309a = new Data();
        public static final List b = CollectionsKt.Q("cart");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CartQuery.Cart cart = null;
            while (reader.o2(b) == 0) {
                cart = (CartQuery.Cart) Adapters.c(Cart.f10308a, true).fromJson(reader, customScalarAdapters);
            }
            if (cart != null) {
                return new CartQuery.Data(cart);
            }
            Assertions.a(reader, "cart");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartQuery.Data value = (CartQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("cart");
            Adapters.c(Cart.f10308a, true).toJson(writer, customScalarAdapters, value.f10303a);
        }
    }
}
