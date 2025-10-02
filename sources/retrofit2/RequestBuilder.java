package retrofit2;

import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* loaded from: classes2.dex */
final class RequestBuilder {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    public final String f26999a;
    public final HttpUrl b;
    public String c;
    public HttpUrl.Builder d;
    public final Request.Builder e = new Request.Builder();
    public final Headers.Builder f;
    public MediaType g;
    public final boolean h;
    public final MultipartBody.Builder i;
    public final FormBody.Builder j;
    public RequestBody k;

    /* loaded from: classes8.dex */
    public static class ContentTypeOverridingRequestBody extends RequestBody {
        public final RequestBody b;
        public final MediaType c;

        public ContentTypeOverridingRequestBody(RequestBody requestBody, MediaType mediaType) {
            this.b = requestBody;
            this.c = mediaType;
        }

        @Override // okhttp3.RequestBody
        public final long a() {
            return this.b.a();
        }

        @Override // okhttp3.RequestBody
        /* renamed from: b */
        public final MediaType getD() {
            return this.c;
        }

        @Override // okhttp3.RequestBody
        public final void d(BufferedSink bufferedSink) {
            this.b.d(bufferedSink);
        }
    }

    public RequestBuilder(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f26999a = str;
        this.b = httpUrl;
        this.c = str2;
        this.g = mediaType;
        this.h = z;
        if (headers != null) {
            this.f = headers.g();
        } else {
            this.f = new Headers.Builder();
        }
        if (z2) {
            this.j = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.i = builder;
            builder.d(MultipartBody.g);
        }
    }

    public final void a(String str, String str2, boolean z) {
        if (me.oriient.internal.infra.rest.RequestBuilder.CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                MediaType.e.getClass();
                this.g = MediaType.Companion.a(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(YU.a.A("Malformed content type: ", str2), e);
            }
        }
        Headers.Builder builder = this.f;
        if (z) {
            builder.d(str, str2);
        } else {
            builder.a(str, str2);
        }
    }

    public final void b(String str, String str2, boolean z) {
        String str3 = this.c;
        if (str3 != null) {
            HttpUrl httpUrl = this.b;
            HttpUrl.Builder builderH = httpUrl.h(str3);
            this.d = builderH;
            if (builderH == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + this.c);
            }
            this.c = null;
        }
        if (z) {
            this.d.a(str, str2);
        } else {
            this.d.c(str, str2);
        }
    }
}
