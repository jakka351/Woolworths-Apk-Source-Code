package com.scandit.internal.sdk.bar;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes.dex */
public abstract class ThreadFactory {

    @DjinniGenerated
    /* loaded from: classes6.dex */
    public static final class CppProxy extends ThreadFactory {
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

    public static native HandlerThreadCreator getFactory();

    public static native void setFactory(HandlerThreadCreator handlerThreadCreator);
}
