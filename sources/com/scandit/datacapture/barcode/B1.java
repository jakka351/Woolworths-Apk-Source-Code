package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class B1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f17101a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(boolean z) {
        super(1);
        this.f17101a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ShutterButtonWrapper it = (ShutterButtonWrapper) obj;
        Intrinsics.h(it, "it");
        it.a(this.f17101a);
        return Unit.f24250a;
    }
}
