package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public interface IPSRegion extends IPSContentItem {
    @Override // me.oriient.ipssdk.api.models.IPSContentItem
    List<? extends IPSRegionPlacement> getPlacements();

    @NonNull
    List<String> getTriggerIds();
}
