package au.com.woolworths.feature.rewards.offers.domain.model;

import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsFooter;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsStatusBadge;
import com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferDetailsPageFragmentOnOfferDetailsFooterExtKt {
    public static final OfferDetailsFooter a(OfferDetailsPageFragment.OnOfferDetailsFooter onOfferDetailsFooter) {
        ContentCta contentCta;
        String str = onOfferDetailsFooter.f20858a;
        OfferDetailsPageFragment.Cta cta = onOfferDetailsFooter.b;
        if (cta != null) {
            ContentCtaFields contentCtaFields = cta.b;
            String str2 = contentCtaFields.f20974a;
            String str3 = contentCtaFields.b;
            Boolean bool = contentCtaFields.c;
            ContentCtaFields.OnCtaClickAnalytics onCtaClickAnalytics = contentCtaFields.d;
            contentCta = new ContentCta(str2, str3, (String) null, bool, onCtaClickAnalytics != null ? ContentCtaFieldsOnCtaClickAnalyticsExtKt.a(onCtaClickAnalytics) : null, 4, (DefaultConstructorMarker) null);
        } else {
            contentCta = null;
        }
        OfferDetailsPageFragment.StatusBadge1 statusBadge1 = onOfferDetailsFooter.c;
        return new OfferDetailsFooter(str, contentCta, statusBadge1 != null ? new OfferDetailsStatusBadge(statusBadge1.f20861a, RewardsOfferStatusExtKt.a(statusBadge1.b)) : null);
    }
}
