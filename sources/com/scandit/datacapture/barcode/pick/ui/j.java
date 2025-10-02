package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodePickView f17962a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(BarcodePickView barcodePickView) {
        super(0);
        this.f17962a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodePickView.access$stopInternal(this.f17962a);
        return Unit.f24250a;
    }
}
