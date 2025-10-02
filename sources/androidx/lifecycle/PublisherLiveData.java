package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import com.google.android.gms.ads.RequestConfiguration;
import io.reactivex.Flowable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/PublisherLiveData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/lifecycle/LiveData;", "LiveDataSubscriber", "lifecycle-reactivestreams_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PublisherLiveData<T> extends LiveData<T> {
    public final Flowable l;
    public final java.util.concurrent.atomic.AtomicReference m = new java.util.concurrent.atomic.AtomicReference();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/PublisherLiveData$LiveDataSubscriber;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lorg/reactivestreams/Subscription;", "Lorg/reactivestreams/Subscriber;", "lifecycle-reactivestreams_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class LiveDataSubscriber extends java.util.concurrent.atomic.AtomicReference<Subscription> implements Subscriber<T> {
        public static final /* synthetic */ int e = 0;

        public LiveDataSubscriber() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription s) {
            Intrinsics.h(s, "s");
            if (compareAndSet(null, s)) {
                s.request(Long.MAX_VALUE);
            } else {
                s.cancel();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            java.util.concurrent.atomic.AtomicReference atomicReference = PublisherLiveData.this.m;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable ex) {
            Intrinsics.h(ex, "ex");
            java.util.concurrent.atomic.AtomicReference atomicReference = PublisherLiveData.this.m;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            ArchTaskExecutor.d().a(new androidx.camera.camera2.interop.d(ex, 10));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            PublisherLiveData.this.j(obj);
        }
    }

    public PublisherLiveData(Flowable flowable) {
        this.l = flowable;
    }

    @Override // androidx.lifecycle.LiveData
    public final void h() {
        LiveDataSubscriber liveDataSubscriber = new LiveDataSubscriber();
        this.m.set(liveDataSubscriber);
        this.l.e(liveDataSubscriber);
    }

    @Override // androidx.lifecycle.LiveData
    public final void i() {
        Subscription subscription;
        LiveDataSubscriber liveDataSubscriber = (LiveDataSubscriber) this.m.getAndSet(null);
        if (liveDataSubscriber == null || (subscription = liveDataSubscriber.get()) == null) {
            return;
        }
        subscription.cancel();
    }
}
