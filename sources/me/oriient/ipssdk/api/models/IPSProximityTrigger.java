package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public interface IPSProximityTrigger {
    @NonNull
    String getId();

    @Nullable
    String getMetadata();

    @NonNull
    String getName();

    @NonNull
    List<? extends IPSTriggerEvent> getTriggerEvents();
}
