package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.tracking.capture.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0855a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBarcodeTracking f18165a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0855a(NativeBarcodeTracking nativeBarcodeTracking) {
        super(0);
        this.f18165a = nativeBarcodeTracking;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodeTrackingSession session = this.f18165a.getSession();
        Intrinsics.g(session, "impl.session");
        return session;
    }
}
