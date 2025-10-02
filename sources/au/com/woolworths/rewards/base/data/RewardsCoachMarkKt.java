package au.com.woolworths.rewards.base.data;

import au.com.woolworths.rewards.tooltip.Tooltip;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toTooltip", "Lau/com/woolworths/rewards/tooltip/Tooltip;", "Lau/com/woolworths/rewards/base/data/RewardsCoachMark;", "base-rewards-app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsCoachMarkKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RewardsCoachMarkAnchor.values().length];
            try {
                iArr[RewardsCoachMarkAnchor.ACCOUNT_TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardsCoachMarkAnchor.ACTIVITY_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardsCoachMarkAnchor.BOOSTERS_TAB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RewardsCoachMarkAnchor.CARD_TAB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RewardsCoachMarkAnchor.DISCOVER_TAB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final Tooltip toTooltip(@NotNull RewardsCoachMark rewardsCoachMark) {
        Intrinsics.h(rewardsCoachMark, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[rewardsCoachMark.getAnchor().ordinal()];
        Integer numValueOf = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : Integer.valueOf(R.id.action_discover) : Integer.valueOf(R.id.action_card) : Integer.valueOf(R.id.action_boosters) : Integer.valueOf(R.id.action_activity) : Integer.valueOf(R.id.action_account);
        if (numValueOf != null) {
            return new Tooltip.BottomNavigationTab(numValueOf.intValue(), rewardsCoachMark.getText());
        }
        return null;
    }
}
