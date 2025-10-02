package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.v1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0880v1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeFindViewPresenter f18231a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0880v1(BarcodeFindViewPresenter barcodeFindViewPresenter) {
        super(0);
        this.f18231a = barcodeFindViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18231a.i();
        return Unit.f24250a;
    }
}
