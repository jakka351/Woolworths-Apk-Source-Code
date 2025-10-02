package au.com.woolworths.feature.shop.homepage.presentation.rewards;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsState;
import au.com.woolworths.feature.shop.homepage.data.AlertIndicator;
import au.com.woolworths.feature.shop.homepage.data.AlertIndicatorType;
import au.com.woolworths.feature.shop.homepage.data.RewardsBalanceCardData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/rewards/PreviewRewardsBalanceCardDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/homepage/presentation/rewards/SampleRewardsBalanceCardData;", "Companion", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreviewRewardsBalanceCardDataProvider implements PreviewParameterProvider<SampleRewardsBalanceCardData> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/rewards/PreviewRewardsBalanceCardDataProvider$Companion;", "", "", "DEFAULT_POINTS_ALERT", "Ljava/lang/String;", "DEFAULT_OFFERS_ALERT", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RewardsBalanceCardData rewardsBalanceCardData = new RewardsBalanceCardData("abc123", "3 of 12 offers boosted", 1580, 2000, "com.woolworths.shop://rewards/boosters?source=home", "Only {0} more points to collect your reward", CollectionsKt.Q("420"), "Points balance 1580 out of 2000. 420 more points to collect your reward Tap to view your Everyday Rewards activity", null, null, RewardsState.ACTIVE);
        AlertIndicatorType alertIndicatorType = AlertIndicatorType.d;
        RewardsBalanceCardData.a(rewardsBalanceCardData, null, new AlertIndicator("We are having trouble retrieving your offers. Please try again later."), 1535);
        RewardsBalanceCardData.a(rewardsBalanceCardData, new AlertIndicator("We are having trouble retrieving your offers. Please try again later."), null, 1789);
        RewardsBalanceCardData.a(RewardsBalanceCardData.a(RewardsBalanceCardData.a(rewardsBalanceCardData, new AlertIndicator("We are having trouble retrieving your offers. Please try again later."), null, 1789), null, new AlertIndicator("We are having trouble retrieving your points balance. Please try again later."), 1535), null, null, 2043);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
