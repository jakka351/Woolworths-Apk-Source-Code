package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "it", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$2", f = "RetryOnErrorInterceptor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DefaultRetryOnErrorInterceptorImpl$intercept$2 extends SuspendLambda implements Function2<ApolloResponse<Operation.Data>, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ Ref.IntRef r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultRetryOnErrorInterceptorImpl$intercept$2(boolean z, Ref.IntRef intRef, Continuation continuation) {
        super(2, continuation);
        this.q = z;
        this.r = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DefaultRetryOnErrorInterceptorImpl$intercept$2 defaultRetryOnErrorInterceptorImpl$intercept$2 = new DefaultRetryOnErrorInterceptorImpl$intercept$2(this.q, this.r, continuation);
        defaultRetryOnErrorInterceptorImpl$intercept$2.p = obj;
        return defaultRetryOnErrorInterceptorImpl$intercept$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws RetryException {
        DefaultRetryOnErrorInterceptorImpl$intercept$2 defaultRetryOnErrorInterceptorImpl$intercept$2 = (DefaultRetryOnErrorInterceptorImpl$intercept$2) create((ApolloResponse) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        defaultRetryOnErrorInterceptorImpl$intercept$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws RetryException {
        ApolloException apolloException;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ApolloResponse apolloResponse = (ApolloResponse) this.p;
        if (this.q && (apolloException = apolloResponse.e) != null) {
            Intrinsics.e(apolloException);
            int i = RetryOnErrorInterceptorKt.f13622a;
            if (apolloException instanceof ApolloNetworkException) {
                throw RetryException.d;
            }
        }
        this.r.d = 0;
        return Unit.f24250a;
    }
}
