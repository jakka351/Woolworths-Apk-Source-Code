package com.scandit.datacapture.core.internal.sdk;

import com.scandit.internal.sdk.bar.Callable;
import com.scandit.internal.sdk.bar.HandlerThread;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class e extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    private final android.os.HandlerThread f18697a;

    public e(String name, Callable function, int i) {
        Intrinsics.h(name, "name");
        Intrinsics.h(function, "function");
        d dVar = new d(name, function, i);
        this.f18697a = dVar;
        dVar.start();
    }

    @Override // com.scandit.internal.sdk.bar.HandlerThread
    public final void quitSafely() {
        try {
            this.f18697a.quitSafely();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
