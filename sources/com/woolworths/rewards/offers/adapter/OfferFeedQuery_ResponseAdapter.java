package com.woolworths.rewards.offers.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.OfferFeedQuery;
import com.woolworths.rewards.offers.fragment.RewardsOfferFeedFields;
import com.woolworths.rewards.offers.fragment.RewardsOfferFeedFieldsImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferFeedQuery_ResponseAdapter;", "", "Data", "RewardsHomePage", "Balance", "PointsBalance", "RewardsOfferFeed", "PersonalisedOffers", "OnAvailablePersonalisedOffers", "AvailableOffer", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferFeedQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferFeedQuery_ResponseAdapter$AvailableOffer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferFeedQuery$AvailableOffer;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AvailableOffer implements Adapter<OfferFeedQuery.AvailableOffer> {

        /* renamed from: a, reason: collision with root package name */
        public static final AvailableOffer f20757a = new AvailableOffer();
        public static final List b = CollectionsKt.Q("offerId");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new OfferFeedQuery.AvailableOffer(str);
            }
            Assertions.a(reader, "offerId");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferFeedQuery.AvailableOffer value = (OfferFeedQuery.AvailableOffer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20719a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferFeedQuery_ResponseAdapter$Balance;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferFeedQuery$Balance;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Balance implements Adapter<OfferFeedQuery.Balance> {

        /* renamed from: a, reason: collision with root package name */
        public static final Balance f20758a = new Balance();
        public static final List b = CollectionsKt.Q("pointsBalance");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferFeedQuery.PointsBalance pointsBalance = null;
            while (reader.o2(b) == 0) {
                pointsBalance = (OfferFeedQuery.PointsBalance) Adapters.c(PointsBalance.f20762a, false).fromJson(reader, customScalarAdapters);
            }
            if (pointsBalance != null) {
                return new OfferFeedQuery.Balance(pointsBalance);
            }
            Assertions.a(reader, "pointsBalance");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferFeedQuery.Balance value = (OfferFeedQuery.Balance) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("pointsBalance");
            Adapters.c(PointsBalance.f20762a, false).toJson(writer, customScalarAdapters, value.f20720a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferFeedQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferFeedQuery$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<OfferFeedQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20759a = new Data();
        public static final List b = CollectionsKt.R("rewardsHomePage", "rewardsOfferFeed", "personalisedOffers");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferFeedQuery.RewardsHomePage rewardsHomePage = null;
            OfferFeedQuery.RewardsOfferFeed rewardsOfferFeed = null;
            OfferFeedQuery.PersonalisedOffers personalisedOffers = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    rewardsHomePage = (OfferFeedQuery.RewardsHomePage) Adapters.b(Adapters.c(RewardsHomePage.f20763a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    rewardsOfferFeed = (OfferFeedQuery.RewardsOfferFeed) Adapters.b(Adapters.c(RewardsOfferFeed.f20764a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    personalisedOffers = (OfferFeedQuery.PersonalisedOffers) Adapters.c(PersonalisedOffers.f20761a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (personalisedOffers != null) {
                return new OfferFeedQuery.Data(rewardsHomePage, rewardsOfferFeed, personalisedOffers);
            }
            Assertions.a(reader, "personalisedOffers");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferFeedQuery.Data value = (OfferFeedQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsHomePage");
            Adapters.b(Adapters.c(RewardsHomePage.f20763a, false)).toJson(writer, customScalarAdapters, value.f20721a);
            writer.F1("rewardsOfferFeed");
            Adapters.b(Adapters.c(RewardsOfferFeed.f20764a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("personalisedOffers");
            Adapters.c(PersonalisedOffers.f20761a, true).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferFeedQuery_ResponseAdapter$OnAvailablePersonalisedOffers;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferFeedQuery$OnAvailablePersonalisedOffers;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAvailablePersonalisedOffers implements Adapter<OfferFeedQuery.OnAvailablePersonalisedOffers> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20760a = CollectionsKt.R("availableOffers", "hasBoostedOffers", "swapEnabled");

        public static OfferFeedQuery.OnAvailablePersonalisedOffers a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (true) {
                int iO2 = reader.o2(f20760a);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(AvailableOffer.f20757a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "availableOffers");
                throw null;
            }
            if (bool == null) {
                Assertions.a(reader, "hasBoostedOffers");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (bool2 != null) {
                return new OfferFeedQuery.OnAvailablePersonalisedOffers(arrayListFromJson, zBooleanValue, bool2.booleanValue());
            }
            Assertions.a(reader, "swapEnabled");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferFeedQuery.OnAvailablePersonalisedOffers value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("availableOffers");
            Adapters.a(Adapters.c(AvailableOffer.f20757a, false)).toJson(writer, customScalarAdapters, value.f20722a);
            writer.F1("hasBoostedOffers");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.b, adapters$BooleanAdapter$1, writer, customScalarAdapters, "swapEnabled");
            adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferFeedQuery.OnAvailablePersonalisedOffers) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferFeedQuery_ResponseAdapter$PersonalisedOffers;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferFeedQuery$PersonalisedOffers;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PersonalisedOffers implements Adapter<OfferFeedQuery.PersonalisedOffers> {

        /* renamed from: a, reason: collision with root package name */
        public static final PersonalisedOffers f20761a = new PersonalisedOffers();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferFeedQuery.OnAvailablePersonalisedOffers onAvailablePersonalisedOffersA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("AvailablePersonalisedOffers"))) {
                reader.o();
                onAvailablePersonalisedOffersA = OnAvailablePersonalisedOffers.a(reader, customScalarAdapters);
            }
            return new OfferFeedQuery.PersonalisedOffers(str, onAvailablePersonalisedOffersA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferFeedQuery.PersonalisedOffers value = (OfferFeedQuery.PersonalisedOffers) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20723a);
            OfferFeedQuery.OnAvailablePersonalisedOffers onAvailablePersonalisedOffers = value.b;
            if (onAvailablePersonalisedOffers != null) {
                OnAvailablePersonalisedOffers.b(writer, customScalarAdapters, onAvailablePersonalisedOffers);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferFeedQuery_ResponseAdapter$PointsBalance;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferFeedQuery$PointsBalance;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PointsBalance implements Adapter<OfferFeedQuery.PointsBalance> {

        /* renamed from: a, reason: collision with root package name */
        public static final PointsBalance f20762a = new PointsBalance();
        public static final List b = CollectionsKt.R("pointsBalance", "creditsBalance", "redemptionPercentage", "displayMessage", "showStatusMark", "statusMarkUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Double d2 = null;
            Integer num2 = null;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 != 0) {
                    if (iO2 == 1) {
                        d = d2;
                        num2 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 2) {
                        d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 3) {
                        d = d2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 4) {
                        d = d2;
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                    } else {
                        if (iO2 != 5) {
                            break;
                        }
                        d = d2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                    }
                    d2 = d;
                } else {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                }
            }
            Double d3 = d2;
            if (num == null) {
                Assertions.a(reader, "pointsBalance");
                throw null;
            }
            int iIntValue = num.intValue();
            if (d3 == null) {
                Assertions.a(reader, "redemptionPercentage");
                throw null;
            }
            double dDoubleValue = d3.doubleValue();
            if (str != null) {
                return new OfferFeedQuery.PointsBalance(iIntValue, num2, dDoubleValue, str, bool, str2);
            }
            Assertions.a(reader, "displayMessage");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferFeedQuery.PointsBalance value = (OfferFeedQuery.PointsBalance) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("pointsBalance");
            d.y(value.f20724a, Adapters.b, writer, customScalarAdapters, "creditsBalance");
            Adapters.k.toJson(writer, customScalarAdapters, value.b);
            writer.F1("redemptionPercentage");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.c));
            writer.F1("displayMessage");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.d);
            writer.F1("showStatusMark");
            Adapters.l.toJson(writer, customScalarAdapters, value.e);
            writer.F1("statusMarkUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferFeedQuery_ResponseAdapter$RewardsHomePage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferFeedQuery$RewardsHomePage;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsHomePage implements Adapter<OfferFeedQuery.RewardsHomePage> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsHomePage f20763a = new RewardsHomePage();
        public static final List b = CollectionsKt.Q("balance");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferFeedQuery.Balance balance = null;
            while (reader.o2(b) == 0) {
                balance = (OfferFeedQuery.Balance) Adapters.c(Balance.f20758a, false).fromJson(reader, customScalarAdapters);
            }
            if (balance != null) {
                return new OfferFeedQuery.RewardsHomePage(balance);
            }
            Assertions.a(reader, "balance");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferFeedQuery.RewardsHomePage value = (OfferFeedQuery.RewardsHomePage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("balance");
            Adapters.c(Balance.f20758a, false).toJson(writer, customScalarAdapters, value.f20725a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferFeedQuery_ResponseAdapter$RewardsOfferFeed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferFeedQuery$RewardsOfferFeed;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsOfferFeed implements Adapter<OfferFeedQuery.RewardsOfferFeed> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsOfferFeed f20764a = new RewardsOfferFeed();
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
                return new OfferFeedQuery.RewardsOfferFeed(str, rewardsOfferFeedFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferFeedQuery.RewardsOfferFeed value = (OfferFeedQuery.RewardsOfferFeed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20726a);
            List list = RewardsOfferFeedFieldsImpl_ResponseAdapter.RewardsOfferFeedFields.f20935a;
            RewardsOfferFeedFieldsImpl_ResponseAdapter.RewardsOfferFeedFields.b(writer, customScalarAdapters, value.b);
        }
    }
}
