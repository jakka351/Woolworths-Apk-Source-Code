package com.woolworths.rewards.offers.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.OfferDetailsQuery;
import com.woolworths.rewards.offers.fragment.fragment.OfferDetailsFragment;
import com.woolworths.rewards.offers.fragment.fragment.OfferDetailsFragmentImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferDetailsQuery_ResponseAdapter;", "", "Data", "RewardsOffer", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferDetailsQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferDetailsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferDetailsQuery$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<OfferDetailsQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20750a = new Data();
        public static final List b = CollectionsKt.Q("rewardsOffer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferDetailsQuery.RewardsOffer rewardsOffer = null;
            while (reader.o2(b) == 0) {
                rewardsOffer = (OfferDetailsQuery.RewardsOffer) Adapters.b(Adapters.c(RewardsOffer.f20751a, true)).fromJson(reader, customScalarAdapters);
            }
            return new OfferDetailsQuery.Data(rewardsOffer);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsQuery.Data value = (OfferDetailsQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsOffer");
            Adapters.b(Adapters.c(RewardsOffer.f20751a, true)).toJson(writer, customScalarAdapters, value.f20710a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferDetailsQuery_ResponseAdapter$RewardsOffer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferDetailsQuery$RewardsOffer;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsOffer implements Adapter<OfferDetailsQuery.RewardsOffer> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsOffer f20751a = new RewardsOffer();
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
            OfferDetailsFragment offerDetailsFragmentA = OfferDetailsFragmentImpl_ResponseAdapter.OfferDetailsFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new OfferDetailsQuery.RewardsOffer(str, offerDetailsFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsQuery.RewardsOffer value = (OfferDetailsQuery.RewardsOffer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20711a);
            List list = OfferDetailsFragmentImpl_ResponseAdapter.OfferDetailsFragment.f20994a;
            OfferDetailsFragmentImpl_ResponseAdapter.OfferDetailsFragment.b(writer, customScalarAdapters, value.b);
        }
    }
}
