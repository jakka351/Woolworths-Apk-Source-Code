package me.oriient.internal.services.auth;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.rest.HttpResponse;
import me.oriient.internal.infra.rest.PostRequestBuilder;
import me.oriient.internal.infra.rest.PutRequestBuilder;
import me.oriient.internal.infra.rest.RequestBuilder;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.infra.rest.RestServiceImpl;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J3\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&¢\u0006\u0002\b)H\u0096A¢\u0006\u0002\u0010*J3\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020$0\"2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&¢\u0006\u0002\b)H\u0096A¢\u0006\u0002\u0010*J3\u0010-\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020(0&¢\u0006\u0002\b)H\u0096A¢\u0006\u0002\u0010*J3\u0010/\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020$0\"2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020(0&¢\u0006\u0002\b)H\u0096A¢\u0006\u0002\u0010*J3\u00100\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020$0\"2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020(0&¢\u0006\u0002\b)H\u0096A¢\u0006\u0002\u0010*J3\u00102\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020(0&¢\u0006\u0002\b)H\u0096A¢\u0006\u0002\u0010*J3\u00104\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020$0\"2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020(0&¢\u0006\u0002\b)H\u0096A¢\u0006\u0002\u0010*J3\u00105\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020$0\"2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020(0&¢\u0006\u0002\b)H\u0096A¢\u0006\u0002\u0010*R\u0018\u0010\u0006\u001a\u00020\u0007X\u0096\u000f¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\u0007X\u0096\u000f¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u0018\u0010\u000f\u001a\u00020\u0010X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u00020\u0007X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\u00020\u0007X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000b¨\u00066"}, d2 = {"Lme/oriient/internal/services/auth/UnauthenticatedRestServiceImpl;", "Lme/oriient/internal/services/auth/UnauthenticatedRestService;", "Lme/oriient/internal/infra/rest/RestService;", "restService", "Lme/oriient/internal/infra/rest/RestServiceImpl;", "(Lme/oriient/internal/infra/rest/RestServiceImpl;)V", "callTimeoutMillis", "", "getCallTimeoutMillis", "()J", "setCallTimeoutMillis", "(J)V", "connectTimeoutMillis", "getConnectTimeoutMillis", "setConnectTimeoutMillis", "enableHttpClientLogging", "", "getEnableHttpClientLogging", "()Z", "setEnableHttpClientLogging", "(Z)V", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "setLogger", "(Lme/oriient/internal/infra/utils/core/Logger;)V", "readTimeoutMillis", "getReadTimeoutMillis", "setReadTimeoutMillis", "writeTimeoutMillis", "getWriteTimeoutMillis", "setWriteTimeoutMillis", "getBytes", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/infra/rest/HttpResponse$BytesResponse;", "Lme/oriient/internal/infra/utils/core/OriientError;", "requestConfig", "Lkotlin/Function1;", "Lme/oriient/internal/infra/rest/RequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getString", "Lme/oriient/internal/infra/rest/HttpResponse$StringResponse;", "postReturningBytes", "Lme/oriient/internal/infra/rest/PostRequestBuilder;", "postReturningString", "postReturningUnit", "Lme/oriient/internal/infra/rest/HttpResponse$EmptyResponse;", "putReturningBytes", "Lme/oriient/internal/infra/rest/PutRequestBuilder;", "putReturningString", "putReturningUnit", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UnauthenticatedRestServiceImpl implements UnauthenticatedRestService, RestService {

    @NotNull
    private final RestServiceImpl restService;

    public UnauthenticatedRestServiceImpl(@NotNull RestServiceImpl restService) {
        Intrinsics.h(restService, "restService");
        this.restService = restService;
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object getBytes(@NotNull Function1<? super RequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.BytesResponse, OriientError>> continuation) {
        return this.restService.getBytes(function1, continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public long getCallTimeoutMillis() {
        return this.restService.getCallTimeoutMillis();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public long getConnectTimeoutMillis() {
        return this.restService.getConnectTimeoutMillis();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public boolean getEnableHttpClientLogging() {
        return this.restService.getEnableHttpClientLogging();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Logger getLogger() {
        return this.restService.getLogger();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public long getReadTimeoutMillis() {
        return this.restService.getReadTimeoutMillis();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object getString(@NotNull Function1<? super RequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.StringResponse, OriientError>> continuation) {
        return this.restService.getString(function1, continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public long getWriteTimeoutMillis() {
        return this.restService.getWriteTimeoutMillis();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object postReturningBytes(@NotNull Function1<? super PostRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.BytesResponse, OriientError>> continuation) {
        return this.restService.postReturningBytes(function1, continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object postReturningString(@NotNull Function1<? super PostRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.StringResponse, OriientError>> continuation) {
        return this.restService.postReturningString(function1, continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object postReturningUnit(@NotNull Function1<? super PostRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.EmptyResponse, OriientError>> continuation) {
        return this.restService.postReturningUnit(function1, continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object putReturningBytes(@NotNull Function1<? super PutRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.BytesResponse, OriientError>> continuation) {
        return this.restService.putReturningBytes(function1, continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object putReturningString(@NotNull Function1<? super PutRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.StringResponse, OriientError>> continuation) {
        return this.restService.putReturningString(function1, continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object putReturningUnit(@NotNull Function1<? super PutRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.EmptyResponse, OriientError>> continuation) {
        return this.restService.putReturningUnit(function1, continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setCallTimeoutMillis(long j) {
        this.restService.setCallTimeoutMillis(j);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setConnectTimeoutMillis(long j) {
        this.restService.setConnectTimeoutMillis(j);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setEnableHttpClientLogging(boolean z) {
        this.restService.setEnableHttpClientLogging(z);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setLogger(@Nullable Logger logger) {
        this.restService.setLogger(logger);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setReadTimeoutMillis(long j) {
        this.restService.setReadTimeoutMillis(j);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setWriteTimeoutMillis(long j) {
        this.restService.setWriteTimeoutMillis(j);
    }
}
