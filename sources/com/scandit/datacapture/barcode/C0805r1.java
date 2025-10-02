package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.r1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0805r1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f17986a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0805r1(boolean z) {
        super(1);
        this.f17986a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ShutterButtonWrapper it = (ShutterButtonWrapper) obj;
        Intrinsics.h(it, "it");
        it.b(this.f17986a);
        return Unit.f24250a;
    }
}
