package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;

/* renamed from: com.scandit.datacapture.barcode.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC0627g {
    Brush brushForTrackedBarcode(TrackedBarcode trackedBarcode);

    Brush brushForTrackedBarcodeNotInList(TrackedBarcode trackedBarcode);

    Brush brushForUnscannedTrackedBarcode(TrackedBarcode trackedBarcode);

    Brush brushFromFilterSettings();

    Brush getNotInListBrush();

    Brush getRecognizedBrush();

    Brush getUnrecognizedBrush();

    boolean isListenerSet();
}
