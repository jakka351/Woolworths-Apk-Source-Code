package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import com.scandit.datacapture.barcode.K;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeCountToolbarViewHolder f17722a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BarcodeCountToolbarViewHolder barcodeCountToolbarViewHolder) {
        super(0);
        this.f17722a = barcodeCountToolbarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17722a.l = !r0.l;
        this.f17722a.d();
        K kB = this.f17722a.b();
        if (kB != null) {
            kB.d(this.f17722a.l);
        }
        return Unit.f24250a;
    }
}
