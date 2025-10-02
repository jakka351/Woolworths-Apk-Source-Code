package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import com.scandit.datacapture.barcode.K;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeCountToolbarViewHolder f17724a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BarcodeCountToolbarViewHolder barcodeCountToolbarViewHolder) {
        super(0);
        this.f17724a = barcodeCountToolbarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17724a.n = !r0.n;
        this.f17724a.d();
        K kB = this.f17724a.b();
        if (kB != null) {
            kB.b(this.f17724a.n);
        }
        return Unit.f24250a;
    }
}
