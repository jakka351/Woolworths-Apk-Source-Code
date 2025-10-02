package kotlinx.coroutines.reactive;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/reactive/FlowAsPublisher;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lorg/reactivestreams/Publisher;", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FlowAsPublisher<T> implements Publisher<T> {
    @Override // org.reactivestreams.Publisher
    public final void e(Subscriber subscriber) {
        subscriber.getClass();
        subscriber.m(new FlowSubscription(subscriber));
    }
}
