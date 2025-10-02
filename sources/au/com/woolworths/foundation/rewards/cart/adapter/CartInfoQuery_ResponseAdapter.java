package au.com.woolworths.foundation.rewards.cart.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.foundation.rewards.cart.CartInfoQuery;
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

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/adapter/CartInfoQuery_ResponseAdapter;", "", "Data", "CartInfo", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartInfoQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/adapter/CartInfoQuery_ResponseAdapter$CartInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/rewards/cart/CartInfoQuery$CartInfo;", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CartInfo implements Adapter<CartInfoQuery.CartInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final CartInfo f8548a = new CartInfo();
        public static final List b = CollectionsKt.R("totalQuantity", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "totalQuantity");
                throw null;
            }
            int iIntValue = num.intValue();
            if (str != null) {
                return new CartInfoQuery.CartInfo(iIntValue, str);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CartInfoQuery.CartInfo value = (CartInfoQuery.CartInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalQuantity");
            d.y(value.f8546a, Adapters.b, writer, customScalarAdapters, "altText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/adapter/CartInfoQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/rewards/cart/CartInfoQuery$Data;", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<CartInfoQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f8549a = new Data();
        public static final List b = CollectionsKt.Q("cartInfo");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CartInfoQuery.CartInfo cartInfo = null;
            while (reader.o2(b) == 0) {
                cartInfo = (CartInfoQuery.CartInfo) Adapters.b(Adapters.c(CartInfo.f8548a, false)).fromJson(reader, customScalarAdapters);
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
            Adapters.b(Adapters.c(CartInfo.f8548a, false)).toJson(writer, customScalarAdapters, value.f8547a);
        }
    }
}
