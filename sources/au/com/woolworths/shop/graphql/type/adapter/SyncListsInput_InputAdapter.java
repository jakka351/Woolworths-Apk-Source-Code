package au.com.woolworths.shop.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.SyncListsInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/SyncListsInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/SyncListsInput;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SyncListsInput_InputAdapter implements Adapter<SyncListsInput> {

    /* renamed from: a, reason: collision with root package name */
    public static final SyncListsInput_InputAdapter f12126a = new SyncListsInput_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        SyncListsInput value = (SyncListsInput) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        Optional optional = value.f11956a;
        if (optional instanceof Optional.Present) {
            writer.F1("options");
            Adapters.d(Adapters.b(Adapters.c(SyncListsInputOptions_InputAdapter.f12125a, false))).toJson(writer, customScalarAdapters, (Optional.Present) optional);
        }
        writer.F1("localLists");
        Adapters.a(Adapters.c(LocalList_InputAdapter.f12083a, false)).toJson(writer, customScalarAdapters, value.b);
        writer.F1("createdLists");
        Adapters.a(Adapters.c(CreateListInput_InputAdapter.f12060a, false)).toJson(writer, customScalarAdapters, value.c);
        writer.F1("updatedLists");
        Adapters.a(Adapters.c(UpdateListInput_InputAdapter.f12136a, false)).toJson(writer, customScalarAdapters, value.d);
        writer.F1("deletedLists");
        Adapters.a(Adapters.c(DeleteListInput_InputAdapter.f12063a, false)).toJson(writer, customScalarAdapters, value.e);
    }
}
