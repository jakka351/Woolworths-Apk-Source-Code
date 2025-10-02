package me.oriient.internal.infra.locationManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/infra/locationManager/SystemLocationManagerFactory;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "create", "Lme/oriient/internal/infra/locationManager/SystemLocationManager;", "createReadOnly", "Lme/oriient/internal/infra/locationManager/ReadOnlySystemLocationManager;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SystemLocationManagerFactory extends DiProvidable {
    @NotNull
    SystemLocationManager create();

    @NotNull
    ReadOnlySystemLocationManager createReadOnly();
}
