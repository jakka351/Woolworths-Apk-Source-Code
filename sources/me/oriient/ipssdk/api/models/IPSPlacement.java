package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes2.dex */
public interface IPSPlacement extends IPSCoordinateInBuilding {
    int getClientCategory();

    @NonNull
    String getId();
}
