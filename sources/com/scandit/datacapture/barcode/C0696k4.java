package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.k4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0696k4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBarcodePickSession f17830a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0696k4(NativeBarcodePickSession nativeBarcodePickSession) {
        super(0);
        this.f17830a = nativeBarcodePickSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17830a;
    }
}
