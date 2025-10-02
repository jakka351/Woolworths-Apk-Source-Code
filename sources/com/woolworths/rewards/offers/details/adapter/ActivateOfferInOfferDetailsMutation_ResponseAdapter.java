package com.woolworths.rewards.offers.details.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.details.ActivateOfferInOfferDetailsMutation;
import com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment;
import com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragmentImpl_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.RewardsOfferFields;
import com.woolworths.rewards.offers.fragment.RewardsOfferFieldsImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/ActivateOfferInOfferDetailsMutation_ResponseAdapter;", "", "Data", "ActivateOfferInOfferDetails", "OnOfferDetailsMutationResult", "RewardsOffer", "OfferDetailsPage", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivateOfferInOfferDetailsMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/ActivateOfferInOfferDetailsMutation_ResponseAdapter$ActivateOfferInOfferDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/ActivateOfferInOfferDetailsMutation$ActivateOfferInOfferDetails;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActivateOfferInOfferDetails implements Adapter<ActivateOfferInOfferDetailsMutation.ActivateOfferInOfferDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActivateOfferInOfferDetails f20789a = new ActivateOfferInOfferDetails();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActivateOfferInOfferDetailsMutation.OnOfferDetailsMutationResult onOfferDetailsMutationResultA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("OfferDetailsMutationResult"))) {
                reader.o();
                onOfferDetailsMutationResultA = OnOfferDetailsMutationResult.a(reader, customScalarAdapters);
            }
            return new ActivateOfferInOfferDetailsMutation.ActivateOfferInOfferDetails(str, onOfferDetailsMutationResultA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ActivateOfferInOfferDetailsMutation.ActivateOfferInOfferDetails value = (ActivateOfferInOfferDetailsMutation.ActivateOfferInOfferDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20775a);
            ActivateOfferInOfferDetailsMutation.OnOfferDetailsMutationResult onOfferDetailsMutationResult = value.b;
            if (onOfferDetailsMutationResult != null) {
                OnOfferDetailsMutationResult.b(writer, customScalarAdapters, onOfferDetailsMutationResult);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/ActivateOfferInOfferDetailsMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/ActivateOfferInOfferDetailsMutation$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ActivateOfferInOfferDetailsMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20790a = new Data();
        public static final List b = CollectionsKt.Q("activateOfferInOfferDetails");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActivateOfferInOfferDetailsMutation.ActivateOfferInOfferDetails activateOfferInOfferDetails = null;
            while (reader.o2(b) == 0) {
                activateOfferInOfferDetails = (ActivateOfferInOfferDetailsMutation.ActivateOfferInOfferDetails) Adapters.c(ActivateOfferInOfferDetails.f20789a, true).fromJson(reader, customScalarAdapters);
            }
            if (activateOfferInOfferDetails != null) {
                return new ActivateOfferInOfferDetailsMutation.Data(activateOfferInOfferDetails);
            }
            Assertions.a(reader, "activateOfferInOfferDetails");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ActivateOfferInOfferDetailsMutation.Data value = (ActivateOfferInOfferDetailsMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("activateOfferInOfferDetails");
            Adapters.c(ActivateOfferInOfferDetails.f20789a, true).toJson(writer, customScalarAdapters, value.f20776a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/ActivateOfferInOfferDetailsMutation_ResponseAdapter$OfferDetailsPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/ActivateOfferInOfferDetailsMutation$OfferDetailsPage;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferDetailsPage implements Adapter<ActivateOfferInOfferDetailsMutation.OfferDetailsPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferDetailsPage f20791a = new OfferDetailsPage();
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
            OfferDetailsPageFragment offerDetailsPageFragmentA = OfferDetailsPageFragmentImpl_ResponseAdapter.OfferDetailsPageFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new ActivateOfferInOfferDetailsMutation.OfferDetailsPage(str, offerDetailsPageFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ActivateOfferInOfferDetailsMutation.OfferDetailsPage value = (ActivateOfferInOfferDetailsMutation.OfferDetailsPage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20777a);
            List list = OfferDetailsPageFragmentImpl_ResponseAdapter.OfferDetailsPageFragment.f20873a;
            OfferDetailsPageFragmentImpl_ResponseAdapter.OfferDetailsPageFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/ActivateOfferInOfferDetailsMutation_ResponseAdapter$OnOfferDetailsMutationResult;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/ActivateOfferInOfferDetailsMutation$OnOfferDetailsMutationResult;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOfferDetailsMutationResult implements Adapter<ActivateOfferInOfferDetailsMutation.OnOfferDetailsMutationResult> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20792a = CollectionsKt.R("rewardsOffer", "offerDetailsPage");

        public static ActivateOfferInOfferDetailsMutation.OnOfferDetailsMutationResult a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActivateOfferInOfferDetailsMutation.RewardsOffer rewardsOffer = null;
            ActivateOfferInOfferDetailsMutation.OfferDetailsPage offerDetailsPage = null;
            while (true) {
                int iO2 = reader.o2(f20792a);
                if (iO2 == 0) {
                    rewardsOffer = (ActivateOfferInOfferDetailsMutation.RewardsOffer) Adapters.c(RewardsOffer.f20793a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    offerDetailsPage = (ActivateOfferInOfferDetailsMutation.OfferDetailsPage) Adapters.c(OfferDetailsPage.f20791a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (rewardsOffer == null) {
                Assertions.a(reader, "rewardsOffer");
                throw null;
            }
            if (offerDetailsPage != null) {
                return new ActivateOfferInOfferDetailsMutation.OnOfferDetailsMutationResult(rewardsOffer, offerDetailsPage);
            }
            Assertions.a(reader, "offerDetailsPage");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ActivateOfferInOfferDetailsMutation.OnOfferDetailsMutationResult value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsOffer");
            Adapters.c(RewardsOffer.f20793a, true).toJson(writer, customScalarAdapters, value.f20778a);
            writer.F1("offerDetailsPage");
            Adapters.c(OfferDetailsPage.f20791a, true).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ActivateOfferInOfferDetailsMutation.OnOfferDetailsMutationResult) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/ActivateOfferInOfferDetailsMutation_ResponseAdapter$RewardsOffer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/ActivateOfferInOfferDetailsMutation$RewardsOffer;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsOffer implements Adapter<ActivateOfferInOfferDetailsMutation.RewardsOffer> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsOffer f20793a = new RewardsOffer();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RewardsOfferFields rewardsOfferFieldsA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("RewardsOffer"))) {
                reader.o();
                rewardsOfferFieldsA = RewardsOfferFieldsImpl_ResponseAdapter.RewardsOfferFields.a(reader, customScalarAdapters);
            }
            return new ActivateOfferInOfferDetailsMutation.RewardsOffer(str, rewardsOfferFieldsA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ActivateOfferInOfferDetailsMutation.RewardsOffer value = (ActivateOfferInOfferDetailsMutation.RewardsOffer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20779a);
            RewardsOfferFields rewardsOfferFields = value.b;
            if (rewardsOfferFields != null) {
                RewardsOfferFieldsImpl_ResponseAdapter.RewardsOfferFields.b(writer, customScalarAdapters, rewardsOfferFields);
            }
        }
    }
}
