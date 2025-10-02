package com.scandit.datacapture.core.internal.sdk;

import android.os.HandlerThread;
import com.scandit.internal.sdk.bar.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class d extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    private final Callable f18693a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String name, Callable function, int i) {
        super(name, i);
        Intrinsics.h(name, "name");
        Intrinsics.h(function, "function");
        this.f18693a = function;
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.f18693a.run();
    }
}
