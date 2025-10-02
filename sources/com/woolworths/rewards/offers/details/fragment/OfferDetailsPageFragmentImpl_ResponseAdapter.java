package com.woolworths.rewards.offers.details.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.ActionType;
import au.com.woolworths.rewards.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import au.com.woolworths.rewards.graphql.type.LocalAssetIconName;
import au.com.woolworths.rewards.graphql.type.RewardsOfferStatus;
import au.com.woolworths.rewards.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.CoreBroadcastBannerStyle_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.DownloadableAssetFit_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.DownloadableAssetType_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.LocalAssetIconName_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.RewardsOfferStatus_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.common.Scopes;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.rewards.offers.details.fragment.OfferDetailsCardFragmentImpl_ResponseAdapter;
import com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment;
import com.woolworths.rewards.offers.fragment.IconAsset;
import com.woolworths.rewards.offers.fragment.IconAssetImpl_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFieldsImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter;", "", "OfferDetailsPageFragment", "Header", "HeroAsset", "LeafAsset", "OnLocalAsset", "OnHostedIcon", "RoundelAsset", "StatusBadge", "BroadcastBanner", "BroadcastBannerUI", "Icon", "OnHostedIcon1", "BroadcastBannerAction", "Content", "OnOfferDetailsCard", "Footer", "OnOfferDetailsFooter", "Cta", "StatusBadge1", "OfferAnalytics", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferDetailsPageFragmentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$BroadcastBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$BroadcastBanner;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBanner implements Adapter<OfferDetailsPageFragment.BroadcastBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBanner f20862a = new BroadcastBanner();
        public static final List b = CollectionsKt.R("broadcastBannerUI", "broadcastBannerAction", "broadcastBannerActionLabel");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferDetailsPageFragment.BroadcastBannerUI broadcastBannerUI = null;
            OfferDetailsPageFragment.BroadcastBannerAction broadcastBannerAction = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    broadcastBannerUI = (OfferDetailsPageFragment.BroadcastBannerUI) Adapters.c(BroadcastBannerUI.f20864a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    broadcastBannerAction = (OfferDetailsPageFragment.BroadcastBannerAction) Adapters.b(Adapters.c(BroadcastBannerAction.f20863a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (broadcastBannerUI != null) {
                return new OfferDetailsPageFragment.BroadcastBanner(broadcastBannerUI, broadcastBannerAction, str);
            }
            Assertions.a(reader, "broadcastBannerUI");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.BroadcastBanner value = (OfferDetailsPageFragment.BroadcastBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("broadcastBannerUI");
            Adapters.c(BroadcastBannerUI.f20864a, false).toJson(writer, customScalarAdapters, value.f20843a);
            writer.F1("broadcastBannerAction");
            Adapters.b(Adapters.c(BroadcastBannerAction.f20863a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("broadcastBannerActionLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$BroadcastBannerAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$BroadcastBannerAction;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerAction implements Adapter<OfferDetailsPageFragment.BroadcastBannerAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerAction f20863a = new BroadcastBannerAction();
        public static final List b = CollectionsKt.R("id", "type", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new OfferDetailsPageFragment.BroadcastBannerAction(str, actionTypeA, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.BroadcastBannerAction value = (OfferDetailsPageFragment.BroadcastBannerAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.f20844a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$BroadcastBannerUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$BroadcastBannerUI;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerUI implements Adapter<OfferDetailsPageFragment.BroadcastBannerUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerUI f20864a = new BroadcastBannerUI();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "style", BarcodePickDeserializer.FIELD_ICON);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CoreBroadcastBannerStyle coreBroadcastBannerStyleA = null;
            OfferDetailsPageFragment.Icon icon = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    coreBroadcastBannerStyleA = CoreBroadcastBannerStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    icon = (OfferDetailsPageFragment.Icon) Adapters.c(Icon.f20870a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (coreBroadcastBannerStyleA == null) {
                Assertions.a(reader, "style");
                throw null;
            }
            if (icon != null) {
                return new OfferDetailsPageFragment.BroadcastBannerUI(str, str2, coreBroadcastBannerStyleA, icon);
            }
            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.BroadcastBannerUI value = (OfferDetailsPageFragment.BroadcastBannerUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20845a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            writer.v0(value.c.d);
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.c(Icon.f20870a, true).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$Content;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$Content;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content implements Adapter<OfferDetailsPageFragment.Content> {

        /* renamed from: a, reason: collision with root package name */
        public static final Content f20865a = new Content();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferDetailsPageFragment.OnOfferDetailsCard onOfferDetailsCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("OfferDetailsCard"))) {
                reader.o();
                onOfferDetailsCardA = OnOfferDetailsCard.a(reader, customScalarAdapters);
            }
            return new OfferDetailsPageFragment.Content(str, onOfferDetailsCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.Content value = (OfferDetailsPageFragment.Content) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20846a);
            OfferDetailsPageFragment.OnOfferDetailsCard onOfferDetailsCard = value.b;
            if (onOfferDetailsCard != null) {
                OnOfferDetailsCard.b(writer, customScalarAdapters, onOfferDetailsCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$Cta;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<OfferDetailsPageFragment.Cta> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta f20866a = new Cta();
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
            ContentCtaFields contentCtaFieldsA = ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new OfferDetailsPageFragment.Cta(str, contentCtaFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.Cta value = (OfferDetailsPageFragment.Cta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20847a);
            List list = ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.f20976a;
            ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$Footer;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<OfferDetailsPageFragment.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f20867a = new Footer();
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
            OfferDetailsPageFragment.OnOfferDetailsFooter onOfferDetailsFooterA = OnOfferDetailsFooter.a(reader, customScalarAdapters);
            if (str != null) {
                return new OfferDetailsPageFragment.Footer(str, onOfferDetailsFooterA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.Footer value = (OfferDetailsPageFragment.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20848a);
            List list = OnOfferDetailsFooter.f20878a;
            OnOfferDetailsFooter.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$Header;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<OfferDetailsPageFragment.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f20868a = new Header();
        public static final List b = CollectionsKt.R("heroAsset", "leafAsset", "roundelAsset", "title", lqlqqlq.mmm006Dm006Dm, "statusBadge", "broadcastBanner");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferDetailsPageFragment.HeroAsset heroAsset = null;
            OfferDetailsPageFragment.LeafAsset leafAsset = null;
            OfferDetailsPageFragment.RoundelAsset roundelAsset = null;
            String str = null;
            String str2 = null;
            OfferDetailsPageFragment.StatusBadge statusBadge = null;
            OfferDetailsPageFragment.BroadcastBanner broadcastBanner = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        heroAsset = (OfferDetailsPageFragment.HeroAsset) Adapters.c(HeroAsset.f20869a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        leafAsset = (OfferDetailsPageFragment.LeafAsset) Adapters.c(LeafAsset.f20871a, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        roundelAsset = (OfferDetailsPageFragment.RoundelAsset) Adapters.b(Adapters.c(RoundelAsset.f20879a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        statusBadge = (OfferDetailsPageFragment.StatusBadge) Adapters.b(Adapters.c(StatusBadge.f20880a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        broadcastBanner = (OfferDetailsPageFragment.BroadcastBanner) Adapters.b(Adapters.c(BroadcastBanner.f20862a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (heroAsset == null) {
                            Assertions.a(reader, "heroAsset");
                            throw null;
                        }
                        if (leafAsset == null) {
                            Assertions.a(reader, "leafAsset");
                            throw null;
                        }
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 != null) {
                            return new OfferDetailsPageFragment.Header(heroAsset, leafAsset, roundelAsset, str, str2, statusBadge, broadcastBanner);
                        }
                        Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.Header value = (OfferDetailsPageFragment.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("heroAsset");
            Adapters.c(HeroAsset.f20869a, false).toJson(writer, customScalarAdapters, value.f20849a);
            writer.F1("leafAsset");
            Adapters.c(LeafAsset.f20871a, true).toJson(writer, customScalarAdapters, value.b);
            writer.F1("roundelAsset");
            Adapters.b(Adapters.c(RoundelAsset.f20879a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("statusBadge");
            Adapters.b(Adapters.c(StatusBadge.f20880a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("broadcastBanner");
            Adapters.b(Adapters.c(BroadcastBanner.f20862a, false)).toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$HeroAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$HeroAsset;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroAsset implements Adapter<OfferDetailsPageFragment.HeroAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroAsset f20869a = new HeroAsset();
        public static final List b = CollectionsKt.R("assetId", "assetType", "assetUrl", "assetWidth", "assetHeight", "fit", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            DownloadableAssetType downloadableAssetTypeA = null;
            String str2 = null;
            Integer num3 = null;
            DownloadableAssetFit downloadableAssetFit = null;
            String str3 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        num = num2;
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        downloadableAssetTypeA = DownloadableAssetType_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 2:
                        num = num2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        num = num2;
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num = num2;
                        downloadableAssetFit = (DownloadableAssetFit) Adapters.b(DownloadableAssetFit_ResponseAdapter.f9949a).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num2;
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num4 = num2;
                        if (downloadableAssetTypeA == null) {
                            Assertions.a(reader, "assetType");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "assetUrl");
                            throw null;
                        }
                        if (num4 == null) {
                            Assertions.a(reader, "assetWidth");
                            throw null;
                        }
                        Integer num5 = num3;
                        int iIntValue = num4.intValue();
                        if (num5 != null) {
                            return new OfferDetailsPageFragment.HeroAsset(str, downloadableAssetTypeA, str2, iIntValue, num5.intValue(), downloadableAssetFit, str3);
                        }
                        Assertions.a(reader, "assetHeight");
                        throw null;
                }
                num2 = num;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.HeroAsset value = (OfferDetailsPageFragment.HeroAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20850a);
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("assetUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.e, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f9949a).toJson(writer, customScalarAdapters, value.f);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$Icon;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Icon implements Adapter<OfferDetailsPageFragment.Icon> {

        /* renamed from: a, reason: collision with root package name */
        public static final Icon f20870a = new Icon();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferDetailsPageFragment.OnHostedIcon1 onHostedIcon1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIcon1A = OnHostedIcon1.a(reader, customScalarAdapters);
            }
            return new OfferDetailsPageFragment.Icon(str, onHostedIcon1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.Icon value = (OfferDetailsPageFragment.Icon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20851a);
            OfferDetailsPageFragment.OnHostedIcon1 onHostedIcon1 = value.b;
            if (onHostedIcon1 != null) {
                OnHostedIcon1.b(writer, customScalarAdapters, onHostedIcon1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$LeafAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$LeafAsset;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LeafAsset implements Adapter<OfferDetailsPageFragment.LeafAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final LeafAsset f20871a = new LeafAsset();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            OfferDetailsPageFragment.OnLocalAsset onLocalAssetA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            OfferDetailsPageFragment.OnHostedIcon onHostedIconA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("LocalAsset"))) {
                reader.o();
                onLocalAssetA = OnLocalAsset.a(reader, customScalarAdapters);
            } else {
                onLocalAssetA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIconA = OnHostedIcon.a(reader, customScalarAdapters);
            }
            return new OfferDetailsPageFragment.LeafAsset(str, onLocalAssetA, onHostedIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.LeafAsset value = (OfferDetailsPageFragment.LeafAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20852a);
            OfferDetailsPageFragment.OnLocalAsset onLocalAsset = value.b;
            if (onLocalAsset != null) {
                List list = OnLocalAsset.f20876a;
                writer.F1("iconName");
                LocalAssetIconName_ResponseAdapter.b(writer, customScalarAdapters, onLocalAsset.f20856a);
            }
            OfferDetailsPageFragment.OnHostedIcon onHostedIcon = value.c;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$OfferAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$OfferAnalytics;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferAnalytics implements Adapter<OfferDetailsPageFragment.OfferAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferAnalytics f20872a = new OfferAnalytics();
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
                        return new OfferDetailsPageFragment.OfferAnalytics(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.OfferAnalytics value = (OfferDetailsPageFragment.OfferAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerName");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20853a);
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
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$OfferDetailsPageFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferDetailsPageFragment implements Adapter<com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20873a = CollectionsKt.R("header", "content", "footer", "offerAnalytics");

        public static com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferDetailsPageFragment.Header header = null;
            ArrayList arrayListFromJson = null;
            OfferDetailsPageFragment.Footer footer = null;
            OfferDetailsPageFragment.OfferAnalytics offerAnalytics = null;
            while (true) {
                int iO2 = reader.o2(f20873a);
                if (iO2 == 0) {
                    header = (OfferDetailsPageFragment.Header) Adapters.c(Header.f20868a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Content.f20865a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    footer = (OfferDetailsPageFragment.Footer) Adapters.b(Adapters.c(Footer.f20867a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    offerAnalytics = (OfferDetailsPageFragment.OfferAnalytics) Adapters.c(OfferAnalytics.f20872a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (header == null) {
                Assertions.a(reader, "header");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (offerAnalytics != null) {
                return new com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment(header, arrayListFromJson, footer, offerAnalytics);
            }
            Assertions.a(reader, "offerAnalytics");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters.c(Header.f20868a, false).toJson(writer, customScalarAdapters, value.f20842a);
            writer.F1("content");
            Adapters.a(Adapters.c(Content.f20865a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("footer");
            Adapters.b(Adapters.c(Footer.f20867a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("offerAnalytics");
            Adapters.c(OfferAnalytics.f20872a, false).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$OnHostedIcon;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<OfferDetailsPageFragment.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20874a = CollectionsKt.Q("url");

        public static OfferDetailsPageFragment.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20874a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new OfferDetailsPageFragment.OnHostedIcon(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsPageFragment.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20854a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsPageFragment.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$OnHostedIcon1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$OnHostedIcon1;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon1 implements Adapter<OfferDetailsPageFragment.OnHostedIcon1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20875a = CollectionsKt.Q("url");

        public static OfferDetailsPageFragment.OnHostedIcon1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20875a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new OfferDetailsPageFragment.OnHostedIcon1(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsPageFragment.OnHostedIcon1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20855a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsPageFragment.OnHostedIcon1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$OnLocalAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$OnLocalAsset;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnLocalAsset implements Adapter<OfferDetailsPageFragment.OnLocalAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20876a = CollectionsKt.Q("iconName");

        public static OfferDetailsPageFragment.OnLocalAsset a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            LocalAssetIconName localAssetIconNameA = null;
            while (reader.o2(f20876a) == 0) {
                localAssetIconNameA = LocalAssetIconName_ResponseAdapter.a(reader, customScalarAdapters);
            }
            if (localAssetIconNameA != null) {
                return new OfferDetailsPageFragment.OnLocalAsset(localAssetIconNameA);
            }
            Assertions.a(reader, "iconName");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.OnLocalAsset value = (OfferDetailsPageFragment.OnLocalAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconName");
            LocalAssetIconName_ResponseAdapter.b(writer, customScalarAdapters, value.f20856a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$OnOfferDetailsCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$OnOfferDetailsCard;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOfferDetailsCard implements Adapter<OfferDetailsPageFragment.OnOfferDetailsCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20877a = CollectionsKt.Q("__typename");

        public static OfferDetailsPageFragment.OnOfferDetailsCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20877a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            OfferDetailsCardFragment offerDetailsCardFragmentA = OfferDetailsCardFragmentImpl_ResponseAdapter.OfferDetailsCardFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new OfferDetailsPageFragment.OnOfferDetailsCard(str, offerDetailsCardFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsPageFragment.OnOfferDetailsCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20857a);
            List list = OfferDetailsCardFragmentImpl_ResponseAdapter.OfferDetailsCardFragment.f20823a;
            OfferDetailsCardFragmentImpl_ResponseAdapter.OfferDetailsCardFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsPageFragment.OnOfferDetailsCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$OnOfferDetailsFooter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$OnOfferDetailsFooter;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOfferDetailsFooter implements Adapter<OfferDetailsPageFragment.OnOfferDetailsFooter> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20878a = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "cta", "statusBadge");

        public static OfferDetailsPageFragment.OnOfferDetailsFooter a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            OfferDetailsPageFragment.Cta cta = null;
            OfferDetailsPageFragment.StatusBadge1 statusBadge1 = null;
            while (true) {
                int iO2 = reader.o2(f20878a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    cta = (OfferDetailsPageFragment.Cta) Adapters.b(Adapters.c(Cta.f20866a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new OfferDetailsPageFragment.OnOfferDetailsFooter(str, cta, statusBadge1);
                    }
                    statusBadge1 = (OfferDetailsPageFragment.StatusBadge1) Adapters.b(Adapters.c(StatusBadge1.f20881a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsPageFragment.OnOfferDetailsFooter value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.i.toJson(writer, customScalarAdapters, value.f20858a);
            writer.F1("cta");
            Adapters.b(Adapters.c(Cta.f20866a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("statusBadge");
            Adapters.b(Adapters.c(StatusBadge1.f20881a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsPageFragment.OnOfferDetailsFooter) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$RoundelAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$RoundelAsset;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RoundelAsset implements Adapter<OfferDetailsPageFragment.RoundelAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final RoundelAsset f20879a = new RoundelAsset();
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
            IconAsset iconAssetA = IconAssetImpl_ResponseAdapter.IconAsset.a(reader, customScalarAdapters);
            if (str != null) {
                return new OfferDetailsPageFragment.RoundelAsset(str, iconAssetA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.RoundelAsset value = (OfferDetailsPageFragment.RoundelAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20859a);
            List list = IconAssetImpl_ResponseAdapter.IconAsset.f20890a;
            IconAssetImpl_ResponseAdapter.IconAsset.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$StatusBadge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$StatusBadge;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StatusBadge implements Adapter<OfferDetailsPageFragment.StatusBadge> {

        /* renamed from: a, reason: collision with root package name */
        public static final StatusBadge f20880a = new StatusBadge();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "status");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            RewardsOfferStatus rewardsOfferStatusA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    rewardsOfferStatusA = RewardsOfferStatus_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (rewardsOfferStatusA != null) {
                return new OfferDetailsPageFragment.StatusBadge(str, rewardsOfferStatusA);
            }
            Assertions.a(reader, "status");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.StatusBadge value = (OfferDetailsPageFragment.StatusBadge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20860a);
            writer.F1("status");
            RewardsOfferStatus_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragmentImpl_ResponseAdapter$StatusBadge1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$StatusBadge1;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StatusBadge1 implements Adapter<OfferDetailsPageFragment.StatusBadge1> {

        /* renamed from: a, reason: collision with root package name */
        public static final StatusBadge1 f20881a = new StatusBadge1();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "status");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            RewardsOfferStatus rewardsOfferStatusA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    rewardsOfferStatusA = RewardsOfferStatus_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (rewardsOfferStatusA != null) {
                return new OfferDetailsPageFragment.StatusBadge1(str, rewardsOfferStatusA);
            }
            Assertions.a(reader, "status");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageFragment.StatusBadge1 value = (OfferDetailsPageFragment.StatusBadge1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20861a);
            writer.F1("status");
            RewardsOfferStatus_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }
}
