package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.d;
import com.google.firebase.crashlytics.internal.common.e;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class FirebaseCrashlytics {

    /* renamed from: a, reason: collision with root package name */
    public final CrashlyticsCore f15252a;

    public FirebaseCrashlytics(CrashlyticsCore crashlyticsCore) {
        this.f15252a = crashlyticsCore;
    }

    public final void a(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        CrashlyticsCore crashlyticsCore = this.f15252a;
        crashlyticsCore.o.f15286a.a(new e(crashlyticsCore, jCurrentTimeMillis - crashlyticsCore.d, str));
    }

    public final void b(final Throwable th) {
        if (th == null) {
            Logger.f15258a.f(null, "A null value was passed to recordException. Ignoring.");
            return;
        }
        Map map = Collections.EMPTY_MAP;
        final CrashlyticsCore crashlyticsCore = this.f15252a;
        crashlyticsCore.o.f15286a.a(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.h
            public final /* synthetic */ Map f = Collections.EMPTY_MAP;

            @Override // java.lang.Runnable
            public final void run() {
                Map map2 = Collections.EMPTY_MAP;
                CrashlyticsController crashlyticsController = crashlyticsCore.g;
                Thread threadCurrentThread = Thread.currentThread();
                crashlyticsController.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = crashlyticsController.n;
                if (crashlyticsUncaughtExceptionHandler == null || !crashlyticsUncaughtExceptionHandler.e.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strE = crashlyticsController.e();
                    Logger logger = Logger.f15258a;
                    if (strE == null) {
                        logger.f(null, "Tried to write a non-fatal exception while no session was open.");
                        return;
                    }
                    EventMetadata eventMetadata = new EventMetadata(strE, j, map2);
                    SessionReportingCoordinator sessionReportingCoordinator = crashlyticsController.m;
                    sessionReportingCoordinator.getClass();
                    logger.e("Persisting non-fatal event for session " + strE);
                    sessionReportingCoordinator.e(th, threadCurrentThread, "error", eventMetadata, false);
                }
            }
        });
    }

    public final void c(String str, String str2) {
        CrashlyticsCore crashlyticsCore = this.f15252a;
        crashlyticsCore.o.f15286a.a(new d(crashlyticsCore, str, str2));
    }
}
