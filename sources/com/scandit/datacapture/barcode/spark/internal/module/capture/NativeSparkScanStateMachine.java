package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeSparkScanStateMachine {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanStateMachine {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18109a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_addScanningModeListenerAsync(long j, NativeSparkScanScanningModeHandlerListener nativeSparkScanScanningModeHandlerListener);

        private native void native_forceViewState(long j, NativeSparkScanViewState nativeSparkScanViewState);

        private native NativeSparkScanScanningMode native_getScanningMode(long j);

        private native NativeSparkScanViewState native_getViewState(long j);

        private native void native_onCameraSwitchButtonTapped(long j);

        private native void native_onScanningBehaviorButtonTapped(long j);

        private native void native_onTargetModeButtonTapped(long j);

        private native void native_onTorchButtonTapped(long j);

        private native void native_onZoomIn(long j);

        private native void native_onZoomOut(long j);

        private native void native_removeScanningModeListenerAsync(long j, NativeSparkScanScanningModeHandlerListener nativeSparkScanScanningModeHandlerListener);

        private native void native_setScanningMode(long j, NativeSparkScanScanningMode nativeSparkScanScanningMode);

        private native void native_setToastPresenterDelegate(long j, NativeSparkScanToastPresenterDelegate nativeSparkScanToastPresenterDelegate);

        private native void native_setViewHandlerDelegate(long j, NativeSparkScanViewHandlerDelegate nativeSparkScanViewHandlerDelegate);

        private native void native_setViewState(long j, NativeSparkScanViewState nativeSparkScanViewState);

        private native void native_startManualFilterForLastScannedBarcodes(long j);

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void addScanningModeListenerAsync(NativeSparkScanScanningModeHandlerListener nativeSparkScanScanningModeHandlerListener) {
            native_addScanningModeListenerAsync(this.nativeRef, nativeSparkScanScanningModeHandlerListener);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void forceViewState(NativeSparkScanViewState nativeSparkScanViewState) {
            native_forceViewState(this.nativeRef, nativeSparkScanViewState);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public NativeSparkScanScanningMode getScanningMode() {
            return native_getScanningMode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public NativeSparkScanViewState getViewState() {
            return native_getViewState(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void onCameraSwitchButtonTapped() {
            native_onCameraSwitchButtonTapped(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void onScanningBehaviorButtonTapped() {
            native_onScanningBehaviorButtonTapped(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void onTargetModeButtonTapped() {
            native_onTargetModeButtonTapped(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void onTorchButtonTapped() {
            native_onTorchButtonTapped(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void onZoomIn() {
            native_onZoomIn(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void onZoomOut() {
            native_onZoomOut(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void removeScanningModeListenerAsync(NativeSparkScanScanningModeHandlerListener nativeSparkScanScanningModeHandlerListener) {
            native_removeScanningModeListenerAsync(this.nativeRef, nativeSparkScanScanningModeHandlerListener);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void setScanningMode(NativeSparkScanScanningMode nativeSparkScanScanningMode) {
            native_setScanningMode(this.nativeRef, nativeSparkScanScanningMode);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void setToastPresenterDelegate(NativeSparkScanToastPresenterDelegate nativeSparkScanToastPresenterDelegate) {
            native_setToastPresenterDelegate(this.nativeRef, nativeSparkScanToastPresenterDelegate);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void setViewHandlerDelegate(NativeSparkScanViewHandlerDelegate nativeSparkScanViewHandlerDelegate) {
            native_setViewHandlerDelegate(this.nativeRef, nativeSparkScanViewHandlerDelegate);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void setViewState(NativeSparkScanViewState nativeSparkScanViewState) {
            native_setViewState(this.nativeRef, nativeSparkScanViewState);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void startManualFilterForLastScannedBarcodes() {
            native_startManualFilterForLastScannedBarcodes(this.nativeRef);
        }
    }

    public static native NativeSparkScanStateMachine createForTests();

    public abstract void addScanningModeListenerAsync(NativeSparkScanScanningModeHandlerListener nativeSparkScanScanningModeHandlerListener);

    public abstract void forceViewState(NativeSparkScanViewState nativeSparkScanViewState);

    public abstract NativeSparkScanScanningMode getScanningMode();

    public abstract NativeSparkScanViewState getViewState();

    public abstract void onCameraSwitchButtonTapped();

    public abstract void onScanningBehaviorButtonTapped();

    public abstract void onTargetModeButtonTapped();

    public abstract void onTorchButtonTapped();

    public abstract void onZoomIn();

    public abstract void onZoomOut();

    public abstract void removeScanningModeListenerAsync(NativeSparkScanScanningModeHandlerListener nativeSparkScanScanningModeHandlerListener);

    public abstract void setScanningMode(NativeSparkScanScanningMode nativeSparkScanScanningMode);

    public abstract void setToastPresenterDelegate(NativeSparkScanToastPresenterDelegate nativeSparkScanToastPresenterDelegate);

    public abstract void setViewHandlerDelegate(NativeSparkScanViewHandlerDelegate nativeSparkScanViewHandlerDelegate);

    public abstract void setViewState(NativeSparkScanViewState nativeSparkScanViewState);

    public abstract void startManualFilterForLastScannedBarcodes();
}
