package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.n1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0741n1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ P1 f17855a;
    final /* synthetic */ BarcodeFindItem b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0741n1(P1 p1, BarcodeFindItem barcodeFindItem) {
        super(0);
        this.f17855a = p1;
        this.b = barcodeFindItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17855a.h.a(this.b);
        return Unit.f24250a;
    }
}
