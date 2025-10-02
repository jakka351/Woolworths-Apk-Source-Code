package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import com.scandit.datacapture.barcode.K;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeCountToolbarViewHolder f17723a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BarcodeCountToolbarViewHolder barcodeCountToolbarViewHolder) {
        super(0);
        this.f17723a = barcodeCountToolbarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f17723a.m = !r0.m;
        this.f17723a.d();
        K kB = this.f17723a.b();
        if (kB != null) {
            kB.c(this.f17723a.m);
        }
        return Unit.f24250a;
    }
}
