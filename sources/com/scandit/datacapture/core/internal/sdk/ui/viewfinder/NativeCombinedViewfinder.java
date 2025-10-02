package com.scandit.datacapture.core.internal.sdk.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeCombinedViewfinder {

    @DjinniGenerated
    public static final class CppProxy extends NativeCombinedViewfinder {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18759a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_addViewfinder(long j, NativeViewfinder nativeViewfinder, PointWithUnit pointWithUnit);

        private native NativeViewfinder native_asViewfinder(long j);

        private native void native_removeAll(long j);

        private native void native_removeViewfinder(long j, NativeViewfinder nativeViewfinder);

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeCombinedViewfinder
        public void addViewfinder(NativeViewfinder nativeViewfinder, PointWithUnit pointWithUnit) {
            native_addViewfinder(this.nativeRef, nativeViewfinder, pointWithUnit);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeCombinedViewfinder
        public NativeViewfinder asViewfinder() {
            return native_asViewfinder(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeCombinedViewfinder
        public void removeAll() {
            native_removeAll(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeCombinedViewfinder
        public void removeViewfinder(NativeViewfinder nativeViewfinder) {
            native_removeViewfinder(this.nativeRef, nativeViewfinder);
        }
    }

    public static native NativeCombinedViewfinder create();

    public abstract void addViewfinder(NativeViewfinder nativeViewfinder, PointWithUnit pointWithUnit);

    public abstract NativeViewfinder asViewfinder();

    public abstract void removeAll();

    public abstract void removeViewfinder(NativeViewfinder nativeViewfinder);
}
