package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes2.dex */
public interface IPSEntrance {
    @NonNull
    String getEntranceDescription();

    @NonNull
    String getId();

    boolean getIsMain();

    double getX();

    double getY();
}
