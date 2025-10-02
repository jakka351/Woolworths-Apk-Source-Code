package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public final Choreographer d;
    public final AndroidUiDispatcher e;

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.d = choreographer;
        this.e = androidUiDispatcher;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final Object e(final Function1 function1, Continuation continuation) {
        final AndroidUiDispatcher androidUiDispatcher = this.e;
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback(this, function1) { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            public final /* synthetic */ Function1 e;

            {
                this.e = function1;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object objA;
                try {
                    objA = this.e.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    objA = ResultKt.a(th);
                }
                this.d.resumeWith(objA);
            }
        };
        if (Intrinsics.c(androidUiDispatcher.f, this.d)) {
            synchronized (androidUiDispatcher.h) {
                androidUiDispatcher.j.add(frameCallback);
                if (!androidUiDispatcher.m) {
                    androidUiDispatcher.m = true;
                    androidUiDispatcher.f.postFrameCallback(androidUiDispatcher.n);
                }
            }
            cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    AndroidUiDispatcher androidUiDispatcher2 = androidUiDispatcher;
                    Choreographer.FrameCallback frameCallback2 = frameCallback;
                    synchronized (androidUiDispatcher2.h) {
                        androidUiDispatcher2.j.remove(frameCallback2);
                    }
                    return Unit.f24250a;
                }
            });
        } else {
            this.d.postFrameCallback(frameCallback);
            cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    this.h.d.removeFrameCallback(frameCallback);
                    return Unit.f24250a;
                }
            });
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
