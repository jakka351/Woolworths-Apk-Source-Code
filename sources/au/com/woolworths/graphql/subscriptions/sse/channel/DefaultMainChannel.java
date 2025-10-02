package au.com.woolworths.graphql.subscriptions.sse.channel;

import androidx.compose.runtime.snapshots.a;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import me.oriient.internal.infra.rest.RequestBuilder;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.internal.connection.RealCall;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSources;
import okhttp3.sse.internal.RealEventSource;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/channel/DefaultMainChannel;", "Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel;", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultMainChannel implements ChannelFactory.MainChannel {

    /* renamed from: a, reason: collision with root package name */
    public final String f9039a;
    public final a b;
    public EventSource c;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel$SseEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.channel.DefaultMainChannel$getData$1", f = "DefaultMainChannel.kt", l = {30}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.graphql.subscriptions.sse.channel.DefaultMainChannel$getData$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super ChannelFactory.MainChannel.SseEvent>, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = DefaultMainChannel.this.new AnonymousClass1(continuation);
            anonymousClass1.q = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                ProducerScope producerScope = (ProducerScope) this.q;
                DefaultMainChannel$createListener$1 defaultMainChannel$createListener$1 = new DefaultMainChannel$createListener$1(producerScope);
                Request.Builder builder = new Request.Builder();
                DefaultMainChannel defaultMainChannel = DefaultMainChannel.this;
                builder.h(defaultMainChannel.f9039a);
                Request request = new Request(builder);
                Call.Factory callFactory = (Call.Factory) defaultMainChannel.b.e;
                int i2 = EventSources.f26777a;
                if (request.c.b(RequestBuilder.ACCEPT) == null) {
                    Request.Builder builderB = request.b();
                    builderB.a(RequestBuilder.ACCEPT, "text/event-stream");
                    request = new Request(builderB);
                }
                RealEventSource realEventSource = new RealEventSource(request, defaultMainChannel$createListener$1);
                Intrinsics.h(callFactory, "callFactory");
                RealCall realCallA = callFactory.a(realEventSource.d);
                realCallA.U1(realEventSource);
                realEventSource.f = realCallA;
                defaultMainChannel.c = realEventSource;
                f fVar = new f(29, realEventSource, defaultMainChannel);
                this.p = 1;
                if (ProduceKt.a(producerScope, fVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    public DefaultMainChannel(String str, a aVar) {
        this.f9039a = str;
        this.b = aVar;
    }

    @Override // au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory.MainChannel
    public final void close() {
        EventSource eventSource = this.c;
        if (eventSource != null) {
            eventSource.cancel();
        }
        this.c = null;
    }

    @Override // au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory.MainChannel
    public final Flow getData() {
        return FlowKt.d(new AnonymousClass1(null));
    }
}
