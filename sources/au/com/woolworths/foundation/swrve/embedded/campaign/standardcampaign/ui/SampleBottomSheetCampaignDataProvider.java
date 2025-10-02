package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/standardcampaign/ui/SampleBottomSheetCampaignDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/swrve/embedded/campaign/standardcampaign/ui/SampleBottomSheetData;", "Companion", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SampleBottomSheetCampaignDataProvider implements PreviewParameterProvider<SampleBottomSheetData> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/standardcampaign/ui/SampleBottomSheetCampaignDataProvider$Companion;", "", "Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent;", "Default", "Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent;", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        StandardCampaignContent.PresentationStyle.Companion companion = StandardCampaignContent.PresentationStyle.INSTANCE;
        StandardCampaignContent.AssetType.Companion companion2 = StandardCampaignContent.AssetType.INSTANCE;
        new StandardCampaignContent.BannerAsset(56, 56, StandardCampaignContent.AssetFit.e);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
