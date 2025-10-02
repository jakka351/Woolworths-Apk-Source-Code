package com.scandit.datacapture.barcode;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class K1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ P1 f17213a;
    final /* synthetic */ List b;
    final /* synthetic */ float c = 1.0f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(P1 p1, List list) {
        super(0);
        this.f17213a = p1;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((W1) this.f17213a.k.a()).setVisibility(0);
        ((W1) this.f17213a.k.a()).a(this.b, this.c);
        return Unit.f24250a;
    }
}
