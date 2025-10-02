package com.scandit.datacapture.core.internal.module.data;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes.dex */
public abstract class NativeDataDecodingFactory {

    @DjinniGenerated
    /* loaded from: classes6.dex */
    public static final class CppProxy extends NativeDataDecodingFactory {
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

    public static native NativeDataDecoding getDataDecoding();

    public static native void setDataDecoding(NativeDataDecoding nativeDataDecoding);
}
