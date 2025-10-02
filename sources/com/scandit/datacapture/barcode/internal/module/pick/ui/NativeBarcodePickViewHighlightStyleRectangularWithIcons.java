package com.scandit.datacapture.barcode.internal.module.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickState;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodePickViewHighlightStyleRectangularWithIcons {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickViewHighlightStyleRectangularWithIcons {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17766a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeBarcodePickViewHighlightStyle native_asHighlightStyle(long j);

        private native NativeBrush native_brushForState(long j, NativeBarcodePickState nativeBarcodePickState);

        private native NativeBarcodePickIconStyle native_getIconStyle(long j);

        private native int native_getMinimumHighlightHeight(long j);

        private native int native_getMinimumHighlightWidth(long j);

        private native NativeBarcodePickStatusIconSettings native_getStatusIconSettings(long j);

        private native boolean native_getStyleResponseCacheEnabled(long j);

        private native NativeBrush native_selectedBrushForState(long j, NativeBarcodePickState nativeBarcodePickState);

        private native void native_setBrushForState(long j, NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

        private native void native_setIconStyle(long j, NativeBarcodePickIconStyle nativeBarcodePickIconStyle);

        private native void native_setMinimumHighlightHeight(long j, int i);

        private native void native_setMinimumHighlightWidth(long j, int i);

        private native void native_setSelectedBrushForState(long j, NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

        private native void native_setStatusIconSettings(long j, NativeBarcodePickStatusIconSettings nativeBarcodePickStatusIconSettings);

        private native void native_setStyleResponseCacheEnabled(long j, boolean z);

        private native String native_toJson(long j);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public NativeBarcodePickViewHighlightStyle asHighlightStyle() {
            return native_asHighlightStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public NativeBrush brushForState(NativeBarcodePickState nativeBarcodePickState) {
            return native_brushForState(this.nativeRef, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public NativeBarcodePickIconStyle getIconStyle() {
            return native_getIconStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public int getMinimumHighlightHeight() {
            return native_getMinimumHighlightHeight(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public int getMinimumHighlightWidth() {
            return native_getMinimumHighlightWidth(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public NativeBarcodePickStatusIconSettings getStatusIconSettings() {
            return native_getStatusIconSettings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public boolean getStyleResponseCacheEnabled() {
            return native_getStyleResponseCacheEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public NativeBrush selectedBrushForState(NativeBarcodePickState nativeBarcodePickState) {
            return native_selectedBrushForState(this.nativeRef, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public void setBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState) {
            native_setBrushForState(this.nativeRef, nativeBrush, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public void setIconStyle(NativeBarcodePickIconStyle nativeBarcodePickIconStyle) {
            native_setIconStyle(this.nativeRef, nativeBarcodePickIconStyle);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public void setMinimumHighlightHeight(int i) {
            native_setMinimumHighlightHeight(this.nativeRef, i);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public void setMinimumHighlightWidth(int i) {
            native_setMinimumHighlightWidth(this.nativeRef, i);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public void setSelectedBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState) {
            native_setSelectedBrushForState(this.nativeRef, nativeBrush, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public void setStatusIconSettings(NativeBarcodePickStatusIconSettings nativeBarcodePickStatusIconSettings) {
            native_setStatusIconSettings(this.nativeRef, nativeBarcodePickStatusIconSettings);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public void setStyleResponseCacheEnabled(boolean z) {
            native_setStyleResponseCacheEnabled(this.nativeRef, z);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public String toJson() {
            return native_toJson(this.nativeRef);
        }
    }

    public static native NativeBarcodePickViewHighlightStyleRectangularWithIcons create();

    public abstract NativeBarcodePickViewHighlightStyle asHighlightStyle();

    public abstract NativeBrush brushForState(NativeBarcodePickState nativeBarcodePickState);

    public abstract NativeBarcodePickIconStyle getIconStyle();

    public abstract int getMinimumHighlightHeight();

    public abstract int getMinimumHighlightWidth();

    public abstract NativeBarcodePickStatusIconSettings getStatusIconSettings();

    public abstract boolean getStyleResponseCacheEnabled();

    public abstract NativeBrush selectedBrushForState(NativeBarcodePickState nativeBarcodePickState);

    public abstract void setBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

    public abstract void setIconStyle(NativeBarcodePickIconStyle nativeBarcodePickIconStyle);

    public abstract void setMinimumHighlightHeight(int i);

    public abstract void setMinimumHighlightWidth(int i);

    public abstract void setSelectedBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

    public abstract void setStatusIconSettings(NativeBarcodePickStatusIconSettings nativeBarcodePickStatusIconSettings);

    public abstract void setStyleResponseCacheEnabled(boolean z);

    public abstract String toJson();
}
