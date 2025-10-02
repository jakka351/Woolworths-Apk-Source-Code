package com.scandit.datacapture.core.internal.sdk.extensions;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f18706a = new c();

    public c() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Integer.valueOf(RangesKt.c(MathKt.b(((Number) obj).floatValue() * 255), 0, 255));
    }
}
