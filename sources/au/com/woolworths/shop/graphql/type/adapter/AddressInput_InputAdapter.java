package au.com.woolworths.shop.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.AddressInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/AddressInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/AddressInput;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddressInput_InputAdapter implements Adapter<AddressInput> {

    /* renamed from: a, reason: collision with root package name */
    public static final AddressInput_InputAdapter f12034a = new AddressInput_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        AddressInput value = (AddressInput) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        Optional optional = value.h;
        Optional optional2 = value.g;
        Optional optional3 = value.f;
        Optional optional4 = value.e;
        Optional optional5 = value.d;
        Optional optional6 = value.c;
        Optional optional7 = value.b;
        Optional optional8 = value.f11012a;
        if (optional8 instanceof Optional.Present) {
            writer.F1("alternateAddressId");
            Adapters.d(Adapters.k).toJson(writer, customScalarAdapters, (Optional.Present) optional8);
        }
        if (optional7 instanceof Optional.Present) {
            writer.F1("amasId");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional7);
        }
        if (optional6 instanceof Optional.Present) {
            writer.F1("isAlternateAddressId");
            Adapters.d(Adapters.l).toJson(writer, customScalarAdapters, (Optional.Present) optional6);
        }
        if (optional5 instanceof Optional.Present) {
            writer.F1("isForBilling");
            Adapters.d(Adapters.l).toJson(writer, customScalarAdapters, (Optional.Present) optional5);
        }
        if (optional4 instanceof Optional.Present) {
            writer.F1("postcode");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional4);
        }
        if (optional3 instanceof Optional.Present) {
            writer.F1("street1");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional3);
        }
        if (optional2 instanceof Optional.Present) {
            writer.F1("street2");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional2);
        }
        if (optional instanceof Optional.Present) {
            writer.F1("suburbId");
            Adapters.d(Adapters.k).toJson(writer, customScalarAdapters, (Optional.Present) optional);
        }
    }
}
