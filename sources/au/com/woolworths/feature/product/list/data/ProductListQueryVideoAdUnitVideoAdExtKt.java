package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdData;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import com.woolworths.product.list.ProductListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdData;", "Lcom/woolworths/product/list/ProductListQuery$VideoAdUnitVideoAd;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryVideoAdUnitVideoAdExtKt {
    @NotNull
    public static final VideoAdData toUiModel(@NotNull ProductListQuery.VideoAdUnitVideoAd videoAdUnitVideoAd) {
        Intrinsics.h(videoAdUnitVideoAd, "<this>");
        String url = videoAdUnitVideoAd.getUrl();
        int duration = videoAdUnitVideoAd.getDuration();
        ProductListQuery.FallbackImage fallbackImage = videoAdUnitVideoAd.getFallbackImage();
        ImageWithAltText uiModel = fallbackImage != null ? ProductListQueryFallbackImageExtKt.toUiModel(fallbackImage) : null;
        ProductListQuery.Transcript transcript = videoAdUnitVideoAd.getTranscript();
        VideoAdBottomSheet uiModel2 = transcript != null ? ProductListQueryTranscriptExtKt.toUiModel(transcript) : null;
        ProductListQuery.TermsAndConditions termsAndConditions = videoAdUnitVideoAd.getTermsAndConditions();
        VideoAdBottomSheet uiModel3 = termsAndConditions != null ? ProductListQueryTermsAndConditionsExtKt.toUiModel(termsAndConditions) : null;
        ProductListQuery.Analytics3 analytics = videoAdUnitVideoAd.getAnalytics();
        AnalyticsData uiModel4 = analytics != null ? ProductListQueryAnalytics3ExtKt.toUiModel(analytics) : null;
        ProductListQuery.EventAnalytics eventAnalytics = videoAdUnitVideoAd.getEventAnalytics();
        return new VideoAdData(url, duration, uiModel, uiModel2, uiModel3, uiModel4, eventAnalytics != null ? ProductListQueryEventAnalyticsExtKt.toUiModel(eventAnalytics) : null);
    }
}
