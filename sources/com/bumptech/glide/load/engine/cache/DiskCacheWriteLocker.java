package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.Preconditions;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
final class DiskCacheWriteLocker {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13828a = new HashMap();
    public final WriteLockPool b = new WriteLockPool();

    public static class WriteLock {

        /* renamed from: a, reason: collision with root package name */
        public final ReentrantLock f13829a = new ReentrantLock();
        public int b;
    }

    public static class WriteLockPool {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayDeque f13830a = new ArrayDeque();
    }

    public final void a(String str) {
        WriteLock writeLock;
        synchronized (this) {
            try {
                Object obj = this.f13828a.get(str);
                Preconditions.c(obj, "Argument must not be null");
                writeLock = (WriteLock) obj;
                int i = writeLock.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + writeLock.b);
                }
                int i2 = i - 1;
                writeLock.b = i2;
                if (i2 == 0) {
                    WriteLock writeLock2 = (WriteLock) this.f13828a.remove(str);
                    if (!writeLock2.equals(writeLock)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + writeLock + ", but actually removed: " + writeLock2 + ", safeKey: " + str);
                    }
                    WriteLockPool writeLockPool = this.b;
                    synchronized (writeLockPool.f13830a) {
                        try {
                            if (writeLockPool.f13830a.size() < 10) {
                                writeLockPool.f13830a.offer(writeLock2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        writeLock.f13829a.unlock();
    }
}
