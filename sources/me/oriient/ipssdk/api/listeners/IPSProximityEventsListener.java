package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import me.oriient.ipssdk.api.models.IPSProximityTrigger;
import me.oriient.ipssdk.api.models.IPSRegion;

@Keep
/* loaded from: classes2.dex */
public interface IPSProximityEventsListener extends IPSFailable {
    void onDwellInRegion(@NonNull IPSProximityTrigger iPSProximityTrigger, @NonNull IPSRegion iPSRegion, long j);

    void onEnterRegion(@NonNull IPSProximityTrigger iPSProximityTrigger, @NonNull IPSRegion iPSRegion);

    void onExitRegion(@NonNull IPSProximityTrigger iPSProximityTrigger, @NonNull IPSRegion iPSRegion);

    void onServiceStateChanged(int i);
}
