package me.oriient.internal.services.eventManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.eventManager.model.EventManagerConfig;
import me.oriient.internal.services.eventManager.model.EventManagerContext;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lme/oriient/internal/services/eventManager/EventManagerFactory;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "create", "Lme/oriient/internal/services/eventManager/EventManager;", "context", "Lme/oriient/internal/services/eventManager/model/EventManagerContext;", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/internal/services/eventManager/model/EventManagerConfig;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface EventManagerFactory extends DiProvidable {
    @NotNull
    EventManager create(@NotNull EventManagerContext context, @NotNull EventManagerConfig config);
}
