package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.capture.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0557c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBarcodeCapture f17440a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0557c(NativeBarcodeCapture nativeBarcodeCapture) {
        super(0);
        this.f17440a = nativeBarcodeCapture;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodeCaptureSession session = this.f17440a.getSession();
        Intrinsics.g(session, "impl.session");
        return session;
    }
}
