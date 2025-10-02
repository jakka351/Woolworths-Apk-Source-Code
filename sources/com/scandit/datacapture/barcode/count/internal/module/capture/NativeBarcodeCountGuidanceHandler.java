package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodeCountGuidanceHandler {
    public abstract void clear();

    public abstract void setMoveCloserAndRescan(boolean z, String str);

    public abstract void setMoveFurtherAndRescan(boolean z, String str);

    public abstract void setScanning(boolean z, String str);

    public abstract void setScanningProgress(int i);

    public abstract void setTapToScan(boolean z, String str);
}
