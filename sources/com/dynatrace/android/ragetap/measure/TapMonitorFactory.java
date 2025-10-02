package com.dynatrace.android.ragetap.measure;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetrics;
import com.dynatrace.android.ragetap.detection.RageTapDetector;
import com.dynatrace.android.window.WindowListenerFactory;

/* loaded from: classes.dex */
public class TapMonitorFactory implements WindowListenerFactory {
    public static final String c;

    /* renamed from: a, reason: collision with root package name */
    public final RageTapDetector f14179a;
    public final TimeLineProvider b;

    static {
        boolean z = Global.f14077a;
        c = "dtxTapMonitorFactory";
    }

    public TapMonitorFactory(RageTapDetector rageTapDetector, TimeLineProvider timeLineProvider) {
        this.f14179a = rageTapDetector;
        this.b = timeLineProvider;
    }

    @Override // com.dynatrace.android.window.WindowListenerFactory
    public final TapMonitor a() {
        float f;
        ScreenMetrics screenMetrics = AndroidMetrics.a().r;
        if (screenMetrics == null) {
            if (Global.f14077a) {
                Utility.h(c, "Cannot determine screen density as ScreenMetrics is null");
            }
            f = 1.0f;
        } else {
            f = screenMetrics.d;
        }
        return new TapMonitor(this.f14179a, new MotionEventConverter(f), this.b);
    }
}
