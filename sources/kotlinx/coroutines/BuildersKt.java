package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

@Metadata(d1 = {"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BuildersKt {
    public static Deferred a(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2, int i) {
        CoroutineStart coroutineStart = CoroutineStart.e;
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.d;
        }
        CoroutineStart coroutineStart2 = (i & 2) != 0 ? CoroutineStart.d : coroutineStart;
        CoroutineContext coroutineContextB = CoroutineContextKt.b(coroutineScope, coroutineContext);
        DeferredCoroutine lazyDeferredCoroutine = coroutineStart2 == coroutineStart ? new LazyDeferredCoroutine(coroutineContextB, function2) : new DeferredCoroutine(coroutineContextB, true, true);
        lazyDeferredCoroutine.p0(coroutineStart2, lazyDeferredCoroutine, function2);
        return lazyDeferredCoroutine;
    }

    public static final Job b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2) {
        CoroutineContext coroutineContextB = CoroutineContextKt.b(coroutineScope, coroutineContext);
        coroutineStart.getClass();
        AbstractCoroutine lazyStandaloneCoroutine = coroutineStart == CoroutineStart.e ? new LazyStandaloneCoroutine(coroutineContextB, function2) : new StandaloneCoroutine(coroutineContextB, true, true);
        lazyStandaloneCoroutine.p0(coroutineStart, lazyStandaloneCoroutine, function2);
        return lazyStandaloneCoroutine;
    }

    public static /* synthetic */ Job c(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.d;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.d;
        }
        return b(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final Object d(CoroutineContext coroutineContext, Function2 function2) throws Throwable {
        EventLoop eventLoopA;
        CoroutineContext coroutineContextB;
        Thread threadCurrentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.Key.d);
        GlobalScope globalScope = GlobalScope.d;
        if (continuationInterceptor == null) {
            eventLoopA = ThreadLocalEventLoop.a();
            coroutineContextB = CoroutineContextKt.b(globalScope, coroutineContext.plus(eventLoopA));
        } else {
            if (continuationInterceptor instanceof EventLoop) {
            }
            eventLoopA = (EventLoop) ThreadLocalEventLoop.f24695a.get();
            coroutineContextB = CoroutineContextKt.b(globalScope, coroutineContext);
        }
        BlockingCoroutine blockingCoroutine = new BlockingCoroutine(coroutineContextB, threadCurrentThread, eventLoopA);
        blockingCoroutine.p0(CoroutineStart.d, blockingCoroutine, function2);
        EventLoop eventLoop = blockingCoroutine.h;
        if (eventLoop != null) {
            int i = EventLoop.i;
            eventLoop.Y(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jB0 = eventLoop != null ? eventLoop.b0() : Long.MAX_VALUE;
                if (blockingCoroutine.isCompleted()) {
                    if (eventLoop != null) {
                        int i2 = EventLoop.i;
                        eventLoop.T(false);
                    }
                    Object objA = JobSupportKt.a(JobSupport.d.get(blockingCoroutine));
                    CompletedExceptionally completedExceptionally = objA instanceof CompletedExceptionally ? (CompletedExceptionally) objA : null;
                    if (completedExceptionally == null) {
                        return objA;
                    }
                    throw completedExceptionally.f24689a;
                }
                LockSupport.parkNanos(blockingCoroutine, jB0);
            } catch (Throwable th) {
                if (eventLoop != null) {
                    int i3 = EventLoop.i;
                    eventLoop.T(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        blockingCoroutine.D(interruptedException);
        throw interruptedException;
    }

    public static final Object f(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) throws Throwable {
        Object objA;
        CoroutineContext context = continuation.getE();
        CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new kotlin.coroutines.a(1))).booleanValue() ? context.plus(coroutineContext) : CoroutineContextKt.a(context, coroutineContext, false);
        JobKt.e(coroutineContextPlus);
        if (coroutineContextPlus == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation, coroutineContextPlus);
            objA = UndispatchedKt.a(scopeCoroutine, scopeCoroutine, function2);
        } else {
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key.d;
            if (Intrinsics.c(coroutineContextPlus.get(key), context.get(key))) {
                UndispatchedCoroutine undispatchedCoroutine = new UndispatchedCoroutine(continuation, coroutineContextPlus);
                CoroutineContext coroutineContext2 = undispatchedCoroutine.f;
                Object objC = ThreadContextKt.c(coroutineContext2, null);
                try {
                    Object objA2 = UndispatchedKt.a(undispatchedCoroutine, undispatchedCoroutine, function2);
                    ThreadContextKt.a(coroutineContext2, objC);
                    objA = objA2;
                } catch (Throwable th) {
                    ThreadContextKt.a(coroutineContext2, objC);
                    throw th;
                }
            } else {
                DispatchedCoroutine dispatchedCoroutine = new DispatchedCoroutine(continuation, coroutineContextPlus);
                try {
                    DispatchedContinuationKt.a(Unit.f24250a, IntrinsicsKt.b(IntrinsicsKt.a(dispatchedCoroutine, dispatchedCoroutine, function2)));
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = DispatchedCoroutine.h;
                    while (true) {
                        int i = atomicIntegerFieldUpdater.get(dispatchedCoroutine);
                        if (i != 0) {
                            if (i != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objA = JobSupportKt.a(JobSupport.d.get(dispatchedCoroutine));
                            if (objA instanceof CompletedExceptionally) {
                                throw ((CompletedExceptionally) objA).f24689a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(dispatchedCoroutine, 0, 1)) {
                            objA = CoroutineSingletons.d;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    CancellableKt.a(th2, dispatchedCoroutine);
                    throw null;
                }
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objA;
    }
}
