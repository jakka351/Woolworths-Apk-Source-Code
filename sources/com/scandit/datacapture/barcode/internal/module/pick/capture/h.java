package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.D4;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodePickSession f17757a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BarcodePickSession barcodePickSession) {
        super(0);
        this.f17757a = barcodePickSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new D4((NativeBarcodePickSession) this.f17757a.f17739a.invoke(), ProxyCacheKt.getGlobalProxyCache());
    }
}
