package kotlinx.coroutines.reactive;

import androidx.camera.core.impl.b;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import org.reactivestreams.Subscription;

@InternalCoroutinesApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u000b\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/reactive/PublisherCoroutine;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lorg/reactivestreams/Subscription;", "", "cancelled", "Z", "Lkotlinx/atomicfu/AtomicLong;", "_nRequested", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PublisherCoroutine<T> extends AbstractCoroutine<Unit> implements ProducerScope<T>, Subscription {
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(PublisherCoroutine.class, "_nRequested$volatile");
    private volatile /* synthetic */ long _nRequested$volatile;
    private volatile boolean cancelled;

    @Override // kotlinx.coroutines.channels.ProducerScope
    public final SendChannel b() {
        return this;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel() {
        this.cancelled = true;
        cancel((CancellationException) null);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void j(Function1 function1) {
        throw new UnsupportedOperationException("PublisherCoroutine doesn't support invokeOnClose");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final Object k(Object obj) {
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void n0(Throwable th, boolean z) {
        r0(th, z);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void o0(Object obj) {
        r0(null, false);
    }

    public final Throwable q0(Object obj) {
        obj.getClass();
        if (!isActive()) {
            throw null;
        }
        try {
            throw null;
        } catch (Throwable th) {
            this.cancelled = true;
            D(th);
            throw null;
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean r() {
        return !isActive();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r0(java.lang.Throwable r8, boolean r9) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.reactive.PublisherCoroutine.g
            long r2 = r0.get(r7)
            r4 = -2
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto Ld
            return
        Ld:
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L56
            r4 = -1
            r1 = r7
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            if (r6 != 0) goto L54
            r2 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.reactive.PublisherCoroutine.g     // Catch: java.lang.Throwable -> L53
            long r3 = r0.get(r7)     // Catch: java.lang.Throwable -> L53
            r5 = -2
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L52
            r0.set(r7, r5)     // Catch: java.lang.Throwable -> L53
            boolean r0 = r1.cancelled     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L39
            if (r8 == 0) goto L38
            if (r9 == 0) goto L37
            goto L38
        L37:
            throw r2     // Catch: java.lang.Throwable -> L53
        L38:
            throw r2
        L39:
            if (r8 != 0) goto L44
            throw r2     // Catch: java.lang.Throwable -> L3c
        L3c:
            r0 = move-exception
            r8 = r0
            kotlin.coroutines.CoroutineContext r9 = r1.f     // Catch: java.lang.Throwable -> L53
            kotlinx.coroutines.CoroutineExceptionHandlerKt.a(r8, r9)     // Catch: java.lang.Throwable -> L53
            goto L51
        L44:
            throw r2     // Catch: java.lang.Throwable -> L45
        L45:
            r0 = move-exception
            r9 = r0
            if (r9 == r8) goto L4c
            kotlin.ExceptionsKt.a(r8, r9)     // Catch: java.lang.Throwable -> L53
        L4c:
            kotlin.coroutines.CoroutineContext r9 = r1.f     // Catch: java.lang.Throwable -> L53
            kotlinx.coroutines.CoroutineExceptionHandlerKt.a(r8, r9)     // Catch: java.lang.Throwable -> L53
        L51:
            throw r2
        L52:
            throw r2
        L53:
            throw r2
        L54:
            r8 = 0
            throw r8
        L56:
            r1 = r7
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Check failed."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.PublisherCoroutine.r0(java.lang.Throwable, boolean):void");
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (j <= 0) {
            D(new IllegalArgumentException(b.k(j, "non-positive subscription request ")));
            return;
        }
        do {
            atomicLongFieldUpdater = g;
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 < 0) {
                return;
            }
            j3 = j2 + j;
            if (j3 < 0 || j == Long.MAX_VALUE) {
                j3 = Long.MAX_VALUE;
            }
            if (j2 == j3) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j3));
        if (j2 == 0) {
            throw null;
        }
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
            boolean r0 = r6 instanceof kotlinx.coroutines.reactive.PublisherCoroutine$send$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.reactive.PublisherCoroutine$send$1 r0 = (kotlinx.coroutines.reactive.PublisherCoroutine$send$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.PublisherCoroutine$send$1 r0 = new kotlinx.coroutines.reactive.PublisherCoroutine$send$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r0.t
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 != r3) goto L2f
            java.lang.Object r5 = r0.q
            kotlinx.coroutines.reactive.PublisherCoroutine r0 = r0.p
            kotlin.ResultKt.b(r6)
            r0.q0(r5)
            throw r2
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.b(r6)
            r0.p = r4
            r0.q = r5
            r0.t = r3
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.PublisherCoroutine.z(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
