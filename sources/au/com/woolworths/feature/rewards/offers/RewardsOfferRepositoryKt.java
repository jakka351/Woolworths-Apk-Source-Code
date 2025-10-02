package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetFit;
import au.com.woolworths.android.onesite.data.DownloadableAssetType;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.feature.rewards.offers.data.MandyBanner;
import au.com.woolworths.feature.rewards.offers.data.NoOffersCard;
import au.com.woolworths.feature.rewards.offers.data.OfferFeedInlineBanner;
import au.com.woolworths.feature.rewards.offers.data.OfferSectionLayout;
import au.com.woolworths.feature.rewards.offers.data.OffersSections;
import au.com.woolworths.feature.rewards.offers.data.PersonalisedOffersBanner;
import au.com.woolworths.feature.rewards.offers.data.PersonalisedOffersStatus;
import au.com.woolworths.feature.rewards.offers.data.ProductOffersSection;
import au.com.woolworths.feature.rewards.offers.data.RewardsCtaCard;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferListPage;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferListPageFooter;
import au.com.woolworths.feature.rewards.offers.data.SpinSurpriseBanner;
import au.com.woolworths.feature.rewards.offers.data.StandardBannerWrapper;
import au.com.woolworths.feature.rewards.offers.data.StandardOffersSection;
import au.com.woolworths.foundation.rewards.model.RewardsEmptyState;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationAnimationData;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationMessage;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsCta;
import au.com.woolworths.foundation.rewards.offers.model.OfferDisplayAnimationData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferMechanics;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferScreenData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferUnknown;
import au.com.woolworths.foundation.rewards.offers.model.StandardBanner;
import au.com.woolworths.rewards.base.data.IconAsset;
import com.woolworths.rewards.offers.OfferDetailsQuery;
import com.woolworths.rewards.offers.OfferDetailsScreenQuery;
import com.woolworths.rewards.offers.OfferListPageQuery;
import com.woolworths.rewards.offers.fragment.IconAssetExtensionKt;
import com.woolworths.rewards.offers.fragment.RewardsOfferFields;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields;
import com.woolworths.rewards.offers.fragment.fragment.OfferDetailsFragment;
import com.woolworths.rewards.offers.fragment.fragment.OffersSectionsFragment;
import com.woolworths.rewards.offers.fragment.fragment.StandardBannerFields;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsOfferRepositoryKt {
    public static final RewardsOfferData a(OfferDetailsQuery.RewardsOffer rewardsOffer) {
        String str;
        String str2;
        OfferActivationMessage offerActivationMessage;
        OfferDetailsFragment.OfferDetailsCta offerDetailsCta;
        Intrinsics.h(rewardsOffer, "<this>");
        OfferDetailsFragment offerDetailsFragment = rewardsOffer.b;
        String str3 = offerDetailsFragment.b;
        String str4 = offerDetailsFragment.c;
        String str5 = offerDetailsFragment.d;
        String str6 = offerDetailsFragment.e;
        String str7 = offerDetailsFragment.f;
        String str8 = offerDetailsFragment.g;
        String str9 = offerDetailsFragment.h;
        String str10 = offerDetailsFragment.i;
        String str11 = offerDetailsFragment.j;
        String str12 = offerDetailsFragment.l;
        RewardsOfferStatus rewardsOfferStatusA = RewardsOfferStatusExtKt.a(offerDetailsFragment.m);
        String str13 = offerDetailsFragment.k;
        OfferDetailsFragment.Mechanics mechanics = offerDetailsFragment.o;
        OfferDetailsCta offerDetailsCtaA = null;
        RewardsOfferMechanics rewardsOfferMechanicsA = mechanics != null ? OfferDetailsFragmentMechanicsExtKt.a(mechanics) : null;
        ArrayList arrayList = offerDetailsFragment.p;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(OfferDetailsFragmentStatusIconExtKt.a((OfferDetailsFragment.StatusIcon) it.next()));
        }
        OfferDetailsFragment.OfferAnalytics offerAnalytics = offerDetailsFragment.q;
        RewardsOfferAnalyticsData rewardsOfferAnalyticsDataA = offerAnalytics != null ? OfferDetailsFragmentOfferAnalyticsExtKt.a(offerAnalytics) : null;
        OfferActivationAnimationData offerActivationAnimationData = Intrinsics.c(offerDetailsFragment.r, "CONFETTI") ? OfferActivationAnimationData.CONFETTI : OfferActivationAnimationData.d;
        OfferDetailsFragment.ActivationMessage activationMessage = offerDetailsFragment.t;
        if (activationMessage != null) {
            str = str4;
            str2 = str5;
            offerActivationMessage = new OfferActivationMessage(activationMessage.f20979a, activationMessage.b, activationMessage.c);
        } else {
            str = str4;
            str2 = str5;
            offerActivationMessage = null;
        }
        RewardsOfferData rewardsOfferData = new RewardsOfferData(str3, str, str2, str6, str7, str8, str9, str10, str11, str12, rewardsOfferStatusA, str13, rewardsOfferMechanicsA, arrayList2, rewardsOfferAnalyticsDataA, offerActivationAnimationData, offerActivationMessage, Intrinsics.c(offerDetailsFragment.s, "BOX_WITH_SPARKLES_CONFETTI_AND_BOW_ON_TOP") ? OfferDisplayAnimationData.BOX_WITH_SPARKLES_CONFETTI_AND_BOW_ON_TOP : OfferDisplayAnimationData.d, offerDetailsFragment.n);
        OfferDetailsFragment.OnRewardsOffer onRewardsOffer = offerDetailsFragment.u;
        String str14 = onRewardsOffer != null ? onRewardsOffer.f20985a : null;
        if (onRewardsOffer != null && (offerDetailsCta = onRewardsOffer.b) != null) {
            offerDetailsCtaA = OfferDetailsFragmentOfferDetailsCtaExtKt.a(offerDetailsCta);
        }
        return RewardsOfferData.a(rewardsOfferData, null, null, null, null, offerDetailsCtaA, null, null, str14, null, 1002438655);
    }

    public static final RewardsOfferListPage b(OfferListPageQuery.RewardsOffersListPage rewardsOffersListPage) {
        OfferListPageQuery.OnRewardsOffersSection onRewardsOffersSection = rewardsOffersListPage.b;
        RewardsOfferListPageFooter rewardsOfferListPageFooter = null;
        if (onRewardsOffersSection == null) {
            OfferListPageQuery.OnRewardsEmptyPage onRewardsEmptyPage = rewardsOffersListPage.c;
            if (onRewardsEmptyPage == null) {
                return null;
            }
            String str = onRewardsEmptyPage.f20731a;
            OfferListPageQuery.State state = onRewardsEmptyPage.b;
            return new RewardsOfferListPage.Empty(str, new RewardsEmptyState(state.f20735a, state.c, state.b));
        }
        String str2 = onRewardsOffersSection.f20732a;
        ArrayList<OfferListPageQuery.Section> arrayList = onRewardsOffersSection.b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (OfferListPageQuery.Section section : arrayList) {
            Intrinsics.h(section, "<this>");
            arrayList2.add(d(section.b));
        }
        OfferListPageQuery.Footer footer = onRewardsOffersSection.c;
        if (footer != null) {
            String str3 = footer.b;
            OfferListPageQuery.Cta cta = footer.f20730a;
            rewardsOfferListPageFooter = new RewardsOfferListPageFooter(str3, new ContentCta(cta.b, cta.c, (String) null, cta.f20728a, (AnalyticsData) null, 20, (DefaultConstructorMarker) null));
        }
        return new RewardsOfferListPage.OfferList(str2, arrayList2, rewardsOfferListPageFooter);
    }

    public static final RewardsOfferScreenData c(OfferDetailsScreenQuery.RewardsOfferDetails rewardsOfferDetails) {
        ArrayList arrayList;
        String str;
        OfferActivationMessage offerActivationMessage;
        StandardBanner standardBanner;
        OfferDetailsFragment.StandardBanner standardBanner2;
        OfferDetailsFragment.OfferDetailsCta offerDetailsCta;
        OfferDetailsScreenQuery.OnRewardsOfferUnknown onRewardsOfferUnknown = rewardsOfferDetails.c;
        OfferDetailsScreenQuery.OnRewardsOffer onRewardsOffer = rewardsOfferDetails.b;
        if (onRewardsOfferUnknown != null) {
            String str2 = onRewardsOfferUnknown.f20716a;
            String str3 = onRewardsOfferUnknown.b;
            OfferDetailsScreenQuery.Cta cta = onRewardsOfferUnknown.c;
            return new RewardsOfferUnknown(str2, str3, cta != null ? new ContentCta(cta.f20713a, cta.b, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null) : null);
        }
        if (onRewardsOffer == null) {
            return null;
        }
        OfferDetailsFragment offerDetailsFragment = onRewardsOffer.b;
        OfferDetailsFragment.OnRewardsOffer onRewardsOffer2 = offerDetailsFragment.u;
        String str4 = offerDetailsFragment.b;
        String str5 = offerDetailsFragment.c;
        String str6 = offerDetailsFragment.d;
        String str7 = offerDetailsFragment.e;
        String str8 = offerDetailsFragment.f;
        String str9 = offerDetailsFragment.g;
        String str10 = offerDetailsFragment.h;
        String str11 = offerDetailsFragment.i;
        String str12 = offerDetailsFragment.j;
        String str13 = offerDetailsFragment.l;
        RewardsOfferStatus rewardsOfferStatusA = RewardsOfferStatusExtKt.a(offerDetailsFragment.m);
        String str14 = offerDetailsFragment.k;
        OfferDetailsFragment.Mechanics mechanics = offerDetailsFragment.o;
        RewardsOfferMechanics rewardsOfferMechanicsA = mechanics != null ? OfferDetailsFragmentMechanicsExtKt.a(mechanics) : null;
        ArrayList arrayList2 = offerDetailsFragment.p;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(OfferDetailsFragmentStatusIconExtKt.a((OfferDetailsFragment.StatusIcon) it.next()));
        }
        OfferDetailsFragment.OfferAnalytics offerAnalytics = offerDetailsFragment.q;
        RewardsOfferAnalyticsData rewardsOfferAnalyticsDataA = offerAnalytics != null ? OfferDetailsFragmentOfferAnalyticsExtKt.a(offerAnalytics) : null;
        OfferActivationAnimationData offerActivationAnimationData = Intrinsics.c(offerDetailsFragment.r, "CONFETTI") ? OfferActivationAnimationData.CONFETTI : OfferActivationAnimationData.d;
        OfferDetailsFragment.ActivationMessage activationMessage = offerDetailsFragment.t;
        if (activationMessage != null) {
            arrayList = arrayList3;
            str = str5;
            offerActivationMessage = new OfferActivationMessage(activationMessage.f20979a, activationMessage.b, activationMessage.c);
        } else {
            arrayList = arrayList3;
            str = str5;
            offerActivationMessage = null;
        }
        RewardsOfferData rewardsOfferData = new RewardsOfferData(str4, str, str6, str7, str8, str9, str10, str11, str12, str13, rewardsOfferStatusA, str14, rewardsOfferMechanicsA, arrayList, rewardsOfferAnalyticsDataA, offerActivationAnimationData, offerActivationMessage, Intrinsics.c(offerDetailsFragment.s, "BOX_WITH_SPARKLES_CONFETTI_AND_BOW_ON_TOP") ? OfferDisplayAnimationData.BOX_WITH_SPARKLES_CONFETTI_AND_BOW_ON_TOP : OfferDisplayAnimationData.d, offerDetailsFragment.n);
        String str15 = onRewardsOffer2 != null ? onRewardsOffer2.f20985a : null;
        OfferDetailsCta offerDetailsCtaA = (onRewardsOffer2 == null || (offerDetailsCta = onRewardsOffer2.b) == null) ? null : OfferDetailsFragmentOfferDetailsCtaExtKt.a(offerDetailsCta);
        if (onRewardsOffer2 == null || (standardBanner2 = onRewardsOffer2.c) == null) {
            standardBanner = null;
        } else {
            StandardBannerFields standardBannerFields = standardBanner2.b;
            standardBanner = new StandardBanner(standardBannerFields.f21034a, standardBannerFields.b, standardBannerFields.c, standardBannerFields.d, standardBannerFields.e, standardBannerFields.f, standardBannerFields.g);
        }
        return RewardsOfferData.a(rewardsOfferData, null, null, null, null, offerDetailsCtaA, null, standardBanner, str15, null, 968884223);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final OffersSections d(OffersSectionsFragment offersSectionsFragment) {
        OffersSectionsFragment.OnHostedIcon onHostedIcon;
        DownloadableAssetFit downloadableAssetFit;
        ContentCta contentCta;
        String str;
        String str2;
        String str3;
        ?? arrayList;
        String str4;
        StandardBanner standardBanner;
        EmptyList emptyList;
        String str5;
        String str6;
        ?? arrayList2;
        String str7;
        StandardBanner standardBanner2;
        OffersSectionsFragment.OnStandardBanner onStandardBanner = offersSectionsFragment.b;
        if (onStandardBanner != null) {
            StandardBannerFields standardBannerFields = onStandardBanner.b;
            return new StandardBannerWrapper(new StandardBanner(standardBannerFields.f21034a, standardBannerFields.b, standardBannerFields.c, standardBannerFields.d, standardBannerFields.e, standardBannerFields.f, standardBannerFields.g));
        }
        OffersSectionsFragment.OnStandardOffersSection onStandardOffersSection = offersSectionsFragment.e;
        EmptyList emptyList2 = EmptyList.d;
        String str8 = "<this>";
        if (onStandardOffersSection != null) {
            String str9 = onStandardOffersSection.f21014a;
            String str10 = onStandardOffersSection.b;
            ArrayList arrayList3 = onStandardOffersSection.c;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                OffersSectionsFragment.Item item = (OffersSectionsFragment.Item) it.next();
                Intrinsics.h(item, "<this>");
                RewardsOfferFields rewardsOfferFields = item.b;
                String str11 = rewardsOfferFields.f20940a;
                String str12 = rewardsOfferFields.b;
                String str13 = rewardsOfferFields.c;
                String str14 = rewardsOfferFields.f;
                String str15 = rewardsOfferFields.g;
                String str16 = rewardsOfferFields.h;
                String str17 = rewardsOfferFields.i;
                Iterator it2 = it;
                String str18 = rewardsOfferFields.j;
                String str19 = rewardsOfferFields.k;
                String str20 = rewardsOfferFields.l;
                RewardsOfferStatus rewardsOfferStatusA = RewardsOfferStatusExtKt.a(rewardsOfferFields.m);
                String str21 = rewardsOfferFields.o;
                RewardsOfferFields.Mechanics mechanics = rewardsOfferFields.n;
                RewardsOfferMechanics rewardsOfferMechanicsA = mechanics != null ? RewardsOfferFieldsMechanicsExtKt.a(mechanics) : null;
                List list = rewardsOfferFields.q;
                if (list != null) {
                    List list2 = list;
                    emptyList = emptyList2;
                    str5 = str17;
                    str6 = str16;
                    arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(RewardsOfferFieldsStatusIconExtKt.a((RewardsOfferFields.StatusIcon) it3.next()));
                    }
                } else {
                    emptyList = emptyList2;
                    str5 = str17;
                    str6 = str16;
                    arrayList2 = 0;
                }
                EmptyList emptyList3 = arrayList2 == 0 ? emptyList : arrayList2;
                RewardsOfferFields.OfferAnalytics offerAnalytics = rewardsOfferFields.r;
                RewardsOfferAnalyticsData rewardsOfferAnalyticsDataA = offerAnalytics != null ? RewardsOfferFieldsOfferAnalyticsExtKt.a(offerAnalytics) : null;
                OfferActivationAnimationData offerActivationAnimationData = Intrinsics.c(rewardsOfferFields.s, "CONFETTI") ? OfferActivationAnimationData.CONFETTI : OfferActivationAnimationData.d;
                RewardsOfferFields.ActivationMessage activationMessage = rewardsOfferFields.u;
                OfferActivationMessage offerActivationMessage = activationMessage != null ? new OfferActivationMessage(activationMessage.f20942a, activationMessage.b, activationMessage.c) : null;
                OfferDisplayAnimationData offerDisplayAnimationData = Intrinsics.c(rewardsOfferFields.t, "BOX_WITH_SPARKLES_CONFETTI_AND_BOW_ON_TOP") ? OfferDisplayAnimationData.BOX_WITH_SPARKLES_CONFETTI_AND_BOW_ON_TOP : OfferDisplayAnimationData.d;
                String str22 = rewardsOfferFields.v;
                String str23 = rewardsOfferFields.w;
                RewardsOfferFields.Roundel roundel = rewardsOfferFields.x;
                IconAsset iconAssetA = roundel != null ? IconAssetExtensionKt.a(roundel.b) : null;
                RewardsOfferFields.OfferDetailsCta offerDetailsCta = rewardsOfferFields.z;
                OfferDetailsCta offerDetailsCtaA = offerDetailsCta != null ? RewardsOfferFieldsOfferDetailsCtaExtKt.a(offerDetailsCta) : null;
                RewardsOfferFields.OfferListCta offerListCta = rewardsOfferFields.y;
                OfferDetailsCta offerDetailsCtaA2 = offerListCta != null ? RewardsOfferFieldsOfferListCtaExtKt.a(offerListCta) : null;
                RewardsOfferFields.BoostedOfferInsetBanner boostedOfferInsetBanner = rewardsOfferFields.e;
                InsetBannerApiData insetBannerApiDataA = boostedOfferInsetBanner != null ? RewardsOfferFieldsBoostedOfferInsetBannerExtKt.a(boostedOfferInsetBanner) : null;
                RewardsOfferFields.StandardBanner standardBanner3 = rewardsOfferFields.d;
                if (standardBanner3 != null) {
                    StandardBannerFields standardBannerFields2 = standardBanner3.b;
                    str7 = str22;
                    standardBanner2 = new StandardBanner(standardBannerFields2.f21034a, standardBannerFields2.b, standardBannerFields2.c, standardBannerFields2.d, standardBannerFields2.e, standardBannerFields2.f, standardBannerFields2.g);
                } else {
                    str7 = str22;
                    standardBanner2 = null;
                }
                String str24 = rewardsOfferFields.p;
                RewardsOfferFields.OfferTileProgressTracker offerTileProgressTracker = rewardsOfferFields.A;
                arrayList4.add(new RewardsOfferData(str11, str12, str13, str14, str15, str6, str5, str18, str19, str20, rewardsOfferStatusA, str21, rewardsOfferMechanicsA, emptyList3, rewardsOfferAnalyticsDataA, offerActivationAnimationData, offerActivationMessage, offerDisplayAnimationData, str7, str23, iconAssetA, null, offerDetailsCtaA, offerDetailsCtaA2, insetBannerApiDataA, standardBanner2, str24, null, offerTileProgressTracker != null ? RewardsOfferFieldsOfferTileProgressTrackerExtKt.a(offerTileProgressTracker) : null, rewardsOfferFields.B));
                it = it2;
                emptyList2 = emptyList;
            }
            return new StandardOffersSection(str9, str10, arrayList4);
        }
        OffersSectionsFragment.OnProductOffersSection onProductOffersSection = offersSectionsFragment.f;
        if (onProductOffersSection == null) {
            OffersSectionsFragment.OnSpinSurpriseBanner onSpinSurpriseBanner = offersSectionsFragment.g;
            if (onSpinSurpriseBanner != null) {
                String str25 = onSpinSurpriseBanner.f21012a;
                OffersSectionsFragment.BannerAsset bannerAsset = onSpinSurpriseBanner.b;
                int iOrdinal = bannerAsset.f20999a.ordinal();
                DownloadableAssetType downloadableAssetType = iOrdinal != 0 ? iOrdinal != 1 ? DownloadableAssetType.d : DownloadableAssetType.IMAGE : DownloadableAssetType.LOTTIE_ANIMATION;
                String str26 = bannerAsset.b;
                int i = bannerAsset.c;
                int i2 = bannerAsset.d;
                au.com.woolworths.rewards.graphql.type.DownloadableAssetFit downloadableAssetFit2 = bannerAsset.e;
                if (downloadableAssetFit2 != null) {
                    int iOrdinal2 = downloadableAssetFit2.ordinal();
                    DownloadableAssetFit downloadableAssetFit3 = (iOrdinal2 == 0 || iOrdinal2 != 1) ? DownloadableAssetFit.ASPECT_FILL : DownloadableAssetFit.CENTER;
                    downloadableAssetFit = downloadableAssetFit3;
                } else {
                    downloadableAssetFit = null;
                }
                return new SpinSurpriseBanner(str25, new DownloadableAsset(downloadableAssetType, str26, i, i2, downloadableAssetFit, (String) null, 32, (DefaultConstructorMarker) null), onSpinSurpriseBanner.c);
            }
            OffersSectionsFragment.OnPersonalisedOffersBanner onPersonalisedOffersBanner = offersSectionsFragment.h;
            if (onPersonalisedOffersBanner != null) {
                String str27 = onPersonalisedOffersBanner.f21009a;
                String str28 = onPersonalisedOffersBanner.b;
                String str29 = onPersonalisedOffersBanner.c;
                String str30 = onPersonalisedOffersBanner.d;
                int iOrdinal3 = onPersonalisedOffersBanner.e.ordinal();
                return new PersonalisedOffersBanner(str27, str28, str29, str30, iOrdinal3 != 0 ? iOrdinal3 != 1 ? iOrdinal3 != 2 ? PersonalisedOffersStatus.d : PersonalisedOffersStatus.f : PersonalisedOffersStatus.e : PersonalisedOffersStatus.d, onPersonalisedOffersBanner.f);
            }
            OffersSectionsFragment.OnOfferFeedInlineBanner onOfferFeedInlineBanner = offersSectionsFragment.i;
            if (onOfferFeedInlineBanner != null) {
                String str31 = onOfferFeedInlineBanner.f21008a;
                OffersSectionsFragment.InlineBannerLeadingIcon inlineBannerLeadingIcon = onOfferFeedInlineBanner.b;
                IconAsset iconAssetA2 = inlineBannerLeadingIcon != null ? IconAssetExtensionKt.a(inlineBannerLeadingIcon.b) : null;
                OffersSectionsFragment.InlineBannerTrailingIcon inlineBannerTrailingIcon = onOfferFeedInlineBanner.c;
                return new OfferFeedInlineBanner(str31, iconAssetA2, inlineBannerTrailingIcon != null ? IconAssetExtensionKt.a(inlineBannerTrailingIcon.b) : null, onOfferFeedInlineBanner.d, onOfferFeedInlineBanner.e, onOfferFeedInlineBanner.f, onOfferFeedInlineBanner.g, onOfferFeedInlineBanner.h);
            }
            OffersSectionsFragment.OnRewardsCtaCard onRewardsCtaCard = offersSectionsFragment.j;
            if (onRewardsCtaCard != null) {
                return new RewardsCtaCard(onRewardsCtaCard.f21011a, onRewardsCtaCard.b, onRewardsCtaCard.c);
            }
            OffersSectionsFragment.OnMandyBanner onMandyBanner = offersSectionsFragment.c;
            if (onMandyBanner != null) {
                return new MandyBanner(onMandyBanner.f21006a, onMandyBanner.c, onMandyBanner.d, onMandyBanner.e, onMandyBanner.b, onMandyBanner.f);
            }
            OffersSectionsFragment.OnNoOffersCard onNoOffersCard = offersSectionsFragment.d;
            if (onNoOffersCard == null) {
                throw new IllegalStateException("Type not implemented");
            }
            OffersSectionsFragment.EmptyStateIconAsset emptyStateIconAsset = onNoOffersCard.f21007a;
            return new NoOffersCard((emptyStateIconAsset == null || (onHostedIcon = emptyStateIconAsset.b) == null) ? null : new IconAsset.HostedIcon(onHostedIcon.f21005a), onNoOffersCard.b, onNoOffersCard.c);
        }
        String str32 = onProductOffersSection.f21010a;
        String str33 = onProductOffersSection.b;
        String str34 = onProductOffersSection.c;
        String str35 = onProductOffersSection.d;
        OffersSectionsFragment.SectionCta sectionCta = onProductOffersSection.e;
        if (sectionCta != null) {
            ContentCtaFields contentCtaFields = sectionCta.b;
            String str36 = contentCtaFields.f20974a;
            String str37 = contentCtaFields.b;
            Boolean bool = contentCtaFields.c;
            ContentCtaFields.OnCtaClickAnalytics onCtaClickAnalytics = contentCtaFields.d;
            contentCta = new ContentCta(str36, str37, (String) null, bool, onCtaClickAnalytics != null ? ContentCtaFieldsOnCtaClickAnalyticsExtKt.a(onCtaClickAnalytics) : null, 4, (DefaultConstructorMarker) null);
        } else {
            contentCta = null;
        }
        ArrayList arrayList5 = onProductOffersSection.f;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            OffersSectionsFragment.Item1 item1 = (OffersSectionsFragment.Item1) it4.next();
            Intrinsics.h(item1, str8);
            RewardsOfferFields rewardsOfferFields2 = item1.b;
            String str38 = rewardsOfferFields2.f20940a;
            String str39 = rewardsOfferFields2.b;
            String str40 = rewardsOfferFields2.c;
            String str41 = rewardsOfferFields2.f;
            Iterator it5 = it4;
            String str42 = rewardsOfferFields2.g;
            String str43 = rewardsOfferFields2.h;
            String str44 = rewardsOfferFields2.i;
            String str45 = rewardsOfferFields2.j;
            String str46 = rewardsOfferFields2.k;
            String str47 = rewardsOfferFields2.l;
            RewardsOfferStatus rewardsOfferStatusA2 = RewardsOfferStatusExtKt.a(rewardsOfferFields2.m);
            String str48 = rewardsOfferFields2.o;
            RewardsOfferFields.Mechanics mechanics2 = rewardsOfferFields2.n;
            RewardsOfferMechanics rewardsOfferMechanicsA2 = mechanics2 != null ? RewardsOfferFieldsMechanicsExtKt.a(mechanics2) : null;
            List list3 = rewardsOfferFields2.q;
            if (list3 != null) {
                List list4 = list3;
                str = str40;
                str2 = str41;
                str3 = str8;
                arrayList = new ArrayList(CollectionsKt.s(list4, 10));
                Iterator it6 = list4.iterator();
                while (it6.hasNext()) {
                    arrayList.add(RewardsOfferFieldsStatusIconExtKt.a((RewardsOfferFields.StatusIcon) it6.next()));
                }
            } else {
                str = str40;
                str2 = str41;
                str3 = str8;
                arrayList = 0;
            }
            EmptyList emptyList4 = arrayList == 0 ? emptyList2 : arrayList;
            RewardsOfferFields.OfferAnalytics offerAnalytics2 = rewardsOfferFields2.r;
            RewardsOfferAnalyticsData rewardsOfferAnalyticsDataA2 = offerAnalytics2 != null ? RewardsOfferFieldsOfferAnalyticsExtKt.a(offerAnalytics2) : null;
            OfferActivationAnimationData offerActivationAnimationData2 = Intrinsics.c(rewardsOfferFields2.s, "CONFETTI") ? OfferActivationAnimationData.CONFETTI : OfferActivationAnimationData.d;
            RewardsOfferFields.ActivationMessage activationMessage2 = rewardsOfferFields2.u;
            OfferActivationMessage offerActivationMessage2 = activationMessage2 != null ? new OfferActivationMessage(activationMessage2.f20942a, activationMessage2.b, activationMessage2.c) : null;
            OfferDisplayAnimationData offerDisplayAnimationData2 = Intrinsics.c(rewardsOfferFields2.t, "BOX_WITH_SPARKLES_CONFETTI_AND_BOW_ON_TOP") ? OfferDisplayAnimationData.BOX_WITH_SPARKLES_CONFETTI_AND_BOW_ON_TOP : OfferDisplayAnimationData.d;
            String str49 = rewardsOfferFields2.v;
            String str50 = rewardsOfferFields2.w;
            RewardsOfferFields.Roundel roundel2 = rewardsOfferFields2.x;
            IconAsset iconAssetA3 = roundel2 != null ? IconAssetExtensionKt.a(roundel2.b) : null;
            RewardsOfferFields.OfferDetailsCta offerDetailsCta2 = rewardsOfferFields2.z;
            OfferDetailsCta offerDetailsCtaA3 = offerDetailsCta2 != null ? RewardsOfferFieldsOfferDetailsCtaExtKt.a(offerDetailsCta2) : null;
            RewardsOfferFields.OfferListCta offerListCta2 = rewardsOfferFields2.y;
            OfferDetailsCta offerDetailsCtaA4 = offerListCta2 != null ? RewardsOfferFieldsOfferListCtaExtKt.a(offerListCta2) : null;
            RewardsOfferFields.BoostedOfferInsetBanner boostedOfferInsetBanner2 = rewardsOfferFields2.e;
            InsetBannerApiData insetBannerApiDataA2 = boostedOfferInsetBanner2 != null ? RewardsOfferFieldsBoostedOfferInsetBannerExtKt.a(boostedOfferInsetBanner2) : null;
            RewardsOfferFields.StandardBanner standardBanner4 = rewardsOfferFields2.d;
            if (standardBanner4 != null) {
                StandardBannerFields standardBannerFields3 = standardBanner4.b;
                str4 = str49;
                standardBanner = new StandardBanner(standardBannerFields3.f21034a, standardBannerFields3.b, standardBannerFields3.c, standardBannerFields3.d, standardBannerFields3.e, standardBannerFields3.f, standardBannerFields3.g);
            } else {
                str4 = str49;
                standardBanner = null;
            }
            String str51 = rewardsOfferFields2.p;
            RewardsOfferFields.OfferTileProgressTracker offerTileProgressTracker2 = rewardsOfferFields2.A;
            arrayList6.add(new RewardsOfferData(str38, str39, str, str2, str42, str43, str44, str45, str46, str47, rewardsOfferStatusA2, str48, rewardsOfferMechanicsA2, emptyList4, rewardsOfferAnalyticsDataA2, offerActivationAnimationData2, offerActivationMessage2, offerDisplayAnimationData2, str4, str50, iconAssetA3, null, offerDetailsCtaA3, offerDetailsCtaA4, insetBannerApiDataA2, standardBanner, str51, null, offerTileProgressTracker2 != null ? RewardsOfferFieldsOfferTileProgressTrackerExtKt.a(offerTileProgressTracker2) : null, rewardsOfferFields2.B));
            it4 = it5;
            str8 = str3;
        }
        int iOrdinal4 = onProductOffersSection.g.ordinal();
        return new ProductOffersSection(str32, str33, str34, str35, contentCta, arrayList6, iOrdinal4 != 0 ? iOrdinal4 != 1 ? iOrdinal4 != 2 ? OfferSectionLayout.d : OfferSectionLayout.f : OfferSectionLayout.e : OfferSectionLayout.d);
    }
}
