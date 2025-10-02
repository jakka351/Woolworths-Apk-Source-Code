package au.com.woolworths.rewards.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.rewards.graphql.type.GiftingSubmitOrderDataInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/adapter/GiftingSubmitOrderDataInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/rewards/graphql/type/GiftingSubmitOrderDataInput;", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GiftingSubmitOrderDataInput_InputAdapter implements Adapter<GiftingSubmitOrderDataInput> {

    /* renamed from: a, reason: collision with root package name */
    public static final GiftingSubmitOrderDataInput_InputAdapter f9957a = new GiftingSubmitOrderDataInput_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        GiftingSubmitOrderDataInput value = (GiftingSubmitOrderDataInput) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        writer.F1("paymentInstrumentId");
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1("firstName");
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1("lastName");
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1("deliveryEmail");
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1("referenceId");
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1("items");
        Adapters.a(Adapters.c(GiftingSubmitOrderItemInput_InputAdapter.f9958a, false)).toJson(writer, customScalarAdapters, null);
    }
}
