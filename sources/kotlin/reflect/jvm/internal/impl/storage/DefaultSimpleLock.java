package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class DefaultSimpleLock implements SimpleLock {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f24592a;

    public DefaultSimpleLock(ReentrantLock reentrantLock) {
        this.f24592a = reentrantLock;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        this.f24592a.lock();
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public final void unlock() {
        this.f24592a.unlock();
    }
}
