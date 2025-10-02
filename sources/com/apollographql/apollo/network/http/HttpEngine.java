package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.http.HttpRequest;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpEngine;", "Ljava/io/Closeable;", "Lokio/Closeable;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface HttpEngine extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
    }

    Object y2(HttpRequest httpRequest, ContinuationImpl continuationImpl);
}
