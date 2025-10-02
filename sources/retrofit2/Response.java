package retrofit2;

import java.util.Objects;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.OkHttpCall;

/* loaded from: classes2.dex */
public final class Response<T> {

    /* renamed from: a, reason: collision with root package name */
    public final okhttp3.Response f27002a;
    public final Object b;
    public final ResponseBody c;

    public Response(okhttp3.Response response, Object obj, ResponseBody responseBody) {
        this.f27002a = response;
        this.b = obj;
        this.c = responseBody;
    }

    public static Response a(int i, ResponseBody responseBody) {
        Objects.requireNonNull(responseBody, "body == null");
        if (i < 400) {
            throw new IllegalArgumentException(YU.a.d(i, "code < 400: "));
        }
        Response.Builder builder = new Response.Builder();
        builder.g = new OkHttpCall.NoContentResponseBody(responseBody.c(), responseBody.b());
        builder.c = i;
        builder.d = "Response.error()";
        builder.b = Protocol.g;
        Request.Builder builder2 = new Request.Builder();
        builder2.h("http://localhost/");
        builder.f26693a = new Request(builder2);
        return b(responseBody, builder.a());
    }

    public static Response b(ResponseBody responseBody, okhttp3.Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        if (response.s) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new Response(response, null, responseBody);
    }

    public final String toString() {
        return this.f27002a.toString();
    }
}
