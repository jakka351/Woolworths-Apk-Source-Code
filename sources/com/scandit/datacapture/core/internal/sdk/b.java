package com.scandit.datacapture.core.internal.sdk;

import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f18655a = new b();

    public b() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Build.SUPPORTED_ABIS;
    }
}
