package com.apollographql.apollo.exception;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloHttpException;", "Lcom/apollographql/apollo/exception/ApolloException;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloHttpException extends ApolloException {
    public final int d;
    public final List e;
    public final BufferedSource f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloHttpException(int i, List headers, BufferedSource bufferedSource, String message) {
        super(message, null);
        Intrinsics.h(headers, "headers");
        Intrinsics.h(message, "message");
        this.d = i;
        this.e = headers;
        this.f = bufferedSource;
    }
}
