package com.woolworths.scanlibrary.analytics.adobe;

import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.mobile.Analytics;
import com.woolworths.scanlibrary.analytics.ActionTracking;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.ScreenTracking;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/analytics/adobe/AdobeAnalyticsProvider;", "Lcom/woolworths/scanlibrary/analytics/AnalyticsProvider;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdobeAnalyticsProvider implements AnalyticsProvider {
    @Override // com.woolworths.scanlibrary.analytics.AnalyticsProvider
    public final void a(ScreenTracking screenTracking) {
        Analytics.c(screenTracking.f21137a, screenTracking.b);
    }

    @Override // com.woolworths.scanlibrary.analytics.AnalyticsProvider
    public final void b(ActionTracking actionTracking) {
        Analytics.b(actionTracking.f21135a, actionTracking.b);
    }
}
