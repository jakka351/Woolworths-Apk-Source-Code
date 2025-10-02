package au.com.woolworths.shop.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.EditListInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/EditListInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/EditListInput;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EditListInput_InputAdapter implements Adapter<EditListInput> {
    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        EditListInput value = (EditListInput) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        writer.F1("title");
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1("color");
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1("timestamp");
        Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
        Double dValueOf = Double.valueOf(0.0d);
        adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, dValueOf);
        writer.F1("lastSynced");
        adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, dValueOf);
    }
}
