package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0005\"\u0004\b\u000e\u0010\u0007R\u0018\u0010\u000f\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0005\"\u0004\b\u0017\u0010\u0007R\u0018\u0010\u0018\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0005\"\u0004\b\u001a\u0010\u0007¨\u0006\u001b"}, d2 = {"Lme/oriient/internal/infra/rest/HttpClientProvider;", "", "callTimeoutMillis", "", "getCallTimeoutMillis", "()J", "setCallTimeoutMillis", "(J)V", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "connectTimeoutMillis", "getConnectTimeoutMillis", "setConnectTimeoutMillis", "enableHttpClientLogging", "", "getEnableHttpClientLogging", "()Z", "setEnableHttpClientLogging", "(Z)V", "readTimeoutMillis", "getReadTimeoutMillis", "setReadTimeoutMillis", "writeTimeoutMillis", "getWriteTimeoutMillis", "setWriteTimeoutMillis", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HttpClientProvider {
    long getCallTimeoutMillis();

    @NotNull
    OkHttpClient getClient();

    long getConnectTimeoutMillis();

    boolean getEnableHttpClientLogging();

    long getReadTimeoutMillis();

    long getWriteTimeoutMillis();

    void setCallTimeoutMillis(long j);

    void setConnectTimeoutMillis(long j);

    void setEnableHttpClientLogging(boolean z);

    void setReadTimeoutMillis(long j);

    void setWriteTimeoutMillis(long j);
}
