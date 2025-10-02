package au.com.woolworths.rewards.base.analytics;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/rewards/base/analytics/TealiumEventBundlingRule;", "", "MustExcludeRule", "IncludeRule", "ExcludedRule", "Lau/com/woolworths/rewards/base/analytics/TealiumEventBundlingRule$ExcludedRule;", "Lau/com/woolworths/rewards/base/analytics/TealiumEventBundlingRule$IncludeRule;", "Lau/com/woolworths/rewards/base/analytics/TealiumEventBundlingRule$MustExcludeRule;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TealiumEventBundlingRule {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/rewards/base/analytics/TealiumEventBundlingRule$ExcludedRule;", "Lau/com/woolworths/rewards/base/analytics/TealiumEventBundlingRule;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ExcludedRule extends TealiumEventBundlingRule {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/rewards/base/analytics/TealiumEventBundlingRule$IncludeRule;", "Lau/com/woolworths/rewards/base/analytics/TealiumEventBundlingRule;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface IncludeRule extends TealiumEventBundlingRule {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/rewards/base/analytics/TealiumEventBundlingRule$MustExcludeRule;", "Lau/com/woolworths/rewards/base/analytics/TealiumEventBundlingRule;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface MustExcludeRule extends TealiumEventBundlingRule {
    }

    boolean a(String str, Map map);
}
