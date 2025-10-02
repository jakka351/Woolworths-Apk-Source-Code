package au.com.woolworths.rewards.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.rewards.graphql.type.EverydayExtraSubscriptionInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/adapter/EverydayExtraSubscriptionInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/rewards/graphql/type/EverydayExtraSubscriptionInput;", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EverydayExtraSubscriptionInput_InputAdapter implements Adapter<EverydayExtraSubscriptionInput> {

    /* renamed from: a, reason: collision with root package name */
    public static final EverydayExtraSubscriptionInput_InputAdapter f9953a = new EverydayExtraSubscriptionInput_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        EverydayExtraSubscriptionInput value = (EverydayExtraSubscriptionInput) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        Optional.Present present = value.d;
        Optional optional = value.c;
        writer.F1("planId");
        Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9555a);
        Optional.Present present2 = value.b;
        writer.F1("paymentInstrumentId");
        NullableAdapter nullableAdapter = Adapters.i;
        Adapters.d(nullableAdapter).toJson(writer, customScalarAdapters, present2);
        if (optional instanceof Optional.Present) {
            writer.F1("acquisitionOfferName");
            Adapters.d(nullableAdapter).toJson(writer, customScalarAdapters, (Optional.Present) optional);
        }
        writer.F1("stepUpToken");
        Adapters.d(nullableAdapter).toJson(writer, customScalarAdapters, present);
    }
}
