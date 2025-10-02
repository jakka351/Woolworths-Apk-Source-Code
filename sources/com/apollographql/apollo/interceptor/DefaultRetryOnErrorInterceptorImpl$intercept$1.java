package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$1", f = "RetryOnErrorInterceptor.kt", l = {65, 67}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DefaultRetryOnErrorInterceptorImpl$intercept$1 extends SuspendLambda implements Function2<FlowCollector<? super ApolloResponse<Operation.Data>>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ DefaultRetryOnErrorInterceptorImpl s;
    public final /* synthetic */ ApolloRequest t;
    public final /* synthetic */ Flow u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultRetryOnErrorInterceptorImpl$intercept$1(boolean z, DefaultRetryOnErrorInterceptorImpl defaultRetryOnErrorInterceptorImpl, ApolloRequest apolloRequest, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.r = z;
        this.s = defaultRetryOnErrorInterceptorImpl;
        this.t = apolloRequest;
        this.u = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DefaultRetryOnErrorInterceptorImpl$intercept$1 defaultRetryOnErrorInterceptorImpl$intercept$1 = new DefaultRetryOnErrorInterceptorImpl$intercept$1(this.r, this.s, this.t, this.u, continuation);
        defaultRetryOnErrorInterceptorImpl$intercept$1.q = obj;
        return defaultRetryOnErrorInterceptorImpl$intercept$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultRetryOnErrorInterceptorImpl$intercept$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.q;
            this.p = 2;
            if (FlowKt.u(flowCollector, this.u, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
