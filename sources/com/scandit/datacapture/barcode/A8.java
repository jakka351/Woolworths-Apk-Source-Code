package com.scandit.datacapture.barcode;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class A8 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8 f17093a;
    final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A8(C8 c8, float f) {
        super(1);
        this.f17093a = c8;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.h(it, "it");
        C0716l8 c0716l8A = this.f17093a.a();
        if (c0716l8A != null) {
            c0716l8A.a(this.b);
        }
        return Unit.f24250a;
    }
}
