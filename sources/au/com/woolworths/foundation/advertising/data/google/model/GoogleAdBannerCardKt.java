package au.com.woolworths.foundation.advertising.data.google.model;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.foundation.advertising.data.common.model.InteractiveAdvertisingBureauAdHeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"advertising-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GoogleAdBannerCardKt {
    public static final TrackingMetadata a(GoogleAdBannerCard googleAdBannerCard) {
        Intrinsics.h(googleAdBannerCard, "<this>");
        TrackableValue trackableValue = TrackableValue.i;
        String stitchId = googleAdBannerCard.getStitchId();
        if (stitchId == null) {
            stitchId = "";
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, stitchId);
        TrackableValue trackableValue2 = TrackableValue.h;
        String detailId = googleAdBannerCard.getDetailId();
        trackingMetadataA.b(trackableValue2, detailId != null ? detailId : "");
        return trackingMetadataA;
    }

    public static final boolean b(GoogleAdBannerCard googleAdBannerCard, GoogleAdBannerCard googleAdBannerCard2) {
        return googleAdBannerCard != null && googleAdBannerCard2 != null && Intrinsics.c(googleAdBannerCard.getAdUnitId(), googleAdBannerCard2.getAdUnitId()) && Intrinsics.c(googleAdBannerCard.getTemplateId(), googleAdBannerCard2.getTemplateId()) && Intrinsics.c(googleAdBannerCard.getTargeting(), googleAdBannerCard2.getTargeting());
    }

    public static final boolean c(GoogleAdBannerCard googleAdBannerCard) {
        String altText;
        Intrinsics.h(googleAdBannerCard, "<this>");
        String imageUrl = googleAdBannerCard.getImageUrl();
        if ((imageUrl == null || imageUrl.length() == 0) && ((altText = googleAdBannerCard.getAltText()) == null || altText.length() == 0)) {
            return false;
        }
        String ctaUrl = googleAdBannerCard.getCtaUrl();
        if (ctaUrl != null && ctaUrl.length() != 0) {
            return true;
        }
        String targetId = googleAdBannerCard.getTargetId();
        return (targetId == null || targetId.length() == 0) ? false : true;
    }

    public static final GoogleAdBannerCard d(GoogleAdBannerCard googleAdBannerCard, GoogleAdBanner googleAdBanner) {
        Intrinsics.h(googleAdBannerCard, "<this>");
        String imageUrl = googleAdBanner.getImageUrl();
        String altText = googleAdBanner.getAltText();
        String title = googleAdBanner.getTitle();
        String targetId = googleAdBanner.getTargetId();
        String targetType = googleAdBanner.getTargetType();
        String stitchId = googleAdBanner.getStitchId();
        String detailId = googleAdBanner.getDetailId();
        InteractiveAdvertisingBureauAdHeight iabSize = googleAdBanner.getIabSize();
        if (iabSize == null) {
            iabSize = googleAdBannerCard.getIabSize();
        }
        return GoogleAdBannerCard.d(googleAdBannerCard, imageUrl, altText, title, targetId, targetType, stitchId, detailId, googleAdBanner.getCtaUrl(), iabSize);
    }
}
