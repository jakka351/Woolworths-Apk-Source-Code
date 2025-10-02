package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.l4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0712l4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0760o4 f17838a;
    final /* synthetic */ BarcodePickSession b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0712l4(C0760o4 c0760o4, BarcodePickSession barcodePickSession) {
        super(0);
        this.f17838a = c0760o4;
        this.b = barcodePickSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17838a.a(this.b);
        return Unit.f24250a;
    }
}
