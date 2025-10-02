package com.apollographql.apollo.network.ws;

import androidx.camera.core.impl.b;
import com.apollographql.apollo.exception.ApolloNetworkException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$2", f = "SubscriptionWsProtocol.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubscriptionWsProtocol$connectionInit$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SubscriptionWsProtocol q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionWsProtocol$connectionInit$2(SubscriptionWsProtocol subscriptionWsProtocol, Continuation continuation) {
        super(2, continuation);
        this.q = subscriptionWsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubscriptionWsProtocol$connectionInit$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubscriptionWsProtocol$connectionInit$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            this.p = 1;
            obj = this.q.d(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Map map = (Map) obj;
        Object obj2 = map.get("type");
        boolean zC = Intrinsics.c(obj2, "connection_ack");
        Unit unit = Unit.f24250a;
        if (zC) {
            return unit;
        }
        if (Intrinsics.c(obj2, "connection_error")) {
            throw new ApolloNetworkException("Connection error:\n" + map, null);
        }
        System.out.println((Object) b.m(obj2, "unknown message while waiting for connection_ack: '"));
        return unit;
    }
}
