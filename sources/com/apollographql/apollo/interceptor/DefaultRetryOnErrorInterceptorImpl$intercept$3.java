package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;", "cause", "", "<unused var>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$3", f = "RetryOnErrorInterceptor.kt", l = {79, 81}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DefaultRetryOnErrorInterceptorImpl$intercept$3 extends SuspendLambda implements Function4<FlowCollector<? super ApolloResponse<Operation.Data>>, Throwable, Long, Continuation<? super Boolean>, Object> {
    public int p;
    public /* synthetic */ Throwable q;
    public final /* synthetic */ Ref.IntRef r;
    public final /* synthetic */ DefaultRetryOnErrorInterceptorImpl s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultRetryOnErrorInterceptorImpl$intercept$3(Ref.IntRef intRef, DefaultRetryOnErrorInterceptorImpl defaultRetryOnErrorInterceptorImpl, Continuation continuation) {
        super(4, continuation);
        this.r = intRef;
        this.s = defaultRetryOnErrorInterceptorImpl;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        DefaultRetryOnErrorInterceptorImpl$intercept$3 defaultRetryOnErrorInterceptorImpl$intercept$3 = new DefaultRetryOnErrorInterceptorImpl$intercept$3(this.r, this.s, (Continuation) obj4);
        defaultRetryOnErrorInterceptorImpl$intercept$3.q = (Throwable) obj2;
        return defaultRetryOnErrorInterceptorImpl$intercept$3.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.d;
        int i = this.p;
        boolean z = true;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.q instanceof RetryException) {
                Ref.IntRef intRef = this.r;
                int i2 = intRef.d + 1;
                intRef.d = i2;
                int i3 = Duration.g;
                long jF = DurationKt.f(Math.pow(2.0d, i2), DurationUnit.h);
                this.p = 2;
                Object objB = DelayKt.b(DelayKt.d(jF), this);
                if (objB != obj2) {
                    objB = Unit.f24250a;
                }
                if (objB == obj2) {
                    return obj2;
                }
            } else {
                z = false;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Boolean.valueOf(z);
    }
}
