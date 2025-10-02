package me.oriient.internal.services.remoteLog;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.rest.HttpResponse;
import me.oriient.internal.infra.rest.RequestBuilder;
import me.oriient.internal.infra.rest.RestRequestsReporter;
import me.oriient.internal.infra.utils.core.OriientError;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lme/oriient/internal/services/remoteLog/EmptyRestRequestReporter;", "Lme/oriient/internal/infra/rest/RestRequestsReporter;", "()V", "reportError", "", "tag", "", "durationSeconds", "", "requestBuilder", "Lme/oriient/internal/infra/rest/RequestBuilder;", "error", "Lme/oriient/internal/infra/utils/core/OriientError;", "reportSuccess", "response", "Lme/oriient/internal/infra/rest/HttpResponse;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmptyRestRequestReporter implements RestRequestsReporter {
    @Override // me.oriient.internal.infra.rest.RestRequestsReporter
    public void reportError(@NotNull String tag, double durationSeconds, @NotNull RequestBuilder requestBuilder, @NotNull OriientError error) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(requestBuilder, "requestBuilder");
        Intrinsics.h(error, "error");
    }

    @Override // me.oriient.internal.infra.rest.RestRequestsReporter
    public void reportSuccess(@NotNull String tag, double durationSeconds, @NotNull RequestBuilder requestBuilder, @NotNull HttpResponse response) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(requestBuilder, "requestBuilder");
        Intrinsics.h(response, "response");
    }
}
