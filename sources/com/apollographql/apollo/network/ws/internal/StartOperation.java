package com.apollographql.apollo.network.ws.internal;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operation.Data;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/network/ws/internal/StartOperation;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/network/ws/internal/Command;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StartOperation<D extends Operation.Data> implements Command {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloRequest f13648a;

    public StartOperation(ApolloRequest apolloRequest) {
        this.f13648a = apolloRequest;
    }

    /* renamed from: a, reason: from getter */
    public final ApolloRequest getF13648a() {
        return this.f13648a;
    }
}
