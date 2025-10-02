package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "FrameAwaiter", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public final Function0 d;
    public Throwable f;
    public final Object e = new Object();
    public ArrayList g = new ArrayList();
    public ArrayList h = new ArrayList();
    public final AtomicInt i = new AtomicInt(0);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "R", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class FrameAwaiter<R> {

        /* renamed from: a, reason: collision with root package name */
        public final Function1 f1622a;
        public final CancellableContinuationImpl b;

        public FrameAwaiter(Function1 function1, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f1622a = function1;
            this.b = cancellableContinuationImpl;
        }
    }

    public BroadcastFrameClock(Function0 function0) {
        this.d = function0;
    }

    public final void b(long j) {
        Object objA;
        synchronized (this.e) {
            try {
                ArrayList arrayList = this.g;
                this.g = this.h;
                this.h = arrayList;
                this.i.set(0);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    FrameAwaiter frameAwaiter = (FrameAwaiter) arrayList.get(i);
                    CancellableContinuationImpl cancellableContinuationImpl = frameAwaiter.b;
                    try {
                        objA = frameAwaiter.f1622a.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        objA = ResultKt.a(th);
                    }
                    cancellableContinuationImpl.resumeWith(objA);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final Object e(Function1 function1, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        final FrameAwaiter frameAwaiter = new FrameAwaiter(function1, cancellableContinuationImpl);
        synchronized (this.e) {
            Throwable th = this.f;
            if (th != null) {
                cancellableContinuationImpl.resumeWith(ResultKt.a(th));
            } else {
                boolean zIsEmpty = this.g.isEmpty();
                this.g.add(frameAwaiter);
                if (zIsEmpty) {
                    this.i.set(1);
                }
                cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        BroadcastFrameClock broadcastFrameClock = this.h;
                        Object obj2 = broadcastFrameClock.e;
                        BroadcastFrameClock.FrameAwaiter frameAwaiter2 = frameAwaiter;
                        synchronized (obj2) {
                            broadcastFrameClock.g.remove(frameAwaiter2);
                            if (broadcastFrameClock.g.isEmpty()) {
                                broadcastFrameClock.i.set(0);
                            }
                        }
                        return Unit.f24250a;
                    }
                });
                if (zIsEmpty) {
                    try {
                        ((Recomposer$broadcastFrameClock$1) this.d).invoke();
                    } catch (Throwable th2) {
                        synchronized (this.e) {
                            try {
                                if (this.f == null) {
                                    this.f = th2;
                                    ArrayList arrayList = this.g;
                                    int size = arrayList.size();
                                    for (int i = 0; i < size; i++) {
                                        ((FrameAwaiter) arrayList.get(i)).b.resumeWith(ResultKt.a(th2));
                                    }
                                    this.g.clear();
                                    this.i.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.a(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.c(this, coroutineContext);
    }
}
