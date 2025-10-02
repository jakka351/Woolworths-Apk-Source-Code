package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeProductProviderCallbackItem {

    @DjinniGenerated
    public static final class CppProxy extends NativeProductProviderCallbackItem {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17749a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native String native_getToBeTransformedData(long j);

        private native String native_getTransformationResult(long j);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallbackItem
        public String getToBeTransformedData() {
            return native_getToBeTransformedData(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallbackItem
        public String getTransformationResult() {
            return native_getTransformationResult(this.nativeRef);
        }
    }

    public static native NativeProductProviderCallbackItem create(String str, String str2);

    public abstract String getToBeTransformedData();

    public abstract String getTransformationResult();
}
