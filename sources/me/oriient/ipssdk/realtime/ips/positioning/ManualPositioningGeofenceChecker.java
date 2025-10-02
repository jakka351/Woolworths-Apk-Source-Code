package me.oriient.ipssdk.realtime.ips.positioning;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.dataManager.building.Building;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/positioning/ManualPositioningGeofenceChecker;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "canStartPositioning", "", "building", "Lme/oriient/internal/services/dataManager/building/Building;", "location", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "(Lme/oriient/internal/services/dataManager/building/Building;Lme/oriient/internal/infra/locationManager/SystemLocation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ManualPositioningGeofenceChecker extends DiProvidable {
    @Nullable
    Object canStartPositioning(@NotNull Building building, @Nullable SystemLocation systemLocation, @NotNull Continuation<? super Boolean> continuation);
}
