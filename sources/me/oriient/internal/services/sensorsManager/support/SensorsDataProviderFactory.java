package me.oriient.internal.services.sensorsManager.support;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.sensorsManager.SensorsDataProvider;
import me.oriient.internal.services.sensorsManager.SensorsManager;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lme/oriient/internal/services/sensorsManager/support/SensorsDataProviderFactory;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "createSensorManager", "Lme/oriient/internal/services/sensorsManager/SensorsManager;", "extraPrints", "", "createSensorsDataProvider", "Lme/oriient/internal/services/sensorsManager/SensorsDataProvider;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SensorsDataProviderFactory extends DiProvidable {
    @NotNull
    SensorsManager createSensorManager(boolean extraPrints);

    @NotNull
    SensorsDataProvider createSensorsDataProvider();
}
