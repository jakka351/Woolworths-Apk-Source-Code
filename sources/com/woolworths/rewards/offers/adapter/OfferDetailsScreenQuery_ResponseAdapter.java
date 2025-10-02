package com.woolworths.rewards.offers.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.woolworths.rewards.offers.OfferDetailsScreenQuery;
import com.woolworths.rewards.offers.fragment.fragment.OfferDetailsFragment;
import com.woolworths.rewards.offers.fragment.fragment.OfferDetailsFragmentImpl_ResponseAdapter;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferDetailsScreenQuery_ResponseAdapter;", "", "Data", "RewardsOfferDetails", "OnRewardsOffer", "OnRewardsOfferUnknown", "Cta", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferDetailsScreenQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferDetailsScreenQuery_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferDetailsScreenQuery$Cta;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<OfferDetailsScreenQuery.Cta> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta f20752a = new Cta();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new OfferDetailsScreenQuery.Cta(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsScreenQuery.Cta value = (OfferDetailsScreenQuery.Cta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20713a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferDetailsScreenQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferDetailsScreenQuery$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<OfferDetailsScreenQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20753a = new Data();
        public static final List b = CollectionsKt.Q("rewardsOfferDetails");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferDetailsScreenQuery.RewardsOfferDetails rewardsOfferDetails = null;
            while (reader.o2(b) == 0) {
                rewardsOfferDetails = (OfferDetailsScreenQuery.RewardsOfferDetails) Adapters.b(Adapters.c(RewardsOfferDetails.f20756a, true)).fromJson(reader, customScalarAdapters);
            }
            return new OfferDetailsScreenQuery.Data(rewardsOfferDetails);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsScreenQuery.Data value = (OfferDetailsScreenQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsOfferDetails");
            Adapters.b(Adapters.c(RewardsOfferDetails.f20756a, true)).toJson(writer, customScalarAdapters, value.f20714a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferDetailsScreenQuery_ResponseAdapter$OnRewardsOffer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferDetailsScreenQuery$OnRewardsOffer;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRewardsOffer implements Adapter<OfferDetailsScreenQuery.OnRewardsOffer> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20754a = CollectionsKt.Q("__typename");

        public static OfferDetailsScreenQuery.OnRewardsOffer a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20754a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            OfferDetailsFragment offerDetailsFragmentA = OfferDetailsFragmentImpl_ResponseAdapter.OfferDetailsFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new OfferDetailsScreenQuery.OnRewardsOffer(str, offerDetailsFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsScreenQuery.OnRewardsOffer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20715a);
            List list = OfferDetailsFragmentImpl_ResponseAdapter.OfferDetailsFragment.f20994a;
            OfferDetailsFragmentImpl_ResponseAdapter.OfferDetailsFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsScreenQuery.OnRewardsOffer) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferDetailsScreenQuery_ResponseAdapter$OnRewardsOfferUnknown;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferDetailsScreenQuery$OnRewardsOfferUnknown;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRewardsOfferUnknown implements Adapter<OfferDetailsScreenQuery.OnRewardsOfferUnknown> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20755a = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "cta");

        public static OfferDetailsScreenQuery.OnRewardsOfferUnknown a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            OfferDetailsScreenQuery.Cta cta = null;
            while (true) {
                int iO2 = reader.o2(f20755a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    cta = (OfferDetailsScreenQuery.Cta) Adapters.b(Adapters.c(Cta.f20752a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new OfferDetailsScreenQuery.OnRewardsOfferUnknown(str, str2, cta);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsScreenQuery.OnRewardsOfferUnknown value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20716a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("cta");
            Adapters.b(Adapters.c(Cta.f20752a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsScreenQuery.OnRewardsOfferUnknown) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferDetailsScreenQuery_ResponseAdapter$RewardsOfferDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferDetailsScreenQuery$RewardsOfferDetails;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsOfferDetails implements Adapter<OfferDetailsScreenQuery.RewardsOfferDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsOfferDetails f20756a = new RewardsOfferDetails();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            OfferDetailsScreenQuery.OnRewardsOffer onRewardsOfferA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            OfferDetailsScreenQuery.OnRewardsOfferUnknown onRewardsOfferUnknownA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RewardsOffer"))) {
                reader.o();
                onRewardsOfferA = OnRewardsOffer.a(reader, customScalarAdapters);
            } else {
                onRewardsOfferA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RewardsOfferUnknown"))) {
                reader.o();
                onRewardsOfferUnknownA = OnRewardsOfferUnknown.a(reader, customScalarAdapters);
            }
            return new OfferDetailsScreenQuery.RewardsOfferDetails(str, onRewardsOfferA, onRewardsOfferUnknownA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsScreenQuery.RewardsOfferDetails value = (OfferDetailsScreenQuery.RewardsOfferDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20717a);
            OfferDetailsScreenQuery.OnRewardsOffer onRewardsOffer = value.b;
            if (onRewardsOffer != null) {
                OnRewardsOffer.b(writer, customScalarAdapters, onRewardsOffer);
            }
            OfferDetailsScreenQuery.OnRewardsOfferUnknown onRewardsOfferUnknown = value.c;
            if (onRewardsOfferUnknown != null) {
                OnRewardsOfferUnknown.b(writer, customScalarAdapters, onRewardsOfferUnknown);
            }
        }
    }
}
