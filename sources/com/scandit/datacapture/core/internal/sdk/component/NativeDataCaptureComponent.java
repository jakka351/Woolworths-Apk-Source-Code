package com.scandit.datacapture.core.internal.sdk.component;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeDataCaptureComponent {

    @DjinniGenerated
    public static final class CppProxy extends NativeDataCaptureComponent {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18692a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native String native_getIdentifier(long j);

        @Override // com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent
        public String getIdentifier() {
            return native_getIdentifier(this.nativeRef);
        }
    }

    public abstract String getIdentifier();
}
