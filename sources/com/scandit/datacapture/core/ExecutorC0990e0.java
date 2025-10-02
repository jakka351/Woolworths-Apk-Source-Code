package com.scandit.datacapture.core;

import android.os.Handler;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ExecutorC0990e0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f18486a;

    public ExecutorC0990e0(Handler handler) {
        Intrinsics.h(handler, "handler");
        this.f18486a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            this.f18486a.post(runnable);
        }
    }
}
