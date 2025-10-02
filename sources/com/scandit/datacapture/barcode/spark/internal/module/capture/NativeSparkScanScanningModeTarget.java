package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeSparkScanScanningModeTarget {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanScanningModeTarget {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18105a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeSparkScanScanningMode native_asScanningMode(long j);

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeTarget
        public NativeSparkScanScanningMode asScanningMode() {
            return native_asScanningMode(this.nativeRef);
        }
    }

    public static native NativeSparkScanScanningModeTarget create(NativeSparkScanScanningBehavior nativeSparkScanScanningBehavior, NativeSparkScanPreviewBehavior nativeSparkScanPreviewBehavior);

    public abstract NativeSparkScanScanningMode asScanningMode();
}
