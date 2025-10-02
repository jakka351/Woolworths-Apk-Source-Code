package com.scandit.datacapture.barcode.tracking.internal.module.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeTrackedBarcode {

    @DjinniGenerated
    public static final class CppProxy extends NativeTrackedBarcode {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18198a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native Point native_getAnchorPosition(long j, Anchor anchor);

        private native Point native_getAnchorPositionIgnoringLicense(long j, Anchor anchor);

        private native NativeBarcode native_getBarcode(long j);

        private native int native_getIdentifier(long j);

        private native Quadrilateral native_getLocation(long j);

        private native Quadrilateral native_getLocationIgnoringLicense(long j);

        private native String native_toJson(long j);

        @Override // com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode
        public Point getAnchorPosition(Anchor anchor) {
            return native_getAnchorPosition(this.nativeRef, anchor);
        }

        @Override // com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode
        public Point getAnchorPositionIgnoringLicense(Anchor anchor) {
            return native_getAnchorPositionIgnoringLicense(this.nativeRef, anchor);
        }

        @Override // com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode
        public NativeBarcode getBarcode() {
            return native_getBarcode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode
        public int getIdentifier() {
            return native_getIdentifier(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode
        public Quadrilateral getLocation() {
            return native_getLocation(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode
        public Quadrilateral getLocationIgnoringLicense() {
            return native_getLocationIgnoringLicense(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode
        public String toJson() {
            return native_toJson(this.nativeRef);
        }
    }

    public abstract Point getAnchorPosition(Anchor anchor);

    public abstract Point getAnchorPositionIgnoringLicense(Anchor anchor);

    public abstract NativeBarcode getBarcode();

    public abstract int getIdentifier();

    public abstract Quadrilateral getLocation();

    public abstract Quadrilateral getLocationIgnoringLicense();

    public abstract String toJson();
}
