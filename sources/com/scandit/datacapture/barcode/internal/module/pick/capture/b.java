package com.scandit.datacapture.barcode.internal.module.pick.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBarcodePick f17751a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NativeBarcodePick nativeBarcodePick) {
        super(0);
        this.f17751a = nativeBarcodePick;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodePickScanningSession scanningSession = this.f17751a.getSession().getScanningSession();
        Intrinsics.g(scanningSession, "impl.session.scanningSession");
        return scanningSession;
    }
}
