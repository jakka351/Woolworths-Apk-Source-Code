package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeSparkScanScanningMode {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanScanningMode {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18103a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeSparkScanPreviewBehavior native_getPreviewBehavior(long j);

        private native NativeSparkScanScanningBehavior native_getScanningBehavior(long j);

        private native NativeSparkScanScanningModeType native_getType(long j);

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningMode
        public NativeSparkScanPreviewBehavior getPreviewBehavior() {
            return native_getPreviewBehavior(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningMode
        public NativeSparkScanScanningBehavior getScanningBehavior() {
            return native_getScanningBehavior(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningMode
        public NativeSparkScanScanningModeType getType() {
            return native_getType(this.nativeRef);
        }
    }

    public abstract NativeSparkScanPreviewBehavior getPreviewBehavior();

    public abstract NativeSparkScanScanningBehavior getScanningBehavior();

    public abstract NativeSparkScanScanningModeType getType();
}
