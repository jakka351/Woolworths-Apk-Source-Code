package com.swrve.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes.dex */
public class SwrveLogger {

    /* renamed from: a, reason: collision with root package name */
    public static int f19060a = -1;
    public static boolean b = true;
    public static SwrveLoggerTree c = null;
    public static boolean d = false;

    /* loaded from: classes6.dex */
    public static class SwrveLoggerTree extends Timber.DebugTree {
        @Override // timber.log.Timber.Tree
        public final boolean i(int i, String str) {
            return str.equals("SwrveSDK") && i >= SwrveLogger.f19060a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[PHI: r2
  0x0026: PHI (r2v7 int) = (r2v4 int), (r2v5 int), (r2v6 int) binds: [B:14:0x0024, B:17:0x002d, B:20:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a() {
        /*
            int r0 = com.swrve.sdk.SwrveLogger.f19060a
            r1 = -1
            if (r0 != r1) goto L3a
            java.lang.String r0 = "SwrveSDK"
            r1 = 2
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto Lf
            goto L38
        Lf:
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto L17
            goto L38
        L17:
            r1 = 4
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto L1f
            goto L38
        L1f:
            r2 = 5
            boolean r3 = android.util.Log.isLoggable(r0, r2)
            if (r3 == 0) goto L28
        L26:
            r1 = r2
            goto L38
        L28:
            r2 = 6
            boolean r3 = android.util.Log.isLoggable(r0, r2)
            if (r3 == 0) goto L30
            goto L26
        L30:
            r2 = 7
            boolean r0 = android.util.Log.isLoggable(r0, r2)
            if (r0 == 0) goto L38
            goto L26
        L38:
            com.swrve.sdk.SwrveLogger.f19060a = r1
        L3a:
            boolean r0 = com.swrve.sdk.SwrveLogger.d
            if (r0 != 0) goto L5d
            java.lang.Class<com.swrve.sdk.SwrveLogger> r0 = com.swrve.sdk.SwrveLogger.class
            monitor-enter(r0)
            boolean r1 = f()     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L56
            com.swrve.sdk.SwrveLogger$SwrveLoggerTree r1 = new com.swrve.sdk.SwrveLogger$SwrveLoggerTree     // Catch: java.lang.Throwable -> L54
            r1.<init>()     // Catch: java.lang.Throwable -> L54
            com.swrve.sdk.SwrveLogger.c = r1     // Catch: java.lang.Throwable -> L54
            timber.log.Timber$Forest r2 = timber.log.Timber.f27013a     // Catch: java.lang.Throwable -> L54
            r2.r(r1)     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r1 = move-exception
            goto L5b
        L56:
            r1 = 1
            com.swrve.sdk.SwrveLogger.d = r1     // Catch: java.lang.Throwable -> L54
            monitor-exit(r0)
            return
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            throw r1
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.SwrveLogger.a():void");
    }

    public static void b(String str, Object... objArr) {
        if (b) {
            a();
            Timber.a();
            Timber.f27013a.b(str, objArr);
        }
    }

    public static void c(String str, Throwable th, Object... objArr) {
        if (b) {
            a();
            Timber.a();
            Timber.f27013a.d(str, th, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        if (b) {
            a();
            Timber.a();
            Timber.f27013a.e(str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        if (b) {
            a();
            Timber.a();
            Timber.f27013a.h(str, objArr);
        }
    }

    public static boolean f() {
        List listUnmodifiableList;
        Timber.f27013a.getClass();
        ArrayList arrayList = Timber.b;
        synchronized (arrayList) {
            listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.G0(arrayList));
            Intrinsics.g(listUnmodifiableList, "unmodifiableList(trees.toList())");
        }
        Iterator it = listUnmodifiableList.iterator();
        boolean zEquals = false;
        while (!zEquals && it.hasNext()) {
            zEquals = ((Timber.Tree) it.next()).getClass().equals(SwrveLoggerTree.class);
        }
        return zEquals;
    }

    public static void g(String str, Object... objArr) {
        boolean z = b;
        if (z && z) {
            a();
            Timber.a();
            Timber.f27013a.m(str, objArr);
        }
    }

    public static void h(String str, Object... objArr) {
        if (b) {
            a();
            Timber.a();
            Timber.f27013a.o(str, objArr);
        }
    }
}
