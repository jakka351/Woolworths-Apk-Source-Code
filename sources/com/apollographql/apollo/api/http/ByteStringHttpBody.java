package com.apollographql.apollo.api.http;

import kotlin.Metadata;
import okio.BufferedSink;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/http/ByteStringHttpBody;", "Lcom/apollographql/apollo/api/http/HttpBody;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ByteStringHttpBody implements HttpBody {
    @Override // com.apollographql.apollo.api.http.HttpBody
    public final void a(BufferedSink bufferedSink) {
        throw null;
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public final long getContentLength() {
        throw null;
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public final String getContentType() {
        throw null;
    }
}
