package me.oriient.ipssdk.api.models;

import androidx.annotation.Nullable;
import me.oriient.ipssdk.api.utils.OriientExperimentalApi;

@OriientExperimentalApi
/* loaded from: classes2.dex */
public interface IPSNavigationInstruction {
    int getDirection();

    @Nullable
    Double getDistance();
}
