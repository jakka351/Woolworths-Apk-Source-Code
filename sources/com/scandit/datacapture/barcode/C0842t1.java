package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.t1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0842t1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0842t1 f18135a = new C0842t1();

    public C0842t1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ShutterButtonWrapper it = (ShutterButtonWrapper) obj;
        Intrinsics.h(it, "it");
        it.b();
        return Unit.f24250a;
    }
}
