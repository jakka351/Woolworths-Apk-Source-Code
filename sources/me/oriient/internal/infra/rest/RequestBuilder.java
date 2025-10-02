package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u000e\b\u0017\u0018\u0000 62\u00020\u0001:\u00017B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d\"\u0004\b\u001f\u0010\u0005R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u000bR$\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u000fR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u0005R#\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0017R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u00100\u001a\u0004\b4\u00102\"\u0004\b5\u0010\u0017¨\u00068"}, d2 = {"Lme/oriient/internal/infra/rest/RequestBuilder;", "", "", "methodForLogs", "<init>", "(Ljava/lang/String;)V", "url", "", "Lme/oriient/internal/infra/rest/HttpContent;", "type", "contentType", "(Lme/oriient/internal/infra/rest/HttpContent;)V", "Lme/oriient/internal/infra/rest/HttpEncoding;", "encoding", "contentEncoding", "(Lme/oriient/internal/infra/rest/HttpEncoding;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "value", "header", "(Ljava/lang/String;Ljava/lang/String;)V", "accept", "", "shouldReportRequest", "(Z)V", "Lokhttp3/Request;", "build", "()Lokhttp3/Request;", "Ljava/lang/String;", "getMethodForLogs", "()Ljava/lang/String;", "getUrl", "setUrl", "Lme/oriient/internal/infra/rest/HttpContent;", "getContentType", "()Lme/oriient/internal/infra/rest/HttpContent;", "setContentType", "Lme/oriient/internal/infra/rest/HttpEncoding;", "getContentEncoding", "()Lme/oriient/internal/infra/rest/HttpEncoding;", "setContentEncoding", "getAccept", "setAccept", "", "headers", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "printResponseBodyToLog", "Z", "getPrintResponseBodyToLog", "()Z", "setPrintResponseBodyToLog", "getShouldReportRequest", "setShouldReportRequest", "Companion", "me/oriient/internal/infra/rest/d", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public class RequestBuilder {

    @NotNull
    public static final String ACCEPT = "Accept";

    @NotNull
    public static final String CONTENT_ENCODING = "Content-Encoding";

    @NotNull
    public static final String CONTENT_TYPE = "Content-Type";

    @NotNull
    public static final d Companion = new d();

    @NotNull
    private static final RequestBody EMPTY_REQUEST;

    @Nullable
    private String accept;

    @Nullable
    private HttpEncoding contentEncoding;

    @NotNull
    private HttpContent contentType;

    @NotNull
    private final Map<String, String> headers;

    @NotNull
    private final String methodForLogs;
    private boolean printResponseBodyToLog;
    private boolean shouldReportRequest;
    public String url;

    static {
        RequestBody.f26692a.getClass();
        EMPTY_REQUEST = RequestBody.Companion.a(0, null, new byte[0]);
    }

    public RequestBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void accept(@NotNull String value) {
        Intrinsics.h(value, "value");
        this.accept = value;
    }

    @NotNull
    public Request build() {
        Request.Builder builder = new Request.Builder();
        builder.h(getUrl());
        builder.c(CONTENT_TYPE, this.contentType.getValue());
        HttpEncoding httpEncoding = this.contentEncoding;
        if (httpEncoding != null) {
            builder.c(CONTENT_ENCODING, httpEncoding.getValue());
        }
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            builder.c(entry.getKey(), entry.getValue());
        }
        return new Request(builder);
    }

    public final void contentEncoding(@NotNull HttpEncoding encoding) {
        Intrinsics.h(encoding, "encoding");
        this.contentEncoding = encoding;
    }

    public final void contentType(@NotNull HttpContent type) {
        Intrinsics.h(type, "type");
        this.contentType = type;
    }

    @Nullable
    public final String getAccept() {
        return this.accept;
    }

    @Nullable
    public final HttpEncoding getContentEncoding() {
        return this.contentEncoding;
    }

    @NotNull
    public final HttpContent getContentType() {
        return this.contentType;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getMethodForLogs() {
        return this.methodForLogs;
    }

    public final boolean getPrintResponseBodyToLog() {
        return this.printResponseBodyToLog;
    }

    public final boolean getShouldReportRequest() {
        return this.shouldReportRequest;
    }

    @NotNull
    public final String getUrl() {
        String str = this.url;
        if (str != null) {
            return str;
        }
        Intrinsics.p("url");
        throw null;
    }

    public final void header(@NotNull String name, @NotNull String value) {
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        this.headers.put(name, value);
    }

    public final void setAccept(@Nullable String str) {
        this.accept = str;
    }

    public final void setContentEncoding(@Nullable HttpEncoding httpEncoding) {
        this.contentEncoding = httpEncoding;
    }

    public final void setContentType(@NotNull HttpContent httpContent) {
        Intrinsics.h(httpContent, "<set-?>");
        this.contentType = httpContent;
    }

    public final void setPrintResponseBodyToLog(boolean z) {
        this.printResponseBodyToLog = z;
    }

    public final void setShouldReportRequest(boolean z) {
        this.shouldReportRequest = z;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.url = str;
    }

    public final void shouldReportRequest(boolean value) {
        this.shouldReportRequest = value;
    }

    public final void url(@NotNull String url) {
        Intrinsics.h(url, "url");
        setUrl(url);
    }

    public RequestBuilder(@NotNull String methodForLogs) {
        Intrinsics.h(methodForLogs, "methodForLogs");
        this.methodForLogs = methodForLogs;
        this.contentType = HttpContent.CONTENT_APPLICATION_JSON;
        this.headers = new LinkedHashMap();
        this.shouldReportRequest = true;
    }

    public /* synthetic */ RequestBuilder(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "GET" : str);
    }
}
