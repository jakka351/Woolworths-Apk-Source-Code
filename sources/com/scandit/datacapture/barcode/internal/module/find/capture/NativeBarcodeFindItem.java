package com.scandit.datacapture.barcode.internal.module.find.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodeFindItem {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeFindItem {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17727a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native int native_getCount(long j);

        private native String native_getFindableData(long j);

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindItem
        public int getCount() {
            return native_getCount(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindItem
        public String getFindableData() {
            return native_getFindableData(this.nativeRef);
        }
    }

    public static native NativeBarcodeFindItem create(String str);

    public abstract int getCount();

    public abstract String getFindableData();
}
