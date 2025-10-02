package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class O5 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ S5 f17255a;
    final /* synthetic */ BarcodeFindItem b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O5(S5 s5, BarcodeFindItem barcodeFindItem) {
        super(0);
        this.f17255a = s5;
        this.b = barcodeFindItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        S5 s5 = this.f17255a;
        s5.a(CollectionsKt.u0(new N5(this.b), s5.d()));
        return Unit.f24250a;
    }
}
