package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/OffersSections;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OffersSections {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f9698a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/OffersSections$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i = StandardOffersSection.f9913a;
        int i2 = ProductOffersSection.f9769a;
        int i3 = OnboardingBanner.f9699a;
        ObjectType objectType = StandardBanner.f9912a;
        int i4 = SpinSurpriseBanner.f9910a;
        int i5 = OfferFeedInlineBanner.f9695a;
        int i6 = PersonalisedOffersBanner.f9737a;
        int i7 = RewardsCtaCard.f9812a;
        int i8 = MandyBanner.f9651a;
        int i9 = NoOffersCard.f9670a;
        f9698a = new UnionType("OffersSections");
    }
}
