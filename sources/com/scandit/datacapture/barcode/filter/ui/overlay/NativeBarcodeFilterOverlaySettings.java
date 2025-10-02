package com.scandit.datacapture.barcode.filter.ui.overlay;

import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodeFilterOverlaySettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeFilterOverlaySettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17653a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeBrush native_getBrush(long j);

        private native NativeBarcodeFilterHighlightType native_getOverlayType(long j);

        private native void native_setBarcodeFilterHighlightType(long j, NativeBarcodeFilterHighlightType nativeBarcodeFilterHighlightType);

        private native void native_setBrush(long j, NativeBrush nativeBrush);

        @Override // com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings
        public NativeBrush getBrush() {
            return native_getBrush(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings
        public NativeBarcodeFilterHighlightType getOverlayType() {
            return native_getOverlayType(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings
        public void setBarcodeFilterHighlightType(NativeBarcodeFilterHighlightType nativeBarcodeFilterHighlightType) {
            native_setBarcodeFilterHighlightType(this.nativeRef, nativeBarcodeFilterHighlightType);
        }

        @Override // com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings
        public void setBrush(NativeBrush nativeBrush) {
            native_setBrush(this.nativeRef, nativeBrush);
        }
    }

    public static native NativeBarcodeFilterOverlaySettings create();

    public abstract NativeBrush getBrush();

    public abstract NativeBarcodeFilterHighlightType getOverlayType();

    public abstract void setBarcodeFilterHighlightType(NativeBarcodeFilterHighlightType nativeBarcodeFilterHighlightType);

    public abstract void setBrush(NativeBrush nativeBrush);
}
