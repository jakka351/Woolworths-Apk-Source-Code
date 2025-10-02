package com.scandit.datacapture.core.internal.sdk.source;

import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeSingleBitmapFrameDataCollection {

    @DjinniGenerated
    public static final class CppProxy extends NativeSingleBitmapFrameDataCollection {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18723a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeFrameData native_get(long j, int i);

        private native int native_getSize(long j);

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeSingleBitmapFrameDataCollection
        public NativeFrameData get(int i) {
            return native_get(this.nativeRef, i);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeSingleBitmapFrameDataCollection
        public int getSize() {
            return native_getSize(this.nativeRef);
        }
    }

    public static native NativeSingleBitmapFrameDataCollection create(NativeBitmapInfo nativeBitmapInfo);

    public abstract NativeFrameData get(int i);

    public abstract int getSize();
}
