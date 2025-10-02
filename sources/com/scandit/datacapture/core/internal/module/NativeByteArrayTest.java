package com.scandit.datacapture.core.internal.module;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeByteArrayTest {

    @DjinniGenerated
    public static final class CppProxy extends NativeByteArrayTest {
        private final long nativeRef;

        private CppProxy(long j) {
            new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);
    }

    public static native int getArraySize(byte[] bArr);

    public static native byte getElementAtIndex(byte[] bArr, int i);

    public static native void multiply(ByteBuffer byteBuffer, int i);
}
