package com.apollographql.apollo.network.ws;

import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$create$connectionPayload$1", f = "GraphQLWsProtocol.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GraphQLWsProtocol$Factory$create$connectionPayload$1 extends SuspendLambda implements Function1<Continuation<? super Map<String, ? extends Object>>, Object> {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GraphQLWsProtocol$Factory$create$connectionPayload$1(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((GraphQLWsProtocol$Factory$create$connectionPayload$1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return null;
    }
}
