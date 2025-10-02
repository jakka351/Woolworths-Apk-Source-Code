package com.fasterxml.jackson.core.util;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
class ThreadLocalBufferManager {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f14222a = new ConcurrentHashMap();
    public final ReferenceQueue b = new ReferenceQueue();

    public static final class ThreadLocalBufferManagerHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final ThreadLocalBufferManager f14223a = new ThreadLocalBufferManager();
    }
}
