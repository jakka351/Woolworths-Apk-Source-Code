package com.google.firebase.perf.util;

import YU.a;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.metrics.Trace;

/* loaded from: classes.dex */
public class ScreenTraceUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidLogger f15724a = AndroidLogger.e();

    public static void a(Trace trace, FrameMetricsCalculator.PerfFrameMetrics perfFrameMetrics) {
        int i = perfFrameMetrics.f15704a;
        int i2 = perfFrameMetrics.c;
        int i3 = perfFrameMetrics.b;
        if (i > 0) {
            trace.putMetric("_fr_tot", i);
        }
        if (i3 > 0) {
            trace.putMetric("_fr_slo", i3);
        }
        if (i2 > 0) {
            trace.putMetric("_fr_fzn", i2);
        }
        StringBuilder sb = new StringBuilder("Screen trace: ");
        sb.append(trace.g);
        sb.append(" _fr_tot:");
        a.w(perfFrameMetrics.f15704a, i3, " _fr_slo:", " _fr_fzn:", sb);
        sb.append(i2);
        f15724a.a(sb.toString());
    }
}
