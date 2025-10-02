package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.data.NativeFloatRange;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeCameraInfo {
    final NativeFloatRange availableZoomRange;

    public NativeCameraInfo(NativeFloatRange nativeFloatRange) {
        this.availableZoomRange = nativeFloatRange;
    }

    public NativeFloatRange getAvailableZoomRange() {
        return this.availableZoomRange;
    }

    public String toString() {
        return "NativeCameraInfo{availableZoomRange=" + this.availableZoomRange + "}";
    }
}
