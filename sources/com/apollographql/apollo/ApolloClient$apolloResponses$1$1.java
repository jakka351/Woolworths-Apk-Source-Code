package com.apollographql.apollo;

import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.exception.ApolloException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "response", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.ApolloClient$apolloResponses$1$1", f = "ApolloClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApolloClient$apolloResponses$1$1 extends SuspendLambda implements Function2<ApolloResponse<Operation.Data>, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ApolloClient$apolloResponses$1$1 apolloClient$apolloResponses$1$1 = new ApolloClient$apolloResponses$1$1(2, continuation);
        apolloClient$apolloResponses$1$1.p = obj;
        return apolloClient$apolloResponses$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ApolloClient$apolloResponses$1$1 apolloClient$apolloResponses$1$1 = (ApolloClient$apolloResponses$1$1) create((ApolloResponse) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        apolloClient$apolloResponses$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ApolloException apolloException = ((ApolloResponse) this.p).e;
        if (apolloException == null) {
            return Unit.f24250a;
        }
        Intrinsics.e(apolloException);
        throw apolloException;
    }
}
