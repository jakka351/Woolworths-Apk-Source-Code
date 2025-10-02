package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class C1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ P1 f17115a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(P1 p1, boolean z) {
        super(0);
        this.f17115a = p1;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17115a.g.setVisibility(this.b ? 0 : 8);
        ((C0581d1) this.f17115a.b).a(this.b);
        return Unit.f24250a;
    }
}
