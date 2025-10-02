package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class w extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodePickView f17974a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(BarcodePickView barcodePickView) {
        super(0);
        this.f17974a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodePickViewListener listener = this.f17974a.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (listener != null) {
            listener.onStopped(this.f17974a);
        }
        return Unit.f24250a;
    }
}
