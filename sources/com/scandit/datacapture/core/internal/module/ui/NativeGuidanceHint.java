package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeGuidanceHint {

    @DjinniGenerated
    public static final class CppProxy extends NativeGuidanceHint {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18599a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeHintStyle native_getHintStyle(long j);

        private native String native_getText(long j);

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHint
        public NativeHintStyle getHintStyle() {
            return native_getHintStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHint
        public String getText() {
            return native_getText(this.nativeRef);
        }
    }

    public static native NativeGuidanceHint create(NativeGuidanceHintStyle nativeGuidanceHintStyle, String str, NativeGuidanceHintAnchor nativeGuidanceHintAnchor);

    public abstract NativeHintStyle getHintStyle();

    public abstract String getText();
}
