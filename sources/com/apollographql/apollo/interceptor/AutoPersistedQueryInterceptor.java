package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.http.HttpMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/interceptor/AutoPersistedQueryInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AutoPersistedQueryInterceptor implements ApolloInterceptor {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/interceptor/AutoPersistedQueryInterceptor$Companion;", "", "", "PROTOCOL_NEGOTIATION_ERROR_QUERY_NOT_FOUND", "Ljava/lang/String;", "PROTOCOL_NEGOTIATION_ERROR_NOT_SUPPORTED", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final Flow a(ApolloRequest apolloRequest, DefaultInterceptorChain defaultInterceptorChain) {
        Boolean bool = apolloRequest.k;
        if (!(bool != null ? bool.booleanValue() : true)) {
            return defaultInterceptorChain.a(apolloRequest);
        }
        boolean z = apolloRequest.d instanceof Mutation;
        ApolloRequest.Builder builderA = apolloRequest.a();
        builderA.g = z ? HttpMethod.e : null;
        builderA.k = Boolean.FALSE;
        builderA.j = Boolean.TRUE;
        return FlowKt.B(new AutoPersistedQueryInterceptor$intercept$1(defaultInterceptorChain, builderA.b(), this, z, null));
    }
}
