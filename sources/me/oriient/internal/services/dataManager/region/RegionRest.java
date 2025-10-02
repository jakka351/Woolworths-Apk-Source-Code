package me.oriient.internal.services.dataManager.region;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.building.BuildingId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lme/oriient/internal/services/dataManager/region/RegionRest;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "fetchRegions", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/services/dataManager/region/BuildingRegion;", "Lme/oriient/internal/infra/utils/core/OriientError;", "buildingId", "Lme/oriient/internal/services/dataManager/building/BuildingId;", "(Lme/oriient/internal/services/dataManager/building/BuildingId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RegionRest extends DiProvidable {
    @Nullable
    Object fetchRegions(@NotNull BuildingId buildingId, @NotNull Continuation<? super Outcome<List<BuildingRegion>, OriientError>> continuation);
}
