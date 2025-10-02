package com.google.firebase.perf;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.injection.components.DaggerFirebasePerformanceComponent;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Keep
/* loaded from: classes.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static FirebasePerfEarly lambda$getComponents$0(Qualified qualified, ComponentContainer componentContainer) {
        AppStartTrace appStartTrace;
        FirebaseApp firebaseApp = (FirebaseApp) componentContainer.a(FirebaseApp.class);
        StartupTime startupTime = (StartupTime) componentContainer.c(StartupTime.class).get();
        Executor executor = (Executor) componentContainer.h(qualified);
        FirebasePerfEarly firebasePerfEarly = new FirebasePerfEarly();
        firebaseApp.a();
        Context context = firebaseApp.f15169a;
        ConfigResolver configResolverE = ConfigResolver.e();
        configResolverE.getClass();
        ConfigResolver.d.b = Utils.a(context);
        configResolverE.c.c(context);
        AppStateMonitor appStateMonitorA = AppStateMonitor.a();
        synchronized (appStateMonitorA) {
            if (!appStateMonitorA.s) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(appStateMonitorA);
                    appStateMonitorA.s = true;
                }
            }
        }
        FirebasePerformanceInitializer firebasePerformanceInitializer = new FirebasePerformanceInitializer();
        synchronized (appStateMonitorA.j) {
            appStateMonitorA.j.add(firebasePerformanceInitializer);
        }
        if (startupTime != null) {
            if (AppStartTrace.A != null) {
                appStartTrace = AppStartTrace.A;
            } else {
                TransportManager transportManager = TransportManager.v;
                Clock clock = new Clock();
                if (AppStartTrace.A == null) {
                    synchronized (AppStartTrace.class) {
                        try {
                            if (AppStartTrace.A == null) {
                                AppStartTrace.A = new AppStartTrace(transportManager, clock, ConfigResolver.e(), new ThreadPoolExecutor(0, 1, 10 + AppStartTrace.z, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                            }
                        } finally {
                        }
                    }
                }
                appStartTrace = AppStartTrace.A;
            }
            synchronized (appStartTrace) {
                if (!appStartTrace.d) {
                    ProcessLifecycleOwner.l.i.a(appStartTrace);
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 instanceof Application) {
                        ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                        appStartTrace.x = appStartTrace.x || AppStartTrace.c((Application) applicationContext2);
                        appStartTrace.d = true;
                        appStartTrace.h = (Application) applicationContext2;
                    }
                }
            }
            executor.execute(new AppStartTrace.StartFromBackgroundRunnable(appStartTrace));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return firebasePerfEarly;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FirebasePerformance providesFirebasePerformance(ComponentContainer componentContainer) {
        componentContainer.a(FirebasePerfEarly.class);
        DaggerFirebasePerformanceComponent.Builder builder = new DaggerFirebasePerformanceComponent.Builder();
        builder.f15692a = new FirebasePerformanceModule((FirebaseApp) componentContainer.a(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.a(FirebaseInstallationsApi.class), componentContainer.c(RemoteConfigComponent.class), componentContainer.c(TransportFactory.class));
        return builder.a().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        Qualified qualified = new Qualified(UiThread.class, Executor.class);
        Component.Builder builderB = Component.b(FirebasePerformance.class);
        builderB.f15223a = LIBRARY_NAME;
        builderB.a(Dependency.c(FirebaseApp.class));
        builderB.a(Dependency.d(RemoteConfigComponent.class));
        builderB.a(Dependency.c(FirebaseInstallationsApi.class));
        builderB.a(Dependency.d(TransportFactory.class));
        builderB.a(Dependency.c(FirebasePerfEarly.class));
        builderB.f = new androidx.compose.ui.graphics.colorspace.a(27);
        Component componentB = builderB.b();
        Component.Builder builderB2 = Component.b(FirebasePerfEarly.class);
        builderB2.f15223a = EARLY_LIBRARY_NAME;
        builderB2.a(Dependency.c(FirebaseApp.class));
        builderB2.a(Dependency.a(StartupTime.class));
        builderB2.a(new Dependency(qualified, 1, 0));
        builderB2.c(2);
        builderB2.f = new a(qualified, 0);
        return Arrays.asList(componentB, builderB2.b(), LibraryVersionComponent.a(LIBRARY_NAME, "22.0.1"));
    }
}
