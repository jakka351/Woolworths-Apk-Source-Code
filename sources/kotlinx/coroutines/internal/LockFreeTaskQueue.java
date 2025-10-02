package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001R!\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u00038\u0002X\u0082\u0004¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "", "E", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Lkotlinx/coroutines/internal/Core;", "_cur", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class LockFreeTaskQueue<E> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24723a = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new LockFreeTaskQueueCore(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24723a;
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            int iA = lockFreeTaskQueueCore.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                LockFreeTaskQueueCore lockFreeTaskQueueCoreC = lockFreeTaskQueueCore.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCoreC) && atomicReferenceFieldUpdater.get(this) == lockFreeTaskQueueCore) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final int b() {
        LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) f24723a.get(this);
        lockFreeTaskQueueCore.getClass();
        long j = LockFreeTaskQueueCore.f.get(lockFreeTaskQueueCore);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object c() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24723a;
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            Object objD = lockFreeTaskQueueCore.d();
            if (objD != LockFreeTaskQueueCore.g) {
                return objD;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCoreC = lockFreeTaskQueueCore.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCoreC) && atomicReferenceFieldUpdater.get(this) == lockFreeTaskQueueCore) {
            }
        }
    }
}
