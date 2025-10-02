package com.woolworths.rewards.offers.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.HomeOfferFeedQuery;
import com.woolworths.rewards.offers.fragment.RewardsHomeOfferFeedFields;
import com.woolworths.rewards.offers.fragment.RewardsHomeOfferFeedFieldsImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/HomeOfferFeedQuery_ResponseAdapter;", "", "Data", "RewardsOfferFeed", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HomeOfferFeedQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/HomeOfferFeedQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/HomeOfferFeedQuery$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<HomeOfferFeedQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20748a = new Data();
        public static final List b = CollectionsKt.Q("rewardsOfferFeed");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeOfferFeedQuery.RewardsOfferFeed rewardsOfferFeed = null;
            while (reader.o2(b) == 0) {
                rewardsOfferFeed = (HomeOfferFeedQuery.RewardsOfferFeed) Adapters.b(Adapters.c(RewardsOfferFeed.f20749a, true)).fromJson(reader, customScalarAdapters);
            }
            return new HomeOfferFeedQuery.Data(rewardsOfferFeed);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeOfferFeedQuery.Data value = (HomeOfferFeedQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsOfferFeed");
            Adapters.b(Adapters.c(RewardsOfferFeed.f20749a, true)).toJson(writer, customScalarAdapters, value.f20707a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/HomeOfferFeedQuery_ResponseAdapter$RewardsOfferFeed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/HomeOfferFeedQuery$RewardsOfferFeed;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsOfferFeed implements Adapter<HomeOfferFeedQuery.RewardsOfferFeed> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsOfferFeed f20749a = new RewardsOfferFeed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RewardsHomeOfferFeedFields rewardsHomeOfferFeedFieldsA = RewardsHomeOfferFeedFieldsImpl_ResponseAdapter.RewardsHomeOfferFeedFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new HomeOfferFeedQuery.RewardsOfferFeed(str, rewardsHomeOfferFeedFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeOfferFeedQuery.RewardsOfferFeed value = (HomeOfferFeedQuery.RewardsOfferFeed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20708a);
            List list = RewardsHomeOfferFeedFieldsImpl_ResponseAdapter.RewardsHomeOfferFeedFields.f20906a;
            RewardsHomeOfferFeedFieldsImpl_ResponseAdapter.RewardsHomeOfferFeedFields.b(writer, customScalarAdapters, value.b);
        }
    }
}
