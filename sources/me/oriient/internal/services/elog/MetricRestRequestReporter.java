package me.oriient.internal.services.elog;

import androidx.annotation.Keep;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.rest.HttpResponse;
import me.oriient.internal.infra.rest.RequestBuilder;
import me.oriient.internal.infra.rest.RestRequestsReporter;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.ServerError;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J(\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lme/oriient/internal/services/elog/MetricRestRequestReporter;", "Lme/oriient/internal/infra/rest/RestRequestsReporter;", "metric", "Lme/oriient/internal/services/elog/Metric;", "(Lme/oriient/internal/services/elog/Metric;)V", "reportError", "", "tag", "", "durationSeconds", "", "requestBuilder", "Lme/oriient/internal/infra/rest/RequestBuilder;", "error", "Lme/oriient/internal/infra/utils/core/OriientError;", "reportSuccess", "response", "Lme/oriient/internal/infra/rest/HttpResponse;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MetricRestRequestReporter implements RestRequestsReporter {

    @NotNull
    private final Metric metric;

    public MetricRestRequestReporter(@NotNull Metric metric) {
        Intrinsics.h(metric, "metric");
        this.metric = metric;
    }

    @Override // me.oriient.internal.infra.rest.RestRequestsReporter
    public void reportError(@NotNull String tag, double durationSeconds, @NotNull RequestBuilder requestBuilder, @NotNull OriientError error) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(requestBuilder, "requestBuilder");
        Intrinsics.h(error, "error");
        this.metric.e(tag, "Rest request failed", durationSeconds, new n(new URL(requestBuilder.getUrl()), requestBuilder, error instanceof ServerError ? ((ServerError) error).getCode() : -1, error));
    }

    @Override // me.oriient.internal.infra.rest.RestRequestsReporter
    public void reportSuccess(@NotNull String tag, double durationSeconds, @NotNull RequestBuilder requestBuilder, @NotNull HttpResponse response) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(requestBuilder, "requestBuilder");
        Intrinsics.h(response, "response");
        this.metric.io(tag, "Rest request", durationSeconds, new o(new URL(requestBuilder.getUrl()), requestBuilder, response));
    }
}
