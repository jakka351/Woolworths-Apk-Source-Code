package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class A extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final A f17085a = new A();

    public A() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.h(it, "it");
        return Boolean.FALSE;
    }
}
