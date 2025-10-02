package com.woolworths.rewards.card.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.card.RewardsDigitalWalletQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsDigitalWalletQuery_ResponseAdapter;", "", "Data", "RewardsDigitalWalletToken", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsDigitalWalletQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsDigitalWalletQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsDigitalWalletQuery$Data;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<RewardsDigitalWalletQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20689a = new Data();
        public static final List b = CollectionsKt.Q("rewardsDigitalWalletToken");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RewardsDigitalWalletQuery.RewardsDigitalWalletToken rewardsDigitalWalletToken = null;
            while (reader.o2(b) == 0) {
                rewardsDigitalWalletToken = (RewardsDigitalWalletQuery.RewardsDigitalWalletToken) Adapters.b(Adapters.c(RewardsDigitalWalletToken.f20690a, false)).fromJson(reader, customScalarAdapters);
            }
            return new RewardsDigitalWalletQuery.Data(rewardsDigitalWalletToken);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsDigitalWalletQuery.Data value = (RewardsDigitalWalletQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsDigitalWalletToken");
            Adapters.b(Adapters.c(RewardsDigitalWalletToken.f20690a, false)).toJson(writer, customScalarAdapters, value.f20667a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsDigitalWalletQuery_ResponseAdapter$RewardsDigitalWalletToken;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsDigitalWalletQuery$RewardsDigitalWalletToken;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsDigitalWalletToken implements Adapter<RewardsDigitalWalletQuery.RewardsDigitalWalletToken> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsDigitalWalletToken f20690a = new RewardsDigitalWalletToken();
        public static final List b = CollectionsKt.Q("connectToken");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new RewardsDigitalWalletQuery.RewardsDigitalWalletToken(str);
            }
            Assertions.a(reader, "connectToken");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsDigitalWalletQuery.RewardsDigitalWalletToken value = (RewardsDigitalWalletQuery.RewardsDigitalWalletToken) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("connectToken");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20668a);
        }
    }
}
