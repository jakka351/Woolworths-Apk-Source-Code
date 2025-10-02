package com.scandit.datacapture.core.internal.sdk.common.async;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeWrappedPromise {

    @DjinniGenerated
    public static final class CppProxy extends NativeWrappedPromise {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18678a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native boolean native_hasValue(long j);

        private native void native_setDone(long j);

        private native void native_setError(long j);

        @Override // com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise
        public boolean hasValue() {
            return native_hasValue(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise
        public void setDone() {
            native_setDone(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise
        public void setError() {
            native_setError(this.nativeRef);
        }
    }

    public abstract boolean hasValue();

    public abstract void setDone();

    public abstract void setError();
}
