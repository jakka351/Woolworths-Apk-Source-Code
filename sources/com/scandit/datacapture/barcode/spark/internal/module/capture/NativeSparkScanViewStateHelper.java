package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeSparkScanViewStateHelper {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanViewStateHelper {
        private final long nativeRef;

        private CppProxy(long j) {
            new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);
    }

    public static native boolean isCaptureEnabledState(NativeSparkScanViewState nativeSparkScanViewState);

    public static native boolean isExpandedState(NativeSparkScanViewState nativeSparkScanViewState);
}
