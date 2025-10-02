package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeAbstractCamera {

    @DjinniGenerated
    public static final class CppProxy extends NativeAbstractCamera {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18563a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeFrameSource native_asFrameSource(long j);

        private native void native_flushPendingTasks(long j);

        @Override // com.scandit.datacapture.core.internal.module.source.NativeAbstractCamera
        public NativeFrameSource asFrameSource() {
            return native_asFrameSource(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.source.NativeAbstractCamera
        public void flushPendingTasks() {
            native_flushPendingTasks(this.nativeRef);
        }
    }

    public abstract NativeFrameSource asFrameSource();

    public abstract void flushPendingTasks();
}
