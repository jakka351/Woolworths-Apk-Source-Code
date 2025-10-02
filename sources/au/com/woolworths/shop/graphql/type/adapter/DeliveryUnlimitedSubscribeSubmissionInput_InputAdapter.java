package au.com.woolworths.shop.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedSubscribeSubmissionInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/DeliveryUnlimitedSubscribeSubmissionInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/DeliveryUnlimitedSubscribeSubmissionInput;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryUnlimitedSubscribeSubmissionInput_InputAdapter implements Adapter<DeliveryUnlimitedSubscribeSubmissionInput> {

    /* renamed from: a, reason: collision with root package name */
    public static final DeliveryUnlimitedSubscribeSubmissionInput_InputAdapter f12065a = new DeliveryUnlimitedSubscribeSubmissionInput_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        DeliveryUnlimitedSubscribeSubmissionInput value = (DeliveryUnlimitedSubscribeSubmissionInput) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        writer.F1("planId");
        Adapters.f13493a.toJson(writer, customScalarAdapters, value.f11335a);
        writer.F1("instruments");
        Adapters.a(Adapters.c(DeliveryUnlimitedSubscribeSubmissionInstrumentInput_InputAdapter.f12066a, false)).toJson(writer, customScalarAdapters, value.b);
    }
}
