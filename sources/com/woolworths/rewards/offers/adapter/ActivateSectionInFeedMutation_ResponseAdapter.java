package com.woolworths.rewards.offers.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.ActivateSectionInFeedMutation;
import com.woolworths.rewards.offers.fragment.RewardsOfferFeedFields;
import com.woolworths.rewards.offers.fragment.RewardsOfferFeedFieldsImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/ActivateSectionInFeedMutation_ResponseAdapter;", "", "Data", "ActivateAllOffersInFeed", "OfferFeed", "ActivationDetails", "OnActivationDetailsError", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivateSectionInFeedMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/ActivateSectionInFeedMutation_ResponseAdapter$ActivateAllOffersInFeed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/ActivateSectionInFeedMutation$ActivateAllOffersInFeed;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActivateAllOffersInFeed implements Adapter<ActivateSectionInFeedMutation.ActivateAllOffersInFeed> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActivateAllOffersInFeed f20743a = new ActivateAllOffersInFeed();
        public static final List b = CollectionsKt.R("offerFeed", "activatedOfferIds", "activationDetails");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActivateSectionInFeedMutation.OfferFeed offerFeed = null;
            ArrayList arrayListFromJson = null;
            ActivateSectionInFeedMutation.ActivationDetails activationDetails = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    offerFeed = (ActivateSectionInFeedMutation.OfferFeed) Adapters.c(OfferFeed.f20746a, true).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    activationDetails = (ActivateSectionInFeedMutation.ActivationDetails) Adapters.b(Adapters.c(ActivationDetails.f20744a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (offerFeed == null) {
                Assertions.a(reader, "offerFeed");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ActivateSectionInFeedMutation.ActivateAllOffersInFeed(offerFeed, arrayListFromJson, activationDetails);
            }
            Assertions.a(reader, "activatedOfferIds");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ActivateSectionInFeedMutation.ActivateAllOffersInFeed value = (ActivateSectionInFeedMutation.ActivateAllOffersInFeed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerFeed");
            Adapters.c(OfferFeed.f20746a, true).toJson(writer, customScalarAdapters, value.f20701a);
            writer.F1("activatedOfferIds");
            Adapters.a(Adapters.f13493a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("activationDetails");
            Adapters.b(Adapters.c(ActivationDetails.f20744a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/ActivateSectionInFeedMutation_ResponseAdapter$ActivationDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/ActivateSectionInFeedMutation$ActivationDetails;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActivationDetails implements Adapter<ActivateSectionInFeedMutation.ActivationDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActivationDetails f20744a = new ActivationDetails();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActivateSectionInFeedMutation.OnActivationDetailsError onActivationDetailsErrorA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ActivationDetailsError"))) {
                reader.o();
                onActivationDetailsErrorA = OnActivationDetailsError.a(reader, customScalarAdapters);
            }
            return new ActivateSectionInFeedMutation.ActivationDetails(str, onActivationDetailsErrorA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ActivateSectionInFeedMutation.ActivationDetails value = (ActivateSectionInFeedMutation.ActivationDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20702a);
            ActivateSectionInFeedMutation.OnActivationDetailsError onActivationDetailsError = value.b;
            if (onActivationDetailsError != null) {
                OnActivationDetailsError.b(writer, customScalarAdapters, onActivationDetailsError);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/ActivateSectionInFeedMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/ActivateSectionInFeedMutation$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ActivateSectionInFeedMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20745a = new Data();
        public static final List b = CollectionsKt.Q("activateAllOffersInFeed");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActivateSectionInFeedMutation.ActivateAllOffersInFeed activateAllOffersInFeed = null;
            while (reader.o2(b) == 0) {
                activateAllOffersInFeed = (ActivateSectionInFeedMutation.ActivateAllOffersInFeed) Adapters.b(Adapters.c(ActivateAllOffersInFeed.f20743a, false)).fromJson(reader, customScalarAdapters);
            }
            return new ActivateSectionInFeedMutation.Data(activateAllOffersInFeed);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ActivateSectionInFeedMutation.Data value = (ActivateSectionInFeedMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("activateAllOffersInFeed");
            Adapters.b(Adapters.c(ActivateAllOffersInFeed.f20743a, false)).toJson(writer, customScalarAdapters, value.f20703a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/ActivateSectionInFeedMutation_ResponseAdapter$OfferFeed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/ActivateSectionInFeedMutation$OfferFeed;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferFeed implements Adapter<ActivateSectionInFeedMutation.OfferFeed> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferFeed f20746a = new OfferFeed();
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
            RewardsOfferFeedFields rewardsOfferFeedFieldsA = RewardsOfferFeedFieldsImpl_ResponseAdapter.RewardsOfferFeedFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ActivateSectionInFeedMutation.OfferFeed(str, rewardsOfferFeedFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ActivateSectionInFeedMutation.OfferFeed value = (ActivateSectionInFeedMutation.OfferFeed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20704a);
            List list = RewardsOfferFeedFieldsImpl_ResponseAdapter.RewardsOfferFeedFields.f20935a;
            RewardsOfferFeedFieldsImpl_ResponseAdapter.RewardsOfferFeedFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/ActivateSectionInFeedMutation_ResponseAdapter$OnActivationDetailsError;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/ActivateSectionInFeedMutation$OnActivationDetailsError;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActivationDetailsError implements Adapter<ActivateSectionInFeedMutation.OnActivationDetailsError> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20747a = CollectionsKt.Q("errorMessage");

        public static ActivateSectionInFeedMutation.OnActivationDetailsError a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20747a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ActivateSectionInFeedMutation.OnActivationDetailsError(str);
            }
            Assertions.a(reader, "errorMessage");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ActivateSectionInFeedMutation.OnActivationDetailsError value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("errorMessage");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20705a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ActivateSectionInFeedMutation.OnActivationDetailsError) obj);
        }
    }
}
