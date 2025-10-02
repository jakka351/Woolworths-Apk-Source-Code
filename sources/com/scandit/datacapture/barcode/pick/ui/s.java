package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodePickView f17970a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(BarcodePickView barcodePickView) {
        super(0);
        this.f17970a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17970a.f.c();
        return Unit.f24250a;
    }
}
