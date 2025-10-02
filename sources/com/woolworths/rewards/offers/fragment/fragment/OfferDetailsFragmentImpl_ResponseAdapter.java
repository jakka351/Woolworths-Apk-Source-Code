package com.woolworths.rewards.offers.fragment.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.RewardsOfferStatus;
import au.com.woolworths.rewards.graphql.type.adapter.RewardsOfferStatus_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.common.Scopes;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.rewards.offers.fragment.fragment.OfferDetailsFragment;
import com.woolworths.rewards.offers.fragment.fragment.StandardBannerFieldsImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragmentImpl_ResponseAdapter;", "", "OfferDetailsFragment", "Mechanics", "Item", "StatusIcon", "OfferAnalytics", "ActivationMessage", "OnRewardsOffer", "OfferDetailsCta", "Cta", "StandardBanner", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferDetailsFragmentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragmentImpl_ResponseAdapter$ActivationMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$ActivationMessage;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActivationMessage implements Adapter<OfferDetailsFragment.ActivationMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActivationMessage f20988a = new ActivationMessage();
        public static final List b = CollectionsKt.R("title", "message", "buttonLabel");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str3 != null) {
                return new OfferDetailsFragment.ActivationMessage(str, str2, str3);
            }
            Assertions.a(reader, "buttonLabel");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsFragment.ActivationMessage value = (OfferDetailsFragment.ActivationMessage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20979a);
            writer.F1("message");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("buttonLabel");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragmentImpl_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$Cta;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<OfferDetailsFragment.Cta> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta f20989a = new Cta();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url", "isExternalUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new OfferDetailsFragment.Cta(bool, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsFragment.Cta value = (OfferDetailsFragment.Cta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20980a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isExternalUrl");
            Adapters.l.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragmentImpl_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$Item;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<OfferDetailsFragment.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f20990a = new Item();
        public static final List b = CollectionsKt.R(BarcodePickDeserializer.FIELD_ICON, "caption", "altText", "title");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "caption");
                throw null;
            }
            if (str4 != null) {
                return new OfferDetailsFragment.Item(str, str2, str3, str4);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsFragment.Item value = (OfferDetailsFragment.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20981a);
            writer.F1("caption");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragmentImpl_ResponseAdapter$Mechanics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$Mechanics;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Mechanics implements Adapter<OfferDetailsFragment.Mechanics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Mechanics f20991a = new Mechanics();
        public static final List b = CollectionsKt.R("displayLastUpdated", "separator", "selectedIndex", "items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Integer num = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f20990a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "displayLastUpdated");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "separator");
                throw null;
            }
            if (num == null) {
                Assertions.a(reader, "selectedIndex");
                throw null;
            }
            int iIntValue = num.intValue();
            if (arrayListFromJson != null) {
                return new OfferDetailsFragment.Mechanics(str, str2, iIntValue, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsFragment.Mechanics value = (OfferDetailsFragment.Mechanics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayLastUpdated");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20982a);
            writer.F1("separator");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("selectedIndex");
            d.y(value.c, Adapters.b, writer, customScalarAdapters, "items");
            Adapters.a(Adapters.c(Item.f20990a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragmentImpl_ResponseAdapter$OfferAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$OfferAnalytics;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferAnalytics implements Adapter<OfferDetailsFragment.OfferAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferAnalytics f20992a = new OfferAnalytics();
        public static final List b = CollectionsKt.R("offerName", "commId", "uoid", "campaignCode", "campaignStream", "channel", "status", "offerType", "partnerId", "rtlAccountID", "rtlCampaignID", "rtlCampaignCode", "rtlCouponStart", Scopes.PROFILE);

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
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
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
                    case 9:
                        str10 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        str11 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        str12 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        str13 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 13:
                        str14 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        return new OfferDetailsFragment.OfferAnalytics(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsFragment.OfferAnalytics value = (OfferDetailsFragment.OfferAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerName");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20983a);
            writer.F1("commId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("uoid");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("campaignCode");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("campaignStream");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("channel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("status");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("offerType");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("partnerId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
            writer.F1("rtlAccountID");
            nullableAdapter.toJson(writer, customScalarAdapters, value.j);
            writer.F1("rtlCampaignID");
            nullableAdapter.toJson(writer, customScalarAdapters, value.k);
            writer.F1("rtlCampaignCode");
            nullableAdapter.toJson(writer, customScalarAdapters, value.l);
            writer.F1("rtlCouponStart");
            nullableAdapter.toJson(writer, customScalarAdapters, value.m);
            writer.F1(Scopes.PROFILE);
            nullableAdapter.toJson(writer, customScalarAdapters, value.n);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragmentImpl_ResponseAdapter$OfferDetailsCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$OfferDetailsCta;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferDetailsCta implements Adapter<OfferDetailsFragment.OfferDetailsCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferDetailsCta f20993a = new OfferDetailsCta();
        public static final List b = CollectionsKt.R("cta", "displayStatus");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferDetailsFragment.Cta cta = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    cta = (OfferDetailsFragment.Cta) Adapters.c(Cta.f20989a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (cta != null) {
                return new OfferDetailsFragment.OfferDetailsCta(cta, str);
            }
            Assertions.a(reader, "cta");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsFragment.OfferDetailsCta value = (OfferDetailsFragment.OfferDetailsCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("cta");
            Adapters.c(Cta.f20989a, false).toJson(writer, customScalarAdapters, value.f20984a);
            writer.F1("displayStatus");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragmentImpl_ResponseAdapter$OfferDetailsFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferDetailsFragment implements Adapter<com.woolworths.rewards.offers.fragment.fragment.OfferDetailsFragment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20994a = CollectionsKt.R("__typename", "offerId", "image", "bannerUrl", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, ErrorBundle.SUMMARY_ENTRY, "body", "formattedTermsAndConditions", "markdownTermsAndConditions", "displayExpiry", "displayStatus", "offerStatus", "brandLogoUrl", "mechanics", "statusIcons", "offerAnalytics", "activationAnimation", "displayAnimation", "activationMessage");

        public static com.woolworths.rewards.offers.fragment.fragment.OfferDetailsFragment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            OfferDetailsFragment.OnRewardsOffer onRewardsOfferA;
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
            String str10 = null;
            String str11 = null;
            String str12 = null;
            RewardsOfferStatus rewardsOfferStatusA = null;
            String str13 = null;
            OfferDetailsFragment.Mechanics mechanics = null;
            ArrayList arrayListFromJson = null;
            OfferDetailsFragment.OfferAnalytics offerAnalytics = null;
            String str14 = null;
            String str15 = null;
            OfferDetailsFragment.ActivationMessage activationMessage = null;
            while (true) {
                switch (reader.o2(f20994a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
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
                    case 9:
                        str10 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        str11 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        str12 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        rewardsOfferStatusA = RewardsOfferStatus_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 13:
                        str13 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 14:
                        mechanics = (OfferDetailsFragment.Mechanics) Adapters.b(Adapters.c(Mechanics.f20991a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 15:
                        arrayListFromJson = Adapters.a(Adapters.c(StatusIcon.f20997a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 16:
                        offerAnalytics = (OfferDetailsFragment.OfferAnalytics) Adapters.b(Adapters.c(OfferAnalytics.f20992a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 17:
                        str14 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 18:
                        str15 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 19:
                        activationMessage = (OfferDetailsFragment.ActivationMessage) Adapters.b(Adapters.c(ActivationMessage.f20988a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            throw new IllegalStateException("__typename was not found");
                        }
                        String str16 = str2;
                        String str17 = str3;
                        if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("RewardsOffer"))) {
                            reader.o();
                            onRewardsOfferA = OnRewardsOffer.a(reader, customScalarAdapters);
                        } else {
                            onRewardsOfferA = null;
                        }
                        if (str16 == null) {
                            Assertions.a(reader, "offerId");
                            throw null;
                        }
                        if (str17 == null) {
                            Assertions.a(reader, "image");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (str11 == null) {
                            Assertions.a(reader, "displayExpiry");
                            throw null;
                        }
                        if (str12 == null) {
                            Assertions.a(reader, "displayStatus");
                            throw null;
                        }
                        if (rewardsOfferStatusA == null) {
                            Assertions.a(reader, "offerStatus");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new com.woolworths.rewards.offers.fragment.fragment.OfferDetailsFragment(str, str16, str17, str4, str5, str6, str7, str8, str9, str10, str11, str12, rewardsOfferStatusA, str13, mechanics, arrayListFromJson, offerAnalytics, str14, str15, activationMessage, onRewardsOfferA);
                        }
                        Assertions.a(reader, "statusIcons");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.rewards.offers.fragment.fragment.OfferDetailsFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20978a);
            writer.F1("offerId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("image");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("bannerUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1(ErrorBundle.SUMMARY_ENTRY);
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("body");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("formattedTermsAndConditions");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
            writer.F1("markdownTermsAndConditions");
            nullableAdapter.toJson(writer, customScalarAdapters, value.j);
            writer.F1("displayExpiry");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.k);
            writer.F1("displayStatus");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.l);
            writer.F1("offerStatus");
            RewardsOfferStatus_ResponseAdapter.b(writer, customScalarAdapters, value.m);
            writer.F1("brandLogoUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.n);
            writer.F1("mechanics");
            Adapters.b(Adapters.c(Mechanics.f20991a, false)).toJson(writer, customScalarAdapters, value.o);
            writer.F1("statusIcons");
            Adapters.a(Adapters.c(StatusIcon.f20997a, false)).toJson(writer, customScalarAdapters, value.p);
            writer.F1("offerAnalytics");
            Adapters.b(Adapters.c(OfferAnalytics.f20992a, false)).toJson(writer, customScalarAdapters, value.q);
            writer.F1("activationAnimation");
            nullableAdapter.toJson(writer, customScalarAdapters, value.r);
            writer.F1("displayAnimation");
            nullableAdapter.toJson(writer, customScalarAdapters, value.s);
            writer.F1("activationMessage");
            Adapters.b(Adapters.c(ActivationMessage.f20988a, false)).toJson(writer, customScalarAdapters, value.t);
            OfferDetailsFragment.OnRewardsOffer onRewardsOffer = value.u;
            if (onRewardsOffer != null) {
                OnRewardsOffer.b(writer, customScalarAdapters, onRewardsOffer);
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.rewards.offers.fragment.fragment.OfferDetailsFragment) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragmentImpl_ResponseAdapter$OnRewardsOffer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$OnRewardsOffer;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRewardsOffer implements Adapter<OfferDetailsFragment.OnRewardsOffer> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20995a = CollectionsKt.R("displayExpiryExtended", "offerDetailsCta", "standardBanner");

        public static OfferDetailsFragment.OnRewardsOffer a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            OfferDetailsFragment.OfferDetailsCta offerDetailsCta = null;
            OfferDetailsFragment.StandardBanner standardBanner = null;
            while (true) {
                int iO2 = reader.o2(f20995a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    offerDetailsCta = (OfferDetailsFragment.OfferDetailsCta) Adapters.b(Adapters.c(OfferDetailsCta.f20993a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new OfferDetailsFragment.OnRewardsOffer(str, offerDetailsCta, standardBanner);
                    }
                    standardBanner = (OfferDetailsFragment.StandardBanner) Adapters.b(Adapters.c(StandardBanner.f20996a, true)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsFragment.OnRewardsOffer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayExpiryExtended");
            Adapters.i.toJson(writer, customScalarAdapters, value.f20985a);
            writer.F1("offerDetailsCta");
            Adapters.b(Adapters.c(OfferDetailsCta.f20993a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("standardBanner");
            Adapters.b(Adapters.c(StandardBanner.f20996a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsFragment.OnRewardsOffer) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragmentImpl_ResponseAdapter$StandardBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$StandardBanner;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StandardBanner implements Adapter<OfferDetailsFragment.StandardBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final StandardBanner f20996a = new StandardBanner();
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
            StandardBannerFields standardBannerFieldsA = StandardBannerFieldsImpl_ResponseAdapter.StandardBannerFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new OfferDetailsFragment.StandardBanner(str, standardBannerFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsFragment.StandardBanner value = (OfferDetailsFragment.StandardBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20986a);
            List list = StandardBannerFieldsImpl_ResponseAdapter.StandardBannerFields.f21035a;
            StandardBannerFieldsImpl_ResponseAdapter.StandardBannerFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragmentImpl_ResponseAdapter$StatusIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$StatusIcon;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StatusIcon implements Adapter<OfferDetailsFragment.StatusIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final StatusIcon f20997a = new StatusIcon();
        public static final List b = CollectionsKt.Q(BarcodePickDeserializer.FIELD_ICON);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new OfferDetailsFragment.StatusIcon(str);
            }
            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsFragment.StatusIcon value = (OfferDetailsFragment.StatusIcon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20987a);
        }
    }
}
