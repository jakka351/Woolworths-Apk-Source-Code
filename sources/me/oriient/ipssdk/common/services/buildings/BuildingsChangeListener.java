package me.oriient.ipssdk.common.services.buildings;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import me.oriient.ipssdk.common.utils.models.Building;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lme/oriient/ipssdk/common/services/buildings/BuildingsChangeListener;", "", "onBuildingsChanged", "", "buildings", "", "Lme/oriient/ipssdk/common/utils/models/Building;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BuildingsChangeListener {
    void onBuildingsChanged(@NotNull List<Building> buildings);
}
