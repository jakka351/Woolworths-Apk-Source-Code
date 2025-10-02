package com.scandit.datacapture.barcode;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class W0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Lazy f17331a = LazyKt.b(V0.f17323a);

    public static final Ge a(Fe fe) {
        Intrinsics.h(fe, "<this>");
        return new U0();
    }

    public static final int a() {
        return ((Number) f17331a.getD()).intValue();
    }
}
