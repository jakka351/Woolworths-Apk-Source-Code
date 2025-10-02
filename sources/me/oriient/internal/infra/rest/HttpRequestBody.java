package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lme/oriient/internal/infra/rest/HttpRequestBody;", "", "()V", "toRequestBody", "Lokhttp3/RequestBody;", "contentType", "Lme/oriient/internal/infra/rest/HttpContent;", "Bytes", "String", "Lme/oriient/internal/infra/rest/HttpRequestBody$Bytes;", "Lme/oriient/internal/infra/rest/HttpRequestBody$String;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class HttpRequestBody {

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lme/oriient/internal/infra/rest/HttpRequestBody$Bytes;", "Lme/oriient/internal/infra/rest/HttpRequestBody;", "body", "", "([B)V", "toRequestBody", "Lokhttp3/RequestBody;", "contentType", "Lme/oriient/internal/infra/rest/HttpContent;", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Bytes extends HttpRequestBody {

        @NotNull
        private final byte[] body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bytes(@NotNull byte[] body) {
            super(null);
            Intrinsics.h(body, "body");
            this.body = body;
        }

        @Override // me.oriient.internal.infra.rest.HttpRequestBody
        @NotNull
        public RequestBody toRequestBody(@NotNull HttpContent contentType) {
            Intrinsics.h(contentType, "contentType");
            RequestBody.Companion companion = RequestBody.f26692a;
            byte[] bArr = this.body;
            MediaType.Companion companion2 = MediaType.e;
            java.lang.String value = contentType.getValue();
            companion2.getClass();
            MediaType mediaTypeA = MediaType.Companion.a(value);
            int length = bArr.length;
            companion.getClass();
            return RequestBody.Companion.a(length, mediaTypeA, bArr);
        }

        @NotNull
        public java.lang.String toString() {
            return YU.a.m(new StringBuilder("BytesRequestBody(size="), this.body.length, " bytes)");
        }
    }

    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lme/oriient/internal/infra/rest/HttpRequestBody$String;", "Lme/oriient/internal/infra/rest/HttpRequestBody;", "body", "", "(Ljava/lang/String;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toRequestBody", "Lokhttp3/RequestBody;", "contentType", "Lme/oriient/internal/infra/rest/HttpContent;", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class String extends HttpRequestBody {

        @NotNull
        private final java.lang.String body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public String(@NotNull java.lang.String body) {
            super(null);
            Intrinsics.h(body, "body");
            this.body = body;
        }

        /* renamed from: component1, reason: from getter */
        private final java.lang.String getBody() {
            return this.body;
        }

        public static /* synthetic */ String copy$default(String string, java.lang.String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = string.body;
            }
            return string.copy(str);
        }

        @NotNull
        public final String copy(@NotNull java.lang.String body) {
            Intrinsics.h(body, "body");
            return new String(body);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof String) && Intrinsics.c(this.body, ((String) other).body);
        }

        public int hashCode() {
            return this.body.hashCode();
        }

        @Override // me.oriient.internal.infra.rest.HttpRequestBody
        @NotNull
        public RequestBody toRequestBody(@NotNull HttpContent contentType) {
            Intrinsics.h(contentType, "contentType");
            RequestBody.Companion companion = RequestBody.f26692a;
            java.lang.String str = this.body;
            MediaType.Companion companion2 = MediaType.e;
            java.lang.String value = contentType.getValue();
            companion2.getClass();
            MediaType mediaTypeA = MediaType.Companion.a(value);
            companion.getClass();
            return RequestBody.Companion.b(str, mediaTypeA);
        }

        @NotNull
        public java.lang.String toString() {
            return this.body;
        }
    }

    public /* synthetic */ HttpRequestBody(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract RequestBody toRequestBody(@NotNull HttpContent contentType);

    private HttpRequestBody() {
    }
}
