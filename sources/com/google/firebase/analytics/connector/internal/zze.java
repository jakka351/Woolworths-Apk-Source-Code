package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;

/* loaded from: classes6.dex */
public final class zze implements zza {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f15185a;
    public final AnalyticsConnector.AnalyticsConnectorListener b;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.b = analyticsConnectorListener;
        appMeasurementSdk.registerOnMeasurementEventListener(new zzd(this));
        this.f15185a = new HashSet();
    }
}
