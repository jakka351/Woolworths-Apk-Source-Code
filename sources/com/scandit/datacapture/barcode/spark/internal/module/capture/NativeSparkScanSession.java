package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeSparkScanSession {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18107a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_clear(long j);

        private native long native_getFrameSeqIdAndroid(long j);

        private native NativeBarcode native_getNewlyRecognizedBarcode(long j);

        private native ArrayList<NativeBarcode> native_getNewlyRecognizedBarcodes(long j);

        private native String native_toJson(long j);

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession
        public void clear() {
            native_clear(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession
        public long getFrameSeqIdAndroid() {
            return native_getFrameSeqIdAndroid(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession
        public NativeBarcode getNewlyRecognizedBarcode() {
            return native_getNewlyRecognizedBarcode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession
        public ArrayList<NativeBarcode> getNewlyRecognizedBarcodes() {
            return native_getNewlyRecognizedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession
        public String toJson() {
            return native_toJson(this.nativeRef);
        }
    }

    public abstract void clear();

    public abstract long getFrameSeqIdAndroid();

    public abstract NativeBarcode getNewlyRecognizedBarcode();

    public abstract ArrayList<NativeBarcode> getNewlyRecognizedBarcodes();

    public abstract String toJson();
}
