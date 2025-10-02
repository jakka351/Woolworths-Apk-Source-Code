package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeColorFillOverlay {

    @DjinniGenerated
    public static final class CppProxy extends NativeColorFillOverlay {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18594a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeDataCaptureOverlay native_asDataCaptureOverlay(long j);

        private native NativeColor native_getColor(long j);

        private native void native_setColor(long j, NativeColor nativeColor);

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeColorFillOverlay
        public NativeDataCaptureOverlay asDataCaptureOverlay() {
            return native_asDataCaptureOverlay(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeColorFillOverlay
        public NativeColor getColor() {
            return native_getColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeColorFillOverlay
        public void setColor(NativeColor nativeColor) {
            native_setColor(this.nativeRef, nativeColor);
        }
    }

    public static native NativeColorFillOverlay create(NativeColor nativeColor);

    public abstract NativeDataCaptureOverlay asDataCaptureOverlay();

    public abstract NativeColor getColor();

    public abstract void setColor(NativeColor nativeColor);
}
