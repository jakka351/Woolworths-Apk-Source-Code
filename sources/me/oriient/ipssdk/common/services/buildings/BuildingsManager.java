package me.oriient.ipssdk.common.services.buildings;

import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.ipssdk.common.utils.models.Building;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\u001c\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lme/oriient/ipssdk/common/services/buildings/BuildingsManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "addBuilding", "", "building", "Lme/oriient/ipssdk/common/utils/models/Building;", "addBuildings", "buildings", "", "addBuildingsChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/ipssdk/common/services/buildings/BuildingsChangeListener;", "clearBuildings", "getBuilding", "buildingId", "Lme/oriient/ipssdk/common/utils/models/BuildingId;", "getBuilding-TVSKQeo", "(Ljava/lang/String;)Lme/oriient/ipssdk/common/utils/models/Building;", "getBuildings", "removeBuildingsChangeListener", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BuildingsManager extends DiProvidable {
    void addBuilding(@NotNull Building building);

    void addBuildings(@NotNull List<Building> buildings);

    void addBuildingsChangeListener(@NotNull BuildingsChangeListener listener);

    void clearBuildings();

    @Nullable
    /* renamed from: getBuilding-TVSKQeo, reason: not valid java name */
    Building mo435getBuildingTVSKQeo(@NotNull String buildingId);

    @NotNull
    List<Building> getBuildings();

    void removeBuildingsChangeListener(@NotNull BuildingsChangeListener listener);
}
