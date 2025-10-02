package au.com.woolworths.android.onesite.di;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.DefaultInterceptorChain;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/di/BaseNetworkModule$provideApolloHeadersInterceptor$1", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BaseNetworkModule$provideApolloHeadersInterceptor$1 implements ApolloInterceptor {
    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final Flow a(ApolloRequest apolloRequest, DefaultInterceptorChain defaultInterceptorChain) {
        ApolloRequest.Builder builderA = apolloRequest.a();
        Operation operation = apolloRequest.d;
        builderA.a("X-APOLLO-OPERATION-NAME", operation.name());
        builderA.a("X-APOLLO-OPERATION-ID", operation.id());
        return defaultInterceptorChain.a(builderA.b());
    }
}
