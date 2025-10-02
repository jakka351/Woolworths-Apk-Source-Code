package au.com.woolworths.feature.rewards.offers.provider;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetFit;
import au.com.woolworths.android.onesite.data.DownloadableAssetType;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsHeader;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsStatusBadge;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerModel;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerStyle;
import au.com.woolworths.sdui.rewards.model.ActionData;
import au.com.woolworths.sdui.rewards.model.ActionType;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/provider/OfferDetailsHeaderProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsHeader;", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferDetailsHeaderProvider implements PreviewParameterProvider<OfferDetailsHeader> {

    /* renamed from: a, reason: collision with root package name */
    public static final OfferDetailsHeader f6388a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/provider/OfferDetailsHeaderProvider$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        DownloadableAssetType downloadableAssetType = DownloadableAssetType.IMAGE;
        DownloadableAssetFit downloadableAssetFit = DownloadableAssetFit.ASPECT_FILL;
        f6388a = new OfferDetailsHeader(new DownloadableAsset(downloadableAssetType, "https://example.com/image/summer_sale.jpg", 200, 96, downloadableAssetFit, ""), new IconAsset.HostedIcon("https://prod.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/leaf_healthylife_logo.png"), new IconAsset.HostedIcon("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/offers/woolworths.png"), "Continue shopping online", "Shop boosted products from your Boosted Offers list.", new OfferDetailsStatusBadge("Activated", RewardsOfferStatus.ACTIVATED), null);
        new DownloadableAsset(downloadableAssetType, "https://example.com/image/summer_sale.jpg", 200, 96, downloadableAssetFit, "");
        new IconAsset.HostedIcon("https://prod.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/leaf_healthylife_logo.png");
        new IconAsset.HostedIcon("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/offers/woolworths.png");
        new CoreBroadcastBannerModel("Shop your boosted products or add to a list", null, CoreBroadcastBannerStyle.d, new IconAsset.HostedIcon("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/boosted_offers_banner_icon.png"));
        new ActionData("", ActionType.d, "", null);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
