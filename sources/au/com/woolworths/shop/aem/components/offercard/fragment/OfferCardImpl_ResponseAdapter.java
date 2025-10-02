package au.com.woolworths.shop.aem.components.offercard.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.aem.components.offercard.fragment.OfferCard;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.OfferCardTextColor;
import au.com.woolworths.shop.graphql.type.OfferCardVariant;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.OfferCardTextColor_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.OfferCardVariant_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCardImpl_ResponseAdapter;", "", "OfferCard", "OfferCardBadgeImage", "OfferCardPriceInfo", "OfferCardAnalytics", "OfferCardAction", "Analytics", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferCardImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCardImpl_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCard$Analytics;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<OfferCard.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f10193a = new Analytics();
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
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new OfferCard.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferCard.Analytics value = (OfferCard.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10188a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCardImpl_ResponseAdapter$OfferCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCard;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferCard implements Adapter<au.com.woolworths.shop.aem.components.offercard.fragment.OfferCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10194a = CollectionsKt.R("offerCardImageUrl", "offerCardTitle", "offerCardDescription", "offerCardBadgeImage", "offerCardTextColor", "offerCardTextBackgroundColor", "offerCardPriceInfo", "offerCardAnalytics", "offerCardAction", "offerCardVariant");

        public static au.com.woolworths.shop.aem.components.offercard.fragment.OfferCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            OfferCard.OfferCardBadgeImage offerCardBadgeImage = null;
            OfferCardTextColor offerCardTextColorA = null;
            String str4 = null;
            OfferCard.OfferCardPriceInfo offerCardPriceInfo = null;
            OfferCard.OfferCardAnalytics offerCardAnalytics = null;
            OfferCard.OfferCardAction offerCardAction = null;
            OfferCardVariant offerCardVariant = null;
            while (true) {
                switch (reader.o2(f10194a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        offerCardBadgeImage = (OfferCard.OfferCardBadgeImage) Adapters.b(Adapters.c(OfferCardBadgeImage.f10197a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        offerCardTextColorA = OfferCardTextColor_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 5:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        offerCardPriceInfo = (OfferCard.OfferCardPriceInfo) Adapters.b(Adapters.c(OfferCardPriceInfo.f10198a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        offerCardAnalytics = (OfferCard.OfferCardAnalytics) Adapters.b(Adapters.c(OfferCardAnalytics.f10196a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        offerCardAction = (OfferCard.OfferCardAction) Adapters.b(Adapters.c(OfferCardAction.f10195a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        offerCardVariant = (OfferCardVariant) Adapters.b(OfferCardVariant_ResponseAdapter.f12089a).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "offerCardImageUrl");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "offerCardTitle");
                            throw null;
                        }
                        if (offerCardTextColorA == null) {
                            Assertions.a(reader, "offerCardTextColor");
                            throw null;
                        }
                        if (str4 != null) {
                            return new au.com.woolworths.shop.aem.components.offercard.fragment.OfferCard(str, str2, str3, offerCardBadgeImage, offerCardTextColorA, str4, offerCardPriceInfo, offerCardAnalytics, offerCardAction, offerCardVariant);
                        }
                        Assertions.a(reader, "offerCardTextBackgroundColor");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.shop.aem.components.offercard.fragment.OfferCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerCardImageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10187a);
            writer.F1("offerCardTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("offerCardDescription");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("offerCardBadgeImage");
            Adapters.b(Adapters.c(OfferCardBadgeImage.f10197a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("offerCardTextColor");
            writer.v0(value.e.d);
            writer.F1("offerCardTextBackgroundColor");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("offerCardPriceInfo");
            Adapters.b(Adapters.c(OfferCardPriceInfo.f10198a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("offerCardAnalytics");
            Adapters.b(Adapters.c(OfferCardAnalytics.f10196a, true)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("offerCardAction");
            Adapters.b(Adapters.c(OfferCardAction.f10195a, false)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("offerCardVariant");
            Adapters.b(OfferCardVariant_ResponseAdapter.f12089a).toJson(writer, customScalarAdapters, value.j);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.shop.aem.components.offercard.fragment.OfferCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCardImpl_ResponseAdapter$OfferCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCard$OfferCardAction;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferCardAction implements Adapter<OfferCard.OfferCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferCardAction f10195a = new OfferCardAction();
        public static final List b = CollectionsKt.R(UrlHandler.ACTION, "analytics", "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            OfferCard.Analytics analytics = null;
            ActionType actionTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    analytics = (OfferCard.Analytics) Adapters.b(Adapters.c(Analytics.f10193a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new OfferCard.OfferCardAction(str, analytics, actionTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferCard.OfferCardAction value = (OfferCard.OfferCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10189a);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f10193a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCardImpl_ResponseAdapter$OfferCardAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCard$OfferCardAnalytics;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferCardAnalytics implements Adapter<OfferCard.OfferCardAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferCardAnalytics f10196a = new OfferCardAnalytics();
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
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new OfferCard.OfferCardAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferCard.OfferCardAnalytics value = (OfferCard.OfferCardAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10190a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCardImpl_ResponseAdapter$OfferCardBadgeImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCard$OfferCardBadgeImage;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferCardBadgeImage implements Adapter<OfferCard.OfferCardBadgeImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferCardBadgeImage f10197a = new OfferCardBadgeImage();
        public static final List b = CollectionsKt.R("imageUrl", "altText");

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
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str2 != null) {
                return new OfferCard.OfferCardBadgeImage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferCard.OfferCardBadgeImage value = (OfferCard.OfferCardBadgeImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10191a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCardImpl_ResponseAdapter$OfferCardPriceInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/offercard/fragment/OfferCard$OfferCardPriceInfo;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferCardPriceInfo implements Adapter<OfferCard.OfferCardPriceInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferCardPriceInfo f10198a = new OfferCardPriceInfo();
        public static final List b = CollectionsKt.R("offerCardPriceInfoPriceDollars", "offerCardPriceInfoPriceCents", "offerCardPriceInfoPrefix1", "offerCardPriceInfoPrefix2", "offerCardPriceInfoSuffix");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        return new OfferCard.OfferCardPriceInfo(str, str2, str3, str4, str5);
                    }
                    str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferCard.OfferCardPriceInfo value = (OfferCard.OfferCardPriceInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerCardPriceInfoPriceDollars");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f10192a);
            writer.F1("offerCardPriceInfoPriceCents");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("offerCardPriceInfoPrefix1");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("offerCardPriceInfoPrefix2");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("offerCardPriceInfoSuffix");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
        }
    }
}
