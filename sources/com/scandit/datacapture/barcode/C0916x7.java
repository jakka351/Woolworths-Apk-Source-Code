package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.x7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0916x7 extends Lambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0916x7 f18261a = new C0916x7();

    public C0916x7() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Intrinsics.h((TrackedBarcode) obj, "<anonymous parameter 0>");
        Intrinsics.h((EnumC0813r9) obj2, "<anonymous parameter 1>");
        Intrinsics.h((EnumC0668i8) obj3, "<anonymous parameter 2>");
        return Unit.f24250a;
    }
}
