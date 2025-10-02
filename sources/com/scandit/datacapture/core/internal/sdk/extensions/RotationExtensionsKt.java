package com.scandit.datacapture.core.internal.sdk.extensions;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"toAngle", "", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RotationExtensionsKt {
    public static final int toAngle(int i) {
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return SubsamplingScaleImageView.ORIENTATION_180;
        }
        if (i != 3) {
            return 0;
        }
        return SubsamplingScaleImageView.ORIENTATION_270;
    }
}
