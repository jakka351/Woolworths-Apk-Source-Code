package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewUiListener;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class R1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeFindViewUiListener f17284a;
    final /* synthetic */ Set b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(BarcodeFindViewUiListener barcodeFindViewUiListener, Set set) {
        super(0);
        this.f17284a = barcodeFindViewUiListener;
        this.b = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17284a.onFinishButtonTapped(this.b);
        return Unit.f24250a;
    }
}
