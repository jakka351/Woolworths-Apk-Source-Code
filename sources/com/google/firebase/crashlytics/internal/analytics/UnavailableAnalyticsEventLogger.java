package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.Logger;

/* loaded from: classes.dex */
public class UnavailableAnalyticsEventLogger implements AnalyticsEventLogger {
    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public final void c(Bundle bundle) {
        Logger.f15258a.b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
    }
}
