package com.scandit.datacapture.core.internal.module.ui.video;

import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeVideoGeometry {

    @DjinniGenerated
    public static final class CppProxy extends NativeVideoGeometry {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18639a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native Size2 native_getFrameSize(long j);

        private native Size2 native_getViewSize(long j);

        private native void native_setFrameSize(long j, Size2 size2);

        private native void native_setViewSize(long j, Size2 size2);

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeVideoGeometry
        public Size2 getFrameSize() {
            return native_getFrameSize(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeVideoGeometry
        public Size2 getViewSize() {
            return native_getViewSize(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeVideoGeometry
        public void setFrameSize(Size2 size2) {
            native_setFrameSize(this.nativeRef, size2);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeVideoGeometry
        public void setViewSize(Size2 size2) {
            native_setViewSize(this.nativeRef, size2);
        }
    }

    public abstract Size2 getFrameSize();

    public abstract Size2 getViewSize();

    public abstract void setFrameSize(Size2 size2);

    public abstract void setViewSize(Size2 size2);
}
