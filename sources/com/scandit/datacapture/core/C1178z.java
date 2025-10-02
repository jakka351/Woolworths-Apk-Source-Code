package com.scandit.datacapture.core;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1178z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1178z f18996a = new C1178z();

    public C1178z() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalArgumentException("Can only create the handler from a Looper thread");
        }
        if (looperMyLooper.equals(Looper.getMainLooper())) {
            return null;
        }
        return new Handler(looperMyLooper);
    }
}
