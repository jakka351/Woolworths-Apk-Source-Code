package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeSwipeToZoom {

    @DjinniGenerated
    public static final class CppProxy extends NativeSwipeToZoom {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18611a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_addListener(long j, NativeZoomGestureListener nativeZoomGestureListener);

        private native NativeZoomGesture native_asZoomGesture(long j);

        private native String native_toJson(long j);

        private native void native_triggerZoomIn(long j);

        private native void native_triggerZoomOut(long j);

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom
        public void addListener(NativeZoomGestureListener nativeZoomGestureListener) {
            native_addListener(this.nativeRef, nativeZoomGestureListener);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom
        public NativeZoomGesture asZoomGesture() {
            return native_asZoomGesture(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom
        public String toJson() {
            return native_toJson(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom
        public void triggerZoomIn() {
            native_triggerZoomIn(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom
        public void triggerZoomOut() {
            native_triggerZoomOut(this.nativeRef);
        }
    }

    public static native NativeSwipeToZoom create();

    public abstract void addListener(NativeZoomGestureListener nativeZoomGestureListener);

    public abstract NativeZoomGesture asZoomGesture();

    public abstract String toJson();

    public abstract void triggerZoomIn();

    public abstract void triggerZoomOut();
}
