package au.com.woolworths.rewards.base.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.base.analytics.TealiumEventBundlingRule;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/analytics/IncludeOfferImpressions;", "Lau/com/woolworths/rewards/base/analytics/TealiumEventBundlingRule$IncludeRule;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IncludeOfferImpressions implements TealiumEventBundlingRule.IncludeRule {

    /* renamed from: a, reason: collision with root package name */
    public static final IncludeOfferImpressions f9356a = new IncludeOfferImpressions();

    @Override // au.com.woolworths.rewards.base.analytics.TealiumEventBundlingRule
    public final boolean a(String tealiumEventKey, Map contextData) {
        Intrinsics.h(tealiumEventKey, "tealiumEventKey");
        Intrinsics.h(contextData, "contextData");
        return tealiumEventKey.equals("offer_impression");
    }
}
