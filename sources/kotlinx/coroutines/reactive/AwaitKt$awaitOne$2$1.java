package kotlinx.coroutines.reactive;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/reactive/AwaitKt$awaitOne$2$1", "Lorg/reactivestreams/Subscriber;", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AwaitKt$awaitOne$2$1 implements Subscriber<Object> {
    public Subscription d;
    public Object e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ CancellableContinuationImpl h;
    public final /* synthetic */ Mode i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Mode mode = Mode.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Mode mode2 = Mode.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Mode mode3 = Mode.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Mode mode4 = Mode.e;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public AwaitKt$awaitOne$2$1(CancellableContinuationImpl cancellableContinuationImpl, Mode mode) {
        this.h = cancellableContinuationImpl;
        this.i = mode;
    }

    public final synchronized void a(Function0 function0) {
        function0.invoke();
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(final Subscription subscription) {
        if (this.d != null) {
            a(new Function0<Unit>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    subscription.cancel();
                    return Unit.f24250a;
                }
            });
            return;
        }
        this.d = subscription;
        this.h.r(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                final Subscription subscription2 = subscription;
                this.d.a(new Function0<Unit>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$2.1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        subscription2.cancel();
                        return Unit.f24250a;
                    }
                });
                return Unit.f24250a;
            }
        });
        final Mode mode = this.i;
        a(new Function0<Unit>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Mode mode2 = Mode.e;
                Mode mode3 = mode;
                subscription.request((mode3 == mode2 || mode3 == Mode.f) ? 1L : Long.MAX_VALUE);
                return Unit.f24250a;
            }
        });
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        boolean z = this.g;
        CancellableContinuationImpl cancellableContinuationImpl = this.h;
        if (z) {
            CoroutineExceptionHandlerKt.a(new IllegalStateException("'onComplete' was called after the publisher already signalled being in a terminal state"), cancellableContinuationImpl.h);
            return;
        }
        this.g = true;
        boolean z2 = this.f;
        Mode mode = this.i;
        if (z2) {
            if (mode == Mode.f || mode == Mode.e || !cancellableContinuationImpl.t()) {
                return;
            }
            cancellableContinuationImpl.resumeWith(this.e);
            return;
        }
        if (mode == Mode.f || mode == Mode.h) {
            cancellableContinuationImpl.resumeWith(null);
        } else if (cancellableContinuationImpl.t()) {
            cancellableContinuationImpl.resumeWith(ResultKt.a(new NoSuchElementException("No value received via onNext for " + mode)));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        boolean z = this.g;
        CancellableContinuationImpl cancellableContinuationImpl = this.h;
        if (z) {
            CoroutineExceptionHandlerKt.a(new IllegalStateException("'onError' was called after the publisher already signalled being in a terminal state"), cancellableContinuationImpl.h);
        } else {
            this.g = true;
            cancellableContinuationImpl.resumeWith(ResultKt.a(th));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        final Subscription subscription = this.d;
        CancellableContinuationImpl cancellableContinuationImpl = this.h;
        CoroutineContext coroutineContext = cancellableContinuationImpl.h;
        if (subscription == null) {
            CoroutineExceptionHandlerKt.a(new IllegalStateException("'onNext' was called before 'onSubscribe'"), coroutineContext);
            return;
        }
        if (this.g) {
            CoroutineExceptionHandlerKt.a(new IllegalStateException("'onNext' was called after the publisher already signalled being in a terminal state"), coroutineContext);
            return;
        }
        Mode mode = this.i;
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (!this.f) {
                this.f = true;
                a(new Function0<Unit>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onNext$1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        subscription.cancel();
                        return Unit.f24250a;
                    }
                });
                cancellableContinuationImpl.resumeWith(obj);
                return;
            } else {
                CoroutineExceptionHandlerKt.a(new IllegalStateException("Only a single value was requested in '" + mode + "', but the publisher provided more"), coroutineContext);
                return;
            }
        }
        if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if ((mode != Mode.g && mode != Mode.h) || !this.f) {
            this.e = obj;
            this.f = true;
            return;
        }
        a(new Function0<Unit>() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onNext$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                subscription.cancel();
                return Unit.f24250a;
            }
        });
        if (cancellableContinuationImpl.t()) {
            cancellableContinuationImpl.resumeWith(ResultKt.a(new IllegalArgumentException("More than one onNext value for " + mode)));
        }
    }
}
