package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.f0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0612f0 extends Lambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeCountBasicOverlay f17633a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0612f0(BarcodeCountBasicOverlay barcodeCountBasicOverlay) {
        super(3);
        this.f17633a = barcodeCountBasicOverlay;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TrackedBarcode barcode = (TrackedBarcode) obj;
        EnumC0813r9 scanStatus = (EnumC0813r9) obj2;
        EnumC0668i8 listStatus = (EnumC0668i8) obj3;
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(scanStatus, "scanStatus");
        Intrinsics.h(listStatus, "listStatus");
        int iOrdinal = scanStatus.ordinal();
        if (iOrdinal == 1) {
            int iOrdinal2 = listStatus.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                this.f17633a.didTapScannedBarcode(barcode);
            } else if (iOrdinal2 == 2) {
                this.f17633a.didTapNotInListBarcode(barcode);
            }
        } else if (iOrdinal == 2) {
            this.f17633a.didTapUnscannedBarcode(barcode);
        } else if (iOrdinal == 3) {
            this.f17633a.didTapFilteredBarcode(barcode);
        }
        return Unit.f24250a;
    }
}
