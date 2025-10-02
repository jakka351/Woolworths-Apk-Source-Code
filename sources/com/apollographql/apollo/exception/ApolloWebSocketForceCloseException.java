package com.apollographql.apollo.exception;

import com.apollographql.apollo.annotations.ApolloExperimental;
import kotlin.Metadata;

@ApolloExperimental
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloWebSocketForceCloseException;", "Lcom/apollographql/apollo/exception/ApolloException;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ApolloWebSocketForceCloseException extends ApolloException {
    static {
        new ApolloWebSocketForceCloseException("closeConnection() was called", null);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ApolloWebSocketForceCloseException);
    }

    public final int hashCode() {
        return 1630789127;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ApolloWebSocketForceCloseException";
    }
}
