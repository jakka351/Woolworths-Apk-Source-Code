package au.com.woolworths.product.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.BoostOffersMutation;
import au.com.woolworths.shop.graphql.type.RewardsOfferStatus;
import au.com.woolworths.shop.graphql.type.adapter.RewardsOfferStatus_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/product/adapter/BoostOffersMutation_ResponseAdapter;", "", "Data", "BoostTagProductOffers", "BoostOffer", "Info", "OfferAnalytics", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BoostOffersMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/adapter/BoostOffersMutation_ResponseAdapter$BoostOffer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/product/BoostOffersMutation$BoostOffer;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BoostOffer implements Adapter<BoostOffersMutation.BoostOffer> {

        /* renamed from: a, reason: collision with root package name */
        public static final BoostOffer f9234a = new BoostOffer();
        public static final List b = CollectionsKt.R("offerId", "success", "message", "info");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            String str2 = null;
            BoostOffersMutation.Info info = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    info = (BoostOffersMutation.Info) Adapters.b(Adapters.c(Info.f9237a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "offerId");
                throw null;
            }
            if (bool == null) {
                Assertions.a(reader, "success");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (str2 != null) {
                return new BoostOffersMutation.BoostOffer(str, zBooleanValue, str2, info);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BoostOffersMutation.BoostOffer value = (BoostOffersMutation.BoostOffer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f9221a);
            writer.F1("success");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("info");
            Adapters.b(Adapters.c(Info.f9237a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/adapter/BoostOffersMutation_ResponseAdapter$BoostTagProductOffers;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/product/BoostOffersMutation$BoostTagProductOffers;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BoostTagProductOffers implements Adapter<BoostOffersMutation.BoostTagProductOffers> {

        /* renamed from: a, reason: collision with root package name */
        public static final BoostTagProductOffers f9235a = new BoostTagProductOffers();
        public static final List b = CollectionsKt.Q("boostOffers");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            List list = null;
            while (reader.o2(b) == 0) {
                list = (List) Adapters.b(Adapters.a(Adapters.c(BoostOffer.f9234a, false))).fromJson(reader, customScalarAdapters);
            }
            return new BoostOffersMutation.BoostTagProductOffers(list);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BoostOffersMutation.BoostTagProductOffers value = (BoostOffersMutation.BoostTagProductOffers) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("boostOffers");
            Adapters.b(Adapters.a(Adapters.c(BoostOffer.f9234a, false))).toJson(writer, customScalarAdapters, value.f9222a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/adapter/BoostOffersMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/product/BoostOffersMutation$Data;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<BoostOffersMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f9236a = new Data();
        public static final List b = CollectionsKt.Q("boostTagProductOffers");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BoostOffersMutation.BoostTagProductOffers boostTagProductOffers = null;
            while (reader.o2(b) == 0) {
                boostTagProductOffers = (BoostOffersMutation.BoostTagProductOffers) Adapters.b(Adapters.c(BoostTagProductOffers.f9235a, false)).fromJson(reader, customScalarAdapters);
            }
            return new BoostOffersMutation.Data(boostTagProductOffers);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BoostOffersMutation.Data value = (BoostOffersMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("boostTagProductOffers");
            Adapters.b(Adapters.c(BoostTagProductOffers.f9235a, false)).toJson(writer, customScalarAdapters, value.f9223a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/adapter/BoostOffersMutation_ResponseAdapter$Info;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/product/BoostOffersMutation$Info;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Info implements Adapter<BoostOffersMutation.Info> {

        /* renamed from: a, reason: collision with root package name */
        public static final Info f9237a = new Info();
        public static final List b = CollectionsKt.R("offerId", "displayExpiry", "offerStatus", "displayStatus", "minimumSpend", "offerAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            RewardsOfferStatus rewardsOfferStatusA = null;
            String str3 = null;
            String str4 = null;
            BoostOffersMutation.OfferAnalytics offerAnalytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    rewardsOfferStatusA = RewardsOfferStatus_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    offerAnalytics = (BoostOffersMutation.OfferAnalytics) Adapters.b(Adapters.c(OfferAnalytics.f9238a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "offerId");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "displayExpiry");
                throw null;
            }
            if (rewardsOfferStatusA != null) {
                return new BoostOffersMutation.Info(str, str2, rewardsOfferStatusA, str3, str4, offerAnalytics);
            }
            Assertions.a(reader, "offerStatus");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BoostOffersMutation.Info value = (BoostOffersMutation.Info) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f9224a);
            writer.F1("displayExpiry");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("offerStatus");
            RewardsOfferStatus_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("displayStatus");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("minimumSpend");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("offerAnalytics");
            Adapters.b(Adapters.c(OfferAnalytics.f9238a, false)).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/adapter/BoostOffersMutation_ResponseAdapter$OfferAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/product/BoostOffersMutation$OfferAnalytics;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferAnalytics implements Adapter<BoostOffersMutation.OfferAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferAnalytics f9238a = new OfferAnalytics();
        public static final List b = CollectionsKt.R("offerName", "campaignStream", "channel", "status", "offerType", "partnerId", "rtlAccountID", "rtlCampaignID", "rtlCampaignCode");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str7 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str8 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str9 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        return new BoostOffersMutation.OfferAnalytics(str, str2, str3, str4, str5, str6, str7, str8, str9);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            BoostOffersMutation.OfferAnalytics value = (BoostOffersMutation.OfferAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerName");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f9225a);
            writer.F1("campaignStream");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("channel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("status");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("offerType");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("partnerId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("rtlAccountID");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("rtlCampaignID");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("rtlCampaignCode");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
        }
    }
}
