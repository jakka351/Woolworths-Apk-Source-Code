package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import java.util.Locale;

/* loaded from: classes.dex */
class CrashlyticsAnalyticsListener implements AnalyticsConnector.AnalyticsConnectorListener {

    /* renamed from: a, reason: collision with root package name */
    public BlockingAnalyticsEventLogger f15248a;
    public BreadcrumbAnalyticsEventReceiver b;

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public final void a(int i, Bundle bundle) {
        Locale locale = Locale.US;
        Logger.f15258a.e("Analytics listener received message. ID: " + i + ", Extras: " + bundle);
        String string = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            AnalyticsEventReceiver analyticsEventReceiver = "clx".equals(bundle2.getString("_o")) ? this.f15248a : this.b;
            if (analyticsEventReceiver == null) {
                return;
            }
            analyticsEventReceiver.b(bundle2, string);
        }
    }
}
