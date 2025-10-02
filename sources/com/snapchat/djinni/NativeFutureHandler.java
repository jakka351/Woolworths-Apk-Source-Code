package com.snapchat.djinni;

import com.snapchat.djinni.Future;

/* loaded from: classes6.dex */
public class NativeFutureHandler<T> implements Future.FutureHandler<T> {
    private static native void nativeHandleResult(long j, long j2, Object obj, Throwable th);
}
