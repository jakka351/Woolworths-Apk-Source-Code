package me.oriient.ipssdk.common.services.elog;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/common/services/elog/EngineSessionDataProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "engineSessionId", "", "getEngineSessionId", "()Ljava/lang/String;", "positioningSessionStartTimeMillis", "", "getPositioningSessionStartTimeMillis", "()Ljava/lang/Long;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface EngineSessionDataProvider extends DiProvidable {
    @Nullable
    String getEngineSessionId();

    @Nullable
    Long getPositioningSessionStartTimeMillis();
}
