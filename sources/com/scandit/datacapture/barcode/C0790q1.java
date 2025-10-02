package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.q1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0790q1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ P1 f17976a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0790q1(P1 p1, int i, int i2) {
        super(0);
        this.f17976a = p1;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17976a.g.a(this.b);
        this.f17976a.g.b(this.c);
        return Unit.f24250a;
    }
}
