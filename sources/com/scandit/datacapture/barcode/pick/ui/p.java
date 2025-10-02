package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class p extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodePickView f17967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(BarcodePickView barcodePickView) {
        super(0);
        this.f17967a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17967a.f.b(this.f17967a.a());
        return Unit.f24250a;
    }
}
