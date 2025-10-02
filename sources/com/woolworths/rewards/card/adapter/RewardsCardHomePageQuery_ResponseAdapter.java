package com.woolworths.rewards.card.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import au.com.woolworths.rewards.graphql.type.RewardsRedemptionSettingIcon;
import au.com.woolworths.rewards.graphql.type.WalletAction;
import au.com.woolworths.rewards.graphql.type.adapter.DownloadableAssetFit_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.DownloadableAssetType_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.RewardsRedemptionSettingIcon_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.WalletAction_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.rewards.card.RewardsCardHomePageQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter;", "", "Data", "RewardsHomePage", "Balance", "RedemptionSettings", "RedemptionUnlock", "UnlockConfirmation", "HeaderImage", "Button", "CallToAction", "FuelVouchers", "WalletHomePage", "Coachmark", "BannerImage", "PrimaryCTA", "InflightPaymentData", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsCardHomePageQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$Balance;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$Balance;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Balance implements Adapter<RewardsCardHomePageQuery.Balance> {

        /* renamed from: a, reason: collision with root package name */
        public static final Balance f20674a = new Balance();
        public static final List b = CollectionsKt.R("redemptionSettings", "fuelVouchers", "displayName");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RewardsCardHomePageQuery.RedemptionSettings redemptionSettings = null;
            RewardsCardHomePageQuery.FuelVouchers fuelVouchers = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    redemptionSettings = (RewardsCardHomePageQuery.RedemptionSettings) Adapters.c(RedemptionSettings.f20684a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    fuelVouchers = (RewardsCardHomePageQuery.FuelVouchers) Adapters.c(FuelVouchers.f20680a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (redemptionSettings == null) {
                Assertions.a(reader, "redemptionSettings");
                throw null;
            }
            if (fuelVouchers != null) {
                return new RewardsCardHomePageQuery.Balance(redemptionSettings, fuelVouchers, str);
            }
            Assertions.a(reader, "fuelVouchers");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.Balance value = (RewardsCardHomePageQuery.Balance) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("redemptionSettings");
            Adapters.c(RedemptionSettings.f20684a, false).toJson(writer, customScalarAdapters, value.f20652a);
            writer.F1("fuelVouchers");
            Adapters.c(FuelVouchers.f20680a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("displayName");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$BannerImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$BannerImage;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerImage implements Adapter<RewardsCardHomePageQuery.BannerImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final BannerImage f20675a = new BannerImage();
        public static final List b = CollectionsKt.R("assetType", "assetUrl", "assetWidth", "assetHeight", "fit", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            DownloadableAssetType downloadableAssetTypeA = null;
            String str = null;
            Integer num3 = null;
            DownloadableAssetFit downloadableAssetFit = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 != 0) {
                    if (iO2 == 1) {
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 2) {
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 3) {
                        num = num2;
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 4) {
                        num = num2;
                        downloadableAssetFit = (DownloadableAssetFit) Adapters.b(DownloadableAssetFit_ResponseAdapter.f9949a).fromJson(reader, customScalarAdapters);
                    } else {
                        if (iO2 != 5) {
                            break;
                        }
                        num = num2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                    }
                    num2 = num;
                } else {
                    downloadableAssetTypeA = DownloadableAssetType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            Integer num4 = num2;
            if (downloadableAssetTypeA == null) {
                Assertions.a(reader, "assetType");
                throw null;
            }
            if (str == null) {
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
                return new RewardsCardHomePageQuery.BannerImage(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit, str2);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.BannerImage value = (RewardsCardHomePageQuery.BannerImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f20653a);
            writer.F1("assetUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f9949a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$Button;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<RewardsCardHomePageQuery.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f20676a = new Button();
        public static final List b = CollectionsKt.R("loadingStateLabel", "sliderLabel", AnnotatedPrivateKey.LABEL, "iconUrl");

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
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str3 != null) {
                return new RewardsCardHomePageQuery.Button(str, str2, str3, str4);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.Button value = (RewardsCardHomePageQuery.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("loadingStateLabel");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20654a);
            writer.F1("sliderLabel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$CallToAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$CallToAction;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CallToAction implements Adapter<RewardsCardHomePageQuery.CallToAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final CallToAction f20677a = new CallToAction();
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
                return new RewardsCardHomePageQuery.CallToAction(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.CallToAction value = (RewardsCardHomePageQuery.CallToAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20655a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$Coachmark;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$Coachmark;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Coachmark implements Adapter<RewardsCardHomePageQuery.Coachmark> {

        /* renamed from: a, reason: collision with root package name */
        public static final Coachmark f20678a = new Coachmark();
        public static final List b = CollectionsKt.R("id", "bannerImage", "contentTitle", "contentBody", "primaryCTA");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            RewardsCardHomePageQuery.BannerImage bannerImage = null;
            String str2 = null;
            String str3 = null;
            RewardsCardHomePageQuery.PrimaryCTA primaryCTA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bannerImage = (RewardsCardHomePageQuery.BannerImage) Adapters.b(Adapters.c(BannerImage.f20675a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    primaryCTA = (RewardsCardHomePageQuery.PrimaryCTA) Adapters.b(Adapters.c(PrimaryCTA.f20683a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new RewardsCardHomePageQuery.Coachmark(str, bannerImage, str2, str3, primaryCTA);
            }
            Assertions.a(reader, "id");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.Coachmark value = (RewardsCardHomePageQuery.Coachmark) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20656a);
            writer.F1("bannerImage");
            Adapters.b(Adapters.c(BannerImage.f20675a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("contentTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("contentBody");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("primaryCTA");
            Adapters.b(Adapters.c(PrimaryCTA.f20683a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$Data;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<RewardsCardHomePageQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20679a = new Data();
        public static final List b = CollectionsKt.R("rewardsHomePage", "walletHomePage", "showCustomerValuePropositions");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RewardsCardHomePageQuery.RewardsHomePage rewardsHomePage = null;
            RewardsCardHomePageQuery.WalletHomePage walletHomePage = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    rewardsHomePage = (RewardsCardHomePageQuery.RewardsHomePage) Adapters.b(Adapters.c(RewardsHomePage.f20686a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    walletHomePage = (RewardsCardHomePageQuery.WalletHomePage) Adapters.c(WalletHomePage.f20688a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (walletHomePage != null) {
                return new RewardsCardHomePageQuery.Data(rewardsHomePage, walletHomePage, bool);
            }
            Assertions.a(reader, "walletHomePage");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.Data value = (RewardsCardHomePageQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsHomePage");
            Adapters.b(Adapters.c(RewardsHomePage.f20686a, false)).toJson(writer, customScalarAdapters, value.f20657a);
            writer.F1("walletHomePage");
            Adapters.c(WalletHomePage.f20688a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("showCustomerValuePropositions");
            Adapters.l.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$FuelVouchers;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$FuelVouchers;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FuelVouchers implements Adapter<RewardsCardHomePageQuery.FuelVouchers> {

        /* renamed from: a, reason: collision with root package name */
        public static final FuelVouchers f20680a = new FuelVouchers();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "numberOfVouchers");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Integer num = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (num != null) {
                return new RewardsCardHomePageQuery.FuelVouchers(str, num.intValue());
            }
            Assertions.a(reader, "numberOfVouchers");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.FuelVouchers value = (RewardsCardHomePageQuery.FuelVouchers) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20658a);
            writer.F1("numberOfVouchers");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.b));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$HeaderImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$HeaderImage;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeaderImage implements Adapter<RewardsCardHomePageQuery.HeaderImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeaderImage f20681a = new HeaderImage();
        public static final List b = CollectionsKt.R("assetType", "assetUrl", "assetWidth", "assetHeight", "fit");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            DownloadableAssetType downloadableAssetTypeA = null;
            String str = null;
            Integer num3 = null;
            DownloadableAssetFit downloadableAssetFit = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 != 0) {
                    if (iO2 == 1) {
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 2) {
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 3) {
                        num = num2;
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                    } else {
                        if (iO2 != 4) {
                            break;
                        }
                        num = num2;
                        downloadableAssetFit = (DownloadableAssetFit) Adapters.b(DownloadableAssetFit_ResponseAdapter.f9949a).fromJson(reader, customScalarAdapters);
                    }
                    num2 = num;
                } else {
                    downloadableAssetTypeA = DownloadableAssetType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            Integer num4 = num2;
            if (downloadableAssetTypeA == null) {
                Assertions.a(reader, "assetType");
                throw null;
            }
            if (str == null) {
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
                return new RewardsCardHomePageQuery.HeaderImage(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.HeaderImage value = (RewardsCardHomePageQuery.HeaderImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f20659a);
            writer.F1("assetUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f9949a).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$InflightPaymentData;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$InflightPaymentData;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InflightPaymentData implements Adapter<RewardsCardHomePageQuery.InflightPaymentData> {

        /* renamed from: a, reason: collision with root package name */
        public static final InflightPaymentData f20682a = new InflightPaymentData();
        public static final List b = CollectionsKt.R("iconUrl", "bannerMessage", "snackbarMessage");

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
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "bannerMessage");
                throw null;
            }
            if (str3 != null) {
                return new RewardsCardHomePageQuery.InflightPaymentData(str, str2, str3);
            }
            Assertions.a(reader, "snackbarMessage");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.InflightPaymentData value = (RewardsCardHomePageQuery.InflightPaymentData) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20660a);
            writer.F1("bannerMessage");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("snackbarMessage");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$PrimaryCTA;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$PrimaryCTA;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCTA implements Adapter<RewardsCardHomePageQuery.PrimaryCTA> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCTA f20683a = new PrimaryCTA();
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
                return new RewardsCardHomePageQuery.PrimaryCTA(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.PrimaryCTA value = (RewardsCardHomePageQuery.PrimaryCTA) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20661a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$RedemptionSettings;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$RedemptionSettings;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RedemptionSettings implements Adapter<RewardsCardHomePageQuery.RedemptionSettings> {

        /* renamed from: a, reason: collision with root package name */
        public static final RedemptionSettings f20684a = new RedemptionSettings();
        public static final List b = CollectionsKt.R("redemptionIcon", AnnotatedPrivateKey.LABEL, "value", "altText", "redemptionUnlock");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RewardsRedemptionSettingIcon rewardsRedemptionSettingIconA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            RewardsCardHomePageQuery.RedemptionUnlock redemptionUnlock = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    rewardsRedemptionSettingIconA = RewardsRedemptionSettingIcon_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    redemptionUnlock = (RewardsCardHomePageQuery.RedemptionUnlock) Adapters.b(Adapters.c(RedemptionUnlock.f20685a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (rewardsRedemptionSettingIconA == null) {
                Assertions.a(reader, "redemptionIcon");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 != null) {
                return new RewardsCardHomePageQuery.RedemptionSettings(rewardsRedemptionSettingIconA, str, str2, str3, redemptionUnlock);
            }
            Assertions.a(reader, "value");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.RedemptionSettings value = (RewardsCardHomePageQuery.RedemptionSettings) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("redemptionIcon");
            RewardsRedemptionSettingIcon_ResponseAdapter.b(writer, customScalarAdapters, value.f20662a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("redemptionUnlock");
            Adapters.b(Adapters.c(RedemptionUnlock.f20685a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$RedemptionUnlock;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$RedemptionUnlock;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RedemptionUnlock implements Adapter<RewardsCardHomePageQuery.RedemptionUnlock> {

        /* renamed from: a, reason: collision with root package name */
        public static final RedemptionUnlock f20685a = new RedemptionUnlock();
        public static final List b = CollectionsKt.R("coachMarkText", "iconUrl", "unlockConfirmation");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            RewardsCardHomePageQuery.UnlockConfirmation unlockConfirmation = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new RewardsCardHomePageQuery.RedemptionUnlock(str, str2, unlockConfirmation);
                    }
                    unlockConfirmation = (RewardsCardHomePageQuery.UnlockConfirmation) Adapters.b(Adapters.c(UnlockConfirmation.f20687a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.RedemptionUnlock value = (RewardsCardHomePageQuery.RedemptionUnlock) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coachMarkText");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20663a);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("unlockConfirmation");
            Adapters.b(Adapters.c(UnlockConfirmation.f20687a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$RewardsHomePage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$RewardsHomePage;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsHomePage implements Adapter<RewardsCardHomePageQuery.RewardsHomePage> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsHomePage f20686a = new RewardsHomePage();
        public static final List b = CollectionsKt.Q("balance");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RewardsCardHomePageQuery.Balance balance = null;
            while (reader.o2(b) == 0) {
                balance = (RewardsCardHomePageQuery.Balance) Adapters.c(Balance.f20674a, false).fromJson(reader, customScalarAdapters);
            }
            if (balance != null) {
                return new RewardsCardHomePageQuery.RewardsHomePage(balance);
            }
            Assertions.a(reader, "balance");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.RewardsHomePage value = (RewardsCardHomePageQuery.RewardsHomePage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("balance");
            Adapters.c(Balance.f20674a, false).toJson(writer, customScalarAdapters, value.f20664a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$UnlockConfirmation;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$UnlockConfirmation;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnlockConfirmation implements Adapter<RewardsCardHomePageQuery.UnlockConfirmation> {

        /* renamed from: a, reason: collision with root package name */
        public static final UnlockConfirmation f20687a = new UnlockConfirmation();
        public static final List b = CollectionsKt.R("iconUrl", "headerImage", "title", "showAnimation", "content", "button", "analyticsLabel", "callToAction", "showUnlock");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            RewardsCardHomePageQuery.HeaderImage headerImage = null;
            String str2 = null;
            String str3 = null;
            RewardsCardHomePageQuery.Button button = null;
            String str4 = null;
            RewardsCardHomePageQuery.CallToAction callToAction = null;
            Boolean bool3 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        headerImage = (RewardsCardHomePageQuery.HeaderImage) Adapters.c(HeaderImage.f20681a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        button = (RewardsCardHomePageQuery.Button) Adapters.c(Button.f20676a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        callToAction = (RewardsCardHomePageQuery.CallToAction) Adapters.b(Adapters.c(CallToAction.f20677a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool = bool2;
                        bool3 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool4 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "iconUrl");
                            throw null;
                        }
                        if (headerImage == null) {
                            Assertions.a(reader, "headerImage");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (bool4 == null) {
                            Assertions.a(reader, "showAnimation");
                            throw null;
                        }
                        boolean zBooleanValue = bool4.booleanValue();
                        if (str3 == null) {
                            Assertions.a(reader, "content");
                            throw null;
                        }
                        if (button == null) {
                            Assertions.a(reader, "button");
                            throw null;
                        }
                        if (str4 != null) {
                            return new RewardsCardHomePageQuery.UnlockConfirmation(str, headerImage, str2, zBooleanValue, str3, button, str4, callToAction, bool3);
                        }
                        Assertions.a(reader, "analyticsLabel");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.UnlockConfirmation value = (RewardsCardHomePageQuery.UnlockConfirmation) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20665a);
            writer.F1("headerImage");
            Adapters.c(HeaderImage.f20681a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("showAnimation");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, "content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("button");
            Adapters.c(Button.f20676a, false).toJson(writer, customScalarAdapters, value.f);
            writer.F1("analyticsLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("callToAction");
            Adapters.b(Adapters.c(CallToAction.f20677a, false)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("showUnlock");
            Adapters.l.toJson(writer, customScalarAdapters, value.i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RewardsCardHomePageQuery_ResponseAdapter$WalletHomePage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$WalletHomePage;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WalletHomePage implements Adapter<RewardsCardHomePageQuery.WalletHomePage> {

        /* renamed from: a, reason: collision with root package name */
        public static final WalletHomePage f20688a = new WalletHomePage();
        public static final List b = CollectionsKt.R("title", "content", UrlHandler.ACTION, "showWalletBadge", "showCardTabBadge", "tooltip", "coachmark", "inflightPaymentData");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            WalletAction walletActionA = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str3 = null;
            RewardsCardHomePageQuery.Coachmark coachmark = null;
            RewardsCardHomePageQuery.InflightPaymentData inflightPaymentData = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        walletActionA = WalletAction_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool2 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        coachmark = (RewardsCardHomePageQuery.Coachmark) Adapters.b(Adapters.c(Coachmark.f20678a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        inflightPaymentData = (RewardsCardHomePageQuery.InflightPaymentData) Adapters.b(Adapters.c(InflightPaymentData.f20682a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (walletActionA != null) {
                            return new RewardsCardHomePageQuery.WalletHomePage(str, str2, walletActionA, bool, bool2, str3, coachmark, inflightPaymentData);
                        }
                        Assertions.a(reader, UrlHandler.ACTION);
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsCardHomePageQuery.WalletHomePage value = (RewardsCardHomePageQuery.WalletHomePage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20666a);
            writer.F1("content");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            writer.v0(value.c.d);
            writer.F1("showWalletBadge");
            NullableAdapter nullableAdapter2 = Adapters.l;
            nullableAdapter2.toJson(writer, customScalarAdapters, value.d);
            writer.F1("showCardTabBadge");
            nullableAdapter2.toJson(writer, customScalarAdapters, value.e);
            writer.F1("tooltip");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("coachmark");
            Adapters.b(Adapters.c(Coachmark.f20678a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("inflightPaymentData");
            Adapters.b(Adapters.c(InflightPaymentData.f20682a, false)).toJson(writer, customScalarAdapters, value.h);
        }
    }
}
