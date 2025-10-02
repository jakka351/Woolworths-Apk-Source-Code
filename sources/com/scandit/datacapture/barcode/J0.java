package com.scandit.datacapture.barcode;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

/* loaded from: classes6.dex */
final class J0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final J0 f17201a = new J0();

    public J0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(MathKt.b(((Number) R0.h.getD()).floatValue() * 2));
    }
}
