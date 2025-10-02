package me.oriient.ipssdk.common.services.geofencing;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.ipssdk.api.listeners.IPSLiveGeofenceListener;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH'J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "addListener", "", "buildingId", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/ipssdk/api/listeners/IPSLiveGeofenceListener;", "clearListeners", "getBuildingIdsInside", "", "removeListener", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LiveGeofenceManager extends DiProvidable {
    void addListener(@NotNull String buildingId, @NotNull IPSLiveGeofenceListener listener);

    void clearListeners();

    @Deprecated
    @NotNull
    List<String> getBuildingIdsInside();

    void removeListener(@NotNull String buildingId, @NotNull IPSLiveGeofenceListener listener);
}
