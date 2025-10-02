package au.com.woolworths.shop.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.SyncListItemsInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/SyncListItemsInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/SyncListItemsInput;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SyncListItemsInput_InputAdapter implements Adapter<SyncListItemsInput> {

    /* renamed from: a, reason: collision with root package name */
    public static final SyncListItemsInput_InputAdapter f12124a = new SyncListItemsInput_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        SyncListItemsInput value = (SyncListItemsInput) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        writer.F1("listId");
        Adapters.f13493a.toJson(writer, customScalarAdapters, value.f11954a);
        writer.F1("timestamp");
        Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
        writer.F1("createdProductItems");
        Adapters.a(Adapters.c(CreateProductItemInput_InputAdapter.f12061a, false)).toJson(writer, customScalarAdapters, value.c);
        writer.F1("createdFreeTextItems");
        Adapters.a(Adapters.c(CreateFreeTextItemInput_InputAdapter.f12059a, false)).toJson(writer, customScalarAdapters, value.d);
        writer.F1("updatedProductItems");
        Adapters.a(Adapters.c(UpdateProductItemInput_InputAdapter.f12138a, false)).toJson(writer, customScalarAdapters, value.e);
        writer.F1("updatedFreeTextItems");
        Adapters.a(Adapters.c(UpdateFreeTextItemInput_InputAdapter.f12135a, false)).toJson(writer, customScalarAdapters, value.f);
        writer.F1("deletedItems");
        Adapters.a(Adapters.c(RemoveListItemInput_InputAdapter.f12111a, false)).toJson(writer, customScalarAdapters, value.g);
    }
}
