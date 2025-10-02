package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import com.woolworths.product.list.ProductListQuery;
import com.woolworths.product.list.fragment.VideoAdBottomSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdBottomSheet;", "Lcom/woolworths/product/list/ProductListQuery$Transcript;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryTranscriptExtKt {
    @NotNull
    public static final VideoAdBottomSheet toUiModel(@NotNull ProductListQuery.Transcript transcript) {
        Intrinsics.h(transcript, "<this>");
        String contentMarkdown = transcript.getVideoAdBottomSheet().getContentMarkdown();
        String title = transcript.getVideoAdBottomSheet().getTitle();
        String buttonText = transcript.getVideoAdBottomSheet().getButtonText();
        String accessibilityText = transcript.getVideoAdBottomSheet().getAccessibilityText();
        VideoAdBottomSheet.ImpressionAnalytics impressionAnalytics = transcript.getVideoAdBottomSheet().getImpressionAnalytics();
        return new au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet(contentMarkdown, title, buttonText, accessibilityText, impressionAnalytics != null ? VideoAdBottomSheetImpressionAnalyticsExtKt.toUiModel(impressionAnalytics) : null);
    }
}
