package com.scandit.datacapture.core.internal.sdk.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeSpotlightViewfinder {

    @DjinniGenerated
    public static final class CppProxy extends NativeSpotlightViewfinder {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18767a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeViewfinder native_asViewfinder(long j);

        private native NativeColor native_getBackgroundColor(long j);

        private native NativeColor native_getDisabledBorderColor(long j);

        private native NativeColor native_getEnabledBorderColor(long j);

        private native NativeSizeWithUnitAndAspect native_getSizeWithUnitAndAspect(long j);

        private native void native_setBackgroundColor(long j, NativeColor nativeColor);

        private native void native_setDisabledBorderColor(long j, NativeColor nativeColor);

        private native void native_setEnabledBorderColor(long j, NativeColor nativeColor);

        private native void native_setHeightAndAspectRatio(long j, FloatWithUnit floatWithUnit, float f);

        private native void native_setWidthAndAspectRatio(long j, FloatWithUnit floatWithUnit, float f);

        private native void native_setWidthAndHeight(long j, FloatWithUnit floatWithUnit, FloatWithUnit floatWithUnit2);

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder
        public NativeViewfinder asViewfinder() {
            return native_asViewfinder(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder
        public NativeColor getBackgroundColor() {
            return native_getBackgroundColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder
        public NativeColor getDisabledBorderColor() {
            return native_getDisabledBorderColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder
        public NativeColor getEnabledBorderColor() {
            return native_getEnabledBorderColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder
        public NativeSizeWithUnitAndAspect getSizeWithUnitAndAspect() {
            return native_getSizeWithUnitAndAspect(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder
        public void setBackgroundColor(NativeColor nativeColor) {
            native_setBackgroundColor(this.nativeRef, nativeColor);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder
        public void setDisabledBorderColor(NativeColor nativeColor) {
            native_setDisabledBorderColor(this.nativeRef, nativeColor);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder
        public void setEnabledBorderColor(NativeColor nativeColor) {
            native_setEnabledBorderColor(this.nativeRef, nativeColor);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder
        public void setHeightAndAspectRatio(FloatWithUnit floatWithUnit, float f) {
            native_setHeightAndAspectRatio(this.nativeRef, floatWithUnit, f);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder
        public void setWidthAndAspectRatio(FloatWithUnit floatWithUnit, float f) {
            native_setWidthAndAspectRatio(this.nativeRef, floatWithUnit, f);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder
        public void setWidthAndHeight(FloatWithUnit floatWithUnit, FloatWithUnit floatWithUnit2) {
            native_setWidthAndHeight(this.nativeRef, floatWithUnit, floatWithUnit2);
        }
    }

    public static native NativeSpotlightViewfinder create();

    public abstract NativeViewfinder asViewfinder();

    public abstract NativeColor getBackgroundColor();

    public abstract NativeColor getDisabledBorderColor();

    public abstract NativeColor getEnabledBorderColor();

    public abstract NativeSizeWithUnitAndAspect getSizeWithUnitAndAspect();

    public abstract void setBackgroundColor(NativeColor nativeColor);

    public abstract void setDisabledBorderColor(NativeColor nativeColor);

    public abstract void setEnabledBorderColor(NativeColor nativeColor);

    public abstract void setHeightAndAspectRatio(FloatWithUnit floatWithUnit, float f);

    public abstract void setWidthAndAspectRatio(FloatWithUnit floatWithUnit, float f);

    public abstract void setWidthAndHeight(FloatWithUnit floatWithUnit, FloatWithUnit floatWithUnit2);
}
