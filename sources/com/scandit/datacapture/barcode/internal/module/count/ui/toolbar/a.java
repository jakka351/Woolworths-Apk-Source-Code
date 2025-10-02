package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import com.scandit.datacapture.barcode.K;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeCountToolbarViewHolder f17721a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BarcodeCountToolbarViewHolder barcodeCountToolbarViewHolder) {
        super(0);
        this.f17721a = barcodeCountToolbarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17721a.k = !r0.k;
        this.f17721a.d();
        K kB = this.f17721a.b();
        if (kB != null) {
            kB.a(this.f17721a.k);
        }
        return Unit.f24250a;
    }
}
