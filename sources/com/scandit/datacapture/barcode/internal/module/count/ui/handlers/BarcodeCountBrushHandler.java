package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.EnumC0668i8;
import com.scandit.datacapture.barcode.EnumC0813r9;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;

/* loaded from: classes6.dex */
public interface BarcodeCountBrushHandler {
    Brush a(TrackedBarcode trackedBarcode, EnumC0813r9 enumC0813r9, EnumC0668i8 enumC0668i8);

    void a(TrackedBarcode trackedBarcode, Brush brush);

    void b(TrackedBarcode trackedBarcode, Brush brush);

    void c(TrackedBarcode trackedBarcode, Brush brush);
}
