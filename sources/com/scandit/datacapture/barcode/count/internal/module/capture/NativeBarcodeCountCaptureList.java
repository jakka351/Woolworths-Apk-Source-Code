package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodeCountCaptureList {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCountCaptureList {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17514a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_addListenerAsync(long j, NativeBarcodeCountCaptureListListener nativeBarcodeCountCaptureListListener);

        private native NativeBarcodeCountCaptureListSession native_getSession(long j);

        private native int native_getTargetBarcodesQuantity(long j);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureList
        public void addListenerAsync(NativeBarcodeCountCaptureListListener nativeBarcodeCountCaptureListListener) {
            native_addListenerAsync(this.nativeRef, nativeBarcodeCountCaptureListListener);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureList
        public NativeBarcodeCountCaptureListSession getSession() {
            return native_getSession(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureList
        public int getTargetBarcodesQuantity() {
            return native_getTargetBarcodesQuantity(this.nativeRef);
        }
    }

    public static native NativeBarcodeCountCaptureList createForAndroid(HashSet<NativeTargetBarcode> hashSet);

    public abstract void addListenerAsync(NativeBarcodeCountCaptureListListener nativeBarcodeCountCaptureListListener);

    public abstract NativeBarcodeCountCaptureListSession getSession();

    public abstract int getTargetBarcodesQuantity();
}
