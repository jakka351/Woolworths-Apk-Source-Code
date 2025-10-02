package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* loaded from: classes.dex */
public class CrashlyticsOriginAnalyticsEventLogger implements AnalyticsEventLogger {
    public final AnalyticsConnector d;

    public CrashlyticsOriginAnalyticsEventLogger(AnalyticsConnector analyticsConnector) {
        this.d = analyticsConnector;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public final void c(Bundle bundle) {
        this.d.a("clx", "_ae", bundle);
    }
}
