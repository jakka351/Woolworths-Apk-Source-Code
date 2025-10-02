package com.scandit.datacapture.barcode.internal.module.generator;

import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodeGeneratorImage {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeGeneratorImage {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17735a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeImageBuffer native_getImageBuffer(long j);

        @Override // com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorImage
        public NativeImageBuffer getImageBuffer() {
            return native_getImageBuffer(this.nativeRef);
        }
    }

    public abstract NativeImageBuffer getImageBuffer();
}
