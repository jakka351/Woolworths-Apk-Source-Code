package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeDataCaptureMode {

    @DjinniGenerated
    public static final class CppProxy extends NativeDataCaptureMode {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18669a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeDataCaptureContext native_getContext(long j);

        private native String native_getSettingsAsJson(long j, boolean z);

        private native boolean native_isAttachedToContext(long j);

        private native boolean native_isEnabled(long j);

        private native void native_onContextAttached(long j, NativeDataCaptureContext nativeDataCaptureContext);

        private native void native_onContextDetached(long j, NativeDataCaptureContext nativeDataCaptureContext);

        private native void native_setEnabled(long j, boolean z);

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public NativeDataCaptureContext getContext() {
            return native_getContext(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public String getSettingsAsJson(boolean z) {
            return native_getSettingsAsJson(this.nativeRef, z);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public boolean isAttachedToContext() {
            return native_isAttachedToContext(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public boolean isEnabled() {
            return native_isEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public void onContextAttached(NativeDataCaptureContext nativeDataCaptureContext) {
            native_onContextAttached(this.nativeRef, nativeDataCaptureContext);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public void onContextDetached(NativeDataCaptureContext nativeDataCaptureContext) {
            native_onContextDetached(this.nativeRef, nativeDataCaptureContext);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public void setEnabled(boolean z) {
            native_setEnabled(this.nativeRef, z);
        }
    }

    public abstract NativeDataCaptureContext getContext();

    public abstract String getSettingsAsJson(boolean z);

    public abstract boolean isAttachedToContext();

    public abstract boolean isEnabled();

    public abstract void onContextAttached(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract void onContextDetached(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract void setEnabled(boolean z);
}
