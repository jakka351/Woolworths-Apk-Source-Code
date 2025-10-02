package com.scandit.datacapture.barcode.internal.module.count.capture;

import com.scandit.datacapture.barcode.M7;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InternalBarcodeCountSession f17717a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InternalBarcodeCountSession internalBarcodeCountSession) {
        super(0);
        this.f17717a = internalBarcodeCountSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new M7((NativeBarcodeCountSession) this.f17717a.f17715a.invoke(), ProxyCacheKt.getGlobalProxyCache());
    }
}
