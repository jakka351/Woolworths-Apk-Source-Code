package com.scandit.datacapture.core.internal.sdk.common.async;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeWrappedFuture {

    @DjinniGenerated
    public static final class CppProxy extends NativeWrappedFuture {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18677a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_then(long j, NativeBoolCallable nativeBoolCallable);

        @Override // com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture
        public void then(NativeBoolCallable nativeBoolCallable) {
            native_then(this.nativeRef, nativeBoolCallable);
        }
    }

    public abstract void then(NativeBoolCallable nativeBoolCallable);
}
