package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.http.HttpBody;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSink;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/apollographql/apollo/network/http/BatchingHttpInterceptor$executePendingRequests$body$1", "Lcom/apollographql/apollo/api/http/HttpBody;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BatchingHttpInterceptor$executePendingRequests$body$1 implements HttpBody {
    @Override // com.apollographql.apollo.api.http.HttpBody
    public final void a(BufferedSink bufferedSink) {
        new BufferedSinkJsonWriter(bufferedSink);
        throw null;
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public final long getContentLength() {
        return -1L;
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public final String getContentType() {
        return "application/json";
    }
}
