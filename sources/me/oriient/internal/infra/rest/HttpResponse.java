package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB?\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e\u0082\u0001\u0003\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lme/oriient/internal/infra/rest/HttpResponse;", "", "code", "", "message", "", "headers", "", "", "cookies", "Lme/oriient/internal/infra/rest/HttpCookie;", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "bodyAsString", "getBodyAsString", "()Ljava/lang/String;", "getCode", "()I", "contentSize", "getContentSize", "getCookies", "()Ljava/util/List;", "getHeaders", "()Ljava/util/Map;", "getMessage", "BytesResponse", "EmptyResponse", "StringResponse", "Lme/oriient/internal/infra/rest/HttpResponse$BytesResponse;", "Lme/oriient/internal/infra/rest/HttpResponse$EmptyResponse;", "Lme/oriient/internal/infra/rest/HttpResponse$StringResponse;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class HttpResponse {
    private final int code;

    @NotNull
    private final List<HttpCookie> cookies;

    @NotNull
    private final Map<String, List<String>> headers;

    @NotNull
    private final String message;

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lme/oriient/internal/infra/rest/HttpResponse$BytesResponse;", "Lme/oriient/internal/infra/rest/HttpResponse;", "bytes", "", "code", "", "message", "", "headers", "", "", "cookies", "Lme/oriient/internal/infra/rest/HttpCookie;", "([BILjava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "bodyAsString", "getBodyAsString", "()Ljava/lang/String;", "getBytes", "()[B", "contentSize", "getContentSize", "()I", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BytesResponse extends HttpResponse {

        @NotNull
        private final byte[] bytes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BytesResponse(@NotNull byte[] bytes, int i, @NotNull String message, @NotNull Map<String, ? extends List<String>> headers, @NotNull List<HttpCookie> cookies) {
            super(i, message, headers, cookies, null);
            Intrinsics.h(bytes, "bytes");
            Intrinsics.h(message, "message");
            Intrinsics.h(headers, "headers");
            Intrinsics.h(cookies, "cookies");
            this.bytes = bytes;
        }

        @Override // me.oriient.internal.infra.rest.HttpResponse
        @NotNull
        /* renamed from: getBodyAsString */
        public String getString() {
            return this.bytes.toString();
        }

        @NotNull
        public final byte[] getBytes() {
            return this.bytes;
        }

        @Override // me.oriient.internal.infra.rest.HttpResponse
        public int getContentSize() {
            return this.bytes.length;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lme/oriient/internal/infra/rest/HttpResponse$EmptyResponse;", "Lme/oriient/internal/infra/rest/HttpResponse;", "code", "", "message", "", "headers", "", "", "cookies", "Lme/oriient/internal/infra/rest/HttpCookie;", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "bodyAsString", "getBodyAsString", "()Ljava/lang/String;", "contentSize", "getContentSize", "()I", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EmptyResponse extends HttpResponse {

        @NotNull
        private final String bodyAsString;
        private final int contentSize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptyResponse(int i, @NotNull String message, @NotNull Map<String, ? extends List<String>> headers, @NotNull List<HttpCookie> cookies) {
            super(i, message, headers, cookies, null);
            Intrinsics.h(message, "message");
            Intrinsics.h(headers, "headers");
            Intrinsics.h(cookies, "cookies");
            this.bodyAsString = "null";
        }

        @Override // me.oriient.internal.infra.rest.HttpResponse
        @NotNull
        /* renamed from: getBodyAsString, reason: from getter */
        public String getString() {
            return this.bodyAsString;
        }

        @Override // me.oriient.internal.infra.rest.HttpResponse
        public int getContentSize() {
            return this.contentSize;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\fR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lme/oriient/internal/infra/rest/HttpResponse$StringResponse;", "Lme/oriient/internal/infra/rest/HttpResponse;", "string", "", "code", "", "message", "headers", "", "", "cookies", "Lme/oriient/internal/infra/rest/HttpCookie;", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "bodyAsString", "getBodyAsString", "()Ljava/lang/String;", "contentSize", "getContentSize", "()I", "getString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StringResponse extends HttpResponse {

        @NotNull
        private final String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringResponse(@NotNull String string, int i, @NotNull String message, @NotNull Map<String, ? extends List<String>> headers, @NotNull List<HttpCookie> cookies) {
            super(i, message, headers, cookies, null);
            Intrinsics.h(string, "string");
            Intrinsics.h(message, "message");
            Intrinsics.h(headers, "headers");
            Intrinsics.h(cookies, "cookies");
            this.string = string;
        }

        @Override // me.oriient.internal.infra.rest.HttpResponse
        @NotNull
        /* renamed from: getBodyAsString, reason: from getter */
        public String getString() {
            return this.string;
        }

        @Override // me.oriient.internal.infra.rest.HttpResponse
        public int getContentSize() {
            return this.string.length();
        }

        @NotNull
        public final String getString() {
            return this.string;
        }
    }

    public /* synthetic */ HttpResponse(int i, String str, Map map, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, map, list);
    }

    @NotNull
    /* renamed from: getBodyAsString */
    public abstract String getString();

    public final int getCode() {
        return this.code;
    }

    public abstract int getContentSize();

    @NotNull
    public final List<HttpCookie> getCookies() {
        return this.cookies;
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private HttpResponse(int i, String str, Map<String, ? extends List<String>> map, List<HttpCookie> list) {
        this.code = i;
        this.message = str;
        this.headers = map;
        this.cookies = list;
    }
}
