package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/infra/rest/PutRequestBuilder;", "Lme/oriient/internal/infra/rest/PostRequestBuilder;", "()V", "build", "Lokhttp3/Request;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PutRequestBuilder extends PostRequestBuilder {
    public PutRequestBuilder() {
        super(Request.PUT);
    }

    @Override // me.oriient.internal.infra.rest.PostRequestBuilder, me.oriient.internal.infra.rest.RequestBuilder
    @NotNull
    public okhttp3.Request build() {
        Request.Builder builder = new Request.Builder();
        builder.h(getUrl());
        builder.c(RequestBuilder.CONTENT_TYPE, getContentType().getValue());
        HttpEncoding contentEncoding = getContentEncoding();
        if (contentEncoding != null) {
            builder.c(RequestBuilder.CONTENT_ENCODING, contentEncoding.getValue());
        }
        String accept = getAccept();
        if (accept != null) {
            builder.a(RequestBuilder.ACCEPT, accept);
        }
        HttpRequestBody body = getBody();
        if (body != null) {
            RequestBody body2 = body.toRequestBody(getContentType());
            Intrinsics.h(body2, "body");
            builder.e(com.salesforce.marketingcloud.sfmcsdk.components.http.Request.PUT, body2);
        } else {
            RequestBuilder.Companion.getClass();
            RequestBody body3 = RequestBuilder.EMPTY_REQUEST;
            Intrinsics.h(body3, "body");
            builder.e(com.salesforce.marketingcloud.sfmcsdk.components.http.Request.PUT, body3);
        }
        for (Map.Entry<String, String> entry : getHeaders().entrySet()) {
            builder.c(entry.getKey(), entry.getValue());
        }
        return new okhttp3.Request(builder);
    }
}
