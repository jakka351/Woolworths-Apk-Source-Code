package au.com.woolworths.shop.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.StoresForProductInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/StoresForProductInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/StoresForProductInput;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StoresForProductInput_InputAdapter implements Adapter<StoresForProductInput> {

    /* renamed from: a, reason: collision with root package name */
    public static final StoresForProductInput_InputAdapter f12121a = new StoresForProductInput_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        StoresForProductInput value = (StoresForProductInput) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        Optional optional = value.c;
        Optional optional2 = value.b;
        Optional optional3 = value.f11937a;
        if (optional3 instanceof Optional.Present) {
            writer.F1("storeId");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional3);
        }
        if (optional2 instanceof Optional.Present) {
            writer.F1("geoLocation");
            Adapters.d(Adapters.b(Adapters.c(GeoLocation_InputAdapter.f12077a, false))).toJson(writer, customScalarAdapters, (Optional.Present) optional2);
        }
        if (optional instanceof Optional.Present) {
            writer.F1("postcode");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional);
        }
        writer.F1("productId");
        Adapters.f13493a.toJson(writer, customScalarAdapters, value.d);
    }
}
