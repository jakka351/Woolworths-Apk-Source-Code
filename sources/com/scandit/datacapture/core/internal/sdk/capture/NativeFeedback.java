package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeFeedback {

    @DjinniGenerated
    public static final class CppProxy extends NativeFeedback {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18672a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_emit(long j);

        private native void native_onFreeResources(long j);

        private native void native_onLoadResources(long j);

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
        public void emit() {
            native_emit(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
        public void onFreeResources() {
            native_onFreeResources(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
        public void onLoadResources() {
            native_onLoadResources(this.nativeRef);
        }
    }

    public abstract void emit();

    public abstract void onFreeResources();

    public abstract void onLoadResources();
}
