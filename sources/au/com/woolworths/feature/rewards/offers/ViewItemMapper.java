package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.feature.rewards.offers.data.MandyBanner;
import au.com.woolworths.feature.rewards.offers.data.NoOffersCard;
import au.com.woolworths.feature.rewards.offers.data.OfferFeedInlineBanner;
import au.com.woolworths.feature.rewards.offers.data.OfferSectionExtKt;
import au.com.woolworths.feature.rewards.offers.data.OffersSections;
import au.com.woolworths.feature.rewards.offers.data.PersonalisedOffersBanner;
import au.com.woolworths.feature.rewards.offers.data.ProductOffersSection;
import au.com.woolworths.feature.rewards.offers.data.RewardsCtaCard;
import au.com.woolworths.feature.rewards.offers.data.SpinSurpriseBanner;
import au.com.woolworths.feature.rewards.offers.data.StandardBannerWrapper;
import au.com.woolworths.feature.rewards.offers.data.StandardOffersSection;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.StandardBanner;
import au.com.woolworths.rewards.base.data.IconAsset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ViewItemMapper;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ViewItemMapper {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsOfferActivationInteractor f6258a;

    public ViewItemMapper(RewardsOfferActivationInteractor rewardsOfferActivationInteractor) {
        Intrinsics.h(rewardsOfferActivationInteractor, "rewardsOfferActivationInteractor");
        this.f6258a = rewardsOfferActivationInteractor;
    }

    public static ArrayList a(ArrayList arrayList, Function1 function1) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RewardsOfferData rewardsOfferData = (RewardsOfferData) it.next();
            arrayList2.add(new OfferViewItem(((Boolean) function1.invoke(rewardsOfferData.d)).booleanValue(), rewardsOfferData));
        }
        return arrayList2;
    }

    public static ArrayList b(ViewItemMapper viewItemMapper, ArrayList arrayList) {
        boolean z;
        SectionViewItem noOffersCardViewItem;
        SectionViewItem mandyBannerViewItem;
        i iVar = new i(viewItemMapper, 4);
        viewItemMapper.getClass();
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((OffersSections) it.next()) instanceof PersonalisedOffersBanner) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((OffersSections) obj) instanceof ProductOffersSection) || !z) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            OffersSections offersSections = (OffersSections) it2.next();
            Intrinsics.h(offersSections, "<this>");
            if (offersSections instanceof StandardBannerWrapper) {
                StandardBanner standardBanner = ((StandardBannerWrapper) offersSections).f6298a;
                noOffersCardViewItem = new StandardBannerViewItem(standardBanner.d, standardBanner.e, standardBanner.f, standardBanner.g, standardBanner.h, standardBanner.i, standardBanner.j);
            } else if (offersSections instanceof SpinSurpriseBanner) {
                SpinSurpriseBanner spinSurpriseBanner = (SpinSurpriseBanner) offersSections;
                String str = spinSurpriseBanner.f6297a;
                DownloadableAsset downloadableAsset = spinSurpriseBanner.b;
                String str2 = spinSurpriseBanner.c;
                if (str2 == null) {
                    str2 = "com.woolworths.rewards://spinSurprise";
                }
                noOffersCardViewItem = new SpinSurpriseBannerViewItem(str, downloadableAsset, str2);
            } else if (offersSections instanceof RewardsCtaCard) {
                RewardsCtaCard rewardsCtaCard = (RewardsCtaCard) offersSections;
                noOffersCardViewItem = new RewardsCtaCardViewItem(rewardsCtaCard.f6281a, rewardsCtaCard.b, rewardsCtaCard.c);
            } else if (offersSections instanceof ProductOffersSection) {
                ProductOffersSection productOffersSection = (ProductOffersSection) offersSections;
                String str3 = productOffersSection.f6280a;
                String str4 = productOffersSection.b;
                RewardsOfferActivationInteractor rewardsOfferActivationInteractor = viewItemMapper.f6258a;
                rewardsOfferActivationInteractor.getClass();
                RewardsOfferRepository rewardsOfferRepository = rewardsOfferActivationInteractor.f6236a;
                rewardsOfferRepository.getClass();
                noOffersCardViewItem = new ProductSectionViewItem(str3, str4, productOffersSection.c, productOffersSection.d, rewardsOfferRepository.i.contains(str3), productOffersSection.e, a(productOffersSection.f, iVar), productOffersSection.g);
            } else if (offersSections instanceof StandardOffersSection) {
                StandardOffersSection standardOffersSection = (StandardOffersSection) offersSections;
                String str5 = standardOffersSection.f6299a;
                String str6 = standardOffersSection.b;
                RewardsOfferActivationInteractor rewardsOfferActivationInteractor2 = viewItemMapper.f6258a;
                rewardsOfferActivationInteractor2.getClass();
                RewardsOfferRepository rewardsOfferRepository2 = rewardsOfferActivationInteractor2.f6236a;
                rewardsOfferRepository2.getClass();
                noOffersCardViewItem = new StandardSectionViewItem(a(standardOffersSection.c, iVar), rewardsOfferRepository2.i.contains(str5), str5, str6);
            } else {
                if (offersSections instanceof PersonalisedOffersBanner) {
                    PersonalisedOffersBanner personalisedOffersBanner = (PersonalisedOffersBanner) offersSections;
                    mandyBannerViewItem = new PersonalisedOffersBannerViewItem(personalisedOffersBanner.f6279a, personalisedOffersBanner.b, personalisedOffersBanner.c, personalisedOffersBanner.d, personalisedOffersBanner.e, personalisedOffersBanner.f);
                } else if (offersSections instanceof OfferFeedInlineBanner) {
                    OfferFeedInlineBanner offerFeedInlineBanner = (OfferFeedInlineBanner) offersSections;
                    String str7 = offerFeedInlineBanner.f6276a;
                    String str8 = offerFeedInlineBanner.d;
                    if (str8 == null) {
                        str8 = "";
                    }
                    String str9 = offerFeedInlineBanner.e;
                    if (str9 == null) {
                        str9 = "";
                    }
                    String str10 = offerFeedInlineBanner.f;
                    IconAsset iconAsset = offerFeedInlineBanner.b;
                    IconAsset iconAsset2 = offerFeedInlineBanner.c;
                    Boolean bool = offerFeedInlineBanner.g;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    Boolean bool2 = offerFeedInlineBanner.h;
                    mandyBannerViewItem = new OfferFeedInlineBannerViewItem(str7, str8, str9, str10, iconAsset, iconAsset2, zBooleanValue, bool2 != null ? bool2.booleanValue() : false);
                } else if (offersSections instanceof MandyBanner) {
                    MandyBanner mandyBanner = (MandyBanner) offersSections;
                    mandyBannerViewItem = new MandyBannerViewItem(mandyBanner.f6272a, mandyBanner.b, mandyBanner.c, mandyBanner.d, mandyBanner.e, mandyBanner.f);
                } else {
                    if (!(offersSections instanceof NoOffersCard)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String strC = OfferSectionExtKt.c(offersSections);
                    NoOffersCard noOffersCard = (NoOffersCard) offersSections;
                    noOffersCardViewItem = new NoOffersCardViewItem(strC, noOffersCard.f6273a, noOffersCard.b, noOffersCard.c);
                }
                noOffersCardViewItem = mandyBannerViewItem;
            }
            arrayList3.add(noOffersCardViewItem);
        }
        return arrayList3;
    }
}
