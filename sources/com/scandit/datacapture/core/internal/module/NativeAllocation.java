package com.scandit.datacapture.core.internal.module;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeAllocation {

    @DjinniGenerated
    public static final class CppProxy extends NativeAllocation {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18540a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native ByteBuffer native_getBuffer(long j);

        private native void native_release(long j);

        @Override // com.scandit.datacapture.core.internal.module.NativeAllocation
        public ByteBuffer getBuffer() {
            return native_getBuffer(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.NativeAllocation
        public void release() {
            native_release(this.nativeRef);
        }
    }

    public static native NativeAllocation allocate(int i);

    public abstract ByteBuffer getBuffer();

    public abstract void release();
}
