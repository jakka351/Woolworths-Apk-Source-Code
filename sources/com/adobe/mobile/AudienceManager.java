package com.adobe.mobile;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class AudienceManager {

    /* renamed from: com.adobe.mobile.AudienceManager$1, reason: invalid class name */
    final class AnonymousClass1 implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public final String call() {
            return AudienceManagerWorker.c();
        }
    }

    public interface AudienceManagerCallback<T> {
    }
}
