package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.p4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0775p4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodePickInternal f17878a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0775p4(BarcodePickInternal barcodePickInternal) {
        super(0);
        this.f17878a = barcodePickInternal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17878a;
    }
}
