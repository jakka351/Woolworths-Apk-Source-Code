package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.rewards.offers.OfferFeedInlineBannerViewItem;
import au.com.woolworths.rewards.base.data.IconAssetKt;
import au.com.woolworths.rewards.base.data.LocalAssetIconName;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ui/OfferFeedInlineBannerPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/offers/OfferFeedInlineBannerViewItem;", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferFeedInlineBannerPreviewProvider implements PreviewParameterProvider<OfferFeedInlineBannerViewItem> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ui/OfferFeedInlineBannerPreviewProvider$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        IconAssetKt.toIconAsset(LocalAssetIconName.RECEIPT);
        IconAssetKt.toIconAsset(LocalAssetIconName.TRUCK);
        IconAssetKt.toIconAsset(LocalAssetIconName.CART);
        IconAssetKt.toIconAsset(LocalAssetIconName.CHEVRON_RIGHT);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
