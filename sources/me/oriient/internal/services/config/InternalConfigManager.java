package me.oriient.internal.services.config;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\tR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lme/oriient/internal/services/config/InternalConfigManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", MlModel.MODEL_FILE_SUFFIX, "Lkotlinx/coroutines/flow/StateFlow;", "Lme/oriient/internal/services/config/InternalConfig;", "getConfig", "()Lkotlinx/coroutines/flow/StateFlow;", "onNewConfig", "", "(Lme/oriient/internal/services/config/InternalConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InternalConfigManager extends DiProvidable {
    @NotNull
    StateFlow<InternalConfig> getConfig();

    @Nullable
    Object onNewConfig(@NotNull InternalConfig internalConfig, @NotNull Continuation<? super Unit> continuation);
}
