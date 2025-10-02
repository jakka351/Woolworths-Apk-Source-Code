package au.com.woolworths.foundation.rewards.common.ui.emptystate;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/emptystate/RewardsEmptyStateStyle;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsEmptyStateStyle {
    public static final RewardsEmptyStateStyle d;
    public static final RewardsEmptyStateStyle e;
    public static final RewardsEmptyStateStyle f;
    public static final /* synthetic */ RewardsEmptyStateStyle[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        RewardsEmptyStateStyle rewardsEmptyStateStyle = new RewardsEmptyStateStyle("DEFAULT_PADDING", 0);
        d = rewardsEmptyStateStyle;
        RewardsEmptyStateStyle rewardsEmptyStateStyle2 = new RewardsEmptyStateStyle("CENTERED", 1);
        e = rewardsEmptyStateStyle2;
        RewardsEmptyStateStyle rewardsEmptyStateStyle3 = new RewardsEmptyStateStyle("NO_PADDING", 2);
        f = rewardsEmptyStateStyle3;
        RewardsEmptyStateStyle[] rewardsEmptyStateStyleArr = {rewardsEmptyStateStyle, rewardsEmptyStateStyle2, rewardsEmptyStateStyle3};
        g = rewardsEmptyStateStyleArr;
        h = EnumEntriesKt.a(rewardsEmptyStateStyleArr);
    }

    public static RewardsEmptyStateStyle valueOf(String str) {
        return (RewardsEmptyStateStyle) Enum.valueOf(RewardsEmptyStateStyle.class, str);
    }

    public static RewardsEmptyStateStyle[] values() {
        return (RewardsEmptyStateStyle[]) g.clone();
    }
}
