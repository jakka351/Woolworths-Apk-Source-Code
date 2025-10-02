package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodePickView f17958a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BarcodePickView barcodePickView) {
        super(0);
        this.f17958a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodePickView.access$freezeInternal(this.f17958a);
        return Unit.f24250a;
    }
}
