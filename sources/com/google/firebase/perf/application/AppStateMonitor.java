package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.ScreenTraceUtil;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class AppStateMonitor implements Application.ActivityLifecycleCallbacks {
    public static final AndroidLogger u = AndroidLogger.e();
    public static volatile AppStateMonitor v;
    public final WeakHashMap d;
    public final WeakHashMap e;
    public final WeakHashMap f;
    public final WeakHashMap g;
    public final HashMap h;
    public final HashSet i;
    public final HashSet j;
    public final AtomicInteger k;
    public final TransportManager l;
    public final ConfigResolver m;
    public final Clock n;
    public final boolean o;
    public Timer p;
    public Timer q;
    public ApplicationProcessState r;
    public boolean s;
    public boolean t;

    public interface AppColdStartCallback {
        void a();
    }

    public interface AppStateCallback {
        void onUpdateAppState(ApplicationProcessState applicationProcessState);
    }

    public AppStateMonitor(TransportManager transportManager, Clock clock) {
        ConfigResolver configResolverE = ConfigResolver.e();
        AndroidLogger androidLogger = FrameMetricsRecorder.e;
        this.d = new WeakHashMap();
        this.e = new WeakHashMap();
        this.f = new WeakHashMap();
        this.g = new WeakHashMap();
        this.h = new HashMap();
        this.i = new HashSet();
        this.j = new HashSet();
        this.k = new AtomicInteger(0);
        this.r = ApplicationProcessState.BACKGROUND;
        this.s = false;
        this.t = true;
        this.l = transportManager;
        this.n = clock;
        this.m = configResolverE;
        this.o = true;
    }

    public static AppStateMonitor a() {
        if (v == null) {
            synchronized (AppStateMonitor.class) {
                try {
                    if (v == null) {
                        v = new AppStateMonitor(TransportManager.v, new Clock());
                    }
                } finally {
                }
            }
        }
        return v;
    }

    public final void b(String str) {
        synchronized (this.h) {
            try {
                Long l = (Long) this.h.get(str);
                if (l == null) {
                    this.h.put(str, 1L);
                } else {
                    this.h.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Activity activity) {
        Optional optional;
        WeakHashMap weakHashMap = this.g;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        FrameMetricsRecorder frameMetricsRecorder = (FrameMetricsRecorder) this.e.get(activity);
        FrameMetricsAggregator frameMetricsAggregator = frameMetricsRecorder.b;
        HashMap map = frameMetricsRecorder.c;
        AndroidLogger androidLogger = FrameMetricsRecorder.e;
        if (frameMetricsRecorder.d) {
            if (!map.isEmpty()) {
                androidLogger.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                map.clear();
            }
            Optional optionalA = frameMetricsRecorder.a();
            try {
                frameMetricsAggregator.c(frameMetricsRecorder.f15669a);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                androidLogger.h("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                optionalA = new Optional();
            }
            frameMetricsAggregator.d();
            frameMetricsRecorder.d = false;
            optional = optionalA;
        } else {
            androidLogger.a("Cannot stop because no recording was started");
            optional = new Optional();
        }
        if (optional.b()) {
            ScreenTraceUtil.a(trace, (FrameMetricsCalculator.PerfFrameMetrics) optional.a());
            trace.stop();
        } else {
            u.h("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        }
    }

    public final void d(String str, Timer timer, Timer timer2) {
        if (this.m.q()) {
            TraceMetric.Builder builderE0 = TraceMetric.e0();
            builderE0.y(str);
            builderE0.v(timer.d);
            builderE0.w(timer.b(timer2));
            PerfSession perfSessionA = SessionManager.getInstance().perfSession().a();
            builderE0.p();
            TraceMetric.Q((TraceMetric) builderE0.e, perfSessionA);
            int andSet = this.k.getAndSet(0);
            synchronized (this.h) {
                try {
                    HashMap map = this.h;
                    builderE0.p();
                    TraceMetric.M((TraceMetric) builderE0.e).putAll(map);
                    if (andSet != 0) {
                        builderE0.u(andSet, "_tsns");
                    }
                    this.h.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.l.c((TraceMetric) builderE0.m(), ApplicationProcessState.FOREGROUND_BACKGROUND);
        }
    }

    public final void e(Activity activity) {
        if (this.o && this.m.q()) {
            FrameMetricsRecorder frameMetricsRecorder = new FrameMetricsRecorder(activity);
            this.e.put(activity, frameMetricsRecorder);
            if (activity instanceof FragmentActivity) {
                FragmentStateMonitor fragmentStateMonitor = new FragmentStateMonitor(this.n, this.l, this, frameMetricsRecorder);
                this.f.put(activity, fragmentStateMonitor);
                ((FragmentActivity) activity).getSupportFragmentManager().e0(fragmentStateMonitor, true);
            }
        }
    }

    public final void f(ApplicationProcessState applicationProcessState) {
        this.r = applicationProcessState;
        synchronized (this.i) {
            try {
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    AppStateCallback appStateCallback = (AppStateCallback) ((WeakReference) it.next()).get();
                    if (appStateCallback != null) {
                        appStateCallback.onUpdateAppState(this.r);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.e.remove(activity);
        WeakHashMap weakHashMap = this.f;
        if (weakHashMap.containsKey(activity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().u0((FragmentManager.FragmentLifecycleCallbacks) weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        if (this.d.isEmpty()) {
            this.n.getClass();
            this.p = new Timer();
            this.d.put(activity, Boolean.TRUE);
            if (this.t) {
                f(ApplicationProcessState.FOREGROUND);
                synchronized (this.j) {
                    try {
                        Iterator it = this.j.iterator();
                        while (it.hasNext()) {
                            AppColdStartCallback appColdStartCallback = (AppColdStartCallback) it.next();
                            if (appColdStartCallback != null) {
                                appColdStartCallback.a();
                            }
                        }
                    } finally {
                    }
                }
                this.t = false;
            } else {
                d("_bs", this.q, this.p);
                f(ApplicationProcessState.FOREGROUND);
            }
        } else {
            this.d.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.o && this.m.q()) {
                if (!this.e.containsKey(activity)) {
                    e(activity);
                }
                FrameMetricsRecorder frameMetricsRecorder = (FrameMetricsRecorder) this.e.get(activity);
                Activity activity2 = frameMetricsRecorder.f15669a;
                if (frameMetricsRecorder.d) {
                    FrameMetricsRecorder.e.b("FrameMetricsAggregator is already recording %s", activity2.getClass().getSimpleName());
                } else {
                    frameMetricsRecorder.b.a(activity2);
                    frameMetricsRecorder.d = true;
                }
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.l, this.n, this);
                trace.start();
                this.g.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.o) {
                c(activity);
            }
            if (this.d.containsKey(activity)) {
                this.d.remove(activity);
                if (this.d.isEmpty()) {
                    this.n.getClass();
                    Timer timer = new Timer();
                    this.q = timer;
                    d("_fs", this.p, timer);
                    f(ApplicationProcessState.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
