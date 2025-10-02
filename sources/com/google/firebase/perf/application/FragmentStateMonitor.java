package com.google.firebase.perf.application;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.ScreenTraceUtil;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class FragmentStateMonitor extends FragmentManager.FragmentLifecycleCallbacks {
    public static final AndroidLogger f = AndroidLogger.e();

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f15668a = new WeakHashMap();
    public final Clock b;
    public final TransportManager c;
    public final AppStateMonitor d;
    public final FrameMetricsRecorder e;

    public FragmentStateMonitor(Clock clock, TransportManager transportManager, AppStateMonitor appStateMonitor, FrameMetricsRecorder frameMetricsRecorder) {
        this.b = clock;
        this.c = transportManager;
        this.d = appStateMonitor;
        this.e = frameMetricsRecorder;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void c(Fragment fragment2) {
        Optional optional;
        Object[] objArr = {fragment2.getClass().getSimpleName()};
        AndroidLogger androidLogger = f;
        androidLogger.b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap weakHashMap = this.f15668a;
        if (!weakHashMap.containsKey(fragment2)) {
            androidLogger.h("FragmentMonitor: missed a fragment trace from %s", fragment2.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) weakHashMap.get(fragment2);
        weakHashMap.remove(fragment2);
        FrameMetricsRecorder frameMetricsRecorder = this.e;
        HashMap map = frameMetricsRecorder.c;
        AndroidLogger androidLogger2 = FrameMetricsRecorder.e;
        if (!frameMetricsRecorder.d) {
            androidLogger2.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            optional = new Optional();
        } else if (map.containsKey(fragment2)) {
            FrameMetricsCalculator.PerfFrameMetrics perfFrameMetrics = (FrameMetricsCalculator.PerfFrameMetrics) map.remove(fragment2);
            Optional optionalA = frameMetricsRecorder.a();
            if (optionalA.b()) {
                FrameMetricsCalculator.PerfFrameMetrics perfFrameMetrics2 = (FrameMetricsCalculator.PerfFrameMetrics) optionalA.a();
                optional = new Optional(new FrameMetricsCalculator.PerfFrameMetrics(perfFrameMetrics2.f15704a - perfFrameMetrics.f15704a, perfFrameMetrics2.b - perfFrameMetrics.b, perfFrameMetrics2.c - perfFrameMetrics.c));
            } else {
                androidLogger2.b("stopFragment(%s): snapshot() failed", fragment2.getClass().getSimpleName());
                optional = new Optional();
            }
        } else {
            androidLogger2.b("Sub-recording associated with key %s was not started or does not exist", fragment2.getClass().getSimpleName());
            optional = new Optional();
        }
        if (!optional.b()) {
            androidLogger.h("onFragmentPaused: recorder failed to trace %s", fragment2.getClass().getSimpleName());
        } else {
            ScreenTraceUtil.a(trace, (FrameMetricsCalculator.PerfFrameMetrics) optional.a());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void d(Fragment fragment2) {
        f.b("FragmentMonitor %s.onFragmentResumed", fragment2.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment2.getClass().getSimpleName()), this.c, this.b, this.d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment2.getParentFragment() == null ? "No parent" : fragment2.getParentFragment().getClass().getSimpleName());
        if (fragment2.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment2.getActivity().getClass().getSimpleName());
        }
        this.f15668a.put(fragment2, trace);
        FrameMetricsRecorder frameMetricsRecorder = this.e;
        HashMap map = frameMetricsRecorder.c;
        AndroidLogger androidLogger = FrameMetricsRecorder.e;
        if (!frameMetricsRecorder.d) {
            androidLogger.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (map.containsKey(fragment2)) {
            androidLogger.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment2.getClass().getSimpleName());
            return;
        }
        Optional optionalA = frameMetricsRecorder.a();
        if (optionalA.b()) {
            map.put(fragment2, (FrameMetricsCalculator.PerfFrameMetrics) optionalA.a());
        } else {
            androidLogger.b("startFragment(%s): snapshot() failed", fragment2.getClass().getSimpleName());
        }
    }
}
