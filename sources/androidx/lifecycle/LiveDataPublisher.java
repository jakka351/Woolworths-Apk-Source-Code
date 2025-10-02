package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/LiveDataPublisher;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lorg/reactivestreams/Publisher;", "LiveDataSubscription", "lifecycle-reactivestreams_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LiveDataPublisher<T> implements Publisher<T> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u00022\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/LiveDataPublisher$LiveDataSubscription;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lorg/reactivestreams/Subscription;", "Landroidx/lifecycle/Observer;", "lifecycle-reactivestreams_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LiveDataSubscription<T> implements Subscription, Observer<T> {
        public final Subscriber d;
        public volatile boolean e;
        public boolean f;
        public long g;
        public Object h;

        public LiveDataSubscription(Subscriber subscriber) {
            Intrinsics.h(subscriber, "subscriber");
            Intrinsics.h(null, "lifecycle");
            Intrinsics.h(null, "liveData");
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.e) {
                return;
            }
            this.e = true;
            ArchTaskExecutor.d().a(new androidx.camera.camera2.interop.d(this, 9));
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            if (this.e) {
                return;
            }
            if (this.g <= 0) {
                this.h = obj;
                return;
            }
            this.h = null;
            this.d.onNext(obj);
            long j = this.g;
            if (j != Long.MAX_VALUE) {
                this.g = j - 1;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (this.e) {
                return;
            }
            ArchTaskExecutor.d().a(new c(this, j, 0));
        }
    }

    @Override // org.reactivestreams.Publisher
    public final void e(Subscriber subscriber) {
        Intrinsics.h(subscriber, "subscriber");
        subscriber.m(new LiveDataSubscription(subscriber));
    }
}
