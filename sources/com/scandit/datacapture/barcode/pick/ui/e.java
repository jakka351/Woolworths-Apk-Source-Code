package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodePickView f17957a;
    final /* synthetic */ BarcodePickViewSettings b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BarcodePickView barcodePickView, BarcodePickViewSettings barcodePickViewSettings) {
        super(0);
        this.f17957a = barcodePickView;
        this.b = barcodePickViewSettings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17957a.d.a(this.b.getHighlightStyle());
        return Unit.f24250a;
    }
}
