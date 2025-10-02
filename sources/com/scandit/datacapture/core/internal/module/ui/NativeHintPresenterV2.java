package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeHintPresenterV2 {

    @DjinniGenerated
    public static final class CppProxy extends NativeHintPresenterV2 {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18608a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_hideAllToasts(long j);

        private native void native_hideCurrentGuidance(long j);

        private native void native_hideToast(long j, String str);

        private native void native_showGuidance(long j, NativeGuidanceHint nativeGuidanceHint);

        private native void native_showToast(long j, NativeToastHint nativeToastHint);

        private native void native_update(long j);

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2
        public void hideAllToasts() {
            native_hideAllToasts(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2
        public void hideCurrentGuidance() {
            native_hideCurrentGuidance(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2
        public void hideToast(String str) {
            native_hideToast(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2
        public void showGuidance(NativeGuidanceHint nativeGuidanceHint) {
            native_showGuidance(this.nativeRef, nativeGuidanceHint);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2
        public void showToast(NativeToastHint nativeToastHint) {
            native_showToast(this.nativeRef, nativeToastHint);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2
        public void update() {
            native_update(this.nativeRef);
        }
    }

    public static native NativeHintPresenterV2 create(NativePlatformHintPresenter nativePlatformHintPresenter);

    public abstract void hideAllToasts();

    public abstract void hideCurrentGuidance();

    public abstract void hideToast(String str);

    public abstract void showGuidance(NativeGuidanceHint nativeGuidanceHint);

    public abstract void showToast(NativeToastHint nativeToastHint);

    public abstract void update();
}
