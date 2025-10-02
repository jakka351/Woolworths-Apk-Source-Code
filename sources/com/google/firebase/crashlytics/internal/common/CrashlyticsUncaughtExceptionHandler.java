package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final CrashlyticsController.AnonymousClass1 f15275a;
    public final SettingsController b;
    public final Thread.UncaughtExceptionHandler c;
    public final CrashlyticsNativeComponent d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public interface CrashListener {
    }

    public CrashlyticsUncaughtExceptionHandler(CrashlyticsController.AnonymousClass1 anonymousClass1, SettingsController settingsController, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.f15275a = anonymousClass1;
        this.b = settingsController;
        this.c = uncaughtExceptionHandler;
        this.d = crashlyticsNativeComponent;
    }

    public final boolean a(Thread thread, Throwable th) {
        Logger logger = Logger.f15258a;
        if (thread == null) {
            logger.c(null, "Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            logger.c(null, "Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.d.c()) {
            return true;
        }
        logger.b("Crashlytics will not record uncaught exception; native crash exists for session.", null);
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        Logger logger = Logger.f15258a;
        AtomicBoolean atomicBoolean = this.e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th)) {
                    this.f15275a.a(this.b, thread, th);
                } else {
                    logger.b("Uncaught exception will not be recorded by Crashlytics.", null);
                }
                if (uncaughtExceptionHandler != null) {
                    logger.b("Completed exception processing. Invoking default exception handler.", null);
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    logger.b("Completed exception processing, but no default exception handler.", null);
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e) {
                logger.c(e, "An error occurred in the uncaught exception handler");
                if (uncaughtExceptionHandler != null) {
                    logger.b("Completed exception processing. Invoking default exception handler.", null);
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    logger.b("Completed exception processing, but no default exception handler.", null);
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                logger.b("Completed exception processing. Invoking default exception handler.", null);
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                logger.b("Completed exception processing, but no default exception handler.", null);
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
