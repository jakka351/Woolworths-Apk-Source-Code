package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeZoomGesture {

    @DjinniGenerated
    public static final class CppProxy extends NativeZoomGesture {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18615a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native String native_toJson(long j);

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeZoomGesture
        public String toJson() {
            return native_toJson(this.nativeRef);
        }
    }

    public abstract String toJson();
}
