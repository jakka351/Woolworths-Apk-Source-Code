package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import me.oriient.internal.infra.rest.HttpResponse;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J3\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%H¦@¢\u0006\u0002\u0010&J3\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020 0\u001e2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%H¦@¢\u0006\u0002\u0010&J3\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%H¦@¢\u0006\u0002\u0010&J3\u0010+\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020 0\u001e2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%H¦@¢\u0006\u0002\u0010&J3\u0010,\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020 0\u001e2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%H¦@¢\u0006\u0002\u0010&J3\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%H¦@¢\u0006\u0002\u0010&J3\u00100\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020 0\u001e2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%H¦@¢\u0006\u0002\u0010&J3\u00101\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020 0\u001e2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%H¦@¢\u0006\u0002\u0010&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u0007R\u0018\u0010\u001a\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0005\"\u0004\b\u001c\u0010\u0007¨\u00062"}, d2 = {"Lme/oriient/internal/infra/rest/RestService;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "callTimeoutMillis", "", "getCallTimeoutMillis", "()J", "setCallTimeoutMillis", "(J)V", "connectTimeoutMillis", "getConnectTimeoutMillis", "setConnectTimeoutMillis", "enableHttpClientLogging", "", "getEnableHttpClientLogging", "()Z", "setEnableHttpClientLogging", "(Z)V", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "setLogger", "(Lme/oriient/internal/infra/utils/core/Logger;)V", "readTimeoutMillis", "getReadTimeoutMillis", "setReadTimeoutMillis", "writeTimeoutMillis", "getWriteTimeoutMillis", "setWriteTimeoutMillis", "getBytes", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/infra/rest/HttpResponse$BytesResponse;", "Lme/oriient/internal/infra/utils/core/OriientError;", "requestConfig", "Lkotlin/Function1;", "Lme/oriient/internal/infra/rest/RequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getString", "Lme/oriient/internal/infra/rest/HttpResponse$StringResponse;", "postReturningBytes", "Lme/oriient/internal/infra/rest/PostRequestBuilder;", "postReturningString", "postReturningUnit", "Lme/oriient/internal/infra/rest/HttpResponse$EmptyResponse;", "putReturningBytes", "Lme/oriient/internal/infra/rest/PutRequestBuilder;", "putReturningString", "putReturningUnit", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RestService extends DiProvidable {
    @Nullable
    Object getBytes(@NotNull Function1<? super RequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.BytesResponse, OriientError>> continuation);

    long getCallTimeoutMillis();

    long getConnectTimeoutMillis();

    boolean getEnableHttpClientLogging();

    @Nullable
    Logger getLogger();

    long getReadTimeoutMillis();

    @Nullable
    Object getString(@NotNull Function1<? super RequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.StringResponse, OriientError>> continuation);

    long getWriteTimeoutMillis();

    @Nullable
    Object postReturningBytes(@NotNull Function1<? super PostRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.BytesResponse, OriientError>> continuation);

    @Nullable
    Object postReturningString(@NotNull Function1<? super PostRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.StringResponse, OriientError>> continuation);

    @Nullable
    Object postReturningUnit(@NotNull Function1<? super PostRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.EmptyResponse, OriientError>> continuation);

    @Nullable
    Object putReturningBytes(@NotNull Function1<? super PutRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.BytesResponse, OriientError>> continuation);

    @Nullable
    Object putReturningString(@NotNull Function1<? super PutRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.StringResponse, OriientError>> continuation);

    @Nullable
    Object putReturningUnit(@NotNull Function1<? super PutRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.EmptyResponse, OriientError>> continuation);

    void setCallTimeoutMillis(long j);

    void setConnectTimeoutMillis(long j);

    void setEnableHttpClientLogging(boolean z);

    void setLogger(@Nullable Logger logger);

    void setReadTimeoutMillis(long j);

    void setWriteTimeoutMillis(long j);
}
