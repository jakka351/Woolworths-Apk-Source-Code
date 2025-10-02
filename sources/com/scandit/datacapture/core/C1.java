package com.scandit.datacapture.core;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class C1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1 f18302a = new C1();

    public C1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
