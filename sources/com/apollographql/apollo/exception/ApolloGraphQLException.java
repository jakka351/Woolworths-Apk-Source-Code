package com.apollographql.apollo.exception;

import androidx.camera.core.impl.b;
import com.apollographql.apollo.api.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloGraphQLException;", "Lcom/apollographql/apollo/exception/ApolloException;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApolloGraphQLException extends ApolloException {
    public final List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloGraphQLException(Error error) {
        super(b.r(new StringBuilder("GraphQL error: '"), error.f13514a, '\''), null);
        Intrinsics.h(error, "error");
        this.d = CollectionsKt.Q(error);
    }
}
