package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class L5 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ S5 f17225a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L5(S5 s5) {
        super(0);
        this.f17225a = s5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17225a.f = false;
        this.f17225a.e.setVisibility(8);
        this.f17225a.d.setVisibility(0);
        return Unit.f24250a;
    }
}
