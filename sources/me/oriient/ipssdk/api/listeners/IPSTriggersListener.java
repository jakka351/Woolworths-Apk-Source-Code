package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import me.oriient.ipssdk.api.models.IPSProximityTrigger;

@Keep
/* loaded from: classes2.dex */
public interface IPSTriggersListener {
    void onTriggerAdded(@NonNull IPSProximityTrigger iPSProximityTrigger);

    void onTriggerChanged(@NonNull IPSProximityTrigger iPSProximityTrigger);

    void onTriggerRemoved(@NonNull IPSProximityTrigger iPSProximityTrigger);
}
