package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.w1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0895w1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeFindViewPresenter f18245a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0895w1(BarcodeFindViewPresenter barcodeFindViewPresenter) {
        super(1);
        this.f18245a = barcodeFindViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f18245a.a((BarcodeFindItem) obj);
        return Unit.f24250a;
    }
}
