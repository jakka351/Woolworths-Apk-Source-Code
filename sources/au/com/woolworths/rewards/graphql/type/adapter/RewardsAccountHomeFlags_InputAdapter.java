package au.com.woolworths.rewards.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.rewards.graphql.type.RewardsAccountHomeFlags;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/adapter/RewardsAccountHomeFlags_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/rewards/graphql/type/RewardsAccountHomeFlags;", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsAccountHomeFlags_InputAdapter implements Adapter<RewardsAccountHomeFlags> {

    /* renamed from: a, reason: collision with root package name */
    public static final RewardsAccountHomeFlags_InputAdapter f9960a = new RewardsAccountHomeFlags_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        RewardsAccountHomeFlags value = (RewardsAccountHomeFlags) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        Optional optional = value.f;
        Optional optional2 = value.e;
        Optional optional3 = value.d;
        Optional optional4 = value.c;
        Optional optional5 = value.b;
        Optional optional6 = value.f9799a;
        if (optional6 instanceof Optional.Present) {
            writer.F1("shouldShowEreceipt");
            Adapters.d(Adapters.l).toJson(writer, customScalarAdapters, (Optional.Present) optional6);
        }
        if (optional5 instanceof Optional.Present) {
            writer.F1("shouldShowPushNotificationPreferences");
            Adapters.d(Adapters.l).toJson(writer, customScalarAdapters, (Optional.Present) optional5);
        }
        if (optional4 instanceof Optional.Present) {
            writer.F1("shouldShowPayTabCoachmarkTour");
            Adapters.d(Adapters.l).toJson(writer, customScalarAdapters, (Optional.Present) optional4);
        }
        if (optional3 instanceof Optional.Present) {
            writer.F1("shouldShowEverydayRewardsShop");
            Adapters.d(Adapters.l).toJson(writer, customScalarAdapters, (Optional.Present) optional3);
        }
        if (optional2 instanceof Optional.Present) {
            writer.F1("shouldShowAutoBoostPreferences");
            Adapters.d(Adapters.l).toJson(writer, customScalarAdapters, (Optional.Present) optional2);
        }
        if (optional instanceof Optional.Present) {
            writer.F1("shouldShowTailoredAdPreferences");
            Adapters.d(Adapters.l).toJson(writer, customScalarAdapters, (Optional.Present) optional);
        }
    }
}
