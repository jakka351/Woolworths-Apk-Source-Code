package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class X3 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodePickHighlightStyleIconsHolder f17342a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X3(BarcodePickHighlightStyleIconsHolder barcodePickHighlightStyleIconsHolder) {
        super(1);
        this.f17342a = barcodePickHighlightStyleIconsHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodePickState it = (BarcodePickState) obj;
        Intrinsics.h(it, "it");
        return this.f17342a.a(it);
    }
}
