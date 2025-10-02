package com.scandit.datacapture.barcode.find.ui;

import com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
final /* synthetic */ class a extends FunctionReferenceImpl implements Function0 {
    public a(Object obj) {
        super(0, obj, BarcodeFindViewPresenter.class, "onShutterClicked", "onShutterClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((BarcodeFindViewPresenter) this.receiver).b();
        return Unit.f24250a;
    }
}
