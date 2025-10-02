package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBarcodeCount f17478a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NativeBarcodeCount nativeBarcodeCount) {
        super(0);
        this.f17478a = nativeBarcodeCount;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodeCountSession session = this.f17478a.getSession();
        Intrinsics.g(session, "impl.session");
        return session;
    }
}
