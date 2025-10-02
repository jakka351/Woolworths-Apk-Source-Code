package com.scandit.datacapture.core.internal.sdk.ui.viewfinder;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeTargetAimerViewfinder {

    @DjinniGenerated
    public static final class CppProxy extends NativeTargetAimerViewfinder {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18768a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeViewfinder native_asViewfinder(long j);

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeTargetAimerViewfinder
        public NativeViewfinder asViewfinder() {
            return native_asViewfinder(this.nativeRef);
        }
    }

    public static native NativeTargetAimerViewfinder create();

    public abstract NativeViewfinder asViewfinder();
}
