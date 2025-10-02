package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.Logger;
import io.jsonwebtoken.JwtParser;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorkers;", "", "Companion", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CrashlyticsWorkers {
    public static final Companion d = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final CrashlyticsWorker f15286a;
    public final CrashlyticsWorker b;
    public final CrashlyticsWorker c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorkers$Companion;", "", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static String a() {
            return Thread.currentThread().getName();
        }
    }

    public CrashlyticsWorkers(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        Intrinsics.h(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.h(blockingExecutorService, "blockingExecutorService");
        this.f15286a = new CrashlyticsWorker(backgroundExecutorService);
        this.b = new CrashlyticsWorker(backgroundExecutorService);
        new CrashlyticsWorker(backgroundExecutorService);
        this.c = new CrashlyticsWorker(blockingExecutorService);
    }

    public static final void a() {
        if (((Boolean) new CrashlyticsWorkers$Companion$checkBackgroundThread$1(0, d, Companion.class, "isBackgroundThread", "isBackgroundThread()Z", 0).invoke()).booleanValue()) {
            return;
        }
        Logger.f15258a.b("Must be called on a background thread, was called on " + Companion.a() + JwtParser.SEPARATOR_CHAR, null);
    }

    public static final void b() {
        if (((Boolean) new CrashlyticsWorkers$Companion$checkBlockingThread$1(0, d, Companion.class, "isBlockingThread", "isBlockingThread()Z", 0).invoke()).booleanValue()) {
            return;
        }
        Logger.f15258a.b("Must be called on a blocking thread, was called on " + Companion.a() + JwtParser.SEPARATOR_CHAR, null);
    }

    public static final void c() {
        if (((Boolean) new CrashlyticsWorkers$Companion$checkNotMainThread$1(0, d, Companion.class, "isNotMainThread", "isNotMainThread()Z", 0).invoke()).booleanValue()) {
            return;
        }
        Logger.f15258a.b("Must not be called on a main thread, was called on " + Companion.a() + JwtParser.SEPARATOR_CHAR, null);
    }
}
