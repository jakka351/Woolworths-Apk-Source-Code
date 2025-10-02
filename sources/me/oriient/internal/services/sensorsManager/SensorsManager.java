package me.oriient.internal.services.sensorsManager;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorsManager;", "Lme/oriient/internal/services/sensorsManager/SensorsDataProvider;", "Lme/oriient/internal/services/sensorsManager/B;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SensorsManager extends SensorsDataProvider, B {
    @Override // me.oriient.internal.services.sensorsManager.B
    @NotNull
    /* synthetic */ Map getSensorsTimestamps();
}
