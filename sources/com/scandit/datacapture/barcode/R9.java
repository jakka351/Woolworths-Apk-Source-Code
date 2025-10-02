package com.scandit.datacapture.barcode;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class R9 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z9 f17289a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R9(Z9 z9) {
        super(0);
        this.f17289a = z9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17289a.f.b(new Q9(this.f17289a));
    }
}
