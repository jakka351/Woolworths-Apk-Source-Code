package au.com.woolworths.feature.rewards.card.overlay.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardTypeData;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/card/overlay/ui/RewardsCardOverlayPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayContract$ViewState;", "Companion", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsCardOverlayPreviewProvider implements PreviewParameterProvider<RewardsCardOverlayContract.ViewState> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/card/overlay/ui/RewardsCardOverlayPreviewProvider$Companion;", "", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardData;", "cardData", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardData;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RewardsCardData rewardsCardData = new RewardsCardData("12345678890123", "1234 56789 1234", "Tony Pepperoni", RewardsCardTypeData.LOYALTY_CARD, null, "DEFAULT", null, 64, null);
        RewardsCardData.a(rewardsCardData, null, "1234 56789 1234 123456789 123456789 1234", null, null, null, 125);
        RewardsCardData.a(rewardsCardData, null, null, null, null, "420", 111);
        RewardsCardData.a(rewardsCardData, null, "1234 56789 1234 123456789 123456789 1234", null, null, "420", 109);
        RewardsCardData.a(rewardsCardData, null, null, null, RewardsCardTypeData.QFF_CARD, null, 119);
        RewardsCardData.a(rewardsCardData, null, null, null, RewardsCardTypeData.STAFF_CARD, null, 119);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
