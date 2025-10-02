package com.woolworths.shop.cart.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.CartInfoQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/shop/cart/adapter/CartInfoQuery_ResponseAdapter;", "", "Data", "CartInfo", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CartInfoQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/CartInfoQuery_ResponseAdapter$CartInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/CartInfoQuery$CartInfo;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CartInfo implements Adapter<CartInfoQuery.CartInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final CartInfo f21586a = new CartInfo();
        public static final List b = CollectionsKt.Q("totalProductCount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            while (reader.o2(b) == 0) {
                num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new CartInfoQuery.CartInfo(num.intValue());
            }
            Assertions.a(reader, "totalProductCount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartInfoQuery.CartInfo value = (CartInfoQuery.CartInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalProductCount");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.f21525a));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/CartInfoQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/CartInfoQuery$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<CartInfoQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21587a = new Data();
        public static final List b = CollectionsKt.Q("cartInfo");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CartInfoQuery.CartInfo cartInfo = null;
            while (reader.o2(b) == 0) {
                cartInfo = (CartInfoQuery.CartInfo) Adapters.b(Adapters.c(CartInfo.f21586a, false)).fromJson(reader, customScalarAdapters);
            }
            return new CartInfoQuery.Data(cartInfo);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartInfoQuery.Data value = (CartInfoQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("cartInfo");
            Adapters.b(Adapters.c(CartInfo.f21586a, false)).toJson(writer, customScalarAdapters, value.f21526a);
        }
    }
}
