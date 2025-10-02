package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/interceptor/DefaultRetryOnErrorInterceptorImpl;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultRetryOnErrorInterceptorImpl implements ApolloInterceptor {
    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final Flow a(ApolloRequest apolloRequest, DefaultInterceptorChain defaultInterceptorChain) {
        Boolean bool = apolloRequest.m;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = apolloRequest.l;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        if (!zBooleanValue && !zBooleanValue2) {
            return defaultInterceptorChain.a(apolloRequest);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new DefaultRetryOnErrorInterceptorImpl$intercept$2(zBooleanValue2, intRef, null), FlowKt.B(new DefaultRetryOnErrorInterceptorImpl$intercept$1(zBooleanValue, this, apolloRequest, defaultInterceptorChain.a(apolloRequest), null))), new DefaultRetryOnErrorInterceptorImpl$intercept$3(intRef, this, null));
    }
}
