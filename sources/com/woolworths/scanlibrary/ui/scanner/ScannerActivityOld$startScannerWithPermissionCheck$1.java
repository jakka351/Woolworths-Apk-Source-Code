package com.woolworths.scanlibrary.ui.scanner;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class ScannerActivityOld$startScannerWithPermissionCheck$1 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.RelativeLayout, au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.RelativeLayout, au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ?? r0;
        ScannerActivityOld scannerActivityOld = (ScannerActivityOld) this.receiver;
        scannerActivityOld.M = true;
        ?? r1 = scannerActivityOld.Q;
        if (r1 != 0) {
            r1.c();
        }
        if (scannerActivityOld.O && (r0 = scannerActivityOld.Q) != 0) {
            r0.a();
        }
        return Unit.f24250a;
    }
}
