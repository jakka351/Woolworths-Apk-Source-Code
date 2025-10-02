package com.dynatrace.android.lifecycle.activitytracking;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetrics;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetricsListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class ActiveActivityMonitor implements ActiveActivityListener, ScreenMetricsListener {

    /* renamed from: a, reason: collision with root package name */
    public ActiveActivityTracker f14161a;

    @Override // com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetricsListener
    public final void a(ScreenMetrics screenMetrics) {
        AndroidMetrics androidMetricsA = AndroidMetrics.a();
        androidMetricsA.getClass();
        if (screenMetrics != null && screenMetrics.b > 0 && screenMetrics.f14162a > 0 && screenMetrics.c > 0) {
            float f = screenMetrics.d;
            if (f != Float.POSITIVE_INFINITY && f > BitmapDescriptorFactory.HUE_RED) {
                androidMetricsA.r = screenMetrics;
                return;
            }
        }
        if (Global.f14077a) {
            Utility.l(AndroidMetrics.u, "Rejecting invalid screen metrics: " + screenMetrics);
        }
        androidMetricsA.r = null;
    }

    @Override // com.dynatrace.android.lifecycle.activitytracking.ActiveActivityListener
    public final void b(String str) {
        AndroidMetrics.a().s = str;
    }
}
