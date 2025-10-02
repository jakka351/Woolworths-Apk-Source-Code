package com.adobe.mobile;

import android.content.SharedPreferences;
import com.adobe.mobile.StaticMethods;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class Target {

    /* renamed from: com.adobe.mobile.Target$1, reason: invalid class name */
    final class AnonymousClass1 implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public final String call() {
            return TargetWorker.j();
        }
    }

    /* renamed from: com.adobe.mobile.Target$2, reason: invalid class name */
    final class AnonymousClass2 implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public final String call() {
            return TargetWorker.h();
        }
    }

    /* renamed from: com.adobe.mobile.Target$3, reason: invalid class name */
    final class AnonymousClass3 implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public final String call() {
            return TargetWorker.i();
        }
    }

    /* renamed from: com.adobe.mobile.Target$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            TargetWorker.o();
        }
    }

    /* renamed from: com.adobe.mobile.Target$5, reason: invalid class name */
    final class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            List list = TargetWorker.f13282a;
            StaticMethods.I("Target - resetting experience for this user", new Object[0]);
            TargetWorker.q();
            TargetWorker.p(null);
            TargetWorker.o();
            TargetWorker.n(null);
            synchronized (TargetWorker.p) {
                TargetWorker.n = null;
                TargetWorker.o = 0L;
                try {
                    SharedPreferences.Editor editorC = StaticMethods.C();
                    editorC.remove("ADBMOBILE_TARGET_SESSION_ID");
                    editorC.remove("ADBMOBILE_TARGET_LAST_TIMESTAMP");
                    editorC.commit();
                } catch (StaticMethods.NullContextException unused) {
                    StaticMethods.J("Target - Error resetting session from shared preferences - application context is null", new Object[0]);
                }
            }
        }
    }

    public interface TargetCallback<T> {
    }
}
