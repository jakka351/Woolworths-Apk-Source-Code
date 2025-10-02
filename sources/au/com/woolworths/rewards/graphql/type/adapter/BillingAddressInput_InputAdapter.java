package au.com.woolworths.rewards.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.rewards.graphql.type.BillingAddressInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/adapter/BillingAddressInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/rewards/graphql/type/BillingAddressInput;", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BillingAddressInput_InputAdapter implements Adapter<BillingAddressInput> {
    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        BillingAddressInput value = (BillingAddressInput) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        writer.F1("firstName");
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1("lastName");
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1(Scopes.EMAIL);
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1("mobileNumber");
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1("line1");
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1("suburb");
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1("state");
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1("countryCode");
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
        writer.F1("postcode");
        adapters$StringAdapter$1.toJson(writer, customScalarAdapters, null);
    }
}
