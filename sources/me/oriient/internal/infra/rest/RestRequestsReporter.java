package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.OriientError;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lme/oriient/internal/infra/rest/RestRequestsReporter;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "reportError", "", "tag", "", "durationSeconds", "", "requestBuilder", "Lme/oriient/internal/infra/rest/RequestBuilder;", "error", "Lme/oriient/internal/infra/utils/core/OriientError;", "reportSuccess", "response", "Lme/oriient/internal/infra/rest/HttpResponse;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RestRequestsReporter extends DiProvidable {
    void reportError(@NotNull String tag, double durationSeconds, @NotNull RequestBuilder requestBuilder, @NotNull OriientError error);

    void reportSuccess(@NotNull String tag, double durationSeconds, @NotNull RequestBuilder requestBuilder, @NotNull HttpResponse response);
}
