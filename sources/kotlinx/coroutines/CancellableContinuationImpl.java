package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006R\u000b\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004R\u0013\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004R\u0013\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "Lkotlinx/coroutines/DisposableHandle;", "_parentHandle", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes.dex */
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CancellableContinuation<T>, CoroutineStackFrame, Waiter {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final Continuation g;
    public final CoroutineContext h;

    public CancellableContinuationImpl(int i2, Continuation continuation) {
        super(i2);
        this.g = continuation;
        this.h = continuation.getF();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = Active.d;
    }

    public static Object E(NotCompleted notCompleted, Object obj, int i2, Function3 function3) {
        if (obj instanceof CompletedExceptionally) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (function3 != null || (notCompleted instanceof CancelHandler)) {
            return new CompletedContinuation(obj, notCompleted instanceof CancelHandler ? (CancelHandler) notCompleted : null, function3, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A() {
        Continuation continuation = this.g;
        Throwable th = null;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = DispatchedContinuation.k;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(dispatchedContinuation);
                Symbol symbol = DispatchedContinuationKt.b;
                if (obj == symbol) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, symbol, this)) {
                        if (atomicReferenceFieldUpdater.get(dispatchedContinuation) != symbol) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(dispatchedContinuation) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            k();
            cancel(th);
        }
    }

    public final void B(Object obj, Function1 function1) throws DispatchException {
        C(obj, this.f, new a(function1, 0));
    }

    public final void C(Object obj, int i2, Function3 function3) throws DispatchException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof NotCompleted) {
                Object objE = E((NotCompleted) obj2, obj, i2, function3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    k();
                }
                l(i2);
                return;
            }
            if (obj2 instanceof CancelledContinuation) {
                CancelledContinuation cancelledContinuation = (CancelledContinuation) obj2;
                if (CancelledContinuation.c.compareAndSet(cancelledContinuation, 0, 1)) {
                    if (function3 != null) {
                        i(function3, cancelledContinuation.f24689a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void D(CoroutineDispatcher coroutineDispatcher, Object obj) {
        Continuation continuation = this.g;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        C(obj, (dispatchedContinuation != null ? dispatchedContinuation.g : null) == coroutineDispatcher ? 4 : this.f, null);
    }

    public final Symbol F(Object obj, Function3 function3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof NotCompleted)) {
                return null;
            }
            Object objE = E((NotCompleted) obj2, obj, this.f, function3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            boolean zX = x();
            Symbol symbol = CancellableContinuationImplKt.f24687a;
            if (!zX) {
                k();
            }
            return symbol;
        }
    }

    @Override // kotlinx.coroutines.Waiter
    public final void a(Segment segment, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = i;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        s(segment);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof NotCompleted) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof CompletedExceptionally) {
                return;
            }
            if (obj instanceof CompletedContinuation) {
                CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                if (completedContinuation.e != null) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (kotlin.reflect.jvm.internal.impl.types.checker.a.y(atomicReferenceFieldUpdater, this, obj, CompletedContinuation.a(completedContinuation, null, cancellationException, 15))) {
                    CancelHandler cancelHandler = completedContinuation.b;
                    if (cancelHandler != null) {
                        h(cancelHandler, cancellationException);
                    }
                    Function3 function3 = completedContinuation.c;
                    if (function3 != null) {
                        i(function3, cancellationException, completedContinuation.f24688a);
                        return;
                    }
                    return;
                }
                cancellationException2 = cancellationException;
            } else {
                cancellationException2 = cancellationException;
                if (kotlin.reflect.jvm.internal.impl.types.checker.a.y(atomicReferenceFieldUpdater, this, obj, new CompletedContinuation(obj, (CancelHandler) null, (Function3) null, cancellationException2, 14))) {
                    return;
                }
            }
            cancellationException = cancellationException2;
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: c, reason: from getter */
    public final Continuation getG() {
        return this.g;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean cancel(Throwable th) throws DispatchException {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
            boolean z = (obj instanceof CancelHandler) || (obj instanceof Segment);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            CancelledContinuation cancelledContinuation = new CancelledContinuation(cancellationException, z);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, cancelledContinuation)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            NotCompleted notCompleted = (NotCompleted) obj;
            if (notCompleted instanceof CancelHandler) {
                h((CancelHandler) obj, th);
            } else if (notCompleted instanceof Segment) {
                j((Segment) obj, th);
            }
            if (!x()) {
                k();
            }
            l(this.f);
            return true;
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Object e(Object obj) {
        return obj instanceof CompletedContinuation ? ((CompletedContinuation) obj).f24688a : obj;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Object g() {
        return j.get(this);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.g;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext, reason: from getter */
    public final CoroutineContext getF() {
        return this.h;
    }

    public final void h(CancelHandler cancelHandler, Throwable th) {
        try {
            cancelHandler.b(th);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.a(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2), this.h);
        }
    }

    public final void i(Function3 function3, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.h;
        try {
            function3.invoke(th, obj, coroutineContext);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.a(new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void j(Segment segment, Throwable th) {
        CoroutineContext coroutineContext = this.h;
        int i2 = i.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment.h(i2, coroutineContext);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.a(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        DisposableHandle disposableHandle = (DisposableHandle) atomicReferenceFieldUpdater.get(this);
        if (disposableHandle == null) {
            return;
        }
        disposableHandle.dispose();
        atomicReferenceFieldUpdater.set(this, NonDisposableHandle.d);
    }

    public final void l(int i2) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = i;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i2 == 4;
                Continuation continuation = this.g;
                if (!z && (continuation instanceof DispatchedContinuation)) {
                    boolean z2 = i2 == 1 || i2 == 2;
                    int i5 = this.f;
                    if (z2 == (i5 == 1 || i5 == 2)) {
                        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
                        CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.g;
                        CoroutineContext h = dispatchedContinuation.h.getF();
                        if (DispatchedContinuationKt.c(coroutineDispatcher, h)) {
                            DispatchedContinuationKt.b(coroutineDispatcher, h, this);
                            return;
                        }
                        EventLoop eventLoopA = ThreadLocalEventLoop.a();
                        if (eventLoopA.f >= llqqqql.a00610061aaaa) {
                            eventLoopA.U(this);
                            return;
                        }
                        eventLoopA.Y(true);
                        try {
                            DispatchedTaskKt.a(this, continuation, true);
                            do {
                            } while (eventLoopA.d0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                DispatchedTaskKt.a(this, continuation, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable m(JobSupport jobSupport) {
        return jobSupport.getCancellationException();
    }

    public final Object n() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        Job job;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = i;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zX) {
                    A();
                }
                Object obj = j.get(this);
                if (obj instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) obj).f24689a;
                }
                int i4 = this.f;
                if ((i4 != 1 && i4 != 2) || (job = (Job) this.h.get(Job.Key.d)) == null || job.isActive()) {
                    return e(obj);
                }
                CancellationException cancellationException = job.getCancellationException();
                b(cancellationException);
                throw cancellationException;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((DisposableHandle) k.get(this)) == null) {
            p();
        }
        if (zX) {
            A();
        }
        return CoroutineSingletons.d;
    }

    public final void o() {
        DisposableHandle disposableHandleP = p();
        if (disposableHandleP != null && v()) {
            disposableHandleP.dispose();
            k.set(this, NonDisposableHandle.d);
        }
    }

    public final DisposableHandle p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Job job = (Job) this.h.get(Job.Key.d);
        if (job == null) {
            return null;
        }
        DisposableHandle disposableHandleG = JobKt.g(job, new ChildContinuation(this));
        do {
            atomicReferenceFieldUpdater = k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, disposableHandleG)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return disposableHandleG;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void q(Object obj, Function3 function3) throws DispatchException {
        C(obj, this.f, function3);
    }

    public final void r(Function1 function1) {
        s(new CancelHandler.UserSupplied(function1));
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            obj = new CompletedExceptionally(thA, false);
        }
        C(obj, this.f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
    
        y(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(kotlinx.coroutines.NotCompleted r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl.j
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof kotlinx.coroutines.Active
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto La5
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof kotlinx.coroutines.CancelHandler
            r3 = 0
            if (r1 != 0) goto Lae
            boolean r1 = r2 instanceof kotlinx.coroutines.internal.Segment
            if (r1 != 0) goto Lae
            boolean r1 = r2 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L52
            r0 = r2
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.CompletedExceptionally.b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L4e
            boolean r1 = r2 instanceof kotlinx.coroutines.CancelledContinuation
            if (r1 == 0) goto La5
            java.lang.Throwable r0 = r0.f24689a
            boolean r1 = r8 instanceof kotlinx.coroutines.CancelHandler
            if (r1 == 0) goto L43
            kotlinx.coroutines.CancelHandler r8 = (kotlinx.coroutines.CancelHandler) r8
            r7.h(r8, r0)
            return
        L43:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            kotlin.jvm.internal.Intrinsics.f(r8, r1)
            kotlinx.coroutines.internal.Segment r8 = (kotlinx.coroutines.internal.Segment) r8
            r7.j(r8, r0)
            return
        L4e:
            y(r8, r2)
            throw r3
        L52:
            boolean r1 = r2 instanceof kotlinx.coroutines.CompletedContinuation
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L8b
            r1 = r2
            kotlinx.coroutines.CompletedContinuation r1 = (kotlinx.coroutines.CompletedContinuation) r1
            kotlinx.coroutines.CancelHandler r5 = r1.b
            if (r5 != 0) goto L87
            boolean r5 = r8 instanceof kotlinx.coroutines.internal.Segment
            if (r5 == 0) goto L64
            return
        L64:
            kotlin.jvm.internal.Intrinsics.f(r8, r4)
            r4 = r8
            kotlinx.coroutines.CancelHandler r4 = (kotlinx.coroutines.CancelHandler) r4
            java.lang.Throwable r5 = r1.e
            if (r5 == 0) goto L72
            r7.h(r4, r5)
            return
        L72:
            r5 = 29
            kotlinx.coroutines.CompletedContinuation r1 = kotlinx.coroutines.CompletedContinuation.a(r1, r4, r3, r5)
        L78:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L7f
            goto La5
        L7f:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L78
            goto L0
        L87:
            y(r8, r2)
            throw r3
        L8b:
            boolean r1 = r8 instanceof kotlinx.coroutines.internal.Segment
            if (r1 == 0) goto L90
            return
        L90:
            kotlin.jvm.internal.Intrinsics.f(r8, r4)
            r3 = r8
            kotlinx.coroutines.CancelHandler r3 = (kotlinx.coroutines.CancelHandler) r3
            kotlinx.coroutines.CompletedContinuation r1 = new kotlinx.coroutines.CompletedContinuation
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L9f:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto La6
        La5:
            return
        La6:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L9f
            goto L0
        Lae:
            y(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CancellableContinuationImpl.s(kotlinx.coroutines.NotCompleted):void");
    }

    public final boolean t() {
        return j.get(this) instanceof NotCompleted;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(DebugStringsKt.b(this.g));
        sb.append("){");
        Object obj = j.get(this);
        sb.append(obj instanceof NotCompleted ? "Active" : obj instanceof CancelledContinuation ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(DebugStringsKt.a(this));
        return sb.toString();
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void u(Object obj) throws DispatchException {
        l(this.f);
    }

    public final boolean v() {
        return !(j.get(this) instanceof NotCompleted);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final Symbol w(Object obj, Function3 function3) {
        return F(obj, function3);
    }

    public final boolean x() {
        if (this.f != 2) {
            return false;
        }
        Continuation continuation = this.g;
        Intrinsics.f(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return DispatchedContinuation.k.get((DispatchedContinuation) continuation) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
