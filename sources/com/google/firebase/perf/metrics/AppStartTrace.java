package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.FirstDrawDoneListener;
import com.google.firebase.perf.util.PreDrawListener;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, LifecycleObserver {
    public static volatile AppStartTrace A;
    public static ThreadPoolExecutor B;
    public static final Timer y = new Timer();
    public static final long z = TimeUnit.MINUTES.toMicros(1);
    public final TransportManager e;
    public final ConfigResolver f;
    public final TraceMetric.Builder g;
    public Application h;
    public final Timer j;
    public final Timer k;
    public PerfSession t;
    public boolean d = false;
    public boolean i = false;
    public Timer l = null;
    public Timer m = null;
    public Timer n = null;
    public Timer o = null;
    public Timer p = null;
    public Timer q = null;
    public Timer r = null;
    public Timer s = null;
    public boolean u = false;
    public int v = 0;
    public final DrawCounter w = new DrawCounter();
    public boolean x = false;

    public final class DrawCounter implements ViewTreeObserver.OnDrawListener {
        public DrawCounter() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            AppStartTrace.this.v++;
        }
    }

    public static class StartFromBackgroundRunnable implements Runnable {
        public final AppStartTrace d;

        public StartFromBackgroundRunnable(AppStartTrace appStartTrace) {
            this.d = appStartTrace;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppStartTrace appStartTrace = this.d;
            if (appStartTrace.l == null) {
                appStartTrace.u = true;
            }
        }
    }

    public AppStartTrace(TransportManager transportManager, Clock clock, ConfigResolver configResolver, ThreadPoolExecutor threadPoolExecutor) {
        Timer timer = null;
        this.e = transportManager;
        this.f = configResolver;
        B = threadPoolExecutor;
        TraceMetric.Builder builderE0 = TraceMetric.e0();
        builderE0.y("_experiment_app_start_ttid");
        this.g = builderE0;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        long micros2 = timeUnit.toMicros(System.currentTimeMillis());
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        this.j = new Timer((micros - timeUnit2.toMicros(SystemClock.elapsedRealtimeNanos())) + micros2, micros);
        StartupTime startupTime = (StartupTime) FirebaseApp.d().b(StartupTime.class);
        if (startupTime != null) {
            long micros3 = timeUnit.toMicros(startupTime.a());
            timer = new Timer((micros3 - timeUnit2.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros3);
        }
        this.k = timer;
    }

    public static boolean c(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String strG = YU.a.g(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strG))) {
                return true;
            }
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public final Timer a() {
        Timer timer = this.k;
        return timer != null ? timer : y;
    }

    public final Timer b() {
        Timer timer = this.j;
        return timer != null ? timer : a();
    }

    public final void d(TraceMetric.Builder builder) {
        if (this.q == null || this.r == null || this.s == null) {
            return;
        }
        B.execute(new com.auth0.android.request.internal.a(2, this, builder));
        e();
    }

    public final synchronized void e() {
        if (this.d) {
            ProcessLifecycleOwner.l.i.c(this);
            this.h.unregisterActivityLifecycleCallbacks(this);
            this.d = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (!this.u && this.l == null) {
                this.x = this.x || c(this.h);
                new WeakReference(activity);
                this.l = new Timer();
                if (b().b(this.l) > z) {
                    this.i = true;
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.u || this.i || !this.f.f() || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.w);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.firebase.perf.metrics.a] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.firebase.perf.metrics.a] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.firebase.perf.metrics.a] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.u && !this.i) {
                boolean zF = this.f.f();
                if (zF && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.w);
                    final int i = 0;
                    FirstDrawDoneListener.a(viewFindViewById, new Runnable(this) { // from class: com.google.firebase.perf.metrics.a
                        public final /* synthetic */ AppStartTrace e;

                        {
                            this.e = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            AppStartTrace appStartTrace = this.e;
                            switch (i2) {
                                case 0:
                                    TraceMetric.Builder builder = appStartTrace.g;
                                    if (appStartTrace.s == null) {
                                        appStartTrace.s = new Timer();
                                        TraceMetric.Builder builderE0 = TraceMetric.e0();
                                        builderE0.y("_experiment_onDrawFoQ");
                                        builderE0.v(appStartTrace.b().d);
                                        builderE0.w(appStartTrace.b().b(appStartTrace.s));
                                        builder.t((TraceMetric) builderE0.m());
                                        if (appStartTrace.j != null) {
                                            TraceMetric.Builder builderE02 = TraceMetric.e0();
                                            builderE02.y("_experiment_procStart_to_classLoad");
                                            builderE02.v(appStartTrace.b().d);
                                            builderE02.w(appStartTrace.b().b(appStartTrace.a()));
                                            builder.t((TraceMetric) builderE02.m());
                                        }
                                        String str = appStartTrace.x ? "true" : "false";
                                        builder.p();
                                        TraceMetric.P((TraceMetric) builder.e).put("systemDeterminedForeground", str);
                                        builder.u(appStartTrace.v, "onDrawCount");
                                        com.google.firebase.perf.v1.PerfSession perfSessionA = appStartTrace.t.a();
                                        builder.p();
                                        TraceMetric.Q((TraceMetric) builder.e, perfSessionA);
                                        appStartTrace.d(builder);
                                        break;
                                    }
                                    break;
                                case 1:
                                    TraceMetric.Builder builder2 = appStartTrace.g;
                                    if (appStartTrace.q == null) {
                                        appStartTrace.q = new Timer();
                                        builder2.v(appStartTrace.b().d);
                                        builder2.w(appStartTrace.b().b(appStartTrace.q));
                                        appStartTrace.d(builder2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    TraceMetric.Builder builder3 = appStartTrace.g;
                                    if (appStartTrace.r == null) {
                                        appStartTrace.r = new Timer();
                                        TraceMetric.Builder builderE03 = TraceMetric.e0();
                                        builderE03.y("_experiment_preDrawFoQ");
                                        builderE03.v(appStartTrace.b().d);
                                        builderE03.w(appStartTrace.b().b(appStartTrace.r));
                                        builder3.t((TraceMetric) builderE03.m());
                                        appStartTrace.d(builder3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer = AppStartTrace.y;
                                    TraceMetric.Builder builderE04 = TraceMetric.e0();
                                    builderE04.y("_as");
                                    builderE04.v(appStartTrace.a().d);
                                    builderE04.w(appStartTrace.a().b(appStartTrace.n));
                                    ArrayList arrayList = new ArrayList(3);
                                    TraceMetric.Builder builderE05 = TraceMetric.e0();
                                    builderE05.y("_astui");
                                    builderE05.v(appStartTrace.a().d);
                                    builderE05.w(appStartTrace.a().b(appStartTrace.l));
                                    arrayList.add((TraceMetric) builderE05.m());
                                    if (appStartTrace.m != null) {
                                        TraceMetric.Builder builderE06 = TraceMetric.e0();
                                        builderE06.y("_astfd");
                                        builderE06.v(appStartTrace.l.d);
                                        builderE06.w(appStartTrace.l.b(appStartTrace.m));
                                        arrayList.add((TraceMetric) builderE06.m());
                                        TraceMetric.Builder builderE07 = TraceMetric.e0();
                                        builderE07.y("_asti");
                                        builderE07.v(appStartTrace.m.d);
                                        builderE07.w(appStartTrace.m.b(appStartTrace.n));
                                        arrayList.add((TraceMetric) builderE07.m());
                                    }
                                    builderE04.p();
                                    TraceMetric.O((TraceMetric) builderE04.e, arrayList);
                                    com.google.firebase.perf.v1.PerfSession perfSessionA2 = appStartTrace.t.a();
                                    builderE04.p();
                                    TraceMetric.Q((TraceMetric) builderE04.e, perfSessionA2);
                                    appStartTrace.e.c((TraceMetric) builderE04.m(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    });
                    final int i2 = 1;
                    final int i3 = 2;
                    PreDrawListener.a(viewFindViewById, new Runnable(this) { // from class: com.google.firebase.perf.metrics.a
                        public final /* synthetic */ AppStartTrace e;

                        {
                            this.e = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = i2;
                            AppStartTrace appStartTrace = this.e;
                            switch (i22) {
                                case 0:
                                    TraceMetric.Builder builder = appStartTrace.g;
                                    if (appStartTrace.s == null) {
                                        appStartTrace.s = new Timer();
                                        TraceMetric.Builder builderE0 = TraceMetric.e0();
                                        builderE0.y("_experiment_onDrawFoQ");
                                        builderE0.v(appStartTrace.b().d);
                                        builderE0.w(appStartTrace.b().b(appStartTrace.s));
                                        builder.t((TraceMetric) builderE0.m());
                                        if (appStartTrace.j != null) {
                                            TraceMetric.Builder builderE02 = TraceMetric.e0();
                                            builderE02.y("_experiment_procStart_to_classLoad");
                                            builderE02.v(appStartTrace.b().d);
                                            builderE02.w(appStartTrace.b().b(appStartTrace.a()));
                                            builder.t((TraceMetric) builderE02.m());
                                        }
                                        String str = appStartTrace.x ? "true" : "false";
                                        builder.p();
                                        TraceMetric.P((TraceMetric) builder.e).put("systemDeterminedForeground", str);
                                        builder.u(appStartTrace.v, "onDrawCount");
                                        com.google.firebase.perf.v1.PerfSession perfSessionA = appStartTrace.t.a();
                                        builder.p();
                                        TraceMetric.Q((TraceMetric) builder.e, perfSessionA);
                                        appStartTrace.d(builder);
                                        break;
                                    }
                                    break;
                                case 1:
                                    TraceMetric.Builder builder2 = appStartTrace.g;
                                    if (appStartTrace.q == null) {
                                        appStartTrace.q = new Timer();
                                        builder2.v(appStartTrace.b().d);
                                        builder2.w(appStartTrace.b().b(appStartTrace.q));
                                        appStartTrace.d(builder2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    TraceMetric.Builder builder3 = appStartTrace.g;
                                    if (appStartTrace.r == null) {
                                        appStartTrace.r = new Timer();
                                        TraceMetric.Builder builderE03 = TraceMetric.e0();
                                        builderE03.y("_experiment_preDrawFoQ");
                                        builderE03.v(appStartTrace.b().d);
                                        builderE03.w(appStartTrace.b().b(appStartTrace.r));
                                        builder3.t((TraceMetric) builderE03.m());
                                        appStartTrace.d(builder3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer = AppStartTrace.y;
                                    TraceMetric.Builder builderE04 = TraceMetric.e0();
                                    builderE04.y("_as");
                                    builderE04.v(appStartTrace.a().d);
                                    builderE04.w(appStartTrace.a().b(appStartTrace.n));
                                    ArrayList arrayList = new ArrayList(3);
                                    TraceMetric.Builder builderE05 = TraceMetric.e0();
                                    builderE05.y("_astui");
                                    builderE05.v(appStartTrace.a().d);
                                    builderE05.w(appStartTrace.a().b(appStartTrace.l));
                                    arrayList.add((TraceMetric) builderE05.m());
                                    if (appStartTrace.m != null) {
                                        TraceMetric.Builder builderE06 = TraceMetric.e0();
                                        builderE06.y("_astfd");
                                        builderE06.v(appStartTrace.l.d);
                                        builderE06.w(appStartTrace.l.b(appStartTrace.m));
                                        arrayList.add((TraceMetric) builderE06.m());
                                        TraceMetric.Builder builderE07 = TraceMetric.e0();
                                        builderE07.y("_asti");
                                        builderE07.v(appStartTrace.m.d);
                                        builderE07.w(appStartTrace.m.b(appStartTrace.n));
                                        arrayList.add((TraceMetric) builderE07.m());
                                    }
                                    builderE04.p();
                                    TraceMetric.O((TraceMetric) builderE04.e, arrayList);
                                    com.google.firebase.perf.v1.PerfSession perfSessionA2 = appStartTrace.t.a();
                                    builderE04.p();
                                    TraceMetric.Q((TraceMetric) builderE04.e, perfSessionA2);
                                    appStartTrace.e.c((TraceMetric) builderE04.m(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }, new Runnable(this) { // from class: com.google.firebase.perf.metrics.a
                        public final /* synthetic */ AppStartTrace e;

                        {
                            this.e = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = i3;
                            AppStartTrace appStartTrace = this.e;
                            switch (i22) {
                                case 0:
                                    TraceMetric.Builder builder = appStartTrace.g;
                                    if (appStartTrace.s == null) {
                                        appStartTrace.s = new Timer();
                                        TraceMetric.Builder builderE0 = TraceMetric.e0();
                                        builderE0.y("_experiment_onDrawFoQ");
                                        builderE0.v(appStartTrace.b().d);
                                        builderE0.w(appStartTrace.b().b(appStartTrace.s));
                                        builder.t((TraceMetric) builderE0.m());
                                        if (appStartTrace.j != null) {
                                            TraceMetric.Builder builderE02 = TraceMetric.e0();
                                            builderE02.y("_experiment_procStart_to_classLoad");
                                            builderE02.v(appStartTrace.b().d);
                                            builderE02.w(appStartTrace.b().b(appStartTrace.a()));
                                            builder.t((TraceMetric) builderE02.m());
                                        }
                                        String str = appStartTrace.x ? "true" : "false";
                                        builder.p();
                                        TraceMetric.P((TraceMetric) builder.e).put("systemDeterminedForeground", str);
                                        builder.u(appStartTrace.v, "onDrawCount");
                                        com.google.firebase.perf.v1.PerfSession perfSessionA = appStartTrace.t.a();
                                        builder.p();
                                        TraceMetric.Q((TraceMetric) builder.e, perfSessionA);
                                        appStartTrace.d(builder);
                                        break;
                                    }
                                    break;
                                case 1:
                                    TraceMetric.Builder builder2 = appStartTrace.g;
                                    if (appStartTrace.q == null) {
                                        appStartTrace.q = new Timer();
                                        builder2.v(appStartTrace.b().d);
                                        builder2.w(appStartTrace.b().b(appStartTrace.q));
                                        appStartTrace.d(builder2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    TraceMetric.Builder builder3 = appStartTrace.g;
                                    if (appStartTrace.r == null) {
                                        appStartTrace.r = new Timer();
                                        TraceMetric.Builder builderE03 = TraceMetric.e0();
                                        builderE03.y("_experiment_preDrawFoQ");
                                        builderE03.v(appStartTrace.b().d);
                                        builderE03.w(appStartTrace.b().b(appStartTrace.r));
                                        builder3.t((TraceMetric) builderE03.m());
                                        appStartTrace.d(builder3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer = AppStartTrace.y;
                                    TraceMetric.Builder builderE04 = TraceMetric.e0();
                                    builderE04.y("_as");
                                    builderE04.v(appStartTrace.a().d);
                                    builderE04.w(appStartTrace.a().b(appStartTrace.n));
                                    ArrayList arrayList = new ArrayList(3);
                                    TraceMetric.Builder builderE05 = TraceMetric.e0();
                                    builderE05.y("_astui");
                                    builderE05.v(appStartTrace.a().d);
                                    builderE05.w(appStartTrace.a().b(appStartTrace.l));
                                    arrayList.add((TraceMetric) builderE05.m());
                                    if (appStartTrace.m != null) {
                                        TraceMetric.Builder builderE06 = TraceMetric.e0();
                                        builderE06.y("_astfd");
                                        builderE06.v(appStartTrace.l.d);
                                        builderE06.w(appStartTrace.l.b(appStartTrace.m));
                                        arrayList.add((TraceMetric) builderE06.m());
                                        TraceMetric.Builder builderE07 = TraceMetric.e0();
                                        builderE07.y("_asti");
                                        builderE07.v(appStartTrace.m.d);
                                        builderE07.w(appStartTrace.m.b(appStartTrace.n));
                                        arrayList.add((TraceMetric) builderE07.m());
                                    }
                                    builderE04.p();
                                    TraceMetric.O((TraceMetric) builderE04.e, arrayList);
                                    com.google.firebase.perf.v1.PerfSession perfSessionA2 = appStartTrace.t.a();
                                    builderE04.p();
                                    TraceMetric.Q((TraceMetric) builderE04.e, perfSessionA2);
                                    appStartTrace.e.c((TraceMetric) builderE04.m(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    });
                }
                if (this.n != null) {
                    return;
                }
                new WeakReference(activity);
                this.n = new Timer();
                this.t = SessionManager.getInstance().perfSession();
                AndroidLogger.e().a("onResume(): " + activity.getClass().getName() + ": " + a().b(this.n) + " microseconds");
                final int i4 = 3;
                B.execute(new Runnable(this) { // from class: com.google.firebase.perf.metrics.a
                    public final /* synthetic */ AppStartTrace e;

                    {
                        this.e = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i22 = i4;
                        AppStartTrace appStartTrace = this.e;
                        switch (i22) {
                            case 0:
                                TraceMetric.Builder builder = appStartTrace.g;
                                if (appStartTrace.s == null) {
                                    appStartTrace.s = new Timer();
                                    TraceMetric.Builder builderE0 = TraceMetric.e0();
                                    builderE0.y("_experiment_onDrawFoQ");
                                    builderE0.v(appStartTrace.b().d);
                                    builderE0.w(appStartTrace.b().b(appStartTrace.s));
                                    builder.t((TraceMetric) builderE0.m());
                                    if (appStartTrace.j != null) {
                                        TraceMetric.Builder builderE02 = TraceMetric.e0();
                                        builderE02.y("_experiment_procStart_to_classLoad");
                                        builderE02.v(appStartTrace.b().d);
                                        builderE02.w(appStartTrace.b().b(appStartTrace.a()));
                                        builder.t((TraceMetric) builderE02.m());
                                    }
                                    String str = appStartTrace.x ? "true" : "false";
                                    builder.p();
                                    TraceMetric.P((TraceMetric) builder.e).put("systemDeterminedForeground", str);
                                    builder.u(appStartTrace.v, "onDrawCount");
                                    com.google.firebase.perf.v1.PerfSession perfSessionA = appStartTrace.t.a();
                                    builder.p();
                                    TraceMetric.Q((TraceMetric) builder.e, perfSessionA);
                                    appStartTrace.d(builder);
                                    break;
                                }
                                break;
                            case 1:
                                TraceMetric.Builder builder2 = appStartTrace.g;
                                if (appStartTrace.q == null) {
                                    appStartTrace.q = new Timer();
                                    builder2.v(appStartTrace.b().d);
                                    builder2.w(appStartTrace.b().b(appStartTrace.q));
                                    appStartTrace.d(builder2);
                                    break;
                                }
                                break;
                            case 2:
                                TraceMetric.Builder builder3 = appStartTrace.g;
                                if (appStartTrace.r == null) {
                                    appStartTrace.r = new Timer();
                                    TraceMetric.Builder builderE03 = TraceMetric.e0();
                                    builderE03.y("_experiment_preDrawFoQ");
                                    builderE03.v(appStartTrace.b().d);
                                    builderE03.w(appStartTrace.b().b(appStartTrace.r));
                                    builder3.t((TraceMetric) builderE03.m());
                                    appStartTrace.d(builder3);
                                    break;
                                }
                                break;
                            default:
                                Timer timer = AppStartTrace.y;
                                TraceMetric.Builder builderE04 = TraceMetric.e0();
                                builderE04.y("_as");
                                builderE04.v(appStartTrace.a().d);
                                builderE04.w(appStartTrace.a().b(appStartTrace.n));
                                ArrayList arrayList = new ArrayList(3);
                                TraceMetric.Builder builderE05 = TraceMetric.e0();
                                builderE05.y("_astui");
                                builderE05.v(appStartTrace.a().d);
                                builderE05.w(appStartTrace.a().b(appStartTrace.l));
                                arrayList.add((TraceMetric) builderE05.m());
                                if (appStartTrace.m != null) {
                                    TraceMetric.Builder builderE06 = TraceMetric.e0();
                                    builderE06.y("_astfd");
                                    builderE06.v(appStartTrace.l.d);
                                    builderE06.w(appStartTrace.l.b(appStartTrace.m));
                                    arrayList.add((TraceMetric) builderE06.m());
                                    TraceMetric.Builder builderE07 = TraceMetric.e0();
                                    builderE07.y("_asti");
                                    builderE07.v(appStartTrace.m.d);
                                    builderE07.w(appStartTrace.m.b(appStartTrace.n));
                                    arrayList.add((TraceMetric) builderE07.m());
                                }
                                builderE04.p();
                                TraceMetric.O((TraceMetric) builderE04.e, arrayList);
                                com.google.firebase.perf.v1.PerfSession perfSessionA2 = appStartTrace.t.a();
                                builderE04.p();
                                TraceMetric.Q((TraceMetric) builderE04.e, perfSessionA2);
                                appStartTrace.e.c((TraceMetric) builderE04.m(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                                break;
                        }
                    }
                });
                if (!zF) {
                    e();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.u && this.m == null && !this.i) {
            this.m = new Timer();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Keep
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.u || this.i || this.p != null) {
            return;
        }
        this.p = new Timer();
        TraceMetric.Builder builderE0 = TraceMetric.e0();
        builderE0.y("_experiment_firstBackgrounding");
        builderE0.v(b().d);
        builderE0.w(b().b(this.p));
        this.g.t((TraceMetric) builderE0.m());
    }

    @Keep
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onAppEnteredForeground() {
        if (this.u || this.i || this.o != null) {
            return;
        }
        this.o = new Timer();
        TraceMetric.Builder builderE0 = TraceMetric.e0();
        builderE0.y("_experiment_firstForegrounding");
        builderE0.v(b().d);
        builderE0.w(b().b(this.o));
        this.g.t((TraceMetric) builderE0.m());
    }
}
