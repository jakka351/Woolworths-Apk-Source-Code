package com.scandit.datacapture.core.internal.sdk.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeAimerViewfinder {

    @DjinniGenerated
    public static final class CppProxy extends NativeAimerViewfinder {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18758a = new AtomicBoolean(false);
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

        private native NativeColor native_getDotColor(long j);

        private native NativeColor native_getFrameColor(long j);

        private native void native_setDotColor(long j, NativeColor nativeColor);

        private native void native_setFrameColor(long j, NativeColor nativeColor);

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder
        public NativeViewfinder asViewfinder() {
            return native_asViewfinder(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder
        public NativeColor getDotColor() {
            return native_getDotColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder
        public NativeColor getFrameColor() {
            return native_getFrameColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder
        public void setDotColor(NativeColor nativeColor) {
            native_setDotColor(this.nativeRef, nativeColor);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder
        public void setFrameColor(NativeColor nativeColor) {
            native_setFrameColor(this.nativeRef, nativeColor);
        }
    }

    public static native NativeAimerViewfinder create();

    public static native NativeColor getDotColorDefault();

    public static native NativeColor getFrameColorDefault();

    public abstract NativeViewfinder asViewfinder();

    public abstract NativeColor getDotColor();

    public abstract NativeColor getFrameColor();

    public abstract void setDotColor(NativeColor nativeColor);

    public abstract void setFrameColor(NativeColor nativeColor);
}
