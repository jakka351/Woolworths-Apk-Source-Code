package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.m4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0728m4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBarcodePickSession f17847a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0728m4(NativeBarcodePickSession nativeBarcodePickSession) {
        super(0);
        this.f17847a = nativeBarcodePickSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17847a;
    }
}
