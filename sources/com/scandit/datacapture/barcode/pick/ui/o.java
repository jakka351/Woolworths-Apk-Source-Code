package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class o extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodePickView f17966a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(BarcodePickView barcodePickView) {
        super(1);
        this.f17966a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function0 block = (Function0) obj;
        Intrinsics.h(block, "block");
        ViewExtensionsKt.runOnMainThread(this.f17966a, new n(block));
        return Unit.f24250a;
    }
}
