package au.com.woolworths.feature.rewards.offers.provider;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsMutationResponse;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.foundation.rewards.offers.model.StandardBanner;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/provider/OfferDetailsMutationResponseProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/offers/domain/model/OfferDetailsMutationResponse;", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferDetailsMutationResponseProvider implements PreviewParameterProvider<OfferDetailsMutationResponse> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/provider/OfferDetailsMutationResponseProvider$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RewardsOfferData rewardsOfferData = new RewardsOfferData("mockOfferId", "mockImageUrl", null, "Shop to collect 100 points", "Mock Subtitle", "Fancy Feast Medleys Tuna Tuscany In Savory Sauce 85g", "Mock Body", "Mock Formatted Terms", "Mock Markdown Terms", "Activate", RewardsOfferStatus.NOT_ACTIVATED, "Offer expires 21 Nov", null, EmptyList.d, null, null, null, null, "mockBrandLogoUrl", "mockBrandLogoUrlCompact", null, null, null, null, null, new StandardBanner("1", "Continue shopping online", "https://example.com/image/summer_sale.jpg", "Shop boosted products from your Boosted Offers list.", "https://example.com/summer_sale", "View on Woolworths App", "Double-tap to see this in Woolies app"), "Mock Display Expiry Extended", "Mock Minimum Spend", null, null);
        OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage = OfferDetailsDataProvider.f6386a;
        new OfferDetailsMutationResponse.OfferDetailsMutationResult(rewardsOfferData, OfferDetailsDataProvider.f6386a);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
