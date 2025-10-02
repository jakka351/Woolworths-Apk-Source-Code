package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.ArrayList;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodeCountStatusListener {
    public abstract void onAbortStatusMode();

    public abstract void onBarcodeStatusesReady(ArrayList<NativeBarcodeCountStatusItem> arrayList);

    public abstract void onHideLoading();

    public abstract void onShowLoading();
}
