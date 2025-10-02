package com.scandit.datacapture.barcode.tracking.internal.module.data;

import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeTrackedObject {

    @DjinniGenerated
    public static final class CppProxy extends NativeTrackedObject {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18199a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native int native_getIdentifier(long j);

        private native Quadrilateral native_getLocationIgnoringLicense(long j);

        private native String native_getUtf8String(long j);

        @Override // com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedObject
        public int getIdentifier() {
            return native_getIdentifier(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedObject
        public Quadrilateral getLocationIgnoringLicense() {
            return native_getLocationIgnoringLicense(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedObject
        public String getUtf8String() {
            return native_getUtf8String(this.nativeRef);
        }
    }

    public abstract int getIdentifier();

    public abstract Quadrilateral getLocationIgnoringLicense();

    public abstract String getUtf8String();
}
