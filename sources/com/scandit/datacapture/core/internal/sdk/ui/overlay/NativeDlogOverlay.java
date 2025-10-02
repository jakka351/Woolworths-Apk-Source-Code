package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeDlogOverlay {

    @DjinniGenerated
    public static final class CppProxy extends NativeDlogOverlay {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18743a = new AtomicBoolean(false);
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

        private native void native_setGlobFilter(long j, String str);

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDlogOverlay
        public NativeDataCaptureOverlay asDataCaptureOverlay() {
            return native_asDataCaptureOverlay(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDlogOverlay
        public void setGlobFilter(String str) {
            native_setGlobFilter(this.nativeRef, str);
        }
    }

    public static native NativeDlogOverlay create(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract NativeDataCaptureOverlay asDataCaptureOverlay();

    public abstract void setGlobFilter(String str);
}
