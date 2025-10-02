package kotlinx.coroutines.reactive;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferedChannel;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u0013\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004R\u000b\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/reactive/SubscriptionChannel;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/channels/BufferedChannel;", "Lorg/reactivestreams/Subscriber;", "Lkotlinx/atomicfu/AtomicRef;", "Lorg/reactivestreams/Subscription;", "_subscription", "Lkotlinx/atomicfu/AtomicInt;", "_requested", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class SubscriptionChannel<T> extends BufferedChannel<T> implements Subscriber<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(SubscriptionChannel.class, Object.class, "_subscription$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(SubscriptionChannel.class, "_requested$volatile");
    private volatile /* synthetic */ int _requested$volatile;
    private volatile /* synthetic */ Object _subscription$volatile;
    public final int n;

    public SubscriptionChannel() {
        super(Integer.MAX_VALUE);
        this.n = 1;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final void K() {
        Subscription subscription = (Subscription) o.getAndSet(this, null);
        if (subscription != null) {
            subscription.cancel();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final void M() {
        p.incrementAndGet(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r2.request(r4 - r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.reactive.SubscriptionChannel.p
            int r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.reactive.SubscriptionChannel.o
            java.lang.Object r2 = r2.get(r5)
            org.reactivestreams.Subscription r2 = (org.reactivestreams.Subscription) r2
            int r3 = r1 + (-1)
            if (r2 == 0) goto L25
            if (r3 >= 0) goto L25
            int r4 = r5.n
            if (r1 == r4) goto L1f
            boolean r0 = r0.compareAndSet(r5, r1, r4)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            int r4 = r4 - r3
            long r0 = (long) r4
            r2.request(r0)
            return
        L25:
            boolean r0 = r0.compareAndSet(r5, r1, r3)
            if (r0 == 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.SubscriptionChannel.N():void");
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        o.set(this, subscription);
        while (!r()) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = p;
            int i = atomicIntegerFieldUpdater.get(this);
            int i2 = this.n;
            if (i >= i2) {
                return;
            }
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i2)) {
                subscription.request(i2 - i);
                return;
            }
        }
        subscription.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        l(null, false);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        l(th, false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        p.decrementAndGet(this);
        k(obj);
    }
}
