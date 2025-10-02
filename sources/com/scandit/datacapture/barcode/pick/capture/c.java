package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodePickInternal f17903a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BarcodePickInternal barcodePickInternal) {
        super(0);
        this.f17903a = barcodePickInternal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17903a.c();
    }
}
