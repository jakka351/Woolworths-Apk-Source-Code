package com.scandit.datacapture.core.internal.sdk.ui.viewfinder;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeRectangularViewfinderAnimation {

    @DjinniGenerated
    public static final class CppProxy extends NativeRectangularViewfinderAnimation {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18764a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native boolean native_isLooping(long j);

        private native String native_toJson(long j);

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderAnimation
        public boolean isLooping() {
            return native_isLooping(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderAnimation
        public String toJson() {
            return native_toJson(this.nativeRef);
        }
    }

    public static native NativeRectangularViewfinderAnimation create(boolean z);

    public abstract boolean isLooping();

    public abstract String toJson();
}
