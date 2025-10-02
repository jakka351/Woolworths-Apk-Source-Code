package com.google.firebase.perf;

import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.logging.AndroidLogger;

/* loaded from: classes.dex */
public final class FirebasePerformanceInitializer implements AppStateMonitor.AppColdStartCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidLogger f15666a = AndroidLogger.e();

    @Override // com.google.firebase.perf.application.AppStateMonitor.AppColdStartCallback
    public final void a() {
        try {
            AndroidLogger androidLogger = FirebasePerformance.h;
        } catch (IllegalStateException e) {
            f15666a.h("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
        }
    }
}
