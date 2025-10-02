package com.google.firebase.perf.application;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.util.Optional;
import java.util.HashMap;

/* loaded from: classes.dex */
public class FrameMetricsRecorder {
    public static final AndroidLogger e = AndroidLogger.e();

    /* renamed from: a, reason: collision with root package name */
    public final Activity f15669a;
    public final FrameMetricsAggregator b;
    public final HashMap c;
    public boolean d;

    public FrameMetricsRecorder(Activity activity) {
        FrameMetricsAggregator frameMetricsAggregator = new FrameMetricsAggregator();
        HashMap map = new HashMap();
        this.d = false;
        this.f15669a = activity;
        this.b = frameMetricsAggregator;
        this.c = map;
    }

    public final Optional a() {
        boolean z = this.d;
        AndroidLogger androidLogger = e;
        if (!z) {
            androidLogger.a("No recording has been started.");
            return new Optional();
        }
        SparseIntArray sparseIntArray = this.b.b()[0];
        if (sparseIntArray == null) {
            androidLogger.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new Optional();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int iKeyAt = sparseIntArray.keyAt(i4);
            int iValueAt = sparseIntArray.valueAt(i4);
            i += iValueAt;
            if (iKeyAt > 700) {
                i3 += iValueAt;
            }
            if (iKeyAt > 16) {
                i2 += iValueAt;
            }
        }
        return new Optional(new FrameMetricsCalculator.PerfFrameMetrics(i, i2, i3));
    }
}
