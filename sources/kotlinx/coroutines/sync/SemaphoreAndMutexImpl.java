package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.a;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001R\u0011\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004R\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004R\u0011\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004R\u000b\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004R\u000b\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "head", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "tail", "enqIdx", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class SemaphoreAndMutexImpl {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f24748a;
    public final a b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public SemaphoreAndMutexImpl(int i, int i2) {
        this.f24748a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(YU.a.d(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(YU.a.d(i, "The number of acquired permits should be in 0..").toString());
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head$volatile = semaphoreSegment;
        this.tail$volatile = semaphoreSegment;
        this._availablePermits$volatile = i - i2;
        this.b = new a(this, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.q(r3, r4.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.SemaphoreAndMutexImpl.g
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.f24748a
            if (r1 > r2) goto L0
            kotlin.Unit r3 = kotlin.Unit.f24250a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r5)
            kotlinx.coroutines.CancellableContinuationImpl r5 = kotlinx.coroutines.CancellableContinuationKt.b(r5)
            boolean r1 = r4.d(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            kotlinx.coroutines.a r0 = r4.b     // Catch: java.lang.Throwable -> L3f
            r5.q(r3, r0)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.d(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r5 = r5.n()
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            if (r5 != r0) goto L3a
            goto L3b
        L3a:
            r5 = r3
        L3b:
            if (r5 != r0) goto L3e
            return r5
        L3e:
            return r3
        L3f:
            r0 = move-exception
            r5.A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreAndMutexImpl.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean d(Waiter waiter) {
        Object objA;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.d;
        long j = andIncrement / SemaphoreKt.f;
        loop0: while (true) {
            objA = ConcurrentLinkedListKt.a(semaphoreSegment, j, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!SegmentOrClosed.b(objA)) {
                Segment segmentA = SegmentOrClosed.a(objA);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f >= segmentA.f) {
                        break loop0;
                    }
                    if (!segmentA.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentA)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (segmentA.f()) {
                                segmentA.e();
                            }
                        }
                    }
                    if (segment.f()) {
                        segment.e();
                    }
                }
            } else {
                break;
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.a(objA);
        AtomicReferenceArray atomicReferenceArray = semaphoreSegment2.h;
        int i = (int) (andIncrement % SemaphoreKt.f);
        while (!atomicReferenceArray.compareAndSet(i, null, waiter)) {
            if (atomicReferenceArray.get(i) != null) {
                Symbol symbol = SemaphoreKt.b;
                Symbol symbol2 = SemaphoreKt.c;
                while (!atomicReferenceArray.compareAndSet(i, symbol, symbol2)) {
                    if (atomicReferenceArray.get(i) != symbol) {
                        return false;
                    }
                }
                boolean z = waiter instanceof CancellableContinuation;
                Unit unit = Unit.f24250a;
                if (z) {
                    ((CancellableContinuation) waiter).q(unit, this.b);
                    return true;
                }
                if (waiter instanceof SelectInstance) {
                    ((SelectInstance) waiter).c(unit);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + waiter).toString());
            }
        }
        waiter.a(semaphoreSegment2, i);
        return true;
    }

    public final void release() {
        int i;
        Object objA;
        boolean zE;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.f24748a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            SemaphoreSegment semaphoreSegment = (SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = d.getAndIncrement(this);
            long j = andIncrement2 / SemaphoreKt.f;
            SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.d;
            while (true) {
                objA = ConcurrentLinkedListKt.a(semaphoreSegment, j, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
                if (SegmentOrClosed.b(objA)) {
                    break;
                }
                Segment segmentA = SegmentOrClosed.a(objA);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f >= segmentA.f) {
                        break;
                    }
                    if (!segmentA.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentA)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (segmentA.f()) {
                                segmentA.e();
                            }
                        }
                    }
                    if (segment.f()) {
                        segment.e();
                    }
                }
            }
            SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.a(objA);
            AtomicReferenceArray atomicReferenceArray = semaphoreSegment2.h;
            semaphoreSegment2.a();
            zE = false;
            if (semaphoreSegment2.f <= j) {
                int i3 = (int) (andIncrement2 % SemaphoreKt.f);
                Object andSet = atomicReferenceArray.getAndSet(i3, SemaphoreKt.b);
                if (andSet == null) {
                    int i4 = SemaphoreKt.f24749a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == SemaphoreKt.c) {
                            zE = true;
                            break;
                        }
                    }
                    Symbol symbol = SemaphoreKt.b;
                    Symbol symbol2 = SemaphoreKt.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, symbol, symbol2)) {
                            if (atomicReferenceArray.get(i3) != symbol) {
                                break;
                            }
                        } else {
                            zE = true;
                            break;
                        }
                    }
                    zE = !zE;
                } else if (andSet != SemaphoreKt.e) {
                    boolean z = andSet instanceof CancellableContinuation;
                    Unit unit = Unit.f24250a;
                    if (z) {
                        CancellableContinuation cancellableContinuation = (CancellableContinuation) andSet;
                        Symbol symbolW = cancellableContinuation.w(unit, this.b);
                        if (symbolW != null) {
                            cancellableContinuation.u(symbolW);
                            zE = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof SelectInstance)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        zE = ((SelectInstance) andSet).e(this, unit);
                    }
                }
            }
        } while (!zE);
    }
}
