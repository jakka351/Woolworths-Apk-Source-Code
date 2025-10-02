package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import me.oriient.ipssdk.api.models.IPSBuildingCoordinatesConverter;

@Keep
/* loaded from: classes2.dex */
public interface IPSCoordinatesConverterListener extends IPSFailable {
    void onCreated(@NonNull IPSBuildingCoordinatesConverter iPSBuildingCoordinatesConverter);
}
