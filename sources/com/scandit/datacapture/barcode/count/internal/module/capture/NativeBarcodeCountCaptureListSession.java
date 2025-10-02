package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodeCountCaptureListSession {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCountCaptureListSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17515a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native ArrayList<NativeBarcode> native_getAdditionalBarcodes(long j);

        private native ArrayList<NativeTrackedBarcode> native_getCorrectBarcodes(long j);

        private native ArrayList<NativeTargetBarcode> native_getMissingBarcodes(long j);

        private native ArrayList<NativeTrackedBarcode> native_getWrongBarcodes(long j);

        private native String native_toJson(long j);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession
        public ArrayList<NativeBarcode> getAdditionalBarcodes() {
            return native_getAdditionalBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession
        public ArrayList<NativeTrackedBarcode> getCorrectBarcodes() {
            return native_getCorrectBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession
        public ArrayList<NativeTargetBarcode> getMissingBarcodes() {
            return native_getMissingBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession
        public ArrayList<NativeTrackedBarcode> getWrongBarcodes() {
            return native_getWrongBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession
        public String toJson() {
            return native_toJson(this.nativeRef);
        }
    }

    public abstract ArrayList<NativeBarcode> getAdditionalBarcodes();

    public abstract ArrayList<NativeTrackedBarcode> getCorrectBarcodes();

    public abstract ArrayList<NativeTargetBarcode> getMissingBarcodes();

    public abstract ArrayList<NativeTrackedBarcode> getWrongBarcodes();

    public abstract String toJson();
}
