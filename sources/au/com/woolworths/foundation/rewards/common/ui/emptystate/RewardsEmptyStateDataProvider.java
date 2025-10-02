package au.com.woolworths.foundation.rewards.common.ui.emptystate;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.rewards.base.data.EmptyStateButtonData;
import au.com.woolworths.rewards.base.data.RewardsEmptyStateData;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/emptystate/RewardsEmptyStateDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/rewards/base/data/RewardsEmptyStateData;", "Companion", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsEmptyStateDataProvider implements PreviewParameterProvider<RewardsEmptyStateData> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/emptystate/RewardsEmptyStateDataProvider$Companion;", "", "Lau/com/woolworths/rewards/base/data/RewardsEmptyStateData;", "available", "Lau/com/woolworths/rewards/base/data/RewardsEmptyStateData;", "availableWithLongButton", "ended", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        new RewardsEmptyStateData(R.drawable.ic_rewards_booster, "More boosters coming soon", "You currently have no boosters waiting", new EmptyStateButtonData("title to click on", ""), null);
        new RewardsEmptyStateData(R.drawable.ic_rewards_booster, "You're all up to date", "Nothing to see here. Points boosters can be viewed for up to 7 days after they've ended", new EmptyStateButtonData("title to click on which can be ieukhfjwkljdh wkjhdg wqj,hd bkwqjdj jlwhd klwjd hwjhkd bwkjlhd wkdj wkudh wkludjh wliukdh ", ""), null);
        new RewardsEmptyStateData(R.drawable.ic_rewards_booster, "You're all up to date", "Nothing to see here. Points boosters can be viewed for up to 7 days after they've ended", null, null, 8, null);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
