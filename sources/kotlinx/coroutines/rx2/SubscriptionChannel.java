package kotlinx.coroutines.rx2;

import com.google.android.gms.ads.RequestConfiguration;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferedChannel;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004R\u0013\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/rx2/SubscriptionChannel;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/channels/BufferedChannel;", "Lio/reactivex/Observer;", "Lio/reactivex/MaybeObserver;", "Lkotlinx/atomicfu/AtomicRef;", "Lio/reactivex/disposables/Disposable;", "_subscription", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SubscriptionChannel<T> extends BufferedChannel<T> implements Observer<T>, MaybeObserver<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(SubscriptionChannel.class, Object.class, "_subscription$volatile");
    private volatile /* synthetic */ Object _subscription$volatile;

    public SubscriptionChannel() {
        super(Integer.MAX_VALUE);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final void K() {
        Disposable disposable = (Disposable) n.getAndSet(this, null);
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        n.set(this, disposable);
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        l(null, false);
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        l(th, false);
    }

    @Override // io.reactivex.MaybeObserver
    public final void onSuccess(Object obj) {
        k(obj);
        l(null, false);
    }
}
