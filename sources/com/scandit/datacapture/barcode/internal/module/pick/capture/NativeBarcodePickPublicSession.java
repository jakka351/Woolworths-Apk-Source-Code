package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodePickPublicSession {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickPublicSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17743a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native HashSet<String> native_getAddedObjects(long j);

        private native HashSet<String> native_getTrackedObjects(long j);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession
        public HashSet<String> getAddedObjects() {
            return native_getAddedObjects(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession
        public HashSet<String> getTrackedObjects() {
            return native_getTrackedObjects(this.nativeRef);
        }
    }

    public abstract HashSet<String> getAddedObjects();

    public abstract HashSet<String> getTrackedObjects();
}
