package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.annotations.ApolloExperimental;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Deprecated
@ApolloExperimental
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/websocket/SubscriptionWsProtocol;", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SubscriptionWsProtocol implements WsProtocol {

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.websocket.SubscriptionWsProtocol$1", f = "SubscriptionWsProtocol.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.apollographql.apollo.network.websocket.SubscriptionWsProtocol$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
            return null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            return null;
        }
    }
}
