package com.apollographql.apollo.exception;

import YU.a;
import com.apollographql.apollo.api.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/exception/RouterError;", "Lcom/apollographql/apollo/exception/ApolloException;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RouterError extends ApolloException {
    public final Object d;

    public RouterError(List list) {
        StringBuilder sb = new StringBuilder("Router error(s) (first: '");
        Error error = (Error) CollectionsKt.F(list);
        super(a.o(sb, error != null ? error.f13514a : null, "')"), null);
        this.d = list;
    }
}
