package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import me.oriient.ipssdk.api.models.IPSBuilding;

@Keep
/* loaded from: classes2.dex */
public interface IPSBuildingListener extends IPSFailable {
    void onBuildingReceived(@NonNull IPSBuilding iPSBuilding);
}
