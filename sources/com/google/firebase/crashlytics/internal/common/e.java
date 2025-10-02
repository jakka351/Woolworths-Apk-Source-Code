package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ CrashlyticsCore d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;

    public /* synthetic */ e(CrashlyticsCore crashlyticsCore, long j, String str) {
        this.d = crashlyticsCore;
        this.e = j;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final CrashlyticsCore crashlyticsCore = this.d;
        CrashlyticsWorker crashlyticsWorker = crashlyticsCore.o.b;
        final long j = this.e;
        final String str = this.f;
        crashlyticsWorker.a(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.f
            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsController crashlyticsController = crashlyticsCore.g;
                CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = crashlyticsController.n;
                if (crashlyticsUncaughtExceptionHandler == null || !crashlyticsUncaughtExceptionHandler.e.get()) {
                    crashlyticsController.i.c(j, str);
                }
            }
        });
    }
}
