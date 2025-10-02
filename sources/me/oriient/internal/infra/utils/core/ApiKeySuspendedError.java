package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/infra/utils/core/ApiKeySuspendedError;", "Lme/oriient/internal/infra/utils/core/OriientError;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ApiKeySuspendedError extends OriientError {
    public ApiKeySuspendedError() {
        super(null, "Your API Key is suspended. Please contact Oriient customer support", 1, null);
    }
}
