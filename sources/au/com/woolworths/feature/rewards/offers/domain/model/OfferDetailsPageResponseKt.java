package au.com.woolworths.feature.rewards.offers.domain.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferDetailsPageResponseKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Type inference failed for: r2v2, types: [au.com.woolworths.rewards.base.data.IconAsset$HostedIcon] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse a(com.woolworths.rewards.offers.details.OfferDetailsPageQuery.OfferDetails r12) {
        /*
            com.woolworths.rewards.offers.details.OfferDetailsPageQuery$OnOfferDetailsPage r0 = r12.b
            r1 = 0
            if (r0 == 0) goto L4a
            com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment r12 = r0.b
            com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment$Header r0 = r12.f20842a
            au.com.woolworths.foundation.rewards.offers.model.OfferDetailsHeader r0 = au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageFragmentHeaderExtKt.a(r0)
            java.util.ArrayList r2 = r12.b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r4 = r2.next()
            com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment$Content r4 = (com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment.Content) r4
            com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment$OnOfferDetailsCard r4 = r4.b
            if (r4 == 0) goto L2d
            au.com.woolworths.foundation.rewards.offers.model.OfferDetailsContentItem$OfferDetailsCard r4 = au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageFragmentOnOfferDetailsCardExtKt.a(r4)
            goto L2e
        L2d:
            r4 = r1
        L2e:
            if (r4 == 0) goto L18
            r3.add(r4)
            goto L18
        L34:
            com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment$Footer r2 = r12.c
            if (r2 == 0) goto L3e
            com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment$OnOfferDetailsFooter r1 = r2.b
            au.com.woolworths.foundation.rewards.offers.model.OfferDetailsFooter r1 = au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageFragmentOnOfferDetailsFooterExtKt.a(r1)
        L3e:
            com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment$OfferAnalytics r12 = r12.d
            au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData r12 = au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageFragmentOfferAnalyticsExtKt.a(r12)
            au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse$OfferDetailsPage r2 = new au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse$OfferDetailsPage
            r2.<init>(r0, r3, r1, r12)
            return r2
        L4a:
            com.woolworths.rewards.offers.details.OfferDetailsPageQuery$OnRewardsErrorEmptyState r12 = r12.c
            if (r12 == 0) goto L98
            com.woolworths.rewards.offers.details.OfferDetailsPageQuery$EmptyStateIconAsset r0 = r12.f20788a
            if (r0 == 0) goto L6f
            com.woolworths.rewards.offers.details.OfferDetailsPageQuery$OnLocalAsset r2 = r0.b
            if (r2 == 0) goto L62
            au.com.woolworths.rewards.base.data.IconAsset$LocalAsset r0 = new au.com.woolworths.rewards.base.data.IconAsset$LocalAsset
            au.com.woolworths.rewards.graphql.type.LocalAssetIconName r2 = r2.f20786a
            au.com.woolworths.rewards.base.data.LocalAssetIconName r2 = au.com.woolworths.feature.rewards.offers.domain.model.LocalAssetIconNameExtKt.a(r2)
            r0.<init>(r2)
            goto L70
        L62:
            com.woolworths.rewards.offers.details.OfferDetailsPageQuery$OnHostedIcon r0 = r0.c
            if (r0 == 0) goto L6f
            au.com.woolworths.rewards.base.data.IconAsset$HostedIcon r2 = new au.com.woolworths.rewards.base.data.IconAsset$HostedIcon
            java.lang.String r0 = r0.f20785a
            r2.<init>(r0)
            r0 = r2
            goto L70
        L6f:
            r0 = r1
        L70:
            java.lang.String r2 = r12.b
            java.lang.String r3 = r12.c
            com.woolworths.rewards.offers.details.OfferDetailsPageQuery$EmptyStateAction r12 = r12.d
            if (r12 == 0) goto L92
            au.com.woolworths.android.onesite.data.ContentCta r4 = new au.com.woolworths.android.onesite.data.ContentCta
            com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields r12 = r12.b
            java.lang.String r5 = r12.f20974a
            java.lang.String r6 = r12.b
            java.lang.Boolean r8 = r12.c
            com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields$OnCtaClickAnalytics r12 = r12.d
            if (r12 == 0) goto L8a
            au.com.woolworths.analytics.model.AnalyticsData r1 = au.com.woolworths.feature.rewards.offers.domain.model.ContentCtaFieldsOnCtaClickAnalyticsExtKt.a(r12)
        L8a:
            r9 = r1
            r10 = 4
            r11 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1 = r4
        L92:
            au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse$RewardsErrorEmptyState r12 = new au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse$RewardsErrorEmptyState
            r12.<init>(r0, r2, r3, r1)
            return r12
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponseKt.a(com.woolworths.rewards.offers.details.OfferDetailsPageQuery$OfferDetails):au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse");
    }
}
