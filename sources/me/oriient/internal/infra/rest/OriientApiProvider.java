package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/infra/rest/OriientApiProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "oriientApi", "Lme/oriient/internal/infra/rest/OriientApi;", "getOriientApi", "()Lme/oriient/internal/infra/rest/OriientApi;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OriientApiProvider extends DiProvidable {
    @NotNull
    OriientApi getOriientApi();
}
