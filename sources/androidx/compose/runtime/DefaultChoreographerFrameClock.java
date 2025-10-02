package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/DefaultChoreographerFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DefaultChoreographerFrameClock implements MonotonicFrameClock {
    public static final DefaultChoreographerFrameClock d = new DefaultChoreographerFrameClock();
    public static final Choreographer e;

    static {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        e = (Choreographer) BuildersKt.d(MainDispatcherLoader.f24726a.T(), new DefaultChoreographerFrameClock$choreographer$1(2, null));
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final Object e(final Function1 function1, Continuation continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object objA;
                DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.d;
                try {
                    objA = function1.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    objA = ResultKt.a(th);
                }
                cancellableContinuationImpl.resumeWith(objA);
            }
        };
        e.postFrameCallback(frameCallback);
        cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DefaultChoreographerFrameClock.e.removeFrameCallback(frameCallback);
                return Unit.f24250a;
            }
        });
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
