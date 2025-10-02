package au.com.woolworths.shop.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.UserSubstitutionPreference;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/UserSubstitutionPreference_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/UserSubstitutionPreference;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserSubstitutionPreference_InputAdapter implements Adapter<UserSubstitutionPreference> {

    /* renamed from: a, reason: collision with root package name */
    public static final UserSubstitutionPreference_InputAdapter f12140a = new UserSubstitutionPreference_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        UserSubstitutionPreference value = (UserSubstitutionPreference) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        Optional optional = value.e;
        Optional optional2 = value.d;
        Optional optional3 = value.c;
        Optional optional4 = value.f12001a;
        if (optional4 instanceof Optional.Present) {
            writer.F1("allowSubstitution");
            Adapters.d(Adapters.l).toJson(writer, customScalarAdapters, (Optional.Present) optional4);
        }
        writer.F1("productId");
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        if (optional3 instanceof Optional.Present) {
            writer.F1("preferred");
            Adapters.d(Adapters.b(Adapters.a(adapters$StringAdapter$1))).toJson(writer, customScalarAdapters, (Optional.Present) optional3);
        }
        if (optional2 instanceof Optional.Present) {
            writer.F1("nonPreferred");
            Adapters.d(Adapters.b(Adapters.a(adapters$StringAdapter$1))).toJson(writer, customScalarAdapters, (Optional.Present) optional2);
        }
        if (optional instanceof Optional.Present) {
            writer.F1("customerSelection");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional);
        }
    }
}
