package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodeCountStatusProviderCallback {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCountStatusProviderCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17519a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_onStatusReady(long j, NativeBarcodeCountStatusResult nativeBarcodeCountStatusResult);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusProviderCallback
        public void onStatusReady(NativeBarcodeCountStatusResult nativeBarcodeCountStatusResult) {
            native_onStatusReady(this.nativeRef, nativeBarcodeCountStatusResult);
        }
    }

    public abstract void onStatusReady(NativeBarcodeCountStatusResult nativeBarcodeCountStatusResult);
}
