package com.scandit.datacapture.barcode.internal.module.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodePickBasicOverlay {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickBasicOverlay {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17759a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_applyViewSettings(long j, NativeBarcodePickViewSettings nativeBarcodePickViewSettings);

        private native NativeDataCaptureOverlay native_asDataCaptureOverlay(long j);

        private native void native_onViewAttachedToWindow(long j, NativeDataCaptureView nativeDataCaptureView);

        private native void native_onViewDetachedFromWindow(long j, NativeDataCaptureView nativeDataCaptureView);

        private native void native_setGuidanceHandler(long j, NativeBarcodePickGuidanceHandler nativeBarcodePickGuidanceHandler);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickBasicOverlay
        public void applyViewSettings(NativeBarcodePickViewSettings nativeBarcodePickViewSettings) {
            native_applyViewSettings(this.nativeRef, nativeBarcodePickViewSettings);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickBasicOverlay
        public NativeDataCaptureOverlay asDataCaptureOverlay() {
            return native_asDataCaptureOverlay(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickBasicOverlay
        public void onViewAttachedToWindow(NativeDataCaptureView nativeDataCaptureView) {
            native_onViewAttachedToWindow(this.nativeRef, nativeDataCaptureView);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickBasicOverlay
        public void onViewDetachedFromWindow(NativeDataCaptureView nativeDataCaptureView) {
            native_onViewDetachedFromWindow(this.nativeRef, nativeDataCaptureView);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickBasicOverlay
        public void setGuidanceHandler(NativeBarcodePickGuidanceHandler nativeBarcodePickGuidanceHandler) {
            native_setGuidanceHandler(this.nativeRef, nativeBarcodePickGuidanceHandler);
        }
    }

    public static native NativeBarcodePickBasicOverlay create(NativeBarcodePick nativeBarcodePick, NativeBarcodePickViewSettings nativeBarcodePickViewSettings);

    public abstract void applyViewSettings(NativeBarcodePickViewSettings nativeBarcodePickViewSettings);

    public abstract NativeDataCaptureOverlay asDataCaptureOverlay();

    public abstract void onViewAttachedToWindow(NativeDataCaptureView nativeDataCaptureView);

    public abstract void onViewDetachedFromWindow(NativeDataCaptureView nativeDataCaptureView);

    public abstract void setGuidanceHandler(NativeBarcodePickGuidanceHandler nativeBarcodePickGuidanceHandler);
}
