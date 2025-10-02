package com.scandit.datacapture.core.internal.module.https;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeHttpsSessionDelegate {

    @DjinniGenerated
    public static final class CppProxy extends NativeHttpsSessionDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18549a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_didComplete(long j, NativeHttpsSession nativeHttpsSession, NativeHttpsTask nativeHttpsTask);

        @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSessionDelegate
        public void didComplete(NativeHttpsSession nativeHttpsSession, NativeHttpsTask nativeHttpsTask) {
            native_didComplete(this.nativeRef, nativeHttpsSession, nativeHttpsTask);
        }
    }

    public abstract void didComplete(NativeHttpsSession nativeHttpsSession, NativeHttpsTask nativeHttpsTask);
}
