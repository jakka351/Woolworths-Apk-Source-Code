package au.com.woolworths.shop.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.CartBundleQuantityUpdate;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/CartBundleQuantityUpdate_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/CartBundleQuantityUpdate;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartBundleQuantityUpdate_InputAdapter implements Adapter<CartBundleQuantityUpdate> {

    /* renamed from: a, reason: collision with root package name */
    public static final CartBundleQuantityUpdate_InputAdapter f12043a = new CartBundleQuantityUpdate_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        CartBundleQuantityUpdate value = (CartBundleQuantityUpdate) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        Optional.Present present = value.d;
        writer.F1("productId");
        Adapters.f13493a.toJson(writer, customScalarAdapters, value.f11104a);
        writer.F1("quantity");
        Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
        adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
        Optional.Present present2 = value.c;
        writer.F1("adId");
        NullableAdapter nullableAdapter = Adapters.i;
        Adapters.d(nullableAdapter).toJson(writer, customScalarAdapters, present2);
        writer.F1("source");
        Adapters.d(nullableAdapter).toJson(writer, customScalarAdapters, present);
        writer.F1("maximum");
        adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.e));
        writer.F1("increment");
        adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.f));
    }
}
