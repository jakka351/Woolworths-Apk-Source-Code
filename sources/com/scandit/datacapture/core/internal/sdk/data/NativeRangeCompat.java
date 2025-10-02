package com.scandit.datacapture.core.internal.sdk.data;

import com.scandit.datacapture.core.data.Range;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeRangeCompat {

    @DjinniGenerated
    public static final class CppProxy extends NativeRangeCompat {
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

    public static native Range create(short s, short s2, short s3);

    public static native boolean isValid(Range range);
}
