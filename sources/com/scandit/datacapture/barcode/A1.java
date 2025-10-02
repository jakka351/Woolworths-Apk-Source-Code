package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class A1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f17087a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A1(boolean z) {
        super(1);
        this.f17087a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ExitButtonWrapper it = (ExitButtonWrapper) obj;
        Intrinsics.h(it, "it");
        it.a(this.f17087a);
        return Unit.f24250a;
    }
}
