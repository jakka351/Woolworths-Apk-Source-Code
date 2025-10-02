package com.scandit.datacapture.barcode.internal.sdk.data;

import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeLocalizedOnlyBarcode {

    @DjinniGenerated
    public static final class CppProxy extends NativeLocalizedOnlyBarcode {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17810a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native int native_getFrameId(long j);

        private native Quadrilateral native_getLocation(long j);

        private native String native_toJson(long j);

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeLocalizedOnlyBarcode
        public int getFrameId() {
            return native_getFrameId(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeLocalizedOnlyBarcode
        public Quadrilateral getLocation() {
            return native_getLocation(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeLocalizedOnlyBarcode
        public String toJson() {
            return native_toJson(this.nativeRef);
        }
    }

    public abstract int getFrameId();

    public abstract Quadrilateral getLocation();

    public abstract String toJson();
}
