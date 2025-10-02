package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodePickActionCallback {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickActionCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17742a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_onResponse(long j, String str, boolean z);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickActionCallback
        public void onResponse(String str, boolean z) {
            native_onResponse(this.nativeRef, str, z);
        }
    }

    public abstract void onResponse(String str, boolean z);
}
