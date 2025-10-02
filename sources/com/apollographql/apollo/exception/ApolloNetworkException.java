package com.apollographql.apollo.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloNetworkException;", "Lcom/apollographql/apollo/exception/ApolloException;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloNetworkException extends ApolloException {
    public final Object d;

    public ApolloNetworkException(String str, Object obj) {
        super(str, obj instanceof Throwable ? (Throwable) obj : null);
        this.d = obj;
    }
}
