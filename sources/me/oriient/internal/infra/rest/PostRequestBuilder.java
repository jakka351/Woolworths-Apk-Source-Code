package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\f\u001a\u00020\rH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/infra/rest/PostRequestBuilder;", "Lme/oriient/internal/infra/rest/RequestBuilder;", "methodForLogs", "", "(Ljava/lang/String;)V", "body", "Lme/oriient/internal/infra/rest/HttpRequestBody;", "getBody$internal_publishRelease", "()Lme/oriient/internal/infra/rest/HttpRequestBody;", "setBody$internal_publishRelease", "(Lme/oriient/internal/infra/rest/HttpRequestBody;)V", "", "build", "Lokhttp3/Request;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public class PostRequestBuilder extends RequestBuilder {

    @Nullable
    private HttpRequestBody body;

    public PostRequestBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void body(@NotNull HttpRequestBody body) {
        Intrinsics.h(body, "body");
        this.body = body;
    }

    @Override // me.oriient.internal.infra.rest.RequestBuilder
    @NotNull
    public Request build() {
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
        HttpRequestBody httpRequestBody = this.body;
        if (httpRequestBody != null) {
            builder.f(httpRequestBody.toRequestBody(getContentType()));
        } else {
            RequestBuilder.Companion.getClass();
            builder.f(RequestBuilder.EMPTY_REQUEST);
        }
        for (Map.Entry<String, String> entry : getHeaders().entrySet()) {
            builder.c(entry.getKey(), entry.getValue());
        }
        return new Request(builder);
    }

    @Nullable
    /* renamed from: getBody$internal_publishRelease, reason: from getter */
    public final HttpRequestBody getBody() {
        return this.body;
    }

    public final void setBody$internal_publishRelease(@Nullable HttpRequestBody httpRequestBody) {
        this.body = httpRequestBody;
    }

    public /* synthetic */ PostRequestBuilder(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "POST" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostRequestBuilder(@NotNull String methodForLogs) {
        super(methodForLogs);
        Intrinsics.h(methodForLogs, "methodForLogs");
        setAccept(HttpContent.CONTENT_APPLICATION_JSON.getValue());
    }
}
