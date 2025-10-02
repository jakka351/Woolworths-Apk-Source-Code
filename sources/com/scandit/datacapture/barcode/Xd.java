package com.scandit.datacapture.barcode;

import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.BarcodeCountToolbarViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Xd extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Yd f17348a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xd(Yd yd) {
        super(1);
        this.f17348a = yd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.h(it, "it");
        BarcodeCountToolbarViewHolder barcodeCountToolbarViewHolderD = this.f17348a.d();
        if (barcodeCountToolbarViewHolderD != null) {
            barcodeCountToolbarViewHolderD.a(Yd.a(this.f17348a));
        }
        return Unit.f24250a;
    }
}
