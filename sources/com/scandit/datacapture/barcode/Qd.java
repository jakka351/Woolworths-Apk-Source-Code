package com.scandit.datacapture.barcode;

import android.os.Handler;
import android.os.Looper;
import com.scandit.datacapture.core.time.TimeInterval;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Qd implements Pd {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f17283a = new Handler(Looper.getMainLooper());

    public final void a(Function0 onTimeout, TimeInterval timeout) {
        Intrinsics.h(onTimeout, "onTimeout");
        Intrinsics.h(timeout, "timeout");
        this.f17283a.postDelayed(new af(3, onTimeout), timeout.asMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 onTimeout) {
        Intrinsics.h(onTimeout, "$onTimeout");
        onTimeout.invoke();
    }

    public final void a() {
        this.f17283a.removeCallbacksAndMessages(null);
    }
}
