package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.rest.HttpResponse;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.infra.utils.core.ParsingError;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import okhttp3.Cookie;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001VB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012JN\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000e\"\b\b\u0000\u0010\u0018*\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u001e\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000e0\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010$\u001a\b\u0012\u0004\u0012\u00020#0!2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020 0!0\u001fH\u0002¢\u0006\u0004\b$\u0010%J5\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u000e2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020&0\u001b¢\u0006\u0002\b'H\u0096@¢\u0006\u0004\b)\u0010*J5\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020&0\u001b¢\u0006\u0002\b'H\u0096@¢\u0006\u0004\b+\u0010*J5\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u000e2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020&0\u001b¢\u0006\u0002\b'H\u0096@¢\u0006\u0004\b-\u0010*J5\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020&0\u001b¢\u0006\u0002\b'H\u0096@¢\u0006\u0004\b.\u0010*J5\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u000e2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020&0\u001b¢\u0006\u0002\b'H\u0096@¢\u0006\u0004\b/\u0010*J5\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u000e2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020&0\u001b¢\u0006\u0002\b'H\u0096@¢\u0006\u0004\b1\u0010*J5\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020&0\u001b¢\u0006\u0002\b'H\u0096@¢\u0006\u0004\b2\u0010*J5\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u000e2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020&0\u001b¢\u0006\u0002\b'H\u0096@¢\u0006\u0004\b3\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R$\u00109\u001a\u0004\u0018\u0001088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010E\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010H\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR$\u0010K\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR$\u0010N\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010B\"\u0004\bM\u0010DR$\u0010T\u001a\u00020O2\u0006\u0010@\u001a\u00020O8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006W"}, d2 = {"Lme/oriient/internal/infra/rest/RestServiceImpl;", "Lme/oriient/internal/infra/rest/RestService;", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/internal/infra/rest/RestRequestsReporter;", "restRequestsReporter", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "Lme/oriient/internal/infra/rest/HttpClientProvider;", "httpClientProvider", "<init>", "(Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;Lme/oriient/internal/infra/rest/RestRequestsReporter;Lme/oriient/internal/infra/utils/core/time/TimeProvider;Lme/oriient/internal/infra/rest/HttpClientProvider;)V", "Lokhttp3/Response;", "response", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/infra/rest/HttpResponse$BytesResponse;", "Lme/oriient/internal/infra/utils/core/OriientError;", "responseToBytes", "(Lokhttp3/Response;)Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/infra/rest/HttpResponse$StringResponse;", "responseToString", "Lme/oriient/internal/infra/rest/HttpResponse$EmptyResponse;", "responseToUnit", "Lme/oriient/internal/infra/rest/HttpResponse;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/internal/infra/rest/RequestBuilder;", "requestBuilder", "Lkotlin/Function1;", "parseResponse", "makeRequest", "(Lme/oriient/internal/infra/rest/RequestBuilder;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "", "headers", "Lme/oriient/internal/infra/rest/HttpCookie;", "getCookies", "(Lokhttp3/Response;Ljava/util/Map;)Ljava/util/List;", "", "Lkotlin/ExtensionFunctionType;", "requestConfig", "getString", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBytes", "Lme/oriient/internal/infra/rest/PostRequestBuilder;", "postReturningString", "postReturningBytes", "postReturningUnit", "Lme/oriient/internal/infra/rest/PutRequestBuilder;", "putReturningString", "putReturningBytes", "putReturningUnit", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "Lme/oriient/internal/infra/rest/RestRequestsReporter;", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "Lme/oriient/internal/infra/rest/HttpClientProvider;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "setLogger", "(Lme/oriient/internal/infra/utils/core/Logger;)V", "", "value", "getCallTimeoutMillis", "()J", "setCallTimeoutMillis", "(J)V", "callTimeoutMillis", "getConnectTimeoutMillis", "setConnectTimeoutMillis", "connectTimeoutMillis", "getReadTimeoutMillis", "setReadTimeoutMillis", "readTimeoutMillis", "getWriteTimeoutMillis", "setWriteTimeoutMillis", "writeTimeoutMillis", "", "getEnableHttpClientLogging", "()Z", "setEnableHttpClientLogging", "(Z)V", "enableHttpClientLogging", "Companion", "me/oriient/internal/infra/rest/g", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RestServiceImpl implements RestService {

    @NotNull
    private static final g Companion = new g();

    @NotNull
    private static final String RESPONSE_HEADER_SET_COOKIE = "Set-Cookie";

    @NotNull
    private static final String TAG = "RestService";

    @NotNull
    private final CoroutineContextProvider coroutineContextProvider;

    @NotNull
    private final HttpClientProvider httpClientProvider;

    @Nullable
    private Logger logger;

    @NotNull
    private final RestRequestsReporter restRequestsReporter;

    @NotNull
    private final TimeProvider timeProvider;

    public RestServiceImpl(@NotNull CoroutineContextProvider coroutineContextProvider, @NotNull RestRequestsReporter restRequestsReporter, @NotNull TimeProvider timeProvider, @NotNull HttpClientProvider httpClientProvider) {
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        Intrinsics.h(restRequestsReporter, "restRequestsReporter");
        Intrinsics.h(timeProvider, "timeProvider");
        Intrinsics.h(httpClientProvider, "httpClientProvider");
        this.coroutineContextProvider = coroutineContextProvider;
        this.restRequestsReporter = restRequestsReporter;
        this.timeProvider = timeProvider;
        this.httpClientProvider = httpClientProvider;
    }

    private final List<HttpCookie> getCookies(Response response, Map<String, ? extends List<String>> headers) {
        Cookie cookieB;
        List<String> list = headers.get(RESPONSE_HEADER_SET_COOKIE);
        if (list == null) {
            return EmptyList.d;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                Cookie.Companion companion = Cookie.k;
                HttpUrl httpUrl = response.d.f26690a;
                companion.getClass();
                cookieB = Cookie.Companion.b(httpUrl, str);
            } catch (Exception unused) {
            }
            HttpCookie httpCookie = cookieB != null ? new HttpCookie(cookieB.f26673a, str, cookieB.c) : null;
            if (httpCookie != null) {
                arrayList.add(httpCookie);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a5 A[Catch: all -> 0x01f3, TryCatch #0 {all -> 0x01f3, blocks: (B:77:0x019f, B:79:0x01a5, B:80:0x01c2, B:83:0x01cb, B:86:0x01d6, B:88:0x01dc, B:91:0x01f5), top: B:105:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01dc A[Catch: all -> 0x01f3, TryCatch #0 {all -> 0x01f3, blocks: (B:77:0x019f, B:79:0x01a5, B:80:0x01c2, B:83:0x01cb, B:86:0x01d6, B:88:0x01dc, B:91:0x01f5), top: B:105:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T extends me.oriient.internal.infra.rest.HttpResponse> java.lang.Object makeRequest(me.oriient.internal.infra.rest.RequestBuilder r23, kotlin.jvm.functions.Function1<? super okhttp3.Response, ? extends me.oriient.internal.infra.utils.core.Outcome<T, me.oriient.internal.infra.utils.core.OriientError>> r24, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<T, me.oriient.internal.infra.utils.core.OriientError>> r25) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.infra.rest.RestServiceImpl.makeRequest(me.oriient.internal.infra.rest.RequestBuilder, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Outcome<HttpResponse.BytesResponse, OriientError> responseToBytes(Response response) {
        ResponseBody responseBody = response.j;
        if (responseBody == null) {
            return OutcomeKt.toOutcomeFailure(new ParsingError("null response body"));
        }
        TreeMap treeMapH = response.i.h();
        return OutcomeKt.toOutcomeSuccess(new HttpResponse.BytesResponse(responseBody.a(), response.g, response.f, treeMapH, getCookies(response, treeMapH)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Outcome<HttpResponse.StringResponse, OriientError> responseToString(Response response) {
        ResponseBody responseBody = response.j;
        if (responseBody == null) {
            return OutcomeKt.toOutcomeFailure(new ParsingError("null response body"));
        }
        TreeMap treeMapH = response.i.h();
        return OutcomeKt.toOutcomeSuccess(new HttpResponse.StringResponse(responseBody.d(), response.g, response.f, treeMapH, getCookies(response, treeMapH)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Outcome<HttpResponse.EmptyResponse, OriientError> responseToUnit(Response response) {
        ResponseBody responseBody = response.j;
        if (responseBody != null) {
            responseBody.close();
        }
        TreeMap treeMapH = response.i.h();
        return OutcomeKt.toOutcomeSuccess(new HttpResponse.EmptyResponse(response.g, response.f, treeMapH, getCookies(response, treeMapH)));
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object getBytes(@NotNull Function1<? super RequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.BytesResponse, OriientError>> continuation) {
        RequestBuilder requestBuilder = new RequestBuilder(null, 1, null);
        function1.invoke(requestBuilder);
        return makeRequest(requestBuilder, new h(this), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public long getCallTimeoutMillis() {
        return this.httpClientProvider.getCallTimeoutMillis();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public long getConnectTimeoutMillis() {
        return this.httpClientProvider.getConnectTimeoutMillis();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public boolean getEnableHttpClientLogging() {
        return this.httpClientProvider.getEnableHttpClientLogging();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Logger getLogger() {
        return this.logger;
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public long getReadTimeoutMillis() {
        return this.httpClientProvider.getReadTimeoutMillis();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object getString(@NotNull Function1<? super RequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.StringResponse, OriientError>> continuation) {
        RequestBuilder requestBuilder = new RequestBuilder(null, 1, null);
        function1.invoke(requestBuilder);
        return makeRequest(requestBuilder, new i(this), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public long getWriteTimeoutMillis() {
        return this.httpClientProvider.getWriteTimeoutMillis();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object postReturningBytes(@NotNull Function1<? super PostRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.BytesResponse, OriientError>> continuation) {
        PostRequestBuilder postRequestBuilder = new PostRequestBuilder(null, 1, null);
        function1.invoke(postRequestBuilder);
        return makeRequest(postRequestBuilder, new l(this), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object postReturningString(@NotNull Function1<? super PostRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.StringResponse, OriientError>> continuation) {
        PostRequestBuilder postRequestBuilder = new PostRequestBuilder(null, 1, null);
        function1.invoke(postRequestBuilder);
        return makeRequest(postRequestBuilder, new m(this), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object postReturningUnit(@NotNull Function1<? super PostRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.EmptyResponse, OriientError>> continuation) {
        PostRequestBuilder postRequestBuilder = new PostRequestBuilder(null, 1, null);
        function1.invoke(postRequestBuilder);
        return makeRequest(postRequestBuilder, new n(this), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object putReturningBytes(@NotNull Function1<? super PutRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.BytesResponse, OriientError>> continuation) {
        PutRequestBuilder putRequestBuilder = new PutRequestBuilder();
        function1.invoke(putRequestBuilder);
        return makeRequest(putRequestBuilder, new o(this), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object putReturningString(@NotNull Function1<? super PutRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.StringResponse, OriientError>> continuation) {
        PutRequestBuilder putRequestBuilder = new PutRequestBuilder();
        function1.invoke(putRequestBuilder);
        return makeRequest(putRequestBuilder, new p(this), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object putReturningUnit(@NotNull Function1<? super PutRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.EmptyResponse, OriientError>> continuation) {
        PutRequestBuilder putRequestBuilder = new PutRequestBuilder();
        function1.invoke(putRequestBuilder);
        return makeRequest(putRequestBuilder, new q(this), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setCallTimeoutMillis(long j) {
        this.httpClientProvider.setCallTimeoutMillis(j);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setConnectTimeoutMillis(long j) {
        this.httpClientProvider.setConnectTimeoutMillis(j);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setEnableHttpClientLogging(boolean z) {
        this.httpClientProvider.setEnableHttpClientLogging(z);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setLogger(@Nullable Logger logger) {
        this.logger = logger;
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setReadTimeoutMillis(long j) {
        this.httpClientProvider.setReadTimeoutMillis(j);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setWriteTimeoutMillis(long j) {
        this.httpClientProvider.setWriteTimeoutMillis(j);
    }

    public /* synthetic */ RestServiceImpl(CoroutineContextProvider coroutineContextProvider, RestRequestsReporter restRequestsReporter, TimeProvider timeProvider, HttpClientProvider httpClientProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineContextProvider, restRequestsReporter, timeProvider, (i & 8) != 0 ? new b() : httpClientProvider);
    }
}
