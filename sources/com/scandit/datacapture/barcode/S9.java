package com.scandit.datacapture.barcode;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class S9 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z9 f17297a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S9(Z9 z9) {
        super(0);
        this.f17297a = z9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f17297a.b.getContext();
        Intrinsics.g(context, "floatingShutterButtonContainer.context");
        return new I(context, Z9.a(this.f17297a), Z9.b(this.f17297a), Z9.m);
    }
}
