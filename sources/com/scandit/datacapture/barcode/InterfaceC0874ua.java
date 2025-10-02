package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.internal.SparkScanInternal;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSession;
import com.scandit.datacapture.core.data.FrameData;

/* renamed from: com.scandit.datacapture.barcode.ua, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC0874ua {
    void onBarcodeScanned(SparkScanInternal sparkScanInternal, SparkScanSession sparkScanSession, FrameData frameData);

    void onObservationStarted(SparkScanInternal sparkScanInternal);

    void onObservationStopped(SparkScanInternal sparkScanInternal);

    void onSessionUpdated(SparkScanInternal sparkScanInternal, SparkScanSession sparkScanSession, FrameData frameData);
}
