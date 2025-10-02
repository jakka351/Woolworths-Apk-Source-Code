package retrofit2;

import com.dynatrace.android.callback.OkCallback;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.RealBufferedSource;
import retrofit2.RequestBuilder;

/* loaded from: classes2.dex */
final class OkHttpCall<T> implements Call<T> {
    public final RequestFactory d;
    public final Object e;
    public final Object[] f;
    public final Call.Factory g;
    public final Converter h;
    public volatile boolean i;
    public okhttp3.Call j;
    public Throwable k;
    public boolean l;

    /* loaded from: classes8.dex */
    public static final class ExceptionCatchingResponseBody extends ResponseBody {
        public final ResponseBody g;
        public final RealBufferedSource h;
        public IOException i;

        public ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.g = responseBody;
            this.h = Okio.c(new ForwardingSource(responseBody.U0()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // okio.ForwardingSource, okio.Source
                public final long q2(Buffer buffer, long j) throws IOException {
                    try {
                        return super.q2(buffer, j);
                    } catch (IOException e) {
                        ExceptionCatchingResponseBody.this.i = e;
                        throw e;
                    }
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public final BufferedSource U0() {
            return this.h;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: b */
        public final long getH() {
            return this.g.getH();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: c */
        public final MediaType getG() {
            return this.g.getG();
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.g.close();
        }

        public final void e() throws IOException {
            IOException iOException = this.i;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public static final class NoContentResponseBody extends ResponseBody {
        public final MediaType g;
        public final long h;

        public NoContentResponseBody(MediaType mediaType, long j) {
            this.g = mediaType;
            this.h = j;
        }

        @Override // okhttp3.ResponseBody
        public final BufferedSource U0() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: b */
        public final long getH() {
            return this.h;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: c */
        public final MediaType getG() {
            return this.g;
        }
    }

    public OkHttpCall(RequestFactory requestFactory, Object obj, Object[] objArr, Call.Factory factory, Converter converter) {
        this.d = requestFactory;
        this.e = obj;
        this.f = objArr;
        this.g = factory;
        this.h = converter;
    }

    @Override // retrofit2.Call
    public final void Z(final Callback callback) {
        okhttp3.Call call;
        Throwable th;
        synchronized (this) {
            try {
                if (this.l) {
                    throw new IllegalStateException("Already executed.");
                }
                this.l = true;
                call = this.j;
                th = this.k;
                if (call == null && th == null) {
                    try {
                        okhttp3.Call callA = a();
                        this.j = callA;
                        call = callA;
                    } catch (Throwable th2) {
                        th = th2;
                        Utils.m(th);
                        this.k = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            callback.a(this, th);
            return;
        }
        if (this.i) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new okhttp3.Callback() { // from class: retrofit2.OkHttpCall.1
            @Override // okhttp3.Callback
            public final void onFailure(okhttp3.Call call2, IOException iOException) {
                OkCallback.b(call2, iOException);
                try {
                    callback.a(OkHttpCall.this, iOException);
                } finally {
                    try {
                    } catch (Throwable th4) {
                    }
                }
            }

            @Override // okhttp3.Callback
            public final void onResponse(okhttp3.Call call2, okhttp3.Response response) {
                Callback callback2 = callback;
                OkHttpCall okHttpCall = OkHttpCall.this;
                OkCallback.c(call2, response);
                try {
                    try {
                        try {
                            callback2.c(okHttpCall, okHttpCall.c(response));
                        } catch (Throwable th4) {
                            Utils.m(th4);
                            th4.printStackTrace();
                        }
                        String str = OkCallback.f14143a;
                    } catch (Throwable th5) {
                        Utils.m(th5);
                        try {
                            callback2.a(okHttpCall, th5);
                        } catch (Throwable th6) {
                            Utils.m(th6);
                            th6.printStackTrace();
                        }
                        String str2 = OkCallback.f14143a;
                    }
                } catch (Throwable th7) {
                    String str3 = OkCallback.f14143a;
                    throw th7;
                }
            }
        });
    }

    public final okhttp3.Call a() {
        HttpUrl httpUrlD;
        RequestFactory requestFactory = this.d;
        ParameterHandler[] parameterHandlerArr = requestFactory.k;
        Object[] objArr = this.f;
        int length = objArr.length;
        if (length != parameterHandlerArr.length) {
            throw new IllegalArgumentException(YU.a.m(YU.a.r(length, "Argument count (", ") doesn't match expected count ("), parameterHandlerArr.length, ")"));
        }
        RequestBuilder requestBuilder = new RequestBuilder(requestFactory.d, requestFactory.c, requestFactory.e, requestFactory.f, requestFactory.g, requestFactory.h, requestFactory.i, requestFactory.j);
        if (requestFactory.l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            parameterHandlerArr[i].a(requestBuilder, objArr[i]);
        }
        HttpUrl.Builder builder = requestBuilder.d;
        if (builder != null) {
            httpUrlD = builder.d();
        } else {
            String link = requestBuilder.c;
            HttpUrl httpUrl = requestBuilder.b;
            httpUrl.getClass();
            Intrinsics.h(link, "link");
            HttpUrl.Builder builderH = httpUrl.h(link);
            httpUrlD = builderH != null ? builderH.d() : null;
            if (httpUrlD == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + requestBuilder.c);
            }
        }
        RequestBody contentTypeOverridingRequestBody = requestBuilder.k;
        if (contentTypeOverridingRequestBody == null) {
            FormBody.Builder builder2 = requestBuilder.j;
            if (builder2 != null) {
                contentTypeOverridingRequestBody = builder2.c();
            } else {
                MultipartBody.Builder builder3 = requestBuilder.i;
                if (builder3 != null) {
                    contentTypeOverridingRequestBody = builder3.c();
                } else if (requestBuilder.h) {
                    RequestBody.f26692a.getClass();
                    contentTypeOverridingRequestBody = RequestBody.Companion.a(0, null, new byte[0]);
                }
            }
        }
        MediaType mediaType = requestBuilder.g;
        Headers.Builder builder4 = requestBuilder.f;
        if (mediaType != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new RequestBuilder.ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, mediaType);
            } else {
                builder4.a(me.oriient.internal.infra.rest.RequestBuilder.CONTENT_TYPE, mediaType.f26685a);
            }
        }
        Request.Builder builder5 = requestBuilder.e;
        builder5.getClass();
        builder5.f26691a = httpUrlD;
        builder5.d(builder4.e());
        builder5.e(requestBuilder.f26999a, contentTypeOverridingRequestBody);
        builder5.g(Invocation.class, new Invocation(requestFactory.f27000a, this.e, requestFactory.b, arrayList));
        return this.g.a(new Request(builder5));
    }

    public final okhttp3.Call b() throws IOException {
        okhttp3.Call call = this.j;
        if (call != null) {
            return call;
        }
        Throwable th = this.k;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            okhttp3.Call callA = a();
            this.j = callA;
            return callA;
        } catch (IOException | Error | RuntimeException e) {
            Utils.m(e);
            this.k = e;
            throw e;
        }
    }

    public final Response c(okhttp3.Response response) throws IOException {
        ResponseBody responseBody = response.j;
        Response.Builder builderC = response.c();
        builderC.g = new NoContentResponseBody(responseBody.getG(), responseBody.getH());
        okhttp3.Response responseA = builderC.a();
        boolean z = responseA.s;
        int i = responseA.g;
        if (i < 200 || i >= 300) {
            try {
                Buffer buffer = new Buffer();
                responseBody.U0().t2(buffer);
                MediaType mediaTypeC = responseBody.getG();
                long jB = responseBody.getH();
                ResponseBody.e.getClass();
                return Response.b(new ResponseBody$Companion$asResponseBody$1(mediaTypeC, jB, buffer), responseA);
            } finally {
                responseBody.close();
            }
        }
        if (i == 204 || i == 205) {
            if (z) {
                return new Response(responseA, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(responseBody);
        try {
            Object objA = this.h.a(exceptionCatchingResponseBody);
            if (z) {
                return new Response(responseA, objA, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            exceptionCatchingResponseBody.e();
            throw e;
        }
    }

    @Override // retrofit2.Call
    public final void cancel() {
        okhttp3.Call call;
        this.i = true;
        synchronized (this) {
            call = this.j;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public final Object clone() {
        return new OkHttpCall(this.d, this.e, this.f, this.g, this.h);
    }

    @Override // retrofit2.Call
    public final Response execute() {
        okhttp3.Call callB;
        synchronized (this) {
            if (this.l) {
                throw new IllegalStateException("Already executed.");
            }
            this.l = true;
            callB = b();
        }
        if (this.i) {
            callB.cancel();
        }
        return c(FirebasePerfOkHttpClient.execute(callB));
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        boolean z = true;
        if (this.i) {
            return true;
        }
        synchronized (this) {
            try {
                okhttp3.Call call = this.j;
                if (call == null || !call.getS()) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    public final synchronized Request x() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().getE();
    }

    @Override // retrofit2.Call
    public final Call clone() {
        return new OkHttpCall(this.d, this.e, this.f, this.g, this.h);
    }
}
