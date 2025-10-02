package com.scandit.datacapture.barcode.data;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Barcode f17618a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Barcode barcode) {
        super(0);
        this.f17618a = barcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17618a.getF17604a().asBarcodeRecord();
    }
}
