package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0580d0 extends Lambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeCountBrushHandler f17590a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0580d0(B b) {
        super(3);
        this.f17590a = b;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TrackedBarcode barcode = (TrackedBarcode) obj;
        EnumC0813r9 scanStatus = (EnumC0813r9) obj2;
        EnumC0668i8 listStatus = (EnumC0668i8) obj3;
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(scanStatus, "scanStatus");
        Intrinsics.h(listStatus, "listStatus");
        return this.f17590a.a(barcode, scanStatus, listStatus);
    }
}
