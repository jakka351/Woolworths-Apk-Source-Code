package com.woolworths.rewards.offers.fragment.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import au.com.woolworths.rewards.graphql.type.PersonalisedOffersStatus;
import au.com.woolworths.rewards.graphql.type.ProductOffersSectionLayout;
import au.com.woolworths.rewards.graphql.type.adapter.DownloadableAssetFit_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.DownloadableAssetType_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.PersonalisedOffersStatus_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.ProductOffersSectionLayout_ResponseAdapter;
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
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.woolworths.rewards.offers.fragment.IconAsset;
import com.woolworths.rewards.offers.fragment.IconAssetImpl_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.RewardsOfferFields;
import com.woolworths.rewards.offers.fragment.RewardsOfferFieldsImpl_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFieldsImpl_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.fragment.OffersSectionsFragment;
import com.woolworths.rewards.offers.fragment.fragment.StandardBannerFieldsImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\bÇ\u0002\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter;", "", "OffersSectionsFragment", "OnStandardBanner", "OnMandyBanner", "OnNoOffersCard", "EmptyStateIconAsset", "OnHostedIcon", "OnStandardOffersSection", "Item", "OnProductOffersSection", "SectionCta", "Item1", "OnSpinSurpriseBanner", "BannerAsset", "OnPersonalisedOffersBanner", "OnOfferFeedInlineBanner", "InlineBannerLeadingIcon", "InlineBannerTrailingIcon", "OnRewardsCtaCard", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OffersSectionsFragmentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$BannerAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$BannerAsset;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerAsset implements Adapter<OffersSectionsFragment.BannerAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final BannerAsset f21016a = new BannerAsset();
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
                return new OffersSectionsFragment.BannerAsset(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OffersSectionsFragment.BannerAsset value = (OffersSectionsFragment.BannerAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f20999a);
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
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$EmptyStateIconAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$EmptyStateIconAsset;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EmptyStateIconAsset implements Adapter<OffersSectionsFragment.EmptyStateIconAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final EmptyStateIconAsset f21017a = new EmptyStateIconAsset();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OffersSectionsFragment.OnHostedIcon onHostedIconA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIconA = OnHostedIcon.a(reader, customScalarAdapters);
            }
            return new OffersSectionsFragment.EmptyStateIconAsset(str, onHostedIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OffersSectionsFragment.EmptyStateIconAsset value = (OffersSectionsFragment.EmptyStateIconAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21000a);
            OffersSectionsFragment.OnHostedIcon onHostedIcon = value.b;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$InlineBannerLeadingIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$InlineBannerLeadingIcon;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InlineBannerLeadingIcon implements Adapter<OffersSectionsFragment.InlineBannerLeadingIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final InlineBannerLeadingIcon f21018a = new InlineBannerLeadingIcon();
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
                return new OffersSectionsFragment.InlineBannerLeadingIcon(str, iconAssetA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OffersSectionsFragment.InlineBannerLeadingIcon value = (OffersSectionsFragment.InlineBannerLeadingIcon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21001a);
            List list = IconAssetImpl_ResponseAdapter.IconAsset.f20890a;
            IconAssetImpl_ResponseAdapter.IconAsset.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$InlineBannerTrailingIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$InlineBannerTrailingIcon;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InlineBannerTrailingIcon implements Adapter<OffersSectionsFragment.InlineBannerTrailingIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final InlineBannerTrailingIcon f21019a = new InlineBannerTrailingIcon();
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
                return new OffersSectionsFragment.InlineBannerTrailingIcon(str, iconAssetA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OffersSectionsFragment.InlineBannerTrailingIcon value = (OffersSectionsFragment.InlineBannerTrailingIcon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21002a);
            List list = IconAssetImpl_ResponseAdapter.IconAsset.f20890a;
            IconAssetImpl_ResponseAdapter.IconAsset.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$Item;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<OffersSectionsFragment.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f21020a = new Item();
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
            RewardsOfferFields rewardsOfferFieldsA = RewardsOfferFieldsImpl_ResponseAdapter.RewardsOfferFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new OffersSectionsFragment.Item(str, rewardsOfferFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OffersSectionsFragment.Item value = (OffersSectionsFragment.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21003a);
            List list = RewardsOfferFieldsImpl_ResponseAdapter.RewardsOfferFields.f20970a;
            RewardsOfferFieldsImpl_ResponseAdapter.RewardsOfferFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$Item1;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<OffersSectionsFragment.Item1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item1 f21021a = new Item1();
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
            RewardsOfferFields rewardsOfferFieldsA = RewardsOfferFieldsImpl_ResponseAdapter.RewardsOfferFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new OffersSectionsFragment.Item1(str, rewardsOfferFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OffersSectionsFragment.Item1 value = (OffersSectionsFragment.Item1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21004a);
            List list = RewardsOfferFieldsImpl_ResponseAdapter.RewardsOfferFields.f20970a;
            RewardsOfferFieldsImpl_ResponseAdapter.RewardsOfferFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$OffersSectionsFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OffersSectionsFragment implements Adapter<com.woolworths.rewards.offers.fragment.fragment.OffersSectionsFragment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21022a = CollectionsKt.Q("__typename");

        public static com.woolworths.rewards.offers.fragment.fragment.OffersSectionsFragment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            OffersSectionsFragment.OnStandardBanner onStandardBannerA;
            OffersSectionsFragment.OnMandyBanner onMandyBannerA;
            OffersSectionsFragment.OnNoOffersCard onNoOffersCardA;
            OffersSectionsFragment.OnStandardOffersSection onStandardOffersSectionA;
            OffersSectionsFragment.OnProductOffersSection onProductOffersSectionA;
            OffersSectionsFragment.OnSpinSurpriseBanner onSpinSurpriseBannerA;
            OffersSectionsFragment.OnPersonalisedOffersBanner onPersonalisedOffersBannerA;
            OffersSectionsFragment.OnOfferFeedInlineBanner onOfferFeedInlineBannerA;
            OffersSectionsFragment.OnRewardsCtaCard onRewardsCtaCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            String str = null;
            while (reader.o2(f21022a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("StandardBanner"))) {
                reader.o();
                onStandardBannerA = OnStandardBanner.a(reader, customScalarAdapters);
            } else {
                onStandardBannerA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("MandyBanner"), BooleanExpressions.d("isMandyBannerEnabled")))) {
                reader.o();
                onMandyBannerA = OnMandyBanner.a(reader, customScalarAdapters);
            } else {
                onMandyBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("NoOffersCard"))) {
                reader.o();
                onNoOffersCardA = OnNoOffersCard.a(reader, customScalarAdapters);
            } else {
                onNoOffersCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("StandardOffersSection"))) {
                reader.o();
                onStandardOffersSectionA = OnStandardOffersSection.a(reader, customScalarAdapters);
            } else {
                onStandardOffersSectionA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductOffersSection"))) {
                reader.o();
                onProductOffersSectionA = OnProductOffersSection.a(reader, customScalarAdapters);
            } else {
                onProductOffersSectionA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("SpinSurpriseBanner"), BooleanExpressions.d("isSpinSurpriseEnabled")))) {
                reader.o();
                onSpinSurpriseBannerA = OnSpinSurpriseBanner.a(reader, customScalarAdapters);
            } else {
                onSpinSurpriseBannerA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("PersonalisedOffersBanner"), BooleanExpressions.d("isPersonalisedOffersEnabled")))) {
                reader.o();
                onPersonalisedOffersBannerA = OnPersonalisedOffersBanner.a(reader, customScalarAdapters);
            } else {
                onPersonalisedOffersBannerA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("OfferFeedInlineBanner"), BooleanExpressions.d("isAutoBoostFeatureEnabled")))) {
                reader.o();
                onOfferFeedInlineBannerA = OnOfferFeedInlineBanner.a(reader, customScalarAdapters);
            } else {
                onOfferFeedInlineBannerA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("RewardsCtaCard"), BooleanExpressions.d("isAutoBoostFeatureEnabled")))) {
                reader.o();
                onRewardsCtaCardA = OnRewardsCtaCard.a(reader, customScalarAdapters);
            } else {
                onRewardsCtaCardA = null;
            }
            return new com.woolworths.rewards.offers.fragment.fragment.OffersSectionsFragment(str, onStandardBannerA, onMandyBannerA, onNoOffersCardA, onStandardOffersSectionA, onProductOffersSectionA, onSpinSurpriseBannerA, onPersonalisedOffersBannerA, onOfferFeedInlineBannerA, onRewardsCtaCardA);
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.rewards.offers.fragment.fragment.OffersSectionsFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20998a);
            OffersSectionsFragment.OnStandardBanner onStandardBanner = value.b;
            if (onStandardBanner != null) {
                OnStandardBanner.b(writer, customScalarAdapters, onStandardBanner);
            }
            OffersSectionsFragment.OnMandyBanner onMandyBanner = value.c;
            if (onMandyBanner != null) {
                OnMandyBanner.b(writer, customScalarAdapters, onMandyBanner);
            }
            OffersSectionsFragment.OnNoOffersCard onNoOffersCard = value.d;
            if (onNoOffersCard != null) {
                OnNoOffersCard.b(writer, customScalarAdapters, onNoOffersCard);
            }
            OffersSectionsFragment.OnStandardOffersSection onStandardOffersSection = value.e;
            if (onStandardOffersSection != null) {
                OnStandardOffersSection.b(writer, customScalarAdapters, onStandardOffersSection);
            }
            OffersSectionsFragment.OnProductOffersSection onProductOffersSection = value.f;
            if (onProductOffersSection != null) {
                OnProductOffersSection.b(writer, customScalarAdapters, onProductOffersSection);
            }
            OffersSectionsFragment.OnSpinSurpriseBanner onSpinSurpriseBanner = value.g;
            if (onSpinSurpriseBanner != null) {
                OnSpinSurpriseBanner.b(writer, customScalarAdapters, onSpinSurpriseBanner);
            }
            OffersSectionsFragment.OnPersonalisedOffersBanner onPersonalisedOffersBanner = value.h;
            if (onPersonalisedOffersBanner != null) {
                OnPersonalisedOffersBanner.b(writer, customScalarAdapters, onPersonalisedOffersBanner);
            }
            OffersSectionsFragment.OnOfferFeedInlineBanner onOfferFeedInlineBanner = value.i;
            if (onOfferFeedInlineBanner != null) {
                OnOfferFeedInlineBanner.b(writer, customScalarAdapters, onOfferFeedInlineBanner);
            }
            OffersSectionsFragment.OnRewardsCtaCard onRewardsCtaCard = value.j;
            if (onRewardsCtaCard != null) {
                OnRewardsCtaCard.b(writer, customScalarAdapters, onRewardsCtaCard);
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.rewards.offers.fragment.fragment.OffersSectionsFragment) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnHostedIcon;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<OffersSectionsFragment.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21023a = CollectionsKt.Q("url");

        public static OffersSectionsFragment.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21023a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new OffersSectionsFragment.OnHostedIcon(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OffersSectionsFragment.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21005a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OffersSectionsFragment.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$OnMandyBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnMandyBanner;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMandyBanner implements Adapter<OffersSectionsFragment.OnMandyBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21024a = CollectionsKt.R("id", "mandyBannerAction", "mandyImageUrl", "mandyBannerTitle", "mandyBannerDescription", "mandyBannerActionUrl");

        public static OffersSectionsFragment.OnMandyBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (true) {
                int iO2 = reader.o2(f21024a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "mandyBannerAction");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "mandyImageUrl");
                throw null;
            }
            if (str4 == null) {
                Assertions.a(reader, "mandyBannerTitle");
                throw null;
            }
            if (str5 == null) {
                Assertions.a(reader, "mandyBannerDescription");
                throw null;
            }
            if (str6 != null) {
                return new OffersSectionsFragment.OnMandyBanner(str, str2, str3, str4, str5, str6);
            }
            Assertions.a(reader, "mandyBannerActionUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OffersSectionsFragment.OnMandyBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21006a);
            writer.F1("mandyBannerAction");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("mandyImageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("mandyBannerTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("mandyBannerDescription");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("mandyBannerActionUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OffersSectionsFragment.OnMandyBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$OnNoOffersCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnNoOffersCard;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnNoOffersCard implements Adapter<OffersSectionsFragment.OnNoOffersCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21025a = CollectionsKt.R("emptyStateIconAsset", "emptyStateTitle", "emptyStateMessage");

        public static OffersSectionsFragment.OnNoOffersCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OffersSectionsFragment.EmptyStateIconAsset emptyStateIconAsset = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f21025a);
                if (iO2 == 0) {
                    emptyStateIconAsset = (OffersSectionsFragment.EmptyStateIconAsset) Adapters.b(Adapters.c(EmptyStateIconAsset.f21017a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new OffersSectionsFragment.OnNoOffersCard(emptyStateIconAsset, str, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OffersSectionsFragment.OnNoOffersCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("emptyStateIconAsset");
            Adapters.b(Adapters.c(EmptyStateIconAsset.f21017a, true)).toJson(writer, customScalarAdapters, value.f21007a);
            writer.F1("emptyStateTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("emptyStateMessage");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OffersSectionsFragment.OnNoOffersCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$OnOfferFeedInlineBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnOfferFeedInlineBanner;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOfferFeedInlineBanner implements Adapter<OffersSectionsFragment.OnOfferFeedInlineBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21026a = CollectionsKt.R("inlineBannerId", "inlineBannerLeadingIcon", "inlineBannerTrailingIcon", "inlineBannerTitle", "inlineBannerDescription", "inlineBannerActionUrl", "showIsNewLabel", "dismissible");

        public static OffersSectionsFragment.OnOfferFeedInlineBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            OffersSectionsFragment.InlineBannerLeadingIcon inlineBannerLeadingIcon = null;
            OffersSectionsFragment.InlineBannerTrailingIcon inlineBannerTrailingIcon = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (true) {
                switch (reader.o2(f21026a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        inlineBannerLeadingIcon = (OffersSectionsFragment.InlineBannerLeadingIcon) Adapters.b(Adapters.c(InlineBannerLeadingIcon.f21018a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        inlineBannerTrailingIcon = (OffersSectionsFragment.InlineBannerTrailingIcon) Adapters.b(Adapters.c(InlineBannerTrailingIcon.f21019a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool2 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "inlineBannerId");
                            throw null;
                        }
                        if (str4 != null) {
                            return new OffersSectionsFragment.OnOfferFeedInlineBanner(str, inlineBannerLeadingIcon, inlineBannerTrailingIcon, str2, str3, str4, bool, bool2);
                        }
                        Assertions.a(reader, "inlineBannerActionUrl");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OffersSectionsFragment.OnOfferFeedInlineBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("inlineBannerId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21008a);
            writer.F1("inlineBannerLeadingIcon");
            Adapters.b(Adapters.c(InlineBannerLeadingIcon.f21018a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("inlineBannerTrailingIcon");
            Adapters.b(Adapters.c(InlineBannerTrailingIcon.f21019a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("inlineBannerTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("inlineBannerDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("inlineBannerActionUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("showIsNewLabel");
            NullableAdapter nullableAdapter2 = Adapters.l;
            nullableAdapter2.toJson(writer, customScalarAdapters, value.g);
            writer.F1("dismissible");
            nullableAdapter2.toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OffersSectionsFragment.OnOfferFeedInlineBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$OnPersonalisedOffersBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnPersonalisedOffersBanner;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPersonalisedOffersBanner implements Adapter<OffersSectionsFragment.OnPersonalisedOffersBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21027a = CollectionsKt.R("bannerId", "imageUrl", "title", lqlqqlq.mmm006Dm006Dm, "status", "actionUrl");

        public static OffersSectionsFragment.OnPersonalisedOffersBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            PersonalisedOffersStatus personalisedOffersStatusA = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(f21027a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    personalisedOffersStatusA = PersonalisedOffersStatus_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "bannerId");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str4 == null) {
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (personalisedOffersStatusA == null) {
                Assertions.a(reader, "status");
                throw null;
            }
            if (str5 != null) {
                return new OffersSectionsFragment.OnPersonalisedOffersBanner(str, str2, str3, str4, personalisedOffersStatusA, str5);
            }
            Assertions.a(reader, "actionUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OffersSectionsFragment.OnPersonalisedOffersBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bannerId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21009a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("status");
            writer.v0(value.e.d);
            writer.F1("actionUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OffersSectionsFragment.OnPersonalisedOffersBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$OnProductOffersSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnProductOffersSection;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductOffersSection implements Adapter<OffersSectionsFragment.OnProductOffersSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21028a = CollectionsKt.R("sectionId", "sectionTitle", "sectionSubtitle", "endedOffersSectionSubtitle", "sectionCta", "items", "layout");

        public static OffersSectionsFragment.OnProductOffersSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            OffersSectionsFragment.SectionCta sectionCta = null;
            ArrayList arrayListFromJson = null;
            ProductOffersSectionLayout productOffersSectionLayoutA = null;
            while (true) {
                switch (reader.o2(f21028a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
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
                        sectionCta = (OffersSectionsFragment.SectionCta) Adapters.b(Adapters.c(SectionCta.f21033a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        arrayListFromJson = Adapters.a(Adapters.c(Item1.f21021a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        productOffersSectionLayoutA = ProductOffersSectionLayout_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "sectionId");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "items");
                            throw null;
                        }
                        if (productOffersSectionLayoutA != null) {
                            return new OffersSectionsFragment.OnProductOffersSection(str, str2, str3, str4, sectionCta, arrayListFromJson, productOffersSectionLayoutA);
                        }
                        Assertions.a(reader, "layout");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OffersSectionsFragment.OnProductOffersSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sectionId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21010a);
            writer.F1("sectionTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("sectionSubtitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("endedOffersSectionSubtitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("sectionCta");
            Adapters.b(Adapters.c(SectionCta.f21033a, true)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.f21021a, true)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("layout");
            writer.v0(value.g.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OffersSectionsFragment.OnProductOffersSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$OnRewardsCtaCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnRewardsCtaCard;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRewardsCtaCard implements Adapter<OffersSectionsFragment.OnRewardsCtaCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21029a = CollectionsKt.R("id", "title", "actionUrl");

        public static OffersSectionsFragment.OnRewardsCtaCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f21029a);
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
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new OffersSectionsFragment.OnRewardsCtaCard(str, str2, str3);
            }
            Assertions.a(reader, "actionUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OffersSectionsFragment.OnRewardsCtaCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21011a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("actionUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OffersSectionsFragment.OnRewardsCtaCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$OnSpinSurpriseBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnSpinSurpriseBanner;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSpinSurpriseBanner implements Adapter<OffersSectionsFragment.OnSpinSurpriseBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21030a = CollectionsKt.R("bannerId", "bannerAsset", "bannerActionUrl");

        public static OffersSectionsFragment.OnSpinSurpriseBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            OffersSectionsFragment.BannerAsset bannerAsset = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f21030a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bannerAsset = (OffersSectionsFragment.BannerAsset) Adapters.c(BannerAsset.f21016a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "bannerId");
                throw null;
            }
            if (bannerAsset != null) {
                return new OffersSectionsFragment.OnSpinSurpriseBanner(str, bannerAsset, str2);
            }
            Assertions.a(reader, "bannerAsset");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OffersSectionsFragment.OnSpinSurpriseBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bannerId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21012a);
            writer.F1("bannerAsset");
            Adapters.c(BannerAsset.f21016a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerActionUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OffersSectionsFragment.OnSpinSurpriseBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$OnStandardBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnStandardBanner;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnStandardBanner implements Adapter<OffersSectionsFragment.OnStandardBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21031a = CollectionsKt.Q("__typename");

        public static OffersSectionsFragment.OnStandardBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21031a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            StandardBannerFields standardBannerFieldsA = StandardBannerFieldsImpl_ResponseAdapter.StandardBannerFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new OffersSectionsFragment.OnStandardBanner(str, standardBannerFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OffersSectionsFragment.OnStandardBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21013a);
            List list = StandardBannerFieldsImpl_ResponseAdapter.StandardBannerFields.f21035a;
            StandardBannerFieldsImpl_ResponseAdapter.StandardBannerFields.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OffersSectionsFragment.OnStandardBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$OnStandardOffersSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnStandardOffersSection;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnStandardOffersSection implements Adapter<OffersSectionsFragment.OnStandardOffersSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21032a = CollectionsKt.R("sectionId", "sectionTitle", "items");

        public static OffersSectionsFragment.OnStandardOffersSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f21032a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f21020a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "sectionId");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new OffersSectionsFragment.OnStandardOffersSection(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OffersSectionsFragment.OnStandardOffersSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sectionId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21014a);
            writer.F1("sectionTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f21020a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OffersSectionsFragment.OnStandardOffersSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragmentImpl_ResponseAdapter$SectionCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$SectionCta;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SectionCta implements Adapter<OffersSectionsFragment.SectionCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final SectionCta f21033a = new SectionCta();
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
                return new OffersSectionsFragment.SectionCta(str, contentCtaFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OffersSectionsFragment.SectionCta value = (OffersSectionsFragment.SectionCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21015a);
            List list = ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.f20976a;
            ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.b(writer, customScalarAdapters, value.b);
        }
    }
}
