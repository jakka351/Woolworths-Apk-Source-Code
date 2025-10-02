package com.scandit.datacapture.barcode.internal.module.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickState;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodePickViewHighlightStyleDotWithIcons {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickViewHighlightStyleDotWithIcons {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17764a = new AtomicBoolean(false);
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

        private native boolean native_getStyleResponseCacheEnabled(long j);

        private native NativeBrush native_selectedBrushForState(long j, NativeBarcodePickState nativeBarcodePickState);

        private native void native_setBrushForState(long j, NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

        private native void native_setIconStyle(long j, NativeBarcodePickIconStyle nativeBarcodePickIconStyle);

        private native void native_setSelectedBrushForState(long j, NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

        private native void native_setStyleResponseCacheEnabled(long j, boolean z);

        private native String native_toJson(long j);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons
        public NativeBarcodePickViewHighlightStyle asHighlightStyle() {
            return native_asHighlightStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons
        public NativeBrush brushForState(NativeBarcodePickState nativeBarcodePickState) {
            return native_brushForState(this.nativeRef, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons
        public NativeBarcodePickIconStyle getIconStyle() {
            return native_getIconStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons
        public boolean getStyleResponseCacheEnabled() {
            return native_getStyleResponseCacheEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons
        public NativeBrush selectedBrushForState(NativeBarcodePickState nativeBarcodePickState) {
            return native_selectedBrushForState(this.nativeRef, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons
        public void setBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState) {
            native_setBrushForState(this.nativeRef, nativeBrush, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons
        public void setIconStyle(NativeBarcodePickIconStyle nativeBarcodePickIconStyle) {
            native_setIconStyle(this.nativeRef, nativeBarcodePickIconStyle);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons
        public void setSelectedBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState) {
            native_setSelectedBrushForState(this.nativeRef, nativeBrush, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons
        public void setStyleResponseCacheEnabled(boolean z) {
            native_setStyleResponseCacheEnabled(this.nativeRef, z);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons
        public String toJson() {
            return native_toJson(this.nativeRef);
        }
    }

    public static native NativeBarcodePickViewHighlightStyleDotWithIcons create();

    public abstract NativeBarcodePickViewHighlightStyle asHighlightStyle();

    public abstract NativeBrush brushForState(NativeBarcodePickState nativeBarcodePickState);

    public abstract NativeBarcodePickIconStyle getIconStyle();

    public abstract boolean getStyleResponseCacheEnabled();

    public abstract NativeBrush selectedBrushForState(NativeBarcodePickState nativeBarcodePickState);

    public abstract void setBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

    public abstract void setIconStyle(NativeBarcodePickIconStyle nativeBarcodePickIconStyle);

    public abstract void setSelectedBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

    public abstract void setStyleResponseCacheEnabled(boolean z);

    public abstract String toJson();
}
