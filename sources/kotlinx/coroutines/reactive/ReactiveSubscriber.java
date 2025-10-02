package kotlinx.coroutines.reactive;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/reactive/ReactiveSubscriber;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lorg/reactivestreams/Subscriber;", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ReactiveSubscriber<T> implements Subscriber<T> {
    public final long d;
    public Subscription e;
    public final BufferedChannel f;

    public ReactiveSubscriber(int i, BufferOverflow bufferOverflow, long j) {
        this.d = j;
        this.f = kotlinx.coroutines.channels.ChannelKt.a(i == 0 ? 1 : i, 4, bufferOverflow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1 r0 = (kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1 r0 = new kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r5)
            kotlinx.coroutines.channels.ChannelResult r5 = (kotlinx.coroutines.channels.ChannelResult) r5
            java.lang.Object r5 = r5.f24699a
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.ResultKt.b(r5)
            r0.r = r3
            kotlinx.coroutines.channels.BufferedChannel r5 = r4.f
            r5.getClass()
            java.lang.Object r5 = kotlinx.coroutines.channels.BufferedChannel.O(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.Throwable r0 = kotlinx.coroutines.channels.ChannelResult.a(r5)
            if (r0 != 0) goto L50
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r0 == 0) goto L4f
            r5 = 0
        L4f:
            return r5
        L50:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.ReactiveSubscriber.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        this.e = subscription;
        if (subscription != null) {
            subscription.request(this.d);
        } else {
            Intrinsics.p("subscription");
            throw null;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.f.y(null);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        this.f.l(th, false);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        BufferedChannel bufferedChannel = this.f;
        if (bufferedChannel.k(obj) instanceof ChannelResult.Failed) {
            throw new IllegalArgumentException(("Element " + obj + " was not added to channel because it was full, " + bufferedChannel).toString());
        }
    }
}
