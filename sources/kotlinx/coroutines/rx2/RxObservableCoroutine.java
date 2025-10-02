package kotlinx.coroutines.rx2;

import com.google.android.gms.ads.RequestConfiguration;
import io.reactivex.ObservableEmitter;
import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005R\u000b\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/rx2/RxObservableCoroutine;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlinx/atomicfu/AtomicInt;", "_signal", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class RxObservableCoroutine<T> extends AbstractCoroutine<Unit> implements ProducerScope<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(RxObservableCoroutine.class, "_signal$volatile");
    private volatile /* synthetic */ int _signal$volatile;
    public final ObservableEmitter g;
    public final MutexImpl h;

    public RxObservableCoroutine(CoroutineContext coroutineContext, ObservableEmitter observableEmitter) {
        super(coroutineContext, false, true);
        this.g = observableEmitter;
        this.h = MutexKt.a();
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public final SendChannel b() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void j(Function1 function1) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final Object k(Object obj) {
        if (!this.h.f()) {
            return ChannelResult.b;
        }
        IllegalStateException illegalStateExceptionQ0 = q0(obj);
        return illegalStateExceptionQ0 == null ? Unit.f24250a : new ChannelResult.Closed(illegalStateExceptionQ0);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void n0(Throwable th, boolean z) {
        if (i.compareAndSet(this, 0, -1) && this.h.f()) {
            r0(th, z);
        }
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void o0(Object obj) {
        if (i.compareAndSet(this, 0, -1) && this.h.f()) {
            r0(null, false);
        }
    }

    public final IllegalStateException q0(Object obj) {
        if (!isActive()) {
            r0(N(), O());
            return getCancellationException();
        }
        try {
            this.g.onNext(obj);
            s0();
            return null;
        } catch (Throwable th) {
            UndeliverableException undeliverableException = new UndeliverableException(th);
            boolean zD = D(undeliverableException);
            s0();
            if (zD) {
                return undeliverableException;
            }
            RxCancellableKt.a(undeliverableException, this.f);
            return getCancellationException();
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean r() {
        return !isActive();
    }

    public final void r0(Throwable th, boolean z) {
        MutexImpl mutexImpl = this.h;
        try {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
            if (atomicIntegerFieldUpdater.get(this) == -2) {
                return;
            }
            atomicIntegerFieldUpdater.set(this, -2);
            Throwable th2 = th != null ? th : null;
            CoroutineContext coroutineContext = this.f;
            ObservableEmitter observableEmitter = this.g;
            if (th2 == null) {
                try {
                    observableEmitter.onComplete();
                } catch (Exception e) {
                    RxCancellableKt.a(e, coroutineContext);
                }
            } else if ((th2 instanceof UndeliverableException) && !z) {
                RxCancellableKt.a(th, coroutineContext);
            } else if (th2 != getCancellationException() || !observableEmitter.b()) {
                try {
                    observableEmitter.onError(th);
                } catch (Exception e2) {
                    ExceptionsKt.a(th, e2);
                    RxCancellableKt.a(th, coroutineContext);
                }
            }
        } finally {
            mutexImpl.c(null);
        }
    }

    public final void s0() {
        MutexImpl mutexImpl = this.h;
        mutexImpl.c(null);
        if (isActive() || !mutexImpl.f()) {
            return;
        }
        r0(N(), O());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.channels.SendChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.rx2.RxObservableCoroutine$send$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.rx2.RxObservableCoroutine$send$1 r0 = (kotlinx.coroutines.rx2.RxObservableCoroutine$send$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            kotlinx.coroutines.rx2.RxObservableCoroutine$send$1 r0 = new kotlinx.coroutines.rx2.RxObservableCoroutine$send$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.q
            java.lang.Object r0 = r0.p
            kotlinx.coroutines.rx2.RxObservableCoroutine r0 = (kotlinx.coroutines.rx2.RxObservableCoroutine) r0
            kotlin.ResultKt.b(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            r0.p = r4
            r0.q = r5
            r0.t = r3
            kotlinx.coroutines.sync.MutexImpl r6 = r4.h
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.lang.IllegalStateException r5 = r0.q0(r5)
            if (r5 != 0) goto L51
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        L51:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxObservableCoroutine.z(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
