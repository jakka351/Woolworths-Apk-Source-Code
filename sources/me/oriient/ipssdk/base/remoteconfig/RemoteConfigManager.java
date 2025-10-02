package me.oriient.ipssdk.base.remoteconfig;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H¦@¢\u0006\u0002\u0010\u0016J&\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u00060\u0019j\u0002`\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010\u001dR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "commonConfig", "Lme/oriient/ipssdk/base/remoteconfig/CommonConfig;", "getCommonConfig", "()Lme/oriient/ipssdk/base/remoteconfig/CommonConfig;", MlModel.MODEL_FILE_SUFFIX, "Lkotlinx/coroutines/flow/StateFlow;", "Lme/oriient/ipssdk/base/remoteconfig/RemoteConfig;", "getConfig", "()Lkotlinx/coroutines/flow/StateFlow;", "defaultEngineConfig", "Lme/oriient/internal/services/dataModel/engine/EngineConfig;", "getDefaultEngineConfig", "()Lme/oriient/internal/services/dataModel/engine/EngineConfig;", "realTimeConfig", "Lme/oriient/ipssdk/base/remoteconfig/RealTimeConfig;", "getRealTimeConfig", "()Lme/oriient/ipssdk/base/remoteconfig/RealTimeConfig;", "getEngineConfig", "buildingId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "Lme/oriient/internal/infra/utils/core/Outcome;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "user", "Lme/oriient/ipssdk/base/auth/User;", "(Lme/oriient/ipssdk/base/auth/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RemoteConfigManager extends DiProvidable {
    @NotNull
    CommonConfig getCommonConfig();

    @NotNull
    StateFlow<RemoteConfig> getConfig();

    @Nullable
    EngineConfig getDefaultEngineConfig();

    @Nullable
    Object getEngineConfig(@Nullable String str, @NotNull Continuation<? super EngineConfig> continuation);

    @NotNull
    RealTimeConfig getRealTimeConfig();

    @Nullable
    Object refresh(@NotNull User user, @NotNull Continuation<? super Outcome<EngineConfig, Exception>> continuation);
}
