package com.scandit.datacapture.core;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class R0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final R0 f18365a = new R0();

    public R0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
