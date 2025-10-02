package com.scandit.datacapture.barcode.internal.module.pick.ui;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodePickGuidanceHandler {
    public abstract void hideLoadingPopup();

    public abstract void setInitialGuidance(boolean z, String str);

    public abstract void setMoveCloserGuidance(boolean z, String str);

    public abstract void setTapShutterToPauseGuidance(boolean z, String str);

    public abstract void showLoadingPopup();
}
